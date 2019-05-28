<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/5/29
  Time: 5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="../../../css/addInsurance.css">
</head>
<body>
<form class="layui-form layui-form-pane">
    <div class="rewardsMessage">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">养老保险：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="proOfRetirementInsurance" name="proOfRetirementInsurance" />
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">医疗保险：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="proOfMedicalInsurance" name="proOfMedicalInsurance" />
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">失业保险：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="proOfEmploymentInsurance" name="proOfEmploymentInsurance" />
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">工伤保险：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input" id="proOfInjuryInsurance" name="proOfInjuryInsurance" />
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">生育保险：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input"  id="proOfMaternityInsurance" name="proOfMaternityInsurance">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">住房公积金：</label>
                <div class="layui-inline">
                    <input type="text" class="layui-input"  id="proOfHousingFund" name="proOfHousingFund">
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>
