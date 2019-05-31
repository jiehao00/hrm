<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/31
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
    <style type="text/css">
        .layui-table-cell {
            height: auto;
            overflow: visible;
            white-space:initial;
            text-overflow: inherit;
        }
    </style>
</head>
<body>

<table id="manageAnnouncement"  lay-filter="manageAnnouncement"></table>

<script type="text/html" id="toolbarDemo">
    <div class="demoTable">
        <button class="layui-btn layui-btn-sm" id="addAnnouncement">
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
<script src="../../../js/announcementManage.js" type="text/javascript" charset="UTF-8"></script>
</body>
</html>
