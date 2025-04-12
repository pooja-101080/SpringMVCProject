<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME TO HomeLOAN</h1>
	<form action="homeloan">
		Employer Name:<input type="text" name="employername"><br>
		Position:<input type="text" name="position"><br>
		Contact Information:<input type="text" name="contactinfo"><br>
        AadharCardNo:<input type="text" name="Aadharno"> <br>
		PropertyDetails(address,purchase,price):<input type="text"name="propertydetails"><br> 
		TypeOfLoan:<select name="loantype"><br>
			<option value="secured">secured</option>
			<option value="unsecured">unsecured</option>
		</select> 
		Down Payment Price:<input type="text" name="dPayment">
		<button value="submit">Apply For homeLoan</button>





	</form>
</body>
</html>