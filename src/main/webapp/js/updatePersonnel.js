layui.use(['form','layer','laydate','upload'], function(){
    $ = layui.jquery;
    var form = layui.form;
    var layer=layui.layer;
    var laydate=layui.laydate;
    var upload = layui.upload;
    laydate.render({
        elem: '#birthDate',
        type:'date',
    });
    laydate.render({
        elem: '#dateIntoCompany',
        type:'date',
    });
    laydate.render({
        elem: '#firstStartTime',
        type:'date',
    });
    laydate.render({
        elem: '#lastEndTime',
        type:'date',
    });
    laydate.render({
        elem: '#informationEntryTime',
        type:'date',
    });
    form.on('submit(dem)', function(data){
        $.ajax({
            url:'/uploadUpdatedPersonnelMessage',
            type:'post',
            data:data.field,
            success:function (data) {
                if(data.status==0){
                    layer.msg('修改成功');
                    window.location.href="admin/index/main/managePersonnel.jsp";
                }
                else {
                    layer.msg('修改失败');
                }
            }
        })
        return false;
    });
    upload.render({
        elem: '.bbb',
        url: '/uploadImage',
        before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#photo').attr('src', result); //图片链接（base64）
            });
        }
        ,done: function(res){
            //如果上传失败
            if(res.code > 0){
                return layer.msg('上传失败');
            }
            //上传成功
            $('#photo').attr('name',res.fileName);
            document.getElementById("ppp").value=res.fileName;
        }
    });
    form.verify({
        age:[
            /^(0|[1-9][0-9]?|100)$/,
            '年龄输入范围为0-100'
        ]
    })
});