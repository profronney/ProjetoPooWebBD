package br.ufjf.dcc.poo.exemplopoowebbd.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufjf.dcc.poo.exemplopoowebbd.dao.ConexaoMySQl;
import br.ufjf.dcc.poo.exemplopoowebbd.model.Cliente;

@WebServlet("/IncluirClienteAction.do")
public class IncluirClienteAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IncluirClienteAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConexaoMySQl conexaoMySQl = new ConexaoMySQl();
		try {
			
			Connection connection = conexaoMySQl.criarConexao();
			
			Cliente cliente = new Cliente();
			cliente.setCod_cliente(request.getParameter("codcliente"));
			cliente.setNome(request.getParameter("nome"));
			cliente.setEnd_rua(request.getParameter("endrua"));
			cliente.setEnd_numero(Integer.parseInt(request.getParameter("endnumero")));
			cliente.setEnd_complemento(request.getParameter("endcomplemento"));
			
			String sql = "INSERT INTO clientes (cod_cliente, nome, end_rua, end_numero," +
			"end_complemento) VALUES ('" + cliente.getCod_cliente() + "', '" +
			cliente.getNome() + "', '" + cliente.getEnd_rua() + "', " +
			cliente.getEnd_numero() + ", '" + cliente.getEnd_complemento() + "')";
			conexaoMySQl.operacaoBanco(connection, sql);
			
			response.sendRedirect("index.jsp");
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			response.sendRedirect("erro.jsp");
			e.printStackTrace();
		}
		
	}

}
