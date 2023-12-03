import * as formidable from 'formidable';
import * as fs from 'fs';
import * as http from 'http';

const hostname = '127.0.0.1';
const port = 4000;

http.createServer(function(req,res){
    if(req.url == '/fileupload')
    {
        var form = new formidable.IncomingForm();
        form.parse(req,function(err,fields,files){
            var oldpath = files.filetoupload.path;
            var newpath = 'D:/Self/WebFramework_Practical/' + files.filetoupload.name;
            fs.rename(oldpath,newpath,function(err){
                if(err) throw err;
                res.write('File uploaded and moved !');
                res.end();
            });
        });
    }
    else
    {
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write('<form action="fileupload" method="post" enctype="multipart/form-data">');
        res.write('<input type="file" name="filetoupload"><br>');
        res.write('<input type="submit">');
        res.write('</form>');
        return res.end();
    }
}).listen(port);

console.log(`Server running at http://${hostname}:${port}/`);

