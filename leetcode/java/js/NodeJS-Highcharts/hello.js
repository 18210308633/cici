var webPage = require('webpage');


var page = webPage.create();
console.log(page.cookies);
page.open('http://m.bing.com', function (status) {


    vartitle = page.evaluate(function (s) {


        returndocument.querySelector(s).innerText;


    }, 'title');


    console.log(title);


    phantom.exit();


});
