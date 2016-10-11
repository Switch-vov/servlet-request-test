<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset=UTF-8">
		<title>注册页面2</title>
	</head>
	<body>
		<div align="center" style="position: relative; top: 100px;">
			<form action="TestBeanServlet" method="post">
				用户名：<input type="text" name="userName" /><br />
				密码：<input type="password" name="password" /><br />
				性别：<input type="radio" name="sex" value="男" />男
				<input type="radio" name="usex" value="女" />女<br />
				爱好：<input type="checkbox" name="hobby" value="蹦迪" />蹦迪
				<input type="checkbox" name="hobby" value="攀岩" />攀岩
				<input type="checkbox" name="hobby" value="蹦极" />蹦极<br />
				生日：<input type="text" name="birthday" /><br/>
				<input type="submit" value="注册" />
			</form>
		</div>
	</body>
</html>