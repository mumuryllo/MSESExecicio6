<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1> Calculadora </h1>

<form method="post" action="PrimeiroServlet">
Primeiro N�mero <br>

<input  type="text" name="n"> <br>
Segundo N�mero <br>
<input  type="text" name="n2"> <br> <br>
 
 <select name="operacoes">
 <option value="+">+</option>
  <option value="-">-</option>
   <option value="*">*</option>
    <option value="/">/</option>
 </select>

<button type="submit"  name="calcular" >CALCULAR</button> <br> <br> 
Resultado = ${requestScope.res}

<br> <br>

<button type="reset">Limpar</button>
</form>


</body>
</html>