<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/16
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/updateCourse.css">

</head>
<body>
<form class="layui-form layui-form-pane" id="CourseForm">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 课程名称：</label>
            <div class="layui-inline">
                <input type="text" class="layui-input" id="courseName" name="courseName">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">培训主办部门：</label>
            <div class="layui-inline">
                <input type="text" class="layui-input" id="courseDepartment" name="courseDepartment">
                <%--<select id="courseDepartment" name="courseDepartment"  lay-filter="department" lay-verify="required"></select>--%>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label"><i class="layui-icon layui-icon-user"></i> 授课对象：</label>
            <div class="layui-inline">
                <input type="text" class="layui-input" id="studentsType" name="studentsType">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">授课时数：</label>
            <div class="layui-inline">
                <input type="text" class="layui-input" id="teachingHours" name="teachingHours">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label"><i class="layui-icon layui-icon-date"></i> 开始日期：</label>
            <div class="layui-inline">
                <input type="text" class="layui-input" placeholder="yyyy-MM-dd" id="plannedStartTime" name="plannedStartTime">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label"><i class="layui-icon layui-icon-date"></i> 结束日期：</label>
            <div class="layui-inline">
                <input type="text" class="layui-input" placeholder="yyyy-MM-dd" id="plannedEndTime" name="plannedEndTime">
            </div>
        </div>

    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label ttt"><i class="layui-icon layui-icon-about"></i>课程介绍：</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea" id="courseIntroduction" name="courseIntroduction"></textarea>
        </div>
    </div>
</form>
<script src="../../../js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script>
    layui.use(['form','laydate'], function(){
        var form = layui.form;
        var laydate=layui.laydate;
        laydate.render({
            elem: '#plannedStartTime',
            type:'date',
            showBottom: false
        });
        laydate.render({
            elem: '#plannedEndTime',
            type:'date',
            showBottom: false
        });
    });
</script>
</body>
</html>
