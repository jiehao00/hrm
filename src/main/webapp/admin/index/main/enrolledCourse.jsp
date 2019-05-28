<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/27
  Time: 2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
    <style>
        .layui-table-cell .layui-form-checkbox[lay-skin="primary"]{
            margin-top: 10px;
        }
        .layui-form{
            margin-left: 30px;
        }
    </style>
</head>
<body>
<table id="enrolledCourse"  lay-filter="enrolledCourse"></table>
</body>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="download">下载文件</a>
    <a class="layui-btn layui-btn-xs" lay-event="downloadVideo">下载视频</a>
</script>

<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/enrolledCourse.js" charset="UTF-8"></script>
</html>
