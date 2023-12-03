import * as mysql from 'mysql'

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "mydb"
})

con.connect(function(err){
   if(err) throw err;
   var sql = "INSERT INTO customer(name,address) VALUES ?";
   var values = [
    ['Abhi','Sangli'],
    ['Chaitya','Aundh'],
    ['Snehal','Kadegaon'],
    ['Kedar','Vihe'],
    ['Suraj','Patan'],
    ['Pranali','Umbraj'],
    ['Rutuja','Umbraj'],
    ['Akash','Banpuri'],
   ];

   con.query(sql,[values],function(err,res){
    if(err) throw err;
    console.log('Records inserted successfully !'+ res.message);
   });
});