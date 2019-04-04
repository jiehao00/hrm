window.addEventListener('load',function () {
    var departmentSelt=document.getElementById("department");
    var positionSelt=document.getElementById("position");
    var str1=" ";
    var str2=" ";
    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form;
        var layer=layui.layer;
        $.ajax({
            url:"/searchDepartment",
            dataType:'json',
            success:function (data) {
                str1+='<option value="">请选择</option>';
                for(var key=0;key<data.department.length;key++){
                    str1+='<option value='+data.department[key].departmentId+'>'+data.department[key].department+'</option>';
                }
                departmentSelt.innerHTML=str1;
                form.render('select');
            }
        });
        form.on('select(department)',function(data){
             var departmentId=data.value;
           $.ajax({
                url:'/searchPosition',
                data:{departmentId:departmentId},
                dataType:'json',
                success:function (data) {
                    str2='<option value="">请选择</option>';
                    for(var key=0;key<data.positionInfo.length;key++){
                        str2+='<option value='+data.positionInfo[key].positionId+'>'+data.positionInfo[key].position+'</option>';
                    }
                    positionSelt.innerHTML=str2;
                    form.render("select");
                }
            });
        });
    })
})