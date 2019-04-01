layui.use('table', function() {
    var table = layui.table;

    table.render({
        elem: '#personnelInfo',
        height: 600,
        width : 1085,
        toolbar: '#toolbarDemo',
        url: '/searchDossierInfo', //数据接口
        page: true, //开启分页
        limit:12,
        cols: [[ //表头
             {type: 'checkbox', fixed: 'left'}
             ,{field: 'personnelId', title: '员工Id', width:120,fixed: 'left'}
            ,{field: 'personnelName', title: '名字', width:80}
            ,{field: 'sex', title: '性别', width:80, sort: true}
            ,{field: 'department', title: '部门', width:80}
            ,{field: 'position', title: '职位', width: 80}
            ,{field: 'telephone', title: '手机', width: 80,}
            ,{field: 'age', title: '年龄', width: 80, sort: true}
            ,{field: 'basicWage', title: '基本工资', width: 120}
            ,{field: 'informationEntryTime', title: '信息录入时间', width: 135, sort: true}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
        ]]
    });

});