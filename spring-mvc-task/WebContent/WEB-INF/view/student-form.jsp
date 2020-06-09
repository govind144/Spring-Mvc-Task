<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Student name & Band</title>
</head>
<body>
	<form:form action="stuform" modelAttribute="student">
	
	Name : <form:input path="name"/>
	<br><br>
	Band:
	<form:select path="band">
		
		<form:options items="${student.bandOps }"/>
	
	</form:select>
	<br><br>
	<input  type="submit" value="Submit"/>
	</form:form>

</body>
</html>