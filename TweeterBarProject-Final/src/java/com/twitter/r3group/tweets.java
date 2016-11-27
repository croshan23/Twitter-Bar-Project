package com.twitter.r3group;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import twitter4j.*;
import java.util.List;
import twitter4j.conf.ConfigurationBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author Roshan, Raushan, Robel
 */
public class tweets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hashTag = "";
        PrintWriter out = response.getWriter();
        String option = request.getParameter("option");

    //DETERMINING VALUE OF HASHTAG        
        switch (option) {
            case "1":
                hashTag = "#business";
                break;
            case "2":
                hashTag = "#documentary";
                break;
            case "3":
                hashTag = "#linux";
                break;
            case "4":
                hashTag = "#rajnikant";
                break;
            default:
              ;
        }

    //AUTHENTICATION CREDENTIALS        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("3PnMEr3VwUG0yQ4NtU31cl36V")
                .setOAuthConsumerSecret("PE4HyuiSPlDstPUD6EPMDGj8GS5QPFtVmq1uVFmFYZgGGKx6zQ")
                .setOAuthAccessToken("800815145005916160-4FKfZQWA0afYNSjepbW74uilq24jfau")
                .setOAuthAccessTokenSecret("hkaOWpJgUCypuQCkBO5Rk3165zmtTwYOlwB54IZ3lFilS");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        //FETCHING DATA ACCORDING TO HASHTAG    
        try {
            Query query = new Query(hashTag); //add code to detect which link is clicked
            QueryResult result;
            result = twitter.search(query);
            List<Status> tweets = new ArrayList<>();

            //NUMBER OF TWEETS BUT LESS THAN 8
            for (int i = 0; (i < 8 && result.hasNext()); i++) {
                tweets.add(result.getTweets().get(i));
            }

            response.setContentType("text/html;charset=UTF-8");

            //CREATING HTML CONTENT FOR CONTAINER
            out.print("<!DOCTYPE html><html><head><title>Tweeter Bar Project</title><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
                    + "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\" type=\"text/javascript\"></script>"
                    + "<script type=\"text/javascript\" src=\"ajaxtweet.js\"></script></head><body>");
            out.print("<nav>");
            out.print("<a class=\"amenu\" href=\"#\" id=\"menu1\"><div class=\"menu\">Business</div></a>");
            out.print("<a class=\"amenu\" href=\"#\" id=\"menu2\"><div class=\"menu\">Documentary</div></a>");
            out.print("<a class=\"amenu\" href=\"#\" id=\"menu3\"><div class=\"menu\">Linux</div></a>");
            out.print("<a class=\"amenu\" href=\"#\" id=\"menu4\"><div class=\"menu\">Bollywood</div></a>");
            out.print("</nav>");
            
            for (Status tweet : tweets) {
                out.print("<div class=\"containerElement\">");
                out.print("<img src='" + tweet.getUser().getBiggerProfileImageURL() + "' alt='profile'>");
                out.print("<span>" + tweet.getUser().getName() + "</span><br/>");
                out.print("<a href=https://twitter.com/" + tweet.getUser().getScreenName() + "><p>" + tweet.getText() + "</p></a>");
                out.print("</div>");
                System.out.println(tweet.getId());
            }
            out.print("</body></html>");

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
