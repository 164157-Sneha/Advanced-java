const express = require("express");
const app = express(); 
const bodyParser = require("body-parser");

app.use(bodyParser.json());

const mongoose = require("mongoose");

require("./Book")
const Book =  mongoose.model("Book")

mongoose.connect("mongodb://Sneha:Sneha@9722@ds145694.mlab.com:45694/bookservice",() =>
{
 console.log("Database connected");   
});

 app.get('/', (req,res) => {
    res.send("This is our book service ");
}) 

app.post("/book", (req,res) => {
    var newBook = {
        title: req.body.title,
        author: req.body.author,
        numPages: req.body.numPages,
        publisher: req.body.publisher
    }

    var book = new Book(newBook)
    book.save().then(() => {
        console.log("New Book created")
    }).catch((err)=> {
        if(err){
            throw err;
        }
    })
    res.send("A new book is created with success");
})

 app.get("/books", (req,res) => {

    Book.find().then((books) => {
        console.log(books);
    })
}) 
app.listen(4545,() => {
    console.log(" Up and Running!---This is books service")
})