layui.use(['table','laydate','form'], function() {
    var table = layui.table;
    var laydate = layui.laydate;
    var form = layui.form;
    var $ = layui.$;
    table.render({
        elem: '#wageManage',
        height: 620,
        width: 1300,
        toolbar: '#toolbarDemo',
        page: true, //开启分页
        limit: 12,
        id: 'wageManage',
        cols: [[ //表头
            , {field: 'personnelId', title: '员工id', width: 100,}
            , {field: 'personnelName', title: '员工名字', width: 80}
            , {field: 'department', title: '部门', width: 80,}
            , {field: 'basicWage', title: '基本工资', width: 100}
            , {field: 'retirementInsurance', title: '养老保险', width: 100}
            , {field: 'medicalInsurance', title: '医疗保险', width: 100}
            , {field: 'employmentInsurance', title: '失业保险', width: 100}
            , {field: 'injuryInsurance', title: '工伤保险', width: 100}
            , {field: 'maternityInsurance', title: '生育保险', width: 100}
            , {field: 'housingFund', title: '住房公职金', width: 100}
            , {field: 'awardMoney', title: '奖金', width: 60}
            , {field: 'finedMoney', title: '罚金', width: 60}
            , {field: 'finalWage', title: '工资', width: 70}
            , {field: 'bankAccount', title: '银行账号', width: 135}
        ]],
    });

    $(document).on('click','#createWage',function(){
        console.log("=====");
        table.reload('wageManage',{
            url:'/createWage'
        })
    })
})
