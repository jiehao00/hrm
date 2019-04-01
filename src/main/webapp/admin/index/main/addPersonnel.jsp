<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
<link rel="stylesheet" type="text/css" href="../../../css/addPersonnel.css">
<body>

<form action="/insertDossierInfo" method="post" class="layui-form addForm" id="myForm">
            <table border="1" width="1100px"  >
                <tr>
                    <td >姓名</td>
                    <td >
                        <input type="text"  name="personnelName" lay-verify="required"
                               autocomplete="off" class="layui-input personnelName" value=""/></td>
                    <td >性别</td>
                    <td >
                        <select name="sex"  class="layui-input-block sex" lay-verify="required">
                            <option value="">请选择</option>
                            <option value="0">男</option>
                            <option value="1">女</option>
                        </select>
                    <td >年龄</td>
                    <td colspan="2"> <input type="text"  name="age"  lay-verify="age"
                                                                autocomplete="off" class="layui-input" /></td>
                    <td rowspan="3" style="width: 100px">
                        <input type="text" id="ppp" name="photo" style="display:none"/>
                                <img class="layui-upload-img bbb" id="photo"  name="photo" style="width: 99.2px;height: 117px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px">部门</td>
                    <td  style="width: 250px"><select id="department" name="department"  lay-filter="department" lay-verify="required"></select></td>
                    <td style="width: 100px">职位</td>
                    <td  style="width: 250px"><select name="position" id="position" class="layui-input-block " lay-verify="required"></select></td>
                    <td style="width: 100px">职称</td>
                    <td colspan="2"style="width: 300px"><input type="text"  name="positionalTile"
                                            autocomplete="off" class="layui-input" value=""/></td>
                </tr>

                <tr>
                    <td >民族</td>
                    <td > <input type="text"  name="nationality"
                                 autocomplete="off" class="layui-input"/></td>
                    <td >籍贯</td>
                    <td > <input type="text"  name="nativeProvince"
                                 autocomplete="off" class="layui-input"/></td>
                    <td >Email</td>
                    <td colspan="2" > <input type="text" name="email" lay-verify=""
                                             autocomplete="off" class="layui-input" /></td>
                </tr>

                <tr>
                    <td >政治面貌</td>
                    <td > <input type="text"  name="politicalStatus"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >QQ</td>
                    <td> <input type="text"  name="qq"
                                autocomplete="off" class="layui-input" /></td>
                    <td >手机</td>
                    <td colspan="3" > <input type="text"  name="telephone" lay-verify=""
                                             autocomplete="off" class="layui-input" /></td>
                </tr>

                <tr>
                    <td>住址</td>
                    <td colspan="3" > <input type="text"  name="address"
                                             autocomplete="off" class="layui-input"/></td>
                    <td>身份证号码</td>
                    <td colspan="3" > <input type="text"  name="idCard" lay-verify=""
                                                autocomplete="off" class="layui-input"/></td>
                </tr>

                <tr>
                    <td >国籍</td>
                    <td  > <input type="text"  name="citizenship"
                                 autocomplete="off" class="layui-input"/></td>
                    <td >出生地</td>
                    <td > <input type="text"  name="birthPlace"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >出生日期</td>
                    <td > <input type="text"  name="birthDate" id="birthDate"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >特长</td>
                    <td colspan="2"> <input type="text"  name="specialty"
                                 autocomplete="off" class="layui-input" /></td>
                </tr>

                <tr>
                    <td >宗教信仰</td>
                    <td > <input type="text"  name="faith"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >社会保障号码</td>
                    <td > <input type="text" name="socialSecurityNumber" lay-verify="number"
                                            autocomplete="off" class="layui-input"/></td>

                    <td >学校</td>
                    <td > <input type="text" name="school"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >婚&nbsp姻&nbsp状&nbsp况</td>
                    <td > <input type="text"  name="marriageStatus"
                                 autocomplete="off" class="layui-input" /></td>
                </tr>

                <tr>
                    <td >微信</td>
                    <td > <input type="text"  name="wechat"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >学历</td>
                    <td > <input type="text"  name="advancedDegree"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >学历专业</td>
                    <td > <input type="text"  name="professional"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >教育年限</td>
                    <td colspan="2"> <input type="text"  name="yearsOfEducation" lay-verify="number"
                                 autocomplete="off" class="layui-input" /></td>
                </tr>

                <tr>
                    <td >基本工资</td>
                    <td > <input type="text"  name="basicWage" lay-verify="number"
                                 autocomplete="off" class="layui-input" ></td>
                    <td >开户行</td>
                    <td > <input type="text"  name="bank"
                                 autocomplete="off" class="layui-input" />
                    <td >账号</td>
                    <td > <input type="text"  name="bankAccount" lay-verify="number"
                                 autocomplete="off" class="layui-input" />
                    <td >爱好</td>
                    <td colspan="2"><input type="text"  name="hobby"
                                autocomplete="off" class="layui-input" ></td>
                </tr>

                <tr>
                    <td >进入公司日期</td>
                    <td > <input type="text"  name="dateIntoCompany" id="dateIntoCompany"
                                 autocomplete="off" class="layui-input" /></td>
                    <td >首次签订日期</td>
                    <td > <input type="text"  name="firstStartTime" id="firstStartTime"
                                 autocomplete="off" class="layui-input"/> </td>
                    <td >最后签订日期</td>
                    <td > <input type="text"  name="lastEndTime" id="lastEndTime"
                                 autocomplete="off" class="layui-input"/> </td>
                    <td >信息录入时间</td>
                    <td colspan="2"><input type="text"  name="informationEntryTime" id="informationEntryTime"
                                autocomplete="off" class="layui-input"/>
                </tr>


            </table>
            <table border="1" width="1100px">
                <tr>
                    <td rowspan="3" >家庭关系</td>
                    <td ><textarea cols="103.5" rows="5" name="familyRelationship"
                                   style="width:100%;height:100%;" id="FamilyRelation" ></textarea></td>
                </tr>
            </table>

            <table border="1" width="1100px">
                <tr>
                    <td rowspan="3" colspan="3" >备注信息</td>
                    <td ><textarea cols="103.5" rows="5" name="remark"
                                   style="width:100%;height:100%;" id="Remark" ></textarea></td>
                </tr>
            </table>
            </table>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
</form>

<script src="../../../js/jquery.js"></script>
<script src="../../../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../js/addPersonnel.js" type="text/javascript" charset="UTF-8"></script>
<script src="../../../js/cascade.js" type="text/javascript" charset="UTF-8"></script>
</body>
</html>
