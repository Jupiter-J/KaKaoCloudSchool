//HTML을 읽어서 응답하는 노드 서버 코드 

const http = require('http');
const fs = require('fs').promises;

const server1 = http.createServer(async(req, res)=>{

    try{
        res.writeHead(200, {'Content-Type': 'text/html; charset-utf-8'})
        
        //서버에서 HTML읽을 수 있도록 하기 
       const data = await fs.readFile('./test.html')
       res.end(data);
    
    }catch(error){
        console.error(err);
        res.writeHead(200, {'content-Type': 'text/plain; charsert=utf-8'});
        res.end(err.message);

    }
})     
    .listen(8080);
server1.on('listening', ()=> {
    console.log('8080번 포트에서 서버 대기 중입니다.');
});
server1.on('error', (error)=> {
    console.error(error);
});
