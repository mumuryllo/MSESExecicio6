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

<input  type="number" name="n"> <br>
Segundo N�mero <br>
<input  type="number" name="n2"> <br> <br>

<button type="submit" ">Somar</button> <br> <br> 
     
<button type="submit" ">Subtra��o</button> <br> <br>

<button type="submit" ">Multiplica��o</button> <br> <br>

<button type="submit" ">Divis�o</button> <br> <br>
  
Resultado =  <nobr> ${requestScope.operacao1}</nobr>  <nobr> ${requestScope.operacao2}</nobr>   
<nobr> ${requestScope.operacao3}</nobr>   <nobr> ${requestScope.operacao4}</nobr>  

<br> <br>

<button type="reset">Limpar</button>
</form>


</body>
</html>