layui.use(['table','laydate','form','element','layer',], function() {
    $ = layui.jquery;
    var form = layui.form;
    var layer = layui.layer;
    var laydate = layui.laydate;
    var upload = layui.upload;
    var table = layui.table;

    table.render({
        elem: '#manageInsurance',
        height: 602,
        width: 1265,
        toolbar: '#toolbarDemo',
        url: '/searchInsurance', //数据接口
        page: true, //开启分页
        limit: 12,
        id: 'manageInsurance',
        cols: [[ //表头
              {type: 'checkbox'}
            , {field: 'proOfRetirementInsurance', title: '养老保险', width: 120,}
            , {field: 'proOfMedicalInsurance', title: '医疗保险', width: 140}
            , {field: 'proOfEmploymentInsurance', title: '失业保险', width: 100,}
            , {field: 'proOfInjuryInsurance', title: '工伤保险', width: 100}
            , {field: 'proOfMaternityInsurance', title: '生育保险', width: 135}
            , {field: 'proOfHousingFund', title: '住房公积金', width: 135}
            //, {field: 'state', title: '状态', width: 100}
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
            url:"/updateInsurance",
            data:{id:id,state:state},
            success:function (data) {
                layer.msg(data.message);
                table.reload('manageInsurance', {
                })
            }
        })

    });
    $(document).on('click','#addInsurance',function () {
        layer.open({
            type: 2,
            offset: ['100px', '300px'],
            title: '添加五险一金比例',
            maxmin: true,
            area: ['60%', '55%'],
            content: 'addInsurance.jsp',
            btn: ['确定', '关闭'],
            yes: function (index, layero) {
                var body = layui.layer.getChildFrame('body', index);
                var proOfRetirementInsurance=body.find('#proOfRetirementInsurance').val();
                var proOfMedicalInsurance=body.find('#proOfMedicalInsurance').val();
                var proOfEmploymentInsurance=body.find('#proOfEmploymentInsurance').val();
                var proOfInjuryInsurance=body.find('#proOfInjuryInsurance').val();
                var proOfMaternityInsurance=body.find('#proOfMaternityInsurance').val();
                var proOfHousingFund=body.find('#proOfHousingFund').val();
                $.ajax({
                    url:"/addInsurance",
                    data:{proOfRetirementInsurance:proOfRetirementInsurance,
                          proOfMedicalInsurance:proOfMedicalInsurance,
                          proOfEmploymentInsurance:proOfEmploymentInsurance,
                          proOfInjuryInsurance:proOfInjuryInsurance,
                          proOfMaternityInsurance:proOfMaternityInsurance,
                          proOfHousingFund:proOfHousingFund},
                    success:function (data) {
                        if(data.status==0){
                            table.reload('manageInsurance', {
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
    })

})