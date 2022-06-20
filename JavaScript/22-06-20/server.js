const http = require('http');

const server1 = http.createServer((req, res)=>{
    res.writeHead(200, {'Content-Type': 'text/html; charset-utf-8'})
    res.write('<h1> Hello Node!!!!!!!</h1>');
    res.write('<p>Hello server<p/>');
    res.end('<p>Hello Node World</p>');

})      //listen을 사용하면 터미널 전체가 사용됨 -> 다른 명령어를 사용하지 못함
    .listen(8080);
server1.on('listening', ()=> {
    console.log('8080번 포트에서 서버 대기 중입니다.');
});
server1.on('error', (error)=> {
    console.error(error);
});



//서버2개
const server2 = http.createServer((req, res)=>{
    res.writeHead(200, {'Content-Type': 'text/html; charset-utf-8'})
    res.write('<h1> Hello Node!!!!!!!</h1>');
    res.write('<p>Hello server<p/>');
    res.end('<p>Hello Node World</p>');

})      //listen을 사용하면 터미널 전체가 사용됨 -> 다른 명령어를 사용하지 못함
    .listen(8070);
server2.on('listening', ()=> {
    console.log('8070번 포트에서 서버 대기 중입니다.');
});
server2.on('error', (error)=> {
    console.error(error);
});