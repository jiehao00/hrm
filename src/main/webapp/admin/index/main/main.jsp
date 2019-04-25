<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/3/20
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>人事管理系统</title>
    <link rel="stylesheet" type="text/css" href="../../../static/admin/layui/css/layui.css"/>
    <link rel="stylesheet" type="text/css" href="../../../static/admin/css/admin.css"/>
</head>
<body>
<div class="main-layout" id='main-layout'>
    <!--侧边栏-->
    <div class="main-layout-side">
        <div class="m-logo">
        </div>
        <ul class="layui-nav layui-nav-tree" lay-filter="leftNav">
            <li class="layui-nav-item layui-nav-itemed">
                <a href="javascript:;"><i class="iconfont">&#xe607;</i>组织架构</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/admin/index/main/companyInfo.jsp" data-id='1' data-text="公司简介"><span class="l-line"></span>公司简介</a></dd>
                    <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/admin/index/main/CompanyStructure.jsp" data-id='11' data-text="组织结构"><span class="l-line"></span>组织结构</a></dd>
                    <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/admin/index/main/manageDepartmentAndPosition.jsp" data-id='12' data-text="职位部门"><span class="l-line"></span>职位部门</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="iconfont">&#xe608;</i>员工管理</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/admin/index/main/addPersonnel.jsp" data-id='3' data-text="添加员工"><span class="l-line"></span>添加员工</a></dd>
                    <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/admin/index/main/managePersonnel.jsp" data-id='7' data-text="管理员工"><span class="l-line"></span>管理员工</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="iconfont">&#xe604;</i>培训发展</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;"data-url="${pageContext.request.contextPath}/admin/index/main/addCourse.jsp" data-id="8" data-text="课程管理"><span class="l-line"></span>课程管理</a></dd>
                    <dd><a href="javascript:;"data-url="${pageContext.request.contextPath}/admin/index/main/manageCourse.jsp" data-id="9" data-text="培训课程"><span class="l-line"></span>培训课程</a></dd>
                    <dd><a href="javascript:;"data-url="${pageContext.request.contextPath}/admin/index/main/tt.jsp" data-id="10" data-text="申请记录"><span class="l-line"></span>申请记录</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="iconfont">&#xe60c;</i>友情链接</a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="iconfont">&#xe60a;</i>RBAC</a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;" data-url="../email.html" data-id='4' data-text="邮件系统"><i class="iconfont">&#xe603;</i>邮件系统</a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="iconfont">&#xe60d;</i>生成静态</a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="iconfont">&#xe600;</i>备份管理</a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;" data-url="../admin-info.html" data-id='5' data-text="个人信息"><i class="iconfont">&#xe606;</i>个人信息</a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;" data-url="../system.html" data-id='6' data-text="系统设置"><i class="iconfont">&#xe60b;</i>系统设置</a>
            </li>
        </ul>
    </div>
    <!--右侧内容-->
    <div class="main-layout-container">
        <!--头部-->
        <div class="main-layout-header">
            <div class="menu-btn" id="hideBtn">
                <a href="javascript:;">
                    <span class="iconfont">&#xe60e;</span>
                </a>
            </div>
            <ul class="layui-nav" lay-filter="rightNav">
                <li class="layui-nav-item"><a href="javascript:;" data-url="../email.html" data-id='4' data-text="邮件系统"><i class="iconfont">&#xe603;</i></a></li>
                <li class="layui-nav-item">
                    <a href="javascript:;" data-url="../admin-info.html" data-id='5' data-text="个人信息">超级管理员</a>
                </li>
                <li class="layui-nav-item"><a href="javascript:;">退出</a></li>
            </ul>
        </div>
        <!--主体内容-->
        <div class="main-layout-body">
            <!--tab 切换-->
            <div class="layui-tab layui-tab-brief main-layout-tab" lay-filter="tab" lay-allowClose="true">
                <ul class="layui-tab-title">
                    <li class="layui-this welcome">后台主页</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show" style="background: #f5f5f5;">
                        <!--1-->
                        <iframe src="welcome.jsp" width="100%" height="100%" name="iframe" scrolling="auto" class="iframe" framborder="0"></iframe>

                        <!--1end-->
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--遮罩-->
    <div class="main-mask">

    </div>
</div>
<script type="text/javascript">
    var scope={
        link:'./welcome.html'
    }
</script>
<%--<script src="${pageContext.request.contextPath}/../../../static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>--%>
<script src="../../../static/admin/layui/layui.js"></script>
<script src="${pageContext.request.contextPath}/../../../static/admin/js/common.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/../../../static/admin/js/main.js" type="text/javascript" charset="utf-8"></script>

</body>
</html>
