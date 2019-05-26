layui.use(['table','laydate','form'], function() {
    var table = layui.table;
    var laydate=layui.laydate;
    var form=layui.form;
    var $ = layui.$;
    table.render({
        elem: '#enrolledCourse',
        height: 602,
        width : 1260,
        toolbar: '#toolbarDemo',
        url: '/findEnrolledCourse', //数据接口
        page: true, //开启分页
        limit:12,
        id:'enrolledCourse',
        cols: [[ //表头
            {type: 'checkbox',fixed: 'left'}
            ,{field: 'personnelId', title: '员工Id', width:120,fixed: 'left'}
            ,{field: 'personnelName', title: '员工名字', width:140}
            ,{field: 'trainingCourse', title: '授课时数', width:100}
            ,{field: 'plannedStartTime', title: '开始时间', width: 135}
            ,{field: 'plannedEndTime', title: '结束时间', width: 135}
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

    table.on('tool(enrolledCourse)', function(obj) {
        var data = obj.data;
        if (obj.event ==='download'){
            layer.msg(data.courseCode);
        }
    })

})



