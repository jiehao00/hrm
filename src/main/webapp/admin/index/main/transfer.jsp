<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/4
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/transfer.css">
</head>
<body>
<from class="layui-form ">
    <div class="terminationForm">
        <table >
            <tr class="message">
                <td >员工id：</td>
                <td> <input  class="layui-input" name="personnelId" id="personnelId" autocomplete="off"  readonly /></td>
                <td ><p class="rightMessage">员工名字:</p></td>
                <td> <input  class="layui-input" name="personnelName" id="personnelName" autocomplete="off" readonly /></td>
            </tr>
            <tr class="message">
                <td >调前部门:</td>
                <td> <input  class="layui-input" name="departmentBefore" id="departmentBefore" autocomplete="off"  readonly/></td>
                <td ><p class="rightMessage">调前职位:</p></td>
                <td><input  class="layui-input" name="positionBefore" id="positionBefore" autocomplete="off" readonly/></td>
            </tr>
            <tr class="message">
                <td >调前职称:</td>
                <td><input  class="layui-input" name="positionalTileBefore" id="positionalTileBefore" autocomplete="off" readonly/></td>
                <td ><p class="rightMessage">调后部门:</p></td>
                <td><select id="department" name="departmentAfter"  lay-filter="department" lay-verify="required"></select></td>
            </tr>
            <tr class="message">
                <td >调后职位:</td>
                <td><select  id="position" name="positionAfter" class="layui-input-block "></select></td>
                <td ><p class="rightMessage">调后职称:</p></td>
                <td><input  class="layui-input" name="positionalTileAfter" id="positionalTileAfter" autocomplete="off"/></td>
            </tr>
            <tr class="message">
                <td >调职时间:</td>
                <td><input  class="layui-input" name="transferredTime" id="transferredTime" autocomplete="off" /></td>
            </tr>
        </table>
        <table>
            <tr class="message">
                <td >调职原因:</td>
                <td><textarea class="layui-input" name="transferredResult" id="transferredResult"> </textarea></td>
            </tr>
        </table>
    </div>
</from>
<script src="../../../layui/layui.js"></script>
<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/cascade.js" charset="UTF-8"></script>
<script>
    layui.use(['form','laydate'], function(){
        var form = layui.form;
        var laydate=layui.laydate;
        laydate.render({
            elem: '#transferredTime',
            type:'date',
            showBottom: false
        });
    });
</script>
</body>
</html>
