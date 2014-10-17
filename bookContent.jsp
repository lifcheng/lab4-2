<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Content</title>
</head>
<body>
    Author Information:<br>
                 ID:<s:property value="auid"/><br>
                 Name:<s:property value="auname"/><br>
                 Age:<s:property value="auage"/><br>
                 Country:<s:property value="aucountry"/><br><br><br>

    
    Book Content:<br><br>
    <s:iterator value="books" id="us">
    <s:a href="information.action?isbn=%{#us.isbn}">
    <s:property value='#us.title'/><br>
    </s:a>  
        <br>
    </s:iterator>
    <form action = "comeBack.action" method ="post">
    <input type = "submit" value = "Back">
    </form>
</body>
</html>