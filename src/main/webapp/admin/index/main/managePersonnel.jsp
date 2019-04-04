<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/1
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
</head>

<style>
    .layui-table-cell .layui-form-checkbox[lay-skin="primary"]{
        margin-top: 10px;
    }
    .layui-form{
        margin-left: 70px;
    }
</style>
<body>

<table id="personnelInfo"  lay-filter="personnelInfo"></table>

<script type="text/html" id="toolbarDemo">
    <div class="demoTable">
        <div class="layui-inline">
            <input  class="layui-input" name="personnelId" id="personnelId" autocomplete="off" placeholder="ID"/>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="personnelName" id="personnelName" autocomplete="off" placeholder="名字"/>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="department" id="department" autocomplete="off" placeholder="部门"/>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="informationEntryTime" id="informationEntryTime" autocomplete="off" placeholder="信息录入时间"/>
        </div>
        <button class="layui-btn" data-type="reload" id="search">搜索</button>
    </div>
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">解聘</a>
    <a class="layui-btn layui-btn-xs" lay-event="transfer">调职</a>
</script>
<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/personnelInfo.js" charset="UTF-8"></script>
</body>
</html>
