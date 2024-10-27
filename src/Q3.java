import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Q3 {

    static URL url;
    static URLConnection conn;
    static JSONParser parser = new JSONParser();
    static JSONObject JSONobject;
    static double LATITUDE;
    static double LONGITUDE;

    static String urlString;


    public static void init(int year,int month,int date){

        Date dateObject=new Date(year,month,date);

         urlString = String.format("https://api.wheretheiss.at/v1/satellites/25544?timestamp=%s",(int)(dateObject.getTime()/1000));

        try {
            url = new URL(urlString);
            conn = url.openConnection();
            Object obj = parser.parse(new String(conn.getInputStream().readAllBytes()));
            JSONobject = (JSONObject) obj;
        }catch(Exception ignored){}

        LATITUDE = (double) JSONobject.get("latitude");
        LONGITUDE = (double) JSONobject.get("longitude");


    }

}
