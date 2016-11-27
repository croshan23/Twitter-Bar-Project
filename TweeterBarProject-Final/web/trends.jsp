<%-- 
    Document   : trends
    Created on : Nov 24, 2016, 2:05:21 PM
    Author     : Roshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tweeter Bar Project</title>   
        <link href="css/mystyle.css" type="text/css" rel="stylesheet" />  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAJSkscL5mXcTduqx68evG5HpTEOj_h1RM"></script>
        <script type="text/javascript" src="jquery.googlemap.js"></script>        
        <script type="text/javascript" src="ajaxtrends.js"></script>         
    </head>
    <body>
        <header>
            <div id="bar">
                <span>CS472</span> TwitterBar
                <ul>
                    <li><a href="index.jsp" id="tweets">Tweets</a></li>
                    <li><a href="#">Maps</a></li>
                    <li><a href="trends.jsp" id="trends">Trends</a></li>
                </ul>
            </div>
            <div id="banner">
                <img src="images/banner2.png" alt="banner" />
            </div>
        </header>
    <!-- BODY CONTENT STARTS HERE-->
        <section>
            <div id="container">
                <div id="map" style="width: 100%; height: 500px;"></div>               
            </div>
        </section>
    <!-- FOOTER SECTION -->
        <footer>
            <span> Copyright: R3 Group :D </span>
        </footer>       
    </body>
</html>