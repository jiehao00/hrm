<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/15
  Time: 14:48
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
<table id="manageCourse"  lay-filter="manageCourse"></table>

<script type="text/html" id="toolbarDemo">
    <div class="demoTable">
        <div class="layui-inline">
            <input  class="layui-input" name="courseName" id="courseName" autocomplete="off" placeholder="课程名字"/>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="studentsType" id="studentsType" autocomplete="off" placeholder="授课对象"/>
        </div>
        <div class="layui-inline">
            <select name="courseStatus"  class="layui-input-block" id="courseStatus">
                <option value="">课程状态</option>
                <option value="0">未开课</option>
                <option value="1">已开课</option>
                <option value="2">已结课</option>
            </select>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="plannedStartTime" id="plannedStartTime" autocomplete="off" placeholder="开始时间"/>
        </div>
        <div class="layui-inline">
            --
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="plannedEndTime" id="plannedEndTime" autocomplete="off" placeholder="结束时间"/>
        </div>
        <button class="layui-btn" data-type="reload" id="search">搜索</button>
    </div>
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="signUp">报名</a>
</script>



<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/personnelSignUp.js" charset="UTF-8"></script>
</body>
</html>
