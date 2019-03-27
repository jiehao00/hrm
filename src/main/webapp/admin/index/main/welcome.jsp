<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../../static/admin/css/main/css.css"/>
    <link rel="stylesheet" type="text/css" href="../../../static/admin/css/main/reset.css"/>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/welcome.css">
</head>
<body  style="overflow:hidden;" >
<div>
    <!--标题-->
    <div class="layui-card" style="height: 100px" >
        <h1>既然选择了远方，便只顾风雨兼程</h1>
    </div>
     <!--中间-->
    <div >
        <!--日历-->
       <div  id="rili">
        <div id='calendar'></div>
    </div>

       <div class="middle">

        <div class="layui-card memo">
            <div class="layui-card-header" >
                <p class="ttt">备忘</p>
                <p class="addMemo">
                    <i class="layui-icon layui-icon-add-1" ></i>
                    添加备忘</p>
            </div>

            <div class="layui-card-body" >
                <ul class="con">
                    <li></li>
                </ul>


            </div>
        </div>

        <div class="layui-card user">
            <div class="layui-card-header ttt">员工</div>
            <div class="layui-card-body">
                <li></li>
            </div>

    </div>
    </div>


       <div class="layui-card announcement" >
        <div class="layui-card-header ">公告</div>
        <div class="layui-card-body">
        </div>
       </div>
    </div >

    <!--底部-->
    <div class="bottom">
        <div class="layui-card mmm" >
            <%--<div class="layui-card-header "></div>--%>
            <div class="layui-card-body">
            </div>
        </div>
    </div>



</div>

<script src="../../../layui/layui.js"></script>

<script src="${pageContext.request.contextPath}/../../../static/admin/js/jquery-1.10.2.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/../../../static/admin/js/main/index.js"></script>
<script>
    layui.use(['element','layer','jquery'],function () {
        var element=layui.element;
        var layer = layui.layer;
        $ = layui.jquery,
        $('.addMemo').click(function() {
            layer.open({
                type: 2,
                offset: ['50px','100px'],
                title:'添加备忘',
                maxmin: true,
                area: ['50%', '86%'],
                content: 'memo.jsp',
                btn: ['确定', '关闭'],
                yes:function(index,layero){
                    var body = layer.getChildFrame('body', index); //得到iframe页的body内容
                    var memo=body.find(".memo").val();
                    var time=body.find("#test1").val();
                    console.log(time);
                     $(".con").append("<li class='normaltab' >"+memo+time+"</li>");
                   layer.close(index);

                }
            });
        });

    })


</script>


</body>
</html>