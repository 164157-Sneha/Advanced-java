var express = require('express');
var app = express();

app.use(express.static('public'));

//Serves all the request which includes /images in the url from Images folder
app.use('/img', express.static(__dirname + '/Images'));

var server = app.listen(7000);