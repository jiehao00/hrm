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
    <link rel="stylesheet" type="text/css" href="../../../css/manageDepartmentAndPosition.css">
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
<div class="layui-tab layui-tab-brief " lay-filter="docDemoTabBrief">
    <ul class="layui-tab-title">
        <div class="posLi">
            <li class="layui-this">奖励信息</li>
            <li>添加奖励</li>

        </div>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show"><table id="showRewardsTable" lay-filter="showRewardsTable"></table></div>
        <div class="layui-tab-item"><table id="personnelInfo"  lay-filter="personnelInfo"></table></div>
    </div>
</div>
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

<script type="text/html" id="toolShowRewardsBar">
    <div class="demoTable">
        <div class="layui-inline">
            <input  class="layui-input" name="personnelName" id="RewardsPersonnelName" autocomplete="off" placeholder="员工名字"/>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="department" id="RewardsDepartment" autocomplete="off" placeholder="部门"/>
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="startTime" id="startTime" autocomplete="off" placeholder="奖赏时间"/>
        </div>
        <div class="layui-inline">
            --
        </div>
        <div class="layui-inline">
            <input  class="layui-input" name="endTime" id="endTime" autocomplete="off" placeholder="奖赏时间"/>
        </div>
        <button class="layui-btn" data-type="reload" id="searchRewards">搜索</button>
    </div>
</script>



<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="addRewards">添加奖励</a>
</script>
<script type="text/html" id="showRewardsBar">
    <a class="layui-btn layui-btn-danger layui-btn-xs"  lay-event="del">删除</a>
</script>

<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/rewardsManage.js" charset="UTF-8"></script>
</body>
</html>
