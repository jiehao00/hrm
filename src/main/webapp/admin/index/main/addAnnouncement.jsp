<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/31
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
    <style type="text/css">
        .layui-form {
            padding-left: 26px;
            padding-top: 50px;
        }
        .layui-form-text{
            width: 500px;
        }
    </style>
</head>
<body>
<form class="layui-form layui-form-pane">
    <div class="rewardsMessage">
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label ttt"><i class="layui-icon layui-icon-about"></i>公告：</label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" class="layui-textarea" id="announcement" name="announcement"></textarea>
            </div>
        </div>
    </div>


</form>


</body>
</html>
