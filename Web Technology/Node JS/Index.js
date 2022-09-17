const http = require('http');

const server = http.createServer((req,res)=>{
    res.statusCode = 200;
    res.setHeader('Content-Type' , 'text/html');
    res.write("hello <h1> world </h1> from du!");
    res.end();
});

server.listen(3000,()=>{
    console.log("server started @ http://localhost:3000");
});