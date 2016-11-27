<%-- 
    Document   : index
    Created on : Nov 21, 2016, 2:13:17 PM
    Author     : Roshan
--%>

<%--  <%@page import="java.util.List"%> --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tweeter Bar Project</title>   
        <link href="css/mystyle.css" type="text/css" rel="stylesheet" />  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js" type="text/javascript"></script>        
        <script type="text/javascript" src="ajaxtweet.js"></script>         
    </head>
    <body>
    <!-- HEADER CONTENT STARTS HERE-->    
        <header>
            <div id="bar">
                <span>CS472</span> TwitterBar
                <ul>
                    <li><a href="#" id="tweets">Tweets</a></li>
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
            <div id="container"></div>
        </section>
    <!-- FOOTER SECTION -->
        <footer>
            <span> Copyright: R3 Group :D </span>
        </footer>       
    </body>
</html>

