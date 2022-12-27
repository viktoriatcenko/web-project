<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09.12.2022
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <%@ page import="model.Cart" %>


    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p>
        Наименование: <%= cart.getProduct() %>
    </p>

    <p>
        Количество: <%= cart.getQuantity() %>
    <%--  int count = 0;
        for (int i = 0; i < 10; i++) {
        count++;
    }
    --%>

    <p>

    </p>

</body>
</html>
