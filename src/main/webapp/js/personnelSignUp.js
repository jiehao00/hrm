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
        width : 1300,
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
        if (obj.event ==='signUp'){
            $.ajax({
                url:'/personnelSignUp',
                dataType:'json',
                type:'post',
                data:{courseCode:data.courseCode,trainingCourse:data.courseName},
                success:function (data) {
                    if (data.status==0){
                        layer.msg(data.message);
                    }else {
                        layer.msg(data.message);
                    }
                }
            })
        }
    })

})