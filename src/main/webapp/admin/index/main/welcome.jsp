<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../../static/admin/css/main/css.css"/>
    <link rel="stylesheet" type="text/css" href="../../../static/admin/css/main/reset.css">
</head>
<body style="background: #fbfbfb">
<div>
    <!--标题-->
    <div style="height: 100px">
        <h1>既然选择了远方，便只顾风雨兼程</h1>
    </div>

    <!--日历-->
    <div style="width: 400px;height: 360px;" id="rili">
        <div id='calendar'></div>
    </div>



</div>


<%--<!--日历-->--%>
<%--<div style="width: 1200px;height: 342px;margin: 10px auto;" id="rili">--%>
    <%--<div id='calendar'></div>--%>
<%--</div>--%>

<script src="${pageContext.request.contextPath}/../../../static/admin/js/jquery-1.10.2.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/../../../static/admin/js/main/index.js"></script>
</body>
</html>
