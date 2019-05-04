layui.use(['table','laydate','form','element'], function() {
    var table = layui.table;
    var laydate=layui.laydate;
    var form=layui.form;
    var element = layui.element;
    var $ = layui.$;
    laydate.render({
        elem: '#informationEntryTime',
        type:'date',
    });
    laydate.render({
        elem: '#startTime',
        type:'date',
    });
    laydate.render({
        elem: '#endTime',
        type:'date',
    });
    //加载表格(员工信息)
    table.render({
        elem: '#personnelInfo',
        height: 555,
        width : 1160,
        toolbar: '#toolbarDemo',
        url: '/searchDossierInfo', //数据接口
        page: true, //开启分页
        limit:11,
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
    //监听增加员工奖励操作
    table.on('tool(personnelInfo)', function(obj){
        var data = obj.data;
        if(obj.event === 'addRewards'){
            layer.open({
                type: 2,
                offset: ['50px','100px'],
                title:'奖励信息',
                maxmin: true,
                area: ['80%', '80%'],
                content: 'addRewards.jsp',
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
                    var awardMoney=body.find("#awardMoney").val();
                    var rewardTime=body.find("#rewardTime").val();
                    var rewardResult=body.find("#rewardResult").val();
                    console.log(rewardTime);
                    if (rewardTime=="" || rewardTime==null){
                        layer.msg("日期不能为空");
                    }else {
                        $.ajax({
                            url:'/addRewards',
                            data:{personnelId:personnelId,personnelName:personnelName,
                                department:department,position:position,awardMoney:awardMoney,
                                rewardTime:rewardTime,rewardResult:rewardResult},
                            success:function (data) {
                                if (data.status==0){
                                    layer.msg(data.message);
                                    layer.close(index);
                                }
                                else if (data.status==1){
                                    layer.msg(data.message);
                                    layer.close(index);
                                }
                            }
                        })
                    }
                    layer.close(index);
                }
            })
        }
    });

    table.render({
        elem: '#showRewardsTable',
        height: 555,
        width : 1160,
        toolbar: '#toolShowRewardsBar',
        url: '/searchRewardsMessage', //数据接口
        page: true, //开启分页
        limit:11,
        id:'showRewardsTable',
        cols: [[ //表头
            {type: 'checkbox',fixed: 'left'}
            ,{field: 'personnelId', title: '员工Id', width:120,fixed: 'left'}
            ,{field: 'personnelName', title: '名字', width:80}
            ,{field: 'department', title: '部门', width:100}
            ,{field: 'position', title: '职位', width: 100}
            ,{field: 'awardMoney', title: '奖赏金额', width: 120}
            ,{field: 'rewardTime', title: '奖赏时间', width: 135, sort: true}
            ,{field: 'rewardResult', title: '奖赏原因', width: 295}
            ,{fixed: 'right', title:'操作', toolbar: '#showRewardsBar', width:150}
        ]]
    });
    //条件搜索
    $(document).on('click','#searchRewards',function(){
        var personnelName=$('#RewardsPersonnelName');
        var department=$('#RewardsDepartment');
        var startTime=$('#startTime');
        var endTime = $('#endTime');
        table.reload('showRewardsTable', {
            where:{
                personnelName: personnelName.val(),
                department:department.val(),
                startTime:startTime.val(),
                endTime: endTime.val(),
            }
            ,page: {
                curr: 1 //重新从第 1 页开始
            }
        })
        laydate.render({
            elem: '#startTime',
            type:'date',
        });
        laydate.render({
            elem: '#endTime',
            type:'date',
        });
    });
    table.on('tool(showRewardsTable)', function(obj) {
        var data = obj.data;
        if(obj.event === 'del'){
            $.ajax({
                url:'/delRewards',
                data:{rewardsId:data.rewardsId},
                success:function (data) {
                    if (data.status==0){
                        table.reload('showRewardsTable', {
                        })
                        layer.msg(data.message);
                    }
                    if (data.status==1){
                        layer.msg(data.message);
                    }
                }
            })
        }
    })



});
