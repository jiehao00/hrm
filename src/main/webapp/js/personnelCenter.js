window.addEventListener('load',function () {
    $.ajax({
        url:'/searchPersonnelCenter',
        success:function (data) {
            console.log(data);
            console.log(data.dossierInfo.department);
            var phone=document.getElementById("phone");
            var email=document.getElementById("email");
            var weChat=document.getElementById("weChat");
            var companyName=document.getElementById("companyName");
            var personnelId = document.getElementById("personnelId");
            var department=document.getElementById("department");
            var position=document.getElementById("position");
            var positionalTile=document.getElementById("positionalTile");
            var professional=document.getElementById("professional");
            var companyAddress=document.getElementById("companyAddress");
            var dateIntoCompany=document.getElementById("dateIntoCompany");
            phone.innerHTML+=data.dossierInfo.telephone;
            email.innerHTML+=data.dossierInfo.email;
            weChat.innerHTML+=data.dossierInfo.wechat;
            companyName.innerHTML+=data.companyInfo.companyName;
            department.innerHTML+=data.dossierInfo.department;
            position.innerHTML+=data.dossierInfo.position;
            positionalTile.innerHTML+=data.dossierInfo.positionalTile;
            professional.innerHTML+=data.dossierInfo.professional;
            companyAddress.innerHTML+=data.companyInfo.companyAddress;
            dateIntoCompany.innerHTML+=data.dossierInfo.dateIntoCompany;
            personnelId.innerHTML+=data.dossierInfo.personnelId;
            
            if (data.dossierInfo.photo!=null || data.dossierInfo.photo!="") {
                $("#photo").attr("src",data.dossierInfo.photo);
            }
        }
    })
})