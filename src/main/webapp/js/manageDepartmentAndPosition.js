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
                    layer.msg("部门和简介不能为空");
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
                            }else {
                                layer.msg(data.message);
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
        ,height: 312
        ,url: '' //数据接口
        ,page: true //开启分页
        ,cols: [[ //表头
            {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
            ,{field: 'username', title: '用户名', width:80}
            ,{field: 'sex', title: '性别', width:80, sort: true}
        ]]
    });

});