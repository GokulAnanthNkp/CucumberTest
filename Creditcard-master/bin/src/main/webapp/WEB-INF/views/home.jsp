<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<style>
table, th, td tr {
	border: 1px solid black;
}
</style>


<title>CreditCard-Home Page</title>
</head>
<body>
	<h1>Check for Credit Card Eligibility</h1>

	<form name="creditcardform" action="checkEligibility" method="post">

		<table>

			<tr>
				<th><label for="PANNumber">Enter PAN Number: </label></th>
				<th><input type="text" id="panNo" name="pannumber"
					required="required" pattern="[A-Za-z0-9]{10}"
					title="10 charatcer alpha numeric"><br></th>
			</tr>

			<tr>
				<th><input type="submit" id="submit" value="Check"></th>
			</tr>
		</table>


	</form>



</body>
</html>