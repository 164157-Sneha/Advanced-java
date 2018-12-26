var express = require('express');
var app = express();

app.get('/year/:age',function(req,res){
    var age=req.params.age;
    var year=2018-age;

res.send("This is the year u were born" + year);


}).listen(3031);