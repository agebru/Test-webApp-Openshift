<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orders page</title>
</head>
<body>
<h2> All Orders</h2>

<table>
<tr>
<th>Order Id</th>  <th>Type</th>  <th>Price</th>
</tr>

<c:forEach var="order" items="${orderList}">
<tr>
    <td>${order.orderId}</td> <td>${order.orderType }</td> <td>${order.price}</td>
</tr>

</c:forEach>

</table>


</body>
</html>