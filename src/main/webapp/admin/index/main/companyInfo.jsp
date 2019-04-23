<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/17
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/companyInfo.css">
</head>
<body>
<form class="layui-form layui-form-pane" id="CompanyForm">
    <table>
        <tr>
            <td class="companyButton">
                <button class="layui-btn" lay-submit lay-filter="addCourse" id="edit">编辑</button>
            </td>
        </tr>
    </table>
        <table style=" border-spacing:110px 110px;">
        <tr>
            <td><label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 公司名字：</label></td>
            <th>${companyInfo.companyName}</th>
        </tr>
        <tr>
            <td class="companyTr"><label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 法人代表：</label></td>
            <th class="companyTr">${companyInfo.legalRepresentative}</th>
        </tr>

        <tr >
            <td class="companyTr"><label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 公司地址：</label></td>
            <th class="companyTr">${companyInfo.companyAddress}</th>
        </tr>

        <tr >
            <td class="companyTr"><label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 公司电话：</label></td>
            <th class="companyTr">${companyInfo.companyTelephone}</th>
        </tr>

        <tr>
            <td class="companyTr"><label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 公司网址：</label></td>
            <th class="companyTr">${companyInfo.companyWeb}</th>
        </tr>
    </table>
    <table>
        <tr>
            <td class="companyTr"><label class="layui-form-label"><i class="layui-icon layui-icon-face-smile"></i> 公司介绍：</label></td>
            <th class="companyTr">${companyInfo.companyIntroduction}</th>
        </tr>
    </table>
    <div class="uploadPhoto">
        <input type="text" id="ppp" name="photo" style="display:none"/>
        <img class="layui-upload-img bbb" id="photo"   style="width: 99.2px;height: 117px;">
    </div>
</form>

<script type="text/javascript" src="../../../js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../layui/layui.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/manageCompany.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../../js/companyMessage.js" charset="UTF-8"></script>
</body>
</html>
