const fs = require('fs');

let text = 'hi this is my first file\n';
             
// write to a new file named 2pac.txt
fs.writeFile('2p.txt', text , (err) => {  
    // throws an error, you could also catch it here
    if (err) throw err;

    // success case, the file was saved
    console.log('Text saved!');
});