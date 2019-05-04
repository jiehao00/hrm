<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/4
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="../../../css/addRewards.css">
</head>
<body>
<form class="layui-form layui-form-pane">
    <div class="rewardsMessage">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 员工id：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="personnelId" name="personnelId" readonly/>
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">员工名字：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="personnelName" name="personnelName" readonly/>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label"><i class="layui-icon layui-icon-user"></i> 部门：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="department" name="department" readonly/>
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">职位：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="position" name="position" readonly/>
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">惩罚金额：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input"  id="finedMoney" name="finedMoney">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">惩罚日期：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" placeholder="yyyy-MM-dd" id="punishTime" name="punishTime">
                </div>
            </div>
        </div>
    </div>
    <div class="layui-form-item layui-form-text result">
        <label class="layui-form-label"><i class="layui-icon layui-icon-about"></i>惩罚原因：</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea" id="punishResult" name="punishResult"></textarea>
        </div>
    </div>
</form>

<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/addRewards.js" charset="UTF-8"></script>
</body>
</html>
