package com.twitter.r3group;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twitter4j.GeoLocation;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Roshan
 */
public class trends extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //extracting latitude and longitude    
        String latLng = request.getParameter("latLng");
        String[] latLngArray = latLng.split(" ");
        String latitude = latLngArray[0].substring(1, latLngArray[0].length()-1);
        String longitude = latLngArray[1].substring(0, latLngArray[1].length()-1);
        
        //AUTHENTICATION CREDENTIALS        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("3PnMEr3VwUG0yQ4NtU31cl36V")
                .setOAuthConsumerSecret("PE4HyuiSPlDstPUD6EPMDGj8GS5QPFtVmq1uVFmFYZgGGKx6zQ")
                .setOAuthAccessToken("800815145005916160-4FKfZQWA0afYNSjepbW74uilq24jfau")
                .setOAuthAccessTokenSecret("hkaOWpJgUCypuQCkBO5Rk3165zmtTwYOlwB54IZ3lFilS");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        try {
            //codes to get the woeid according to the geo location      
            ResponseList<Location> locations;
            locations = twitter.getClosestTrends(new GeoLocation(Double.parseDouble(latitude), Double.parseDouble(longitude)));            
            int woeid = locations.get(0).getWoeid();
            
            //searching top trends according to WOEID
            Trends trends = twitter.getPlaceTrends(woeid);//
            Trend[] trend = trends.getTrends();
            
            //just printing the output
            out.print("<ul>");
            for (int i = 0; i < 5; i++) {
                out.print("<li><a href=\""+ trend[i].getURL() +"\">" + trend[i].getName() + "</a></li>");
            }
            out.print("</ul>");
            
        } catch (Exception e) {
            System.out.println("No trends available!");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
