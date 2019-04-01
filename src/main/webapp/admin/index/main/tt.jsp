<%--
  Created by IntelliJ IDEA.
  User: 41147
  Date: 2019/3/19
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/listCategory" method="post">
    <table >
        <tr>
            <table border="1" width="1200px"  >
                <tr>
                    <td bgcolor=#28FF28>姓名</td>
                    <td id="FMechanismName"><input type="text" name="FMechanismName"
                                                   style="width:100%;height:100%;" /></td>
                    <td bgcolor=#28FF28>性别</td>
                    <td id="SMechanismName"><input type="text" name="SMechanismName"
                                                   style="width:100%;height:100%;" /></td>
                    <td bgcolor=#28FF28>年龄</td>
                    <td colspan="2" id="TMechanismName"><input type="text" name="TMechanismName"
                                                               style="width:100%;height:100%;" /></td>
                    <td rowspan="5"><input type="file" name="Photo"
                                           style="width:100%;height:100%;" /></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>部门</td>
                    <td id="JType"><input type="text" name="JType"
                                          style="width:100%;height:100%;" /></td>
                    <td bgcolor=#28FF28>职位</td>
                    <td id="jobName"><input type="text" name="jobName"
                                            style="width:100%;height:100%;" /></td>
                    <td bgcolor=#28FF28>职称</td>
                    <td colspan="2" ><input type="text" name="Rank"
                                            style="width:100%;height:100%;" id="Rank"/></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>民族</td>
                    <td ><input type="text" name="EmpName"
                                style="width:100%;height:100%;" id="EmpName"/></td>
                    <td bgcolor=#28FF28>籍贯</td>
                    <td ><input type="text" name="Gender"
                                style="width:100%;height:100%;" id="Gender"/></td>
                    <td bgcolor=#28FF28>Email</td>
                    <td colspan="2" ><input type="text" name="Email"
                                            style="width:100%;height:100%;" id="Email" /></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>政治面貌</td>
                    <td ><input type="text" name="Phone"
                                style="width:100%;height:100%;" id="Phone" /></td>
                    <td bgcolor=#28FF28>QQ</td>
                    <td><input type="text" name="QQ"
                               style="width:100%;height:100%;"  id="QQ"/></td>
                    <td bgcolor=#28FF28>手机</td>
                    <td colspan="2" ><input type="text" name="Telephone"
                                                          style="width:100%;height:100%;" id="Telephone"/></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>住址</td>
                    <td colspan="3" ><input type="text" name="Adress"
                                            style="width:100%;height:100%;" id="Adress"/></td>
                    <td bgcolor=#28FF28>身份证号码</td>
                    <td colspan="2" ><input type="text" name="PostalCode"
                                            style="width:100%;height:100%;" id="PostalCode"/></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>国籍</td>
                    <td ><input type="text" name="Nationality"
                                style="width:100%;height:100%;" id="Nationality"/></td>
                    <td bgcolor=#28FF28>出生地</td>
                    <td ><input type="text" name="Birthplace"
                                style="width:100%;height:100%;" id="Birthplace"/></td>
                    <td bgcolor=#28FF28>出生日期</td>
                    <td ><input type="text" name="Birthdate"
                                style="width:100%;height:100%;" id="Birthdate"/></td>
                    <td bgcolor=#28FF28>民族</td>
                    <td ><input type="text" name="Nation"
                                style="width:100%;height:100%;" id="Nation"/></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>宗教信仰</td>
                    <td ><input type="text" name="Religion"
                                style="width:100%;height:100%;" id="Religion"/></td>
                    <td bgcolor=#28FF28>政治面貌</td>
                    <td ><input type="text" name="Political"
                                style="width:100%;height:100%;" id="Political"/></td>
                    <td bgcolor=#28FF28>身份证号码</td>
                    <td ><input type="text" name="ID"
                                style="width:100%;height:100%;" id="ID"/></td>
                    <td bgcolor=#28FF28>社会保障号码</td>
                    <td ><input type="text" name="SocialNumber"
                                style="width:100%;height:100%;" id="SocialNumber"/></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>微信</td>
                    <td ><input type="text" name="Age"
                                style="width:100%;height:100%;" id="Age"/></td>
                    <td bgcolor=#28FF28>学历</td>
                    <td ><input type="text" name="Record"
                                style="width:100%;height:100%;" id="Record"/></td>
                    <td bgcolor=#28FF28>学历专业</td>
                    <td ><input type="text" name="Profession"
                                style="width:100%;height:100%;" id="Profession"/></td>
                    <td bgcolor=#28FF28>教育年限</td>
                    <td ><input type="text" name="EducationYear"
                                style="width:100%;height:100%;" id="EducationYear"/></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>基本工资</td>
                    <td ><input type="text" name="SalaryStandard"
                                style="width:100%;height:100%;" id="SalaryStandard"/></td>
                    <td bgcolor=#28FF28>开户行</td>
                    <td ><input type="text" name="Bank"
                                style="width:100%;height:100%;" id="Bank"/></td>
                    <td bgcolor=#28FF28>账号</td>
                    <td ><input type="text" name="BankId"
                                style="width:100%;height:100%;" id="BankId"/></td>
                    <td bgcolor=#28FF28></td>
                    <td ></td>
                </tr>

                <tr>
                    <td bgcolor=#28FF28>进入公司日期</td>
                    <td ><input type="text" name="SalaryStandard"
                                style="width:100%;height:100%;" /></td>
                    <td bgcolor=#28FF28>首次签订日期</td>
                    <td ><input type="text" name="Bank"
                                style="width:100%;height:100%;" /></td>
                    <td bgcolor=#28FF28>最后签订日期</td>
                    <td ><input type="text" name="BankId"
                                style="width:100%;height:100%;"/></td>
                    <td bgcolor=#28FF28></td>
                    <td ></td>
                </tr>


            </table>
            <table border="1" width="1200px">
                <tr>
                    <td rowspan="3" bgcolor=#28FF28>家庭关系</td>
                    <td ><textarea cols="146.5" rows="5" name="FamilyRelation"
                                   style="width:100%;height:100%;" id="FamilyRelation"></textarea></td>
                </tr>
            </table>

            <table border="1" width="1200px">
                <tr>
                    <td rowspan="3" colspan="3" bgcolor=#28FF28>备注信息</td>
                    <td ><textarea cols="146.5" rows="5" name="Remark"
                                   style="width:100%;height:100%;" id="Remark"></textarea></td>
                </tr>
            </table>
    </table>
</form>
</body>
</html>
