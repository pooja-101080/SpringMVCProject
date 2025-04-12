<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CARLOAN FORM</title>
</head>
<body>
<h1>WELCOME TO CARLOAN </h1>
<form action="carloan">
Employer Name:<input type="text" name="employername"><br>
Position:<input type="text" name="position"><br>
Contact Information:<input type="text" name="contactinfo"><br>
Address:<input type="text" name="add"><br>
PanCardNo:<input type="text" name="panno"><br>
Vehicle Details(model,mileage,price):<input type="text" name="vehicledetails"><br>
Dealership Name:<input type="text" name="dealership"><br>
TypeOfLoan:<select name="loantype"><br>
<option value="secured">secured</option>
<option value="unsecured">unsecured</option>
</select>
Down Payment Price:<input type="text" name="dPayment">
<button value="submit">Apply For CarLoan</button>





</form>
</body>
</html>