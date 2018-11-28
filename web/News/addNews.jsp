<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>发布页面</title>
</head>
<body>

<table bgcolor="#fff8dc">


    新闻发布

    <hr>
    <s:form action="public" method="post">
        <s:textfield name="title" label="标题"/>
        <s:textarea name="content" cols="36" rows="10" label="发布内容"/>
        <s:textfield name="date" label="发布日期"/>
        <s:submit value="提交"/>
        <s:reset value="清除"/>
    </s:form>

</table>


</body>
</html>
