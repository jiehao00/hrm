<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/24
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/manageDepartmentAndPosition.css">
</head>
<body>

<div class="layui-tab layui-tab-brief " lay-filter="docDemoTabBrief">
    <ul class="layui-tab-title">
        <div class="posLi">
            <li class="layui-this">部门设置</li>
            <li>职位设置</li>

        </div>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show"><table id="departmentTable" lay-filter="departmentTable"></table></div>
        <div class="layui-tab-item"><table id="positionTable" lay-filter="positionTable"></table></div>
    </div>
</div>
<!--部门-->
<script type="text/html" id="toolbarDemo">
    <div class="demoTable">
        <button class="layui-btn layui-btn-sm" id="addDepartment">
            <i class="layui-icon">&#xe608;</i> 添加
        </button>
        <div class="layui-inline">
            <input  class="layui-input" name="department" id="department" autocomplete="off" placeholder="部门名字"/>
        </div>
        <button class="layui-btn" data-type="reload" id="search">搜索</button>
    </div>
</script>
<!--职位-->
<script type="text/html" id="positionToolbar">
    <div class="demoTable">
        <button class="layui-btn layui-btn-sm" id="addPosition">
            <i class="layui-icon">&#xe608;</i> 添加
        </button>
        <div class="layui-inline">
            <input  class="layui-input" name="position" id="position" autocomplete="off" placeholder="职位名字"/>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="department" id="positionDepartment" autocomplete="off" placeholder="部门名字"/>
        </div>
        <button class="layui-btn" data-type="reload" id="searchPosition">搜索</button>
    </div>
</script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script type="text/javascript" src="../../../js/jquery.js"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/manageDepartmentAndPosition.js" charset="UTF-8"></script>
</body>
</html>
