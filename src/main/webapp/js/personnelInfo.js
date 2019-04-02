layui.use(['table','laydate'], function() {
    var table = layui.table;
    var laydate=layui.laydate;
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
        console.log(data.personnelId);

        if(obj.event === 'del'){
             layer.confirm('确认删除', function(index){
                 $.ajax({
                     url:'/delDossierInfo',
                     data:{personnelId:data.personnelId},
                     success:function (data) {
                         if(data.status==0){
                             obj.del();
                             layer.close(index);
                             layer.msg(data.message);
                         }else {
                             layer.msg(data.message);
                         }
                     }
                 })
            });
        } else if(obj.event === 'edit'){
            // layer.prompt({
            //     formType: 2
            //     ,value: data.email
            // }, function(value, index){
            //     obj.update({
            //         email: value
            //     });
            //     layer.close(index);
            // });
        }
    });

});
