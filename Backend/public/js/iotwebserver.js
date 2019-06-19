$( document ).ready(function() {
    console.log( "ready!" );
});


$(function () {
    //Kết nối tới server socket đang lắng nghe
    var socket = io.connect('http://35.237.183.31:3000');

    //Socket nhận data và append vào giao diện
    // socket.on("send", function (data) {
    //     console.log(data);
    //     $("#content").append("<p class='message'>" + data.username + ": " + data.message + "</p>")
    // })

    socket.on("send", function (data) {
        if (data.TenThietBi=="bongden1")
        {
            if (data.TrangThai==0) $('#bongden1_toggle').text('MỞ ĐÈN').attr("class","btn btn-danger"); 
            if (data.TrangThai==1) $('#bongden1_toggle').text("TẮT ĐÈN").attr("class","btn btn-success");
        }
        
        if (data.TenThietBi=="pir")
        {
            if (data.TrangThai==0) {
                $('#pir_toggle').text('MỞ PIR').attr("class","btn btn-danger");
                $('#pir_label').text('Đang tắt chế độ tự động').attr("class","alert alert-dark");
                
                }
            if (data.TrangThai==1) {
                $('#pir_toggle').text("TẮT PIR").attr("class","btn btn-success");
                $('#pir_label').text('Phát hiện có người').attr("class","alert alert-light");
            }
        }
        
    })

    //Bắt sự kiện click gửi message
    // $("#sendMessage").on('click', function () {
    //     var username = $('#username').val();
    //     var message = $('#message').val();

    //     if (username == '' || message == '') {
    //         alert('Please enter name and message!!');
    //     } else {
    //         //Gửi dữ liệu cho socket
    //         socket.emit('send', {username: username, message: message});
    //         $('#message').val('');
    //     }
    // })

    $("#bongden1_toggle").on('click',function () {

        if ($(this).text()=="TẮT ĐÈN") 
        {
            $(this).text('MỞ ĐÈN').attr("class","btn btn-danger"); 
            var ThietBi = {
                TenThietBi: "bongden1",
                TrangThai: 0,
                GiaTri: ""
            }
        }
        else
        {
            $(this).text("TẮT ĐÈN").attr("class","btn btn-success");
            var ThietBi = {
                TenThietBi: "bongden1",
                TrangThai: 1,
                GiaTri: ""
            }
        }
        
        socket.emit('send', ThietBi);
    })

    $("#pir_toggle").on('click',function () {

        if ($(this).text()=="TẮT PIR") 
        {
            $(this).text('MỞ PIR').attr("class","btn btn-danger"); 
            var ThietBi = {
                TenThietBi: "pir",
                TrangThai: 0,
                GiaTri: 0
            }
        }
        else
        {
            $(this).text("TẮT PIR").attr("class","btn btn-success");
            var ThietBi = {
                TenThietBi: "pir",
                TrangThai: 1,
                GiaTri: 1
            }
        }
        
        socket.emit('send', ThietBi);
    })
})