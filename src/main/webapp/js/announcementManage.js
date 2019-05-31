layui.use(['table','laydate','form','element','layer',], function() {
    $ = layui.jquery;
    var form = layui.form;
    var layer = layui.layer;
    var laydate = layui.laydate;
    var upload = layui.upload;
    var table = layui.table;

    table.render({
        elem: '#manageAnnouncement',
        height: 602,
        width: 1265,
        toolbar: '#toolbarDemo',
        url: '/searchAllAnnouncement', //数据接口
        page: true, //开启分页
        limit: 12,
        id: 'manageAnnouncement',
        cols: [[ //表头
              {type: 'checkbox'}
            , {field: 'id', title: 'ID', width: 120,}
            , {field: 'announcement', title: '公告',}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 150}
        ]],
    })

    form.on('switch(switchTest)',function(data){
        console.log(data.value);
        var id=data.value;
        var checked = data.elem.checked;
        console.log(checked);
        if (checked){
            var state=1;
        } else {
            var state=0;
        }
        console.log(state);
        $.ajax({
            url:"/updateState",
            data:{id:id,state:state},
            success:function (data) {
                layer.msg(data.message);
                table.reload('manageAnnouncement', {
                })
            }
        })
    });
    $(document).on('click','#addAnnouncement',function () {
        layer.open({
            type: 2,
            offset: ['100px', '300px'],
            title: '添加公告',
            maxmin: true,
            area: ['60%', '55%'],
            content: 'addAnnouncement.jsp',
            btn: ['确定', '关闭'],
            yes: function (index, layero) {
                var body = layui.layer.getChildFrame('body', index);
                var announcement = body.find('#announcement').val();
                console.log(announcement);
                $.ajax({
                    url: "/addAnnouncement",
                    data: {announcement: announcement},
                    success: function (data) {
                        if (data.status == 0) {
                            table.reload('manageAnnouncement', {})
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
    })
})