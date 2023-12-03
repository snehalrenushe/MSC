import * as mysql from 'mysql'

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "mydb"
});

con.connect(function(err){
    if(err) throw err;
    con.query("SELECT * FROM customer",function(err,res,fields){
        if(err) throw err;
        console.log(res);
    });
});