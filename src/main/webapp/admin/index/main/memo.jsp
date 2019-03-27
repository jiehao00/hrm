<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/3/24
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
  <style type="text/css">
      .memo{
          resize: none;
          width: 640px;
          height: 100px;
          padding-top: 10px;
          padding-left: 10px;
      }
      .time{
          margin-top: 20px;
          margin-left: 20px;
      }
      .remind{
          margin-top: 20px;
          margin-left: 20px;
      }
  </style>
</head>
<body  style="overflow:hidden;">

<div style="padding-left: 10px ; padding-top: 10px" >
<textarea placeholder="请输入备忘" class="memo"></textarea>
</div>
<div class="time">
时间：<input type="text" id="test1"/>
</div>

<div class="remind">提醒：<select>
    <option>提醒</option>
    <option>不提醒</option>
</select></div>
<script src="../../../layui/layui.js"></script>
<script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        //执行一个laydate实例
        laydate.render({
            elem: '#test1',
            type:'datetime',
        });
    });
</script>
</body>
</html>
