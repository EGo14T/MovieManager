<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>查看所有管理员</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="mainUI/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>所有管理员信息</legend>
</fieldset>

<div class="layui-form">
    <table class="layui-table">
        <colgroup>
            <col width="150">
            <col width="150">
            <col width="200">
            <col>
        </colgroup>
        <thead>
        <tr>
            <th>管理员姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>电话</th>
            <th>家庭住址</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list }" var="adminEntity">
            <tr>
                <td>${adminEntity.adminName}</td>
                <td>${adminEntity.adminSex}</td>
                <td>${adminEntity.adminAge}</td>
                <td>${adminEntity.adminTel}</td>
                <td>${adminEntity.adminAddress}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
