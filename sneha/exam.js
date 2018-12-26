var express = require('express');
var app = express();

app.post('/', function(req, res){
   res.send("Hello Arpitha!");
});

app.listen(3030);