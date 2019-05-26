window.addEventListener('load',function () {
    var departmentSelt=document.getElementById("courseDepartment");
    var str1=" ";
layui.use(['form','layer','laydate','upload'],function () {
    $ = layui.jquery;
    var form = layui.form;
    var layer = layui.layer;
    var laydate = layui.laydate;
    var upload = layui.upload;
    laydate.render({
        elem: '#plannedStartTime',
        type: 'date',
        min:0,
    })
    laydate.render({
        elem: '#plannedEndTime',
        type: 'date',
        done: function (value, date, endDate) {
                var startDate = new Date($('#plannedStartTime').val()).getTime();
                var endTime = new Date(value).getTime();
                if (endTime < startDate) {
                    layer.msg('结束时间不能小于开始时间');
                    $('#plannedEndTime').val($('#plannedStartTime').val());
                }
            }
    })
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
    form.on('submit(addCourse)', function (data) {
        console.log(data.field);
        $.ajax({
            url:"/addCourse",
            type:'post',
            dataType:'json',
            data:data.field,
            success:function (data) {
                console.log(data);
                if (data.status==0){
                    layer.msg(data.message);
                    document.getElementById("CourseForm").reset();
                    $('#CourseForm')[0].reset();
                    form.render();
                } else {
                    layer.msg(data.message)
                }
            }
        })
        return false;
    })
    //拖拽上传
    upload.render({
        elem: '#test10'
        ,url: '/uploadImage'
        ,accept: 'file'
        ,done: function(res){
            //如果上传失败
            if(res.code > 0){
                return layer.msg('上传失败');
            }
            //上传成功
            //$('#photo').attr('name',res.fileName);
            layer.msg("上传成功");
            document.getElementById("actualStartTime").value=res.fileName;
        }
    });
 })

})
