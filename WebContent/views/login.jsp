<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
	<head>
		<title>Login</title>
		<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css" />"><link>
		<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-theme.min.css" />"><link>
		<script type="text/javascript" src="<c:url value="/assets/js/jquery-1.11.2.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
	</head>
	<body>
		<div class="container">
		<h2 class="text-center">Login System</h2>
		<form class="form-horizontal" action="/login" th:action="@{/login}" th:object="${admin}" method="post">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<c:if test="${param.error != null}">
				<p>Invalid username and password.</p>
			</c:if>
			<c:if test="${param.logout != null}">
				<p>You have been logged out.</p>
			</c:if>
			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">Username</label>
				<div class="col-sm-4">
					<input type="text" required="required" class="form-control" id="username" name="username" th:field="*{username}" placeholder="Username">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
				<div class="col-sm-4">
					<input type="password" required="required" class="form-control" id="inputPassword3" name="password" th:field="*{password}" placeholder="Password">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Login</button>
				</div>
			</div>
		</form>
	</div>
	</body>
</html>