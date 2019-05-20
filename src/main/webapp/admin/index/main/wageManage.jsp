<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/20
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
    <style>
        .layui-form{
            margin-left: 20px;
        }
    </style>
</head>
<body>
<table id="wageManage"  lay-filter="WageManage"></table>

<script type="text/html" id="toolbarDemo">
    <button class="layui-btn" data-type="reload" id="createWage">生成当月工资</button>
</script>

<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/wageManage.js" charset="UTF-8"></script>
</body>
</html>
