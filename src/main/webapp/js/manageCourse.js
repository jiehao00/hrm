layui.use(['table','laydate','form'], function() {
        var table = layui.table;
        var laydate=layui.laydate;
        var form=layui.form;
        var $ = layui.$;
    laydate.render({
        elem: '#plannedStartTime',
        type:'date',
    });
    laydate.render({
        elem: '#plannedEndTime',
        type:'date',
    });
    table.render({
        elem: '#manageCourse',
        height: 602,
        width : 1260,
        toolbar: '#toolbarDemo',
        url: '/searchCourse', //数据接口
        page: true, //开启分页
        limit:12,
        id:'manageCourse',
        cols: [[ //表头
            {type: 'checkbox',fixed: 'left'}
            ,{field: 'courseName', title: '课程名称', width:120,fixed: 'left'}
            ,{field: 'courseDepartment', title: '培训主办部门', width:140}
            ,{field: 'studentsType', title: '授课对象', width:100, }
            ,{field: 'teachingHours', title: '授课时数', width:100}
            ,{field: 'plannedStartTime', title: '开始时间', width: 135}
            ,{field: 'plannedEndTime', title: '结束时间', width: 135}
            ,{field: 'courseIntroduction', title: '课程介绍', width: 222, }
            ,{field:'courseStatus',title:'状态',width:100}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
        ]],
        done:function (res,curr,count) {
            $("[data-field = 'courseStatus']").children().each(function(){
                if($(this).text() == '0'){
                    $(this).text("未开课");
                    $(this).css("color",'green');
                }else if($(this).text() == '1'){
                    $(this).text("已开课");
                    $(this).css("color",'red');
                }else if ($(this).text()=='2'){
                    $(this).text("已结课");
                    $(this).css("color",'gray');
                }
            })
        }
    });
    //条件搜索
    $(document).on('click','#search',function(){
        var courseName = $('#courseName');
        var studentsType=$('#studentsType');
        var plannedStartTime=$('#plannedStartTime');
        var plannedEndTime =$('#plannedEndTime');
        var courseStatus=$('#courseStatus');
        table.reload('manageCourse',{
            where:{
                courseName: courseName.val(),
                studentsType:studentsType.val(),
                plannedStartTime:plannedStartTime.val(),
                plannedEndTime:plannedEndTime.val(),
                courseStatus:courseStatus.val(),
            }
            ,page: {
                curr: 1 //重新从第 1 页开始
            }
        })
        laydate.render({
            elem: '#plannedStartTime',
            type:'date',
        });
        laydate.render({
            elem: '#plannedEndTime',
            type:'date',
        });
    });


    table.on('tool(manageCourse)', function(obj) {
        var data = obj.data;
        if (obj.event ==='del'){
            $.ajax({
                url:'/delCourseInfo',
                dataType:'json',
                type:'post',
                data:{courseCode:data.courseCode},
                success:function (data) {
                    if (data.status==0){
                        obj.del();
                        table.reload('manageCourse', {
                        })
                        layer.msg(data.message);
                    }else {
                        layer.msg(data.message);
                    }
                }
            })
        }
        else if(obj.event ==='edit'){
            layer.open({
                type:2,
                offset:['50px','100px'],
                title:'信息更改',
                maxmin:true,
                area:['80%','80%'],
                content:'updateCourse.jsp',
                btn:['确定','关闭'],
                success:function (layero, index) {
                    var body = layui.layer.getChildFrame('body', index);
                    body.find('#courseName').val(data.courseName);
                    body.find('#courseDepartment').val(data.courseDepartment);
                    body.find('#studentsType').val(data.studentsType);
                    body.find('#teachingHours').val(data.teachingHours);
                    body.find('#plannedStartTime').val(data.plannedStartTime);
                    body.find('#plannedEndTime').val(data.plannedEndTime);
                    body.find('#courseIntroduction').val(data.courseIntroduction);
                },
                yes:function(index,layero){
                    var body = layui.layer.getChildFrame('body', index);
                    var courseName=body.find('#courseName').val();
                    var courseDepartment=body.find('#courseDepartment').val();
                    var studentsType=body.find('#studentsType').val();
                    var teachingHours=body.find('#teachingHours').val();
                    var plannedStartTime=body.find('#plannedStartTime').val();
                    var plannedEndTime=body.find('#plannedEndTime').val();
                    var courseIntroduction=body.find('#courseIntroduction').val();
                    $.ajax({
                        url:'/updateCourseMessage',
                        data:{courseCode:data.courseCode,courseName:courseName,courseDepartment:courseDepartment,
                              studentsType:studentsType,teachingHours:teachingHours, plannedStartTime:plannedStartTime,
                              plannedEndTime:plannedEndTime, courseIntroduction:courseIntroduction},
                        success:function (data) {
                            if(data.status==0){
                                table.reload('manageCourse', {
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
            })
        }
        else if (obj.event ==='classEnd') {

            if (data.courseStatus =='0') {
                layer.msg("本课程还没开课");
            } if (data.courseStatus=='1'){
                $.ajax({
                    url:'/endCourse',
                    dataType:'json',
                    type:'post',
                    data:{courseCode:data.courseCode},
                    success:function (data) {
                        console.log(data)
                        if (data.status==0){
                            layer.msg(data.message);
                            table.reload('manageCourse', {
                            })
                        } else {
                            layer.msg(data.message);
                        }
                    }
                })
            }if (data.courseStatus=='2'){
                layer.msg("本课程已结课");
            }
        }

    })

})