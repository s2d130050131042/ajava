<%@ page language="java" contentType="text/html"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
out.print("<br>130050131042");
out.print("method :"+request.getMethod());
out.print("getRequestURI :"+request.getRequestURI()+ "<br>getProtocol :"+request.getProtocol()+"<br> getPathInfo :"+ request.getPathInfo()+"<br> getPathTranslated :"+request.getPathTranslated()+"<br>getQueryString :"+ request.getQueryString()+"<br>getContentLength :"+request.getContentLength()+"<br> getContentType :"+request.getContentType()+"<br>getServerName :"+request.getServerName()+"<br> getServerPort :"+ request.getServerPort()+" <br>getRemoteUser :"+request.getRemoteUser()+"<br> getRemoteAddr :"+ request.getRemoteAddr()+"<br>getRemoteHost :"+ request.getRemoteHost());

%>
</body>
</html>