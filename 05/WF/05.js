import * as fs from 'fs';
let a;

console.log('\nFile Content before append : ',a = fs.readFileSync('file1.txt','utf8'));

fs.appendFile('file2.txt',a,(err)=>{
    if(err)
    {
         console.log(err);
    }
    else
    {
        console.log('File Content after append : ',fs.readFileSync('file2.txt','utf8'));
    }
});