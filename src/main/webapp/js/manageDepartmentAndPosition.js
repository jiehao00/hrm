layui.use(['element','table','layer','form'], function(){
    var $ = layui.jquery;
    var element = layui.element;
    var table=layui.table;
    var form=layui.form;

    //部门设置
    table.render({
        elem: '#departmentTable'
        ,height: 550
        // ,width:600
        ,toolbar: '#toolbarDemo'
        ,url: '/searchAllDepartmentByPaging' //数据接口
        ,page: true //开启分页
        ,id:'departmentTable'
        ,cols: [[ //表头
            {field: 'departmentId', title: 'Id', width:80, sort: true, fixed: 'left'}
            ,{field: 'department', title: '部门', width:120}
            ,{field: 'deparmentIntroduction', title: '部门简介', width:950, sort: true}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
        ]]
    });
    //条件搜索
    $(document).on('click','#search',function(){
        var department=$('#department');
        table.reload('departmentTable',{
            where:{
                department: department.val(),
            }
            ,page: {
                curr: 1 //重新从第 1 页开始
            }
        })
    })
    //添加部门
    $(document).on('click','#addDepartment',function () {
        layer.open({
            type: 2,
            offset: ['100px', '300px'],
            title: '添加部门',
            maxmin: true,
            area: ['50%', '45%'],
            content: 'addDepartment.jsp',
            btn: ['确定', '关闭'],
            yes: function (index, layero) {
                var body = layui.layer.getChildFrame('body', index);
                var department=body.find('#department').val();
                var deparmentIntroduction=body.find('#deparmentIntroduction').val();
                if (department==""||department.indexOf(" ") >= 0||deparmentIntroduction==""||deparmentIntroduction.indexOf(" ") >= 0){
                    layer.msg("部门和简介不能为空或有空格");
                }else {
                    $.ajax({
                        url:'/addDepartment',
                        data:{department:department,deparmentIntroduction:deparmentIntroduction},
                        success:function (data) {
                            if(data.status==0){
                                table.reload('departmentTable', {
                                })
                                layer.close(index);
                                layer.msg(data.message);
                            }else if (data.status==1) {
                                layer.msg(data.message);//添加部门失败
                            }else if(data.status==2){
                                layer.msg(data.message);//部门已存在
                            }
                        }
                    })
                }
                layer.close(index);

            }
        });
    });

    //部门编辑删除(departmentTable是jsp table标签中lay-fiter)
    table.on('tool(departmentTable)', function(obj) {
        var data = obj.data;
        if(obj.event ==='del'){
            $.ajax({
                url:'/delDepartment',
                data:{departmentId:data.departmentId},
                success:function (data) {
                    console.log(data);
                    if (data.status==0){
                        layer.msg(data.message);
                    }
                    else if (data.status==1){
                        table.reload('departmentTable', {
                        })
                        layer.msg(data.message);
                    }
                    else if (data.status==2){
                        layer.msg(data.message);
                    }
                }
            })

        }
        else if(obj.event ==='edit') {
            layer.open({
                type: 2,
                offset: ['100px', '300px'],
                title: '添加部门',
                maxmin: true,
                area: ['50%', '45%'],
                content: 'addDepartment.jsp',
                btn: ['确定', '关闭'],
                success: function (layero, index) {
                    var body = layui.layer.getChildFrame('body', index);
                    body.find('#department').val(data.department);
                    body.find('#deparmentIntroduction').val(data.deparmentIntroduction);
                },
                yes: function (index, layero) {
                    var body = layui.layer.getChildFrame('body', index);
                    var department = body.find('#department').val();
                    var deparmentIntroduction = body.find('#deparmentIntroduction').val();
                    $.ajax({
                        url:'/updateDepartment',
                        data:{departmentId:data.departmentId,department :department,deparmentIntroduction:deparmentIntroduction},
                        success:function (data) {
                            if(data.status==0){
                                table.reload('departmentTable', {
                                })
                                layer.close(index);
                                layer.msg(data.message);
                            }else {
                                layer.msg(data.message);
                            }
                        }
                    })
                    layer.close(index);
                }

            });
        }
    });

    //职位设置
    table.render({
        elem: '#positionTable'
        ,height: 550
        ,toolbar: '#positionToolbar'
        ,url: '/searchAllPositionByPaging' //数据接口
        ,page: true //开启分页
        ,id:'positionTable'
        ,cols: [[ //表头
            {field: 'positionId', title: 'ID', width:80, sort: true, fixed: 'left'}
            ,{field: 'position', title: '用户名', width:120}
            ,{field: 'department', title: '所属部门', width:120,}
            ,{field: 'positionIntroduction', title: '职位介绍', width:830,}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
        ]]
    });
    //职位条件搜索
    $(document).on('click','#searchPosition',function(){
        var department=$('#positionDepartment');
        var position=$('#position')
        table.reload('positionTable',{
            where:{
                position:position.val(),
                department: department.val()
            }
            ,page: {
                curr: 1 //重新从第 1 页开始
            }
        })
    })

    //添加职位
    $(document).on('click','#addPosition',function () {
        layer.open({
            type: 2,
            offset: ['100px', '300px'],
            title: '添加职位',
            maxmin: true,
            area: ['55%', '58%'],
            content: 'addPosition.jsp',
            btn: ['确定', '关闭'],
            yes: function (index, layero) {
                var body = layui.layer.getChildFrame('body', index);
                var departmentId=body.find('#department').val();
                var position=body.find('#position').val();
                var positionIntroduction=body.find('#positionIntroduction').val();
                if (departmentId==""){
                    layer.msg("请选择部门");
                }else if(position==""||position.indexOf(" ") > 0||positionIntroduction==""||positionIntroduction.indexOf(" ") > 0){
                    layer.msg("职位和职位简介不能为空或有空格");
                }
                else if (department!=""&&position!=""&&position.indexOf(" ")<0 && positionIntroduction!=""&&positionIntroduction.indexOf(" ")<0) {
                   $.ajax({
                       url:'/addPosition',
                       data:{departmentId:departmentId,position:position,positionIntroduction:positionIntroduction},
                       success:function (data) {
                           if(data.status==0){
                               table.reload('positionTable', {
                               })
                               layer.close(index);
                               layer.msg(data.message);
                           }else if (data.status==1) {
                               layer.msg(data.message);//添加职位失败
                           }else if(data.status==2){
                               layer.msg(data.message);//职位已存在
                           }
                       }
                   })

                }
                layer.close(index);
            }

        })
    })


    //职位编辑删除(departmentTable是jsp table标签中lay-fiter)
    table.on('tool(positionTable)', function(obj) {
        var data = obj.data;
        if(obj.event ==='edit'){
            layer.open({
                type: 2,
                offset: ['100px', '300px'],
                title: '添加部门',
                maxmin: true,
                area: ['50%', '70%'],
                content: 'updatePosition.jsp',
                btn: ['确定', '关闭'],
                success: function (layero, index) {
                    var body = layui.layer.getChildFrame('body', index);
                    body.find('#oldDepartment').val(data.department);
                    body.find('#position').val(data.position);
                    body.find('#positionIntroduction').val(data.positionIntroduction);

                },
                yes: function (index, layero) {
                    var body = layui.layer.getChildFrame('body', index);
                    var oldDepartment = body.find('#oldDepartment').val();
                    var departmentId=body.find('#department').val();
                    var position=body.find('#position').val();
                    var positionIntroduction=body.find('#positionIntroduction').val();
                    if(departmentId==""){
                        departmentId==null;
                    }
                    $.ajax({
                        url:'/updatePosition',
                        data:{positionId:data.positionId,position:position,
                            positionIntroduction:positionIntroduction,departmentId:departmentId,department:oldDepartment},
                        success:function (data) {
                            if (data.status==0){
                                table.reload('positionTable', {
                                })
                                layer.close(index);
                                layer.msg(data.message);
                            } else if (data.status==1) {
                                layer.msg(data.message);//更新职位失败
                            }else if(data.status==2){
                                layer.msg(data.message);//职位已存在
                            }
                        }
                    })
                    layer.close(index);
                }

            });

        }
        else if (obj.event ==='del'){
            $.ajax({
                url:'/delPosition',
                data:{positionId:data.positionId},
                success:function (data) {
                    if (data.status==0){
                        table.reload('positionTable', {
                        })
                        layer.msg(data.message);
                    }
                    else {
                        layer.msg(data.message);
                    }
                }
            })
        }
    })







});