<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error </title>
</head>
<body>
        <h3>Please enter the correct details</h3>
        <table>
            <tr>
                <td><a href="/index">Try again</a></td>
            </tr>
             <tr>      
              <td>${errors}</td>
            </tr>
        </table>
</body>
</html>