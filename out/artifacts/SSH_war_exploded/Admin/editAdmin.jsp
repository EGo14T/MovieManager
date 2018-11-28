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
    <h1>个人信息</h1>

    <form action="/admin_update.action" method="post">
        <table border="0" width="500">
            <tr>
                <td>姓名:</td>
                <td>
                    <input type="text" name="adminName" value="${adminEntity.adminName}">
                    <input type="hidden" name="id" value="${adminEntity.id}">
                </td>
            </tr>

            <tr>
                <td>性别:</td>
                <td>
                    <input type="text" name="adminSex" value="${adminEntity.adminSex}">
                </td>
            </tr>


            <tr>
                <td>年龄:</td>
                <td><input type="text" name="adminAge" value="${adminEntity.adminAge}"></td>
            </tr>

            <tr>
                <td>电话：</td>
                <td><input type="text" name="adminTel" value="${adminEntity.adminTel}"></td>
            </tr>

            <tr>
                <td>家庭住址：</td>
                <td>
                    <input type="text" name="adminAddress" value="${adminEntity.adminAddress}">
                    <input type="hidden" name="userName" value="${adminEntity.userName}">
                    <input type="hidden" name="password" value="${adminEntity.password}">
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
