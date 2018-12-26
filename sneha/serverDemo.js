var express = require('express');
var app = express();

app.use(express.static('public'));
app.get('/sne.html', function (req, res) {
   res.sendFile( __dirname + "/" + "sne.html" );
});

app.get('/process_get', function (req, res) {
   // Prepare output in JSON format
   response = {
      Username:req.query.username,
      Password:req.query. password
   };
   console.log(response);
   res.end(JSON.stringify(response));
})

var server = app.listen(3056, function () {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
})