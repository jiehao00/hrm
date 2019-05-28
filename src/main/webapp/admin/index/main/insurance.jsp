<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/29
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
</head>
<body>
<table id="manageInsurance"  lay-filter="manageInsurance"></table>

<script type="text/html" id="toolbarDemo">
    <div class="demoTable">
        <button class="layui-btn layui-btn-sm" id="addInsurance">
            <i class="layui-icon">&#xe608;</i> 添加
        </button>
    </div>
</script>

<script type="text/html" id="barDemo">
    <form class="layui-form" action="">
        <input type="checkbox" name="courseName" value="{{d.id}}" lay-skin="switch"  lay-filter="switchTest" lay-text="ON|OFF" {{d.state=="1"?"checked":""}}>
    </form>
</script>
<script src="../../../js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../js/insurance.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>
