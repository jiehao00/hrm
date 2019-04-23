$(function () {
    var items = document.getElementsByTagName('th');
    $.ajax({
        url:'/searchCompanyMessage',
        success:function (data) {
            items[0].innerHTML = data.company.companyName;
            items[1].innerHTML = data.company.legalRepresentative;
            items[2].innerHTML = data.company.companyAddress;
            items[3].innerHTML = data.company.companyTelephone;
            items[4].innerHTML = data.company.companyWeb;
            items[5].innerHTML = data.company.companyIntroduction;
        }
    })
})

