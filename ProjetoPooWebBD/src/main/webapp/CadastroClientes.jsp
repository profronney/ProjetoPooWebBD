<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    	<title>Cadastro de Clientes</title>
    	<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<form action="IncluirClienteAction.do" method="post">
    		<div>
        		<label for="codCliente">Código do Cliente:</label>
        		<input type="text" name="codcliente" id="codcliente" />
    		</div>
    		<div>
        		<label for="nome">Nome:</label>
        		<input type="text" name="nome" id="nome" />
    		</div>
    		<div>
        		<label for="endrua">Rua:</label>
        		<input type="text" name="endrua" id="endrua" />
    		</div>
    		<div>
        		<label for="endnumero">Número:</label>
        		<input type="text" name="endnumero" id="endnumero" />
    		</div>
    		<div>
        		<label for="endcomplemento">Complemento:</label>
        		<input type="text" name= "endcomplemento" id="endcomplemento" />
    		</div>
    		<div class="button">
        		<button type="submit">Salvar</button>
   			 </div>
		</form>
	</body>
</html>