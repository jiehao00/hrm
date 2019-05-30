<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/30
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="../../../css/personnelCenter.css" media="all">
</head>
<body style="background-color: rgba(245,245,245,0.49)">
<div class="wholePage">
    <div class="layui-card">
        <div class="layui-card-body">
            <div class="top">
                <div class="image">
                    <img src="../../../images/photo.jpg" class="photo" id="photo" width="120" height="120">
                </div>
                <div class="rightPart">
                    <div class="name">
                        <h1><%=request.getSession().getAttribute("userName")%></h1>
                    </div>
                    <div class="link-top"></div>
                    <div class="top-bottom">
                       <ul>
                           <li>
                               <i class="layui-icon layui-icon-cellphone"></i>
                               <span>手机号：</span>
                               <span class="phone" id="phone"></span>
                           </li >
                           <li class="top-bottom">
                               <i class="iconfont">&#xe603;</i>
                               <span>邮箱：</span>
                               <span class="email" id="email"></span>
                           </li>
                           <li class="top-bottom">
                               <i class="layui-icon layui-icon-login-wechat"></i>
                               <span>微信：</span>
                               <span class="weChat" id="weChat"></span>
                           </li>
                       </ul>
                    </div>
                </div>
            </div>

            <div class="center">
                <div>
                    <i class="layui-icon layui-icon-template-1" style="font-size: 30px; color: #00FF00;"></i>&nbsp&nbsp&nbsp&nbsp
                    <span class="companyName" id="companyName"></span>
                </div>
            </div>

            <div class="link-bottom" style="height: 100px">
                    <div class="bottom_1">
                        <div class="bottom_left">
                            <label style="float: left">
                                <span>姓名</span>
                            </label>
                            <div style="width: 100px;margin-left: 50px">
                                <p class="name"><%=request.getSession().getAttribute("userName")%></p>
                            </div>
                        </div>

                        <div class="bottom_right">
                            <label style="float: left">
                                <span>工号&nbsp&nbsp&nbsp&nbsp&nbsp</span>
                            </label>
                            <div>
                                <p class="personnelId" id="personnelId"> </p>
                            </div>
                        </div>
                    </div>

                    <div class="bottom_1">
                        <div class="bottom_left">
                            <label style="float: left">
                                <span>部门</span>
                            </label>
                            <div style="width: 100px;margin-left: 50px">
                                <p class="department" id="department"></p>
                            </div>
                        </div>
                        <div class="bottom_right">
                            <label style="float: left">
                                <span>职位&nbsp&nbsp&nbsp&nbsp&nbsp</span>
                            </label>
                            <div>
                                <p class="position" id="position"></p>
                            </div>
                        </div>
                    </div>


                <div class="bottom_1">
                    <div class="bottom_left">
                        <label style="float: left">
                            <span>职称</span>
                        </label>
                        <div style="width: 100px;margin-left: 50px">
                            <p class="positionalTile" id="positionalTile"></p>
                        </div>
                    </div>
                    <div class="bottom_right">
                        <label style="float: left">
                            <span >专业&nbsp&nbsp&nbsp&nbsp&nbsp</span>
                        </label>
                        <div>
                            <p class="professional" id="professional"></p>
                        </div>
                    </div>
                </div>

                <div class="bottom_1">
                    <div class="bottom_left">
                        <label style="float: left">
                            <span>工作地址 </span>
                        </label>
                        <div style="width: 100px;margin-left: 75px">
                            <p class="companyAddress" id="companyAddress"></p>
                        </div>
                    </div>
                    <div class="bottom_right">
                        <label style="float: left">
                            <span>入职时间&nbsp&nbsp&nbsp&nbsp&nbsp</span>
                        </label>
                        <div >
                            <p class="dateIntoCompany" id="dateIntoCompany"></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="../../../js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../js/personnelCenter.js" type="text/javascript" charset="UTF-8"></script>
</body>
</html>
