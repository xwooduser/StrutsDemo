<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>

<html>
	<head>
		<title>JSP for RegisterForm form</title>
	</head>
	<body>
		<html:form action="/register">
			userName : <html:text property="userName" />
			<html:errors property="userName" />
			<br />
			userEmail : <html:text property="userEmail" />
			<html:errors property="userEmail" />
			<br />
			userPwd : <html:text property="userPwd" />
			<html:errors property="userPwd" />
			<br />
			<html:submit onclick="forms[0].action='register.do?method=addUser'" />
			<html:cancel />
		</html:form>
		<html:form action="/register">
			userName : <html:text property="userName" />
			<html:errors property="userName" />
			<br />
			userEmail : <html:text property="userEmail" />
			<html:errors property="userEmail" />
			<br />
			userPwd : <html:text property="userPwd" />
			<html:errors property="userPwd" />
			<br />
			<html:submit
				onclick="forms[1].action='register.do?method=updateUser'" />
			<html:cancel />
		</html:form>
	</body>
</html>

