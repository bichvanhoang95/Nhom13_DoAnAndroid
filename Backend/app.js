var APIRepo = require('./repos/APIRepo');

var path = require("path");
var express = require("express");
var app = express();
var server = require('http').createServer(app);
// var io = require('socket.io')(server);

//Chỉ ra đường dẫn chứa css, js, images...
// app.use(express.static(path.join(__dirname, 'public')));
var result;
//Tạo router
app.get("/login", function (req, res) {
    var email = req.query.email;
    var password = req.query.password;


    APIRepo.Dang_Nhap(email,password).then(rows => {

        if (rows.length > 0) {
            // res.writeHead(200, {'Content-Type': 'text/plain'});
            // res.end("TRUE");
            APIRepo.Lay_Session_Phong(rows[0].idPhong).then(rows1 => {
                    // result = [];
                    // result.push(rows1[0]);
                    res.writeHead(200,{'Content-Type':'application/json'});
                    res.end(JSON.stringify(rows1));
            });
        }
        else
        {
            // result = [];
            // result.push(rows[0]);
            res.writeHead(200,{'Content-Type':'application/json'});
            res.end(JSON.stringify(rows));
        }
    });

    // res.writeHead(200,{'Content-Type':'application/json'});
    // res.end(JSON.stringify(Chuoi_Kq)); 

});

//Khởi tạo 1 server listen tại 1 port
server.listen(3000);