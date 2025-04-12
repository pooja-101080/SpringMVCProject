<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO PERSONALLOAN</h1>
	<form action="personalloan">
		Full Name:<input type="text" name="fullname"><br>
		Address:<input type="text" name="add"><br>
		PhoneNo:<input type="text" name="phono"><br>
		Email Address:<input type="text" name="email"><br>
        PurposeOfLoan:<input type="text"name="purpose"> <br>
		TypeOfLoan:<select name="loantype"><br>
			<option value="secured">secured</option>
			<option value="unsecured">unsecured</option>
		</select> 
		<button value="submit">Apply For personalLoan</button>





	</form>
</body>
</html>