<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/3
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/termination.css">
</head>
<body>
<from class="layui-form ">
    <div class="terminationForm">
        <table >
            <tr class="message">
                <td >员工id：</td>
                <td> <input  class="layui-input" name="personnelId" id="personnelId" autocomplete="off"  readonly /></td>

            </tr>
            <tr class="message">
                <td >员工名字:</td>
                <td> <input  class="layui-input" name="personnelName" id="personnelName" autocomplete="off" readonly /></td>

            </tr>
            <tr class="message">
                <td >员工部门:</td>
                <td> <input  class="layui-input" name="department" id="department" autocomplete="off"  readonly/></td>
            </tr>
            <tr class="message">
                <td >职位:</td>
                <td><input  class="layui-input" name="position" id="position" autocomplete="off" readonly/></td>
            </tr>
            <tr class="message">
                <td >解聘时间:</td>
                <td><input  class="layui-input" name="terminationTime" id="terminationTime" autocomplete="off" /></td>
            </tr>
            <tr class="message">
                <td >停薪时间:</td>
                <td><input  class="layui-input" name="stopSalaryTime" id="stopSalaryTime" autocomplete="off" /></td>
            </tr>
        </table>
        <table>
            <tr class="message">
                <td >解聘原因:</td>
                <td><textarea class="layui-input" name="terminationResult" id="terminationResult"> </textarea></td>
            </tr>

        </table>
    </div>
</from>
<script src="../../../layui/layui.js"></script>
<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script>
    layui.use(['form','laydate'], function(){
        var form = layui.form;
        var laydate=layui.laydate;
        laydate.render({
            elem: '#terminationTime',
            type:'date',
            showBottom: false
        });
        laydate.render({
            elem: '#stopSalaryTime',
            type:'date',
            showBottom: false
        });
    });
</script>
</body>
</html>
