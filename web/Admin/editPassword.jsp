<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>个人资料</title>
</head>
<body bgcolor="#f0ffff">
<center>
    <br>
    <br>
    <br>
    <h1>修改密码</h1>

    <form action="/admin_updatePassword.action" method="post">
        <table border="0" width="500">
            <tr>
                <td>账号:</td>
                <td>
                    <input type="text" name="userName" value="${adminEntity.userName}" readonly="true">
                </td>
            </tr>

            <tr>
                <td>请输入新密码:</td>
                <td>
                    <input type="password" name="password"/>


                    <input type="hidden" name="id" value="${adminEntity.id}">
                    <input type="hidden" name="adminName" value="${adminEntity.adminName}">
                    <input type="hidden" name="adminSex" value="${adminEntity.adminSex}">
                    <input type="hidden" name="adminAge" value="${adminEntity.adminAge}">
                    <input type="hidden" name="adminTel" value="${adminEntity.adminTel}">
                    <input type="hidden" name="adminAddress" value="${adminEntity.adminAddress}">
                </td>
            </tr>

            <tr align="center">
                <td colspan="2">
                    <input name="sure" type="submit" value="修改"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="clear" type="reset" value="恢复"/>
                </td>
            </tr>
        </table>

    </form>
</center>
</body>
</html>
