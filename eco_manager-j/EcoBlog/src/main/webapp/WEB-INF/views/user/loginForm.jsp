<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<!DOCTYPE html>
<html lang="ko">

<div class="container">
	<form action="/auth/loginProc" method="post">
		<div class="form-group">
			<label for="text">Username:</label> <input type="text"
				name="username" class="form-control" placeholder="Enter Username" id="username">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				name="password" class="form-control" placeholder="Enter password" id="passwd">
		</div>
	<button id="btn-login" class="btn btn-primary">Login</button>
</form>
	
</div>
<br/>
</body>
<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>

</html>


