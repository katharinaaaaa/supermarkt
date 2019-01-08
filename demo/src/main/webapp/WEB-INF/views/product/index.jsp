<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- OutSourced Kopf-Teil für einheitliches Menü -->
<%@include file="../partials/layout_top.jsp"%>

<!-- Page Spezifische Meta und Stylesheet Implementationen -->

</head>
<body>

<div class="container-fluid">
<h1>Unser Sortiment</h1>
<table width=100% cellpadding="5" cellspacing="2" border="1">
	<tr>
		<th><h1>Art.Nr.</h1></th>
		<th><h1>Name</h1></th>
		<th><h1>Bild</h1></th>
		<th><h1>Preis</h1></th>
		<th><h1>Kaufen</h1></th>
	</tr>
	<c:forEach var="product" items="${products }">
		<tr>
			<td>${product.id }</td>
			<td>${product.name }</td>
			<td><img
				src="${pageContext.request.contextPath}/resources/images/${product.photo}"
				width="200"></td>
			<td>${product.price }</td>
			<td align="center"><a
				href="${pageContext.request.contextPath }/cart/buy/${product.id}">Buy
					Now</a></td>
		</tr>
	</c:forEach>
</table>
</div>
</div>
<!-- Footer -->
<%@include file="../partials/layout_bottom.jsp"%>