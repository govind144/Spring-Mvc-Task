<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Data</title>
</head>
<body>
	<form:form action="savedata" modelAttribute="bandForm" method="POST">
		Band Name:
		<form:input path="bandTable.bname" />
		<br></br>
		Band Member:
			<form:input path="bandTable.bmember" />
		<br></br>
		Country Name:
		<form:input path="country" />
		<br><br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>