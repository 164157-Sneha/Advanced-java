/* var express var app = express();= require('express'); */
var app= require('express')();

/* app.use(express.static('public')); */

//Serves all the request which includes /images in the url from Images folder
/* app.use('/img', express.static(__dirname + '/Images')); */
app.use(express.static('public'));
var server = app.listen(7000);