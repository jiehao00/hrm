layui.use(['table','laydate','form','element'], function() {
    var table = layui.table;
    var laydate=layui.laydate;
    var form=layui.form;
    var element = layui.element;
    var $ = layui.$;
    laydate.render({
        elem: '#rewardTime',
        type:'date',
    });
    laydate.render({
        elem: '#punishTime',
        type:'date',
    });

})