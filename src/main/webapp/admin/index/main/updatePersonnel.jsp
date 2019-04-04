<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/4/3
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../css/addPersonnel.css">
</head>
<body>

<form action="/insertDossierInfo" method="post" class="layui-form addForm" id="myForm">
    <table border="1" width="1100px"  >
        <input type="text" name="personnelId" value="${dossierInfo.personnelId}" readonly style="display:none"/>
        <tr>
            <td >姓名</td>
            <td>
                <input type="text"  name="personnelName" lay-verify="required"
                       autocomplete="off" class="layui-input personnelName" value="${dossierInfo.personnelName}"/></td>
            <td >性别</td>
            <td >
                <select name="sex"  class="layui-input-block sex" lay-verify="required" value="${dossierInfo.sex}">
                    <c:if test="${num=='0'}">
                        <option value="${num}">${dossierInfo.sex}</option>
                        <option value="1">女</option>
                    </c:if>
                    <c:if test="${num =='1'}">
                        <option value="${num}">${dossierInfo.sex}</option>
                        <option value="0">男</option>
                    </c:if>
                </select>
            <td >年龄</td>
            <td colspan="2"> <input type="text"  name="age"  lay-verify="age"
                                    autocomplete="off" class="layui-input" value="${dossierInfo.age}"/></td>
            <td rowspan="3" style="width: 100px">
                <input type="text" id="ppp" name="photo" style="display:none"/>
                <img class="layui-upload-img bbb" id="photo"   style="width: 99.2px;height: 117px;" src="${dossierInfo.photo}">
            </td>
        </tr>
        <tr>
            <td style="width: 100px">部门</td>
            <td  style="width: 250px">
                <input type="text"  name="department"  lay-verify="department"
                       autocomplete="off" class="layui-input" value="${dossierInfo.department}" readonly/>
            <td style="width: 100px">职位</td>
            <td  style="width: 250px">
                <input type="text"  name="position"  lay-verify="position"
                       autocomplete="off" class="layui-input" value="${dossierInfo.position}" readonly/>
           </td>
            <td style="width: 100px">职称</td>
            <td colspan="2"style="width: 300px"><input type="text"  name="positionalTile"
                                                       autocomplete="off" class="layui-input" value="${dossierInfo.positionalTile}"/></td>
        </tr>

        <tr>
            <td >民族</td>
            <td > <input type="text"  name="nationality"
                         autocomplete="off" class="layui-input" value="${dossierInfo.nationality}"/></td>
            <td >籍贯</td>
            <td > <input type="text"  name="nativeProvince"
                         autocomplete="off" class="layui-input" value="${dossierInfo.nativeProvince}"/></td>
            <td >Email</td>
            <td colspan="2" > <input type="text" name="email" lay-verify=""
                                     autocomplete="off" class="layui-input" value="${dossierInfo.email}"/></td>
        </tr>

        <tr>
            <td >政治面貌</td>
            <td > <input type="text"  name="politicalStatus"
                         autocomplete="off" class="layui-input" value="${dossierInfo.politicalStatus}" /></td>
            <td >QQ</td>
            <td> <input type="text"  name="qq"
                        autocomplete="off" class="layui-input" value="${dossierInfo.qq}" /></td>
            <td >手机</td>
            <td colspan="3" > <input type="text"  name="telephone" lay-verify=""
                                     autocomplete="off" class="layui-input" value="${dossierInfo.telephone}" /></td>
        </tr>

        <tr>
            <td>住址</td>
            <td colspan="3" > <input type="text"  name="address"
                                     autocomplete="off" class="layui-input" value="${dossierInfo.address}" /></td>
            <td>身份证号码</td>
            <td colspan="3" > <input type="text"  name="idCard" lay-verify=""
                                     autocomplete="off" class="layui-input" value="${dossierInfo.idCard}" /></td>
        </tr>

        <tr>
            <td >国籍</td>
            <td  > <input type="text"  name="citizenship"
                          autocomplete="off" class="layui-input" value="${dossierInfo.citizenship}" /></td>
            <td >出生地</td>
            <td > <input type="text"  name="birthPlace"
                         autocomplete="off" class="layui-input" value="${dossierInfo.birthPlace}" /></td>
            <td >出生日期</td>
            <td > <input type="text"  name="birthDate" id="birthDate"
                         autocomplete="off" class="layui-input" value="${dossierInfo.birthDate}" /></td>
            <td >特长</td>
            <td colspan="2"> <input type="text"  name="specialty"
                                    autocomplete="off" class="layui-input" value="${dossierInfo.specialty}" /></td>
        </tr>

        <tr>
            <td >宗教信仰</td>
            <td > <input type="text"  name="faith"
                         autocomplete="off" class="layui-input" value="${dossierInfo.faith}" /></td>
            <td >社会保障号码</td>
            <td > <input type="text" name="socialSecurityNumber" lay-verify="number"
                         autocomplete="off" class="layui-input" value="${dossierInfo.socialSecurityNumber}" /></td>

            <td >学校</td>
            <td > <input type="text" name="school"
                         autocomplete="off" class="layui-input" value="${dossierInfo.school}" /></td>
            <td >婚&nbsp姻&nbsp状&nbsp况</td>
            <td > <input type="text"  name="marriageStatus"
                         autocomplete="off" class="layui-input" value="${dossierInfo.marriageStatus}"/></td>
        </tr>

        <tr>
            <td >微信</td>
            <td > <input type="text"  name="wechat"
                         autocomplete="off" class="layui-input" value="${dossierInfo.wechat}"/></td>
            <td >学历</td>
            <td > <input type="text"  name="advancedDegree"
                         autocomplete="off" class="layui-input" value="${dossierInfo.advancedDegree}"/></td>
            <td >学历专业</td>
            <td > <input type="text"  name="professional"
                         autocomplete="off" class="layui-input" value="${dossierInfo.professional}"/></td>
            <td >教育年限</td>
            <td colspan="2"> <input type="text"  name="yearsOfEducation" lay-verify="number"
                                    autocomplete="off" class="layui-input" value="${dossierInfo.yearsOfEducation}"/></td>
        </tr>

        <tr>
            <td >基本工资</td>
            <td > <input type="text"  name="basicWage" lay-verify="number"
                         autocomplete="off" class="layui-input" value="${dossierInfo.basicWage}"></td>
            <td >开户行</td>
            <td > <input type="text"  name="bank"
                         autocomplete="off" class="layui-input" value="${dossierInfo.bank}"/>
            <td >账号</td>
            <td > <input type="text"  name="bankAccount" lay-verify="number"
                         autocomplete="off" class="layui-input" value="${dossierInfo.bankAccount}"/>
            <td >爱好</td>
            <td colspan="2"><input type="text"  name="hobby"
                                   autocomplete="off" class="layui-input" value="${dossierInfo.hobby}"></td>
        </tr>

        <tr>
            <td >进入公司日期</td>
            <td > <input type="text"  name="dateIntoCompany" id="dateIntoCompany"
                         autocomplete="off" class="layui-input" value="${dossierInfo.dateIntoCompany}"/></td>
            <td >首次签订日期</td>
            <td > <input type="text"  name="firstStartTime" id="firstStartTime"
                         autocomplete="off" class="layui-input" value="${dossierInfo.firstStartTime}"/> </td>
            <td >最后签订日期</td>
            <td > <input type="text"  name="lastEndTime" id="lastEndTime"
                         autocomplete="off" class="layui-input" value="${dossierInfo.lastEndTime}"/> </td>
            <td >信息录入时间</td>
            <td colspan="2"><input type="text"  name="informationEntryTime" id="informationEntryTime"
                                   autocomplete="off" class="layui-input" value="${dossierInfo.informationEntryTime}"/>
        </tr>


    </table>
    <table border="1" width="1100px">
        <tr>
            <td rowspan="3" >家庭关系</td>
            <td ><textarea cols="103.5" rows="5" name="familyRelationship"
                           style="width:100%;height:100%;" id="FamilyRelation" >${dossierInfo.familyRelationship}</textarea></td>
        </tr>
    </table>

    <table border="1" width="1100px">
        <tr>
            <td rowspan="3" colspan="3" >备注信息</td>
            <td ><textarea cols="103.5" rows="5" name="remark"
                           style="width:100%;height:100%;" id="Remark" >${dossierInfo.remark}</textarea></td>
        </tr>
    </table>
    </table>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="dem">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script src="../../../js/jquery.js"></script>
<script src="../../../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../js/updatePersonnel.js" type="text/javascript" charset="UTF-8"></script>
<%--<script src="../../../js/cascade.js" type="text/javascript" charset="UTF-8"></script>--%>
</body>
</html>
