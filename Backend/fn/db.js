var mysql  = require('mysql');

exports.load = sql => {
	return new Promise((resolve, reject) => {
		var cnn = mysql.createConnection({
			host : 'localhost',
			port : 3306,
			user : 'root',
			password : 'root',
			database : 'quanlyphongtro',
			insecureAuth : true
		});

		cnn.connect();

		cnn.query(sql, function(error, rows, fields){
			if(error){
				reject(error);
			}else{
				resolve(rows);
			}

			cnn.end();
		});
	});
}

exports.save = sql => {
    return new Promise((resolve, reject) => {
        var cn = mysql.createConnection({
            host: 'localhost',
            port: 3306,
            user: 'root',
            password: 'root',
            database: 'quanlyphongtro'
        });

        cn.connect();

        cn.query(sql, function(error, value) {
            if (error) {
                reject(error);
            } else {
                resolve(value);
            }

            cn.end();
        });
    });
}