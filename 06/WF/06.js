import * as http from 'http';
import * as url from 'url';
import * as fs from 'fs';

const hostname = '127.0.0.1';
const port = 3000;

http.createServer(function(req,res){
    var q = url.parse(req.url,true);

    var filename = 'file1.txt' + q.pathname;

    fs.readFile(filename,function(err,data){
        if(err)
        {
            res.writeHead(404,{'Content-Type':'text/html'});
            return res.end('404 Not Found');
        }

        res.writeHead(200,{'Content-Type':'text/html'});
        res.write(data);
        res.end();
    });
}).listen(port);

console.log(`Server running at http://${hostname}:${port}/`);
