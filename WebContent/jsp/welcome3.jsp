<html>
<body>
	<center>
		<h1>
			<font color="red"> Welcome Page </font>
		</h1>
	</center>

	<form method="get" action="/MyFirstWebb/Welcome3Servlet">
	
	<% Object obj =request.getAttribute("errors");
	String errorMsg ="";
	if(obj!=null){
		errorMsg =(String)obj;
	}
	%>
	
	<%=errorMsg %>

		<table>
			<tr>
				<td><label for="fname">First Name</label></td>
				<td><input type="text" name="fname" id="fname"></td>
			</tr>
			<tr>
				<td><label for="lname">Last Name</label></td>
				<td><input type="text" name="lname" id="lname"></td>
			</tr>
			<tr>
				<td><label for="mname">Middle Name</label></td>
				<td><input type="text" name="mname" id="mname"></td>
			</tr>
		</table>
		<br> <br> <input type=submit name="submit" value="submit" />
		</form>

		</body>
</html>