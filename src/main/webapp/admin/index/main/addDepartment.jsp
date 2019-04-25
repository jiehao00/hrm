<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/25
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/addDepartment.css">
</head>
<body>
<form class="layui-form" id="DepartmentForm">
<div>
    <div class="layui-form-item">
        <label class="layui-form-label"> 部门名称：</label>
        <div class="layui-input-block">
            <input type="text" name="department" id="department" autocomplete="off" class="layui-input" >
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">部门简介：</label>
        <div class="layui-input-block">
            <textarea name="deparmentIntroduction" id="deparmentIntroduction" placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>
</div>
</form>
<script src="../../../js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../layui/layui.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>
