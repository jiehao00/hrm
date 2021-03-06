<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
     <link type="text/css" rel="stylesheet" href="../../../static/admin/css/login/style.css">
    <%--<script src="${pageContext.request.contextPath}/../../../static/admin/js/jquery-1.10.2.js"></script>--%>
    <script src="${pageContext.request.contextPath}/../../../static/admin/js/login/img_ver.js"></script>
    <script src="../../../js/jquery.js"></script>
    <style>
        .bxs-row {
            margin-bottom:12px;
        }
        .logo-box {
            width:404px;
            margin:120px auto;
            border:1px solid #e5e5e5;
            border-radius:4px;
            box-shadow:0 4px 18px rgba(0,0,0,0.2);
            position:relative;
            overflow:hidden;
            height:360px;
        }
        .login {
            position:absolute;
            width:320px;left:0;
            top:0;
            padding: 42px 42px 36px;
            transition:all 0.8s;
        }
        .username,.password,.btn {
            height: 44px;
            width: 100%;
            padding: 0 10px;
            border: 1px solid #9da3a6;
            background: #fff;
            text-overflow: ellipsis;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            -webkit-border-radius: 4px;
            -moz-border-radius: 4px;
            -khtml-border-radius: 4px;
            border-radius: 4px;
            -webkit-box-shadow: none;
            -moz-box-shadow: none;
            box-shadow: none;
            color: #000;
            font-size: 1em;
            font-family: Helvetica,Arial,sans-serif;
            font-weight: 400;
            direction: ltr;
            font-size:13px;
        }
        .submit {
            background-color: #0070ba;
            color:#fff;
            border:1px solid #0070ba;
        }
        .submit:hover {
            background-color:#005ea6;
        }
        .verBox {
            position:absolute;
            width:100%;
            text-align:center;
            left:404px;
            top:0;
            opacity:0;
            transition:all 0.8s;
            padding-top:55px;
        }
        .err {
            margin:12px 0 0;
            line-height:12px;
            height:12px;
            font-size:12px;
            color:red;
        }
    </style>

</head>
<body>

<div class="logo-box">
    <div class="login" style="">
        <div class="bxs-row" style="text-align:center;">
            <img id="logo" src="${pageContext.request.contextPath}/../../../static/admin/images/login/logo.jpg" style="width:72px;"><span class="tips" style="color:red;"></span>
        </div>
        <div class="bxs-row">
            <input type="text" class="username" id="username" placeholder="用户">
            <p class=" err err-username"></p>
        </div>
        <div class="bxs-row">
            <input type="password" class="password" id="password" placeholder="密码">
            <p class="err err-password"></p>
        </div>
        <div class="bxs-row">
            <input type="submit" class="submit btn" value="登录">
        </div>
    </div>
    <div class="verBox">
        <div id="imgVer" style="display:inline-block;"></div>
    </div>
</div>
<script>
    imgVer({
        el:'$("#imgVer")',
        width:'260',
        height:'116',
        img:[
            'images/ver.png',
            '${pageContext.request.contextPath}/../../../static/admin/images/login/ver-1.png',
            '${pageContext.request.contextPath}/../../../static/admin/images/login/ver-2.png',
            '${pageContext.request.contextPath}/../../../static/admin/images/login/ver-3.png'
        ],
        success:function () {
            var personnelId = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            $.ajax({
                url:'/login',
                method:'Get',
                data:{username:personnelId,password:password},
                dataType:'json',
                success:function (data) {
                    console.log(data);
                    console.log("============");
                    console.log(data.loginMessage);
                    console.log(data.loginMessage.role);
                    var name=data.loginMessage.role;
                    if (data.errorCode == 1){
                         $(".login").css({
                             "left":"0",
                             "opacity":"1"
                         });
                         $(".verBox").css({
                             "left":"404px",
                             "opacity":"0"
                         });
                        $(".tips").html(data.message);
                    }
                    else {
                        if (data.loginMessage.role==1){
                            window.location.href="${pageContext.request.contextPath}/admin/index/main/main.jsp";
                        }
                        else {
                            window.location.href="${pageContext.request.contextPath}/admin/index/main/personnelMain.jsp";
                        }

                    }
                }
            })
        },
        error:function () {
            //alert('错误什么都不执行')
        }
    });
    $(".submit").on('click',function () {
        if($(".username").val() == '') {
            $(".tips").html('用户名不能为空');
            <%--$("#logo").attr("src",'${pageContext.request.contextPath}/../../../static/admin/images/login/null-username.jpg')--%>
        } else if($(".password").val() == '') {
            $(".tips").html('密码不能为空');
        } else {
            $(".login").css({
                "left":"-404px",
                "opacity":"0"
            });
            $(".verBox").css({
                "left":"0",
                "opacity":"1"
            })
        }
    })
</script>

</body>
</html>
