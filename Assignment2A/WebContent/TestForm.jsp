<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Test Form</title>
</head>
<body>
  <h2>Test form</h2>
	<form action = "TestResponse.jsp" method = "post">
         <label>First Name:</label><input type = "text" name = "firstName" />
         <br/>
         <label>Last Name:</label><input type = "text" name = "lastName" />
         <input type = "submit" value = "Submit" />
      </form>
</body>
</html>