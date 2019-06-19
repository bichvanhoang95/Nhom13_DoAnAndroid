// var db = require('../fn/db');

 // exports.login = (admin) => {
 // 	var sql = "SELECT * FROM admin WHERE email = '${admin.email}' AND matKhau= '${admin.pass}'";
 // 	return db.load(sql);
 // }

 var db = require('../fn/db');

exports.Dang_Nhap = (email,password) => {
 	// var sql = "update dashboard set TrangThai = '"+ThietBi.TrangThai+"' where TenThietBi = '"+ThietBi.TenThietBi+"'";
 	// var sql = "update dashboard set TrangThai = '"+ThietBi.TrangThai+"' where TenThietBi = '"+ThietBi.TenThietBi+"'";
 	var sql = "SELECT * FROM taikhoan WHERE Email = '"+email+"' AND matKhau = '"+password+"'";
 	return db.save(sql);
 }

 exports.Lay_Session_Phong = (idPhong) => {
 	var sql = "SELECT * FROM phong WHERE idPhong = '"+idPhong+"'";
 	return db.load(sql);
 }