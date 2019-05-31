window.addEventListener('load',function () {
    $.ajax({
        url:'/searchAnnouncement',
        success:function (data) {
            var announcement=document.getElementById("announcement");
            announcement.innerHTML+=data.announcement.announcement;

        }
    })

})