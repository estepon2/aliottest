<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum and Subtraction of numbers</title>
</head>
<body>
      <form:form method="POST" 
          action="/caculateResult" modelAttribute="operation">
             <table>
                <tr>
                    <td><form:label path="firtNumber">First Number</form:label></td>
                    <td><form:input path="firtNumber"/></td>
                </tr>
                <tr>
                    <td><form:label path="secondNumber">Second Number</form:label></td>
                    <td><form:input path="secondNumber"/></td>
                </tr>
				<tr>
					<td><form:label path="operationType">Select Operation Type </form:label></td>
					<td><form:select path="operationType">  
        				<form:option value="sum" label="Sum"/>  
        				<form:option value="subtraction" label="substraction"/>  
         			</form:select></td>
                </tr>
                <tr>
                	<td><input type="submit" value="Submit"/></td></tr>
                </tr>
            </table>
        </form:form>
</body>
</html>