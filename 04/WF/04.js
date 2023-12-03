import * as http from 'http';
import {upperCase} from 'upper-case';

const hostname = '127.0.0.1';
const port = 3030;

http.createServer(function(req,res){
 res.writeHead(200,{'Content-Type':'text/html'});
 res.write(upperCase('hello-world!'));
 res.end();
}).listen(port);

console.log(`Server running at http://${hostname}:${port}/`);