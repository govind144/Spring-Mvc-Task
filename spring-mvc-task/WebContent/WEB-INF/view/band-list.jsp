<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Band Details</title>

</head>

<body>
			<h2>Band name and member</h2>
		
			<!--  add our html table here -->
		
			<table border="1">
				<tr>
					<th>Band Name</th>
					<th>Band member</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempBand" items="${bandDetails}">
				
					<tr>
						<td> ${tempBand.bname} </td>
						<td> ${tempBand.bmember} </td>
					</tr>
				
				</c:forEach>
						
			</table>
</body>

</html>









