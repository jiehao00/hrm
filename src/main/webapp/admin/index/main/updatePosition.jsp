<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/27
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/addPosition.css">
</head>
<body>
<form class="layui-form" id="positionForm">
    <div>
        <div class="layui-form-item">
            <label class="layui-form-label"> 原来部门：</label>
            <div class="layui-input-block">
                <input type="text" name="oldDepartment" id="oldDepartment" autocomplete="off" class="layui-input positionInput" readonly/>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">新部门：</label>
            <div class="layui-input-block departmentSelect">
                <select id="department" name="department"  lay-filter="department"></select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"> 职位名称：</label>
            <div class="layui-input-block">
                <input type="text" name="position" id="position" autocomplete="off" class="layui-input positionInput" >
            </div>
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">职位简介：</label>
            <div class="layui-input-block">
                <textarea name="positionIntroduction" id="positionIntroduction" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>
    </div>
</form>
<script src="../../../js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../js/cascade.js" type="text/javascript" charset="UTF-8"></script>
</body>
</html>
