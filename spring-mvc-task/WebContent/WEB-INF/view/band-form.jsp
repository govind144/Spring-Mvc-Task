<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Band Name</title>
</head>
<body>
<h1>Select Band Name</h1>
	<form:form action="bandform" modelAttribute="band" >
	
	Band:
	<form:select path="band">
		
		<form:options items="${band.bandOps }"/>
	
	</form:select>
	<br><br>
	Country:
	<form:select path="country">
		
		<form:options items="${band.countryOption }"/>
	
	</form:select>
	<br><br>
	<input  type="submit" value="Submit"/>
	</form:form>

</body>
</html>