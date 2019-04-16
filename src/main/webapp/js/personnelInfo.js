layui.use(['table','laydate','form'], function() {
    var table = layui.table;
    var laydate=layui.laydate;
    var form=layui.form;
    var $ = layui.$;
    laydate.render({
        elem: '#informationEntryTime',
        type:'date',
    });
    //加载表格
   table.render({
        elem: '#personnelInfo',
        height: 602,
        width : 1160,
        toolbar: '#toolbarDemo',
        url: '/searchDossierInfo', //数据接口
        page: true, //开启分页
        limit:12,
        id:'personnelInfo',
        cols: [[ //表头
             {type: 'checkbox',fixed: 'left'}
             ,{field: 'personnelId', title: '员工Id', width:120,fixed: 'left'}
            ,{field: 'personnelName', title: '名字', width:80}
            ,{field: 'sex', title: '性别', width:80, sort: true}
            ,{field: 'department', title: '部门', width:100}
            ,{field: 'position', title: '职位', width: 100}
            ,{field: 'telephone', title: '手机', width: 135}
            ,{field: 'age', title: '年龄', width: 80, sort: true}
            ,{field: 'basicWage', title: '基本工资', width: 120}
            ,{field: 'informationEntryTime', title: '信息录入时间', width: 135, sort: true}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
        ]]
    });
   //条件搜索
    $(document).on('click','#search',function(){
        var personnelId = $('#personnelId');
        var personnelName=$('#personnelName');
        var department=$('#department');
        var informationEntryTime=$('#informationEntryTime');
        table.reload('personnelInfo', {
            where:{
                personnelId: personnelId.val(),
                personnelName: personnelName.val(),
                department:department.val(),
                informationEntryTime:informationEntryTime.val()
            }
            ,page: {
                curr: 1 //重新从第 1 页开始
            }
        })
        laydate.render({
            elem: '#informationEntryTime',
            type:'date',
        });
    });
    //监听删除编辑操作
    table.on('tool(personnelInfo)', function(obj){
        var data = obj.data;
        console.log(data);

        if(obj.event === 'del'){
            layer.open({
                type: 2,
                offset: ['50px','100px'],
                title:'解聘信息',
                maxmin: true,
                area: ['50%', '86%'],
                content: 'termination.jsp',
                btn: ['确定', '关闭'],
                success:function (layero, index) {
                    var body = layui.layer.getChildFrame('body', index);
                    body.find("#personnelId").val(data.personnelId);
                    body.find("#personnelName").val(data.personnelName);
                    body.find("#department").val(data.department);
                    body.find("#position").val(data.position);
                    form.render();
                },
                yes:function (index,layero) {
                    var body = layui.layer.getChildFrame('body', index);
                    var personnelId=body.find("#personnelId").val();
                    var personnelName=body.find("#personnelName").val();
                    var department=body.find("#department").val();
                    var position=body.find("#position").val();
                    var terminationTime=body.find("#terminationTime").val();
                    var stopSalaryTime=body.find("#stopSalaryTime").val();
                    var terminationResult=body.find("#terminationResult").val();
                    $.ajax({
                        url:'/delDossierInfo',
                        data:{personnelId:personnelId,personnelName:personnelName,
                            department:department,position:position,terminationTime:terminationTime,
                            stopSalaryTime:stopSalaryTime,terminationResult:terminationResult},
                        success:function (data) {
                            if(data.status==0){
                                obj.del();
                                layer.close(index);
                                table.reload('personnelInfo', {
                                })
                                layer.msg(data.message);
                            }else {
                                layer.msg(data.message);
                            }
                        }
                    })
                    layer.close(index);
                }
            })
        } else if(obj.event === 'edit'){
            window.location.href="/updatePersonnel?personnelId="+data.personnelId;
        }else if(obj.event ==='transfer'){
            layer.open({
                type: 2,
                offset: ['50px','100px'],
                title:'调职信息',
                maxmin: true,
                area: ['60%', '86%'],
                content: 'transfer.jsp',
                btn: ['确定', '关闭'],
                success:function (layero, index) {
                     var body = layui.layer.getChildFrame('body', index);
                     body.find("#personnelId").val(data.personnelId);
                     body.find("#personnelName").val(data.personnelName);
                     body.find("#departmentBefore").val(data.department);
                     body.find("#positionBefore").val(data.position);
                     body.find("#positionalTileBefore").val(data.positionalTile);
                     form.render();
                },
                yes:function (index,layero) {
                    var body = layui.layer.getChildFrame('body', index);
                    var personnelId=body.find("#personnelId").val();
                    var personnelName=body.find("#personnelName").val();
                    var departmentBefore=body.find("#departmentBefore").val();
                    var positionBefore=body.find("#positionBefore").val();
                    var positionalTileBefore=body.find("#positionalTileBefore").val();
                    var departmentAfter=body.find("#department").val();
                    var positionAfter=body.find("#position").val();
                    var positionalTileAfter=body.find("#positionalTileAfter").val();
                    var transferredTime=body.find("#transferredTime").val();
                    var transferredResult=body.find("#transferredResult").val();
                    $.ajax({
                        url:'/transferPersonnel',
                        data:{personnelId:personnelId,personnelName:personnelName,departmentBefore:departmentBefore,
                              positionBefore:positionBefore,positionalTileBefore:positionalTileBefore,departmentAfter:departmentAfter,
                              positionAfter:positionAfter,positionalTileAfter:positionalTileAfter,transferredTime:transferredTime,transferredResult:transferredResult},
                        success:function (data) {
                            if (data.status==0){
                                // obj.update();
                                table.reload('personnelInfo', {
                                })
                                layer.close(index);
                                layer.msg(data.message);
                            } else {
                                layer.msg(data.message);
                            }
                        }
                    })
                    layer.close(index);
                }
            })
        }
    });
});
