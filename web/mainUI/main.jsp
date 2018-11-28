<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>电影后台管理系统</title>
    <link rel="stylesheet" href="mainUI/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">电影后台管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="/News/addNews.jsp" target="iframe">新闻发布</a></li>
            <li class="layui-nav-item"><a href="/admin_listAdmin.action" target="iframe">管理员</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">电影</a>
                <dl class="layui-nav-child">
                    <dd><a href="/movie_listMovie.action" target="iframe">查看所有电影</a></dd>
                    <dd><a href="/Movie/addMovie.jsp" target="iframe">上传电影</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="mainUI/img.png" class="layui-nav-img">
                    ${user.adminName}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="${pageContext.request.contextPath}/admin_showAdmin.action?id=${user.id}"
                           target="iframe">个人资料</a></dd>
                    <dd><a href="${pageContext.request.contextPath}/admin_editPassword.action?id=${user.id}"
                           target="iframe">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="loginout.jsp">退出</a></li>
        </ul>
    </div>


    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe name="iframe" style="width: 100%" height="100%" src=""></iframe>
    </div>
</div>
<script src="mainUI/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });
</script>
</body>
</html>
