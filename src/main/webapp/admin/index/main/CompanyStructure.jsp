<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/3/19
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../../css/jquery.jOrgChart.css">
    <style>
        a {
            text-decoration: none;
            color: #fff;
            font-size: 12px;
        }
        .jOrgChart .node {
            width: 120px;
            height: 50px;
            line-height: 50px;
            border-radius: 4px;
            margin: 0 8px;
        }
        #jOrgChart{
            margin-top: 50px;
            margin-left:100px;
        }
    </style>
</head>
<body>
<div id='jOrgChart'></div>
<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/jquery.jOrgChart.js" charset="UTF-8"></script>
<script type='text/javascript'>
    $(function(){
        //数据返回
        $.ajax({
            url: "/treeToList",
            type: 'GET',
            dataType: 'JSON',
            success: function(result){
                var showlist = $("<ul id='org' style='display:none'></ul>");
                showall(result, showlist);
                $("#jOrgChart").append(showlist);
                $("#org").jOrgChart( {
                    chartElement : '#jOrgChart',//指定在某个dom生成jorgchart
                     dragAndDrop : false //设置是否可拖动
                });

            }
        });
    });
    function showall(menu_list, parent) {
        $.each(menu_list, function(index, val) {
            if(val.children !=null  ){
                var li = $("<li></li>");
                li.append("<a href='javascript:void(0)' ;>"+val.name+"</a>").append("<ul></ul>").appendTo(parent);
                //递归显示
                showall(val.children, $(li).children().eq(1));
            }else{
                $("<li></li>").append("<a href='javascript:void(0)';>"+val.name+"</a>").appendTo(parent);
            }
        });
    }
</script>
</body>



</html>
