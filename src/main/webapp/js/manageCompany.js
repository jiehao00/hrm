 window.addEventListener('load',function () {
    var status = 0;
    var item = document.getElementsByTagName('th');
    var edit = document.getElementById('edit');
    var item_length = item.length;
    var item_value = new Array(item.length);
    for(var i = 0; i < item.length; i++){
        item_value[i] = item[i].innerHTML;
    }
    layui.use(['form','layer','laydate','upload'],function () {
        $ = layui.jquery;
        var form = layui.form;
        var layer = layui.layer;
        var laydate = layui.laydate;
        var upload = layui.upload;
        form.on('submit(addCourse)', function (data) {
            if(status == 0){
                edit.innerHTML= '保存';
                for(i = 0; i < item_length; i++){
                    if (i < item_length-1){
                        item[i].innerHTML = '<input type="text" class="layui-input" value="'+item_value[i]+'">';
                    }
                    if (i==item_length-1) {
                        item[i].innerHTML = '<textarea class="layui-textarea" id="companyInfo"></textarea>';
                        $('#companyInfo').val(item_value[i]);
                    }
                }
                status = 1;

            }else{
                edit.innerHTML= '编辑';
                var item_input = document.getElementsByClassName('layui-input');
                for(i = 0; i < item_length; i++){
                    if (i < item_length-1){
                        item_value[i] = item_input[i].value;
                    }
                    if (i== item_length-1) {
                        item_value[i]=$('#companyInfo').val();
                    }
                }
                for(i = 0; i < item_length; i++){
                    if (i < item_length-1) {
                        item[i].innerHTML = item_value[i];
                    }
                    if (i== item_length-1) {
                        item[i].innerHTML = item_value[i];
                    }
                }
                var companyName=item_value[0];
                var legalRepresentative=item_value[1];
                var companyAddress=item_value[2];
                var companyTelephone=item_value[3];
                var companyWeb=item_value[4];
                var companyIntroduction=item_value[5];
                $.ajax({
                    url:'/updateCompanyMessage',
                    data:{companyName:companyName,legalRepresentative:legalRepresentative,
                        companyAddress:companyAddress,companyTelephone:companyTelephone,
                        companyWeb:companyWeb,companyIntroduction:companyIntroduction},
                    success:function (data) {
                        console.log(data);
                        if (data.status=='0'){
                            layer.msg(data.message);
                            status = 0;
                        }else {
                            layer.msg(data.message);
                            status = 0;
                        }
                    }
                })
            }
            return false;
        })
        //上传图片
        upload.render({
            elem: '.bbb',
            //url: '/uploadImage',
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
                // $('#photo').attr('name',res.fileName);
                // document.getElementById("ppp").value=res.fileName;
            }
        });
    });

 });