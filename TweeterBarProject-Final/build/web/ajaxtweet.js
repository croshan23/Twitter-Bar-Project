$(function(){
    $("#tweets").click(getTweetsDefault);
    $("#menu1").click(getTweetsDefault);
    $("#menu2").click(getTweetsDocumentary);
    $("#menu3").click(getTweetsLinux);    
    $("#menu4").click(getTweetsBollywood);
});

function emptyData(){
    $("#container").empty();
}

function getTweetsDefault(){
    emptyData();//can be extended for Throbber
    $.get("tweets.servlet", {"option":"1"}).done(displayPage).fail();
}

function getTweetsDocumentary(){
    emptyData();//can be extended for Throbber
    $.get("tweets.servlet", {"option":"2"}).done(displayPage).fail();
}

function getTweetsLinux(){
    emptyData();//can be extended for Throbber
    $.get("tweets.servlet", {"option":"3"}).done(displayPage).fail();
}

function getTweetsBollywood(){
    emptyData();//can be extended for Throbber
    $.get("tweets.servlet", {"option":"4"}).done(displayPage).fail();
}

function getTrends(){
    emptyData();//can be extended for Throbber
    $.get("trends.servlet").done(displayPage).fail();
}

function displayPage(data){
    $("#container").html(data);
}

window.onload = function ()
{
    getTweetsDefault();
};
        