<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- OutSourced Kopf-Teil für einheitliches Menü -->
<%@include file="../partials/layout_top.jsp"%>

<title>Warenkorb</title>
</head>
<body>

<div class="container-fluid">
<h2>Warenkorb</h2>
<table width=100% cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th><h1>Status</h1></th>
        <th><h1>Art.Nr.</h1></th>
        <th><h1>Name</h1></th>
        <th><h1>Bild</h1></th>
        <th><h1>Preis</h1></th>
        <th><h1>Anzahl</h1></th>
        <th><h1>Gesamtpreis</h1></th>
    </tr>
    <c:set var="total" value="${item.total}"></c:set>
    <c:set var="itemCounter" value="0" scope="page"></c:set>
    <c:forEach var="item" items="${sessionScope.cart }">
       <c:set var="totalPerProduct"
               value="${item.product.price.mul(item.quantity)}"></c:set>

        <tr>
            <td align="center"><a
                    href="${pageContext.request.contextPath }/cart/remove/${item.product.id}"
                    onclick="return confirm('Sind Sie sicher, dass Sie das produkt entfernen möchten?')">Entfernen</a></td>
            <td>${item.product.id }</td>
            <td>${item.product.name }</td>
            <td><img src="${pageContext.request.contextPath}/resources/images/${item.product.photo}"
                     width="100"></td>
            <td>${item.product.price }</td>
            <td>${item.quantity }</td>
            <td>${totalPerProduct} Euro</td>
       
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6" align="right" class="summe-label">Sum</td>
        <td>${summeZuZahlen/100.0} Euro</td>

       
    </tr>
</table>
<br>
<a href="${pageContext.request.contextPath }/product">Weiter einkaufen</a>


<%@include file="../partials/layout_bottom.jsp"%>