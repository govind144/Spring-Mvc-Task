<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Band-Country Table</title>
	<style>
	.table1{	
			margin-left: 3%;
			margin-top: 3%;
			width:90%;
			height:200px;		
			text-align: center;
		}
		

	</style>

</head>
<body>
	<input type="button" value="Add Data"
		onclick="window.location.href='showFormAdd'; return false;" />
	<br><br>
	<hr>
	<table border="1" class="table1" >
		<tr style="background-color:yellow">
			
			<th>Band Name</th>
			<th>Band Member</th>
			<th>Band Country</th>
		</tr>
		<c:forEach var="tempBand" items="${bandDetails}">
			<tr>
				
				<td>${tempBand.bandTable.bname}</td>
				<td>${tempBand.bandTable.bmember}</td>
				<td>${tempBand.country}</td>

			</tr>
		</c:forEach>
	</table>


</body>
</html>