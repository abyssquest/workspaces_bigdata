<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page buffer="1kb" autoFlush="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>auto flush</title>
</head>
<body>
	
	<% for(int i=0; i < 1000; i++){ %>
		1234
	<%	
	}
	%>
	
</body>
</html>