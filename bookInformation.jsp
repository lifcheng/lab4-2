<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Information</title>
</head>
<body>
      Author Information:<br>
                 ID:<s:property value="auid"/><br>
                 Name:<s:property value="auname"/><br>
                 Age:<s:property value="auage"/><br>
                 Country:<s:property value="aucountry"/><br><br><br>
      Book Informations:<br><br>
                ISBN:<s:property value="bookinfo.isbn"/><br>
                Title:<s:property value="bookinfo.title"/><br>
                Publisher:<s:property value="bookinfo.publisher"/><br>
                PublishDate:<s:property value="bookinfo.publishDate"/><br>
                Price:<s:property value="bookinfo.price"/><br>
                
      <a href="delete.action?isbn=<s:property value="bookinfo.isbn"/>">
      delete<br><br><br>
      </a>
      
      <form action = "comeBack.action" method ="post">
    <input type = "submit" value = "Back">
    </form>
      
</body>
</html>