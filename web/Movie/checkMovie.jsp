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
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="mainUI/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>所有电影信息</legend>
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
            <th>影片名称</th>
            <th>影片类型</th>
            <th>影片产地</th>
            <th>上传时间</th>
            <th>上传人</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list }" var="movieEntity">
            <tr>
                <td>${movieEntity.movieName}</td>
                <td>${movieEntity.movieKind}</td>
                <td>${movieEntity.movieArea}</td>
                <td>${movieEntity.movieTime}</td>
                <td>${movieEntity.movieMan}</td>
                <td>
                    <!--表格的操作 -->
                    <a class="layui-btn layui-btn-xs" lay-event="edit"
                       href="${pageContext.request.contextPath}/movie_showMovie.action?movieId=${movieEntity.movieId}">编辑</a>
                    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del"
                       href="${pageContext.request.contextPath}/movie_delMovie.action?movieId=${movieEntity.movieId}">删除</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
