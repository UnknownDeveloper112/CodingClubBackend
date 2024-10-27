import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.URL;
import java.net.URLConnection;

public class Q1 {


    static URL url;
    static URLConnection conn;
    static JSONParser parser = new JSONParser();
    static JSONObject JSONobject;
    static double LATITUDE;
    static double LONGITUDE;

    final static String urlString = "https://api.wheretheiss.at/v1/satellites/25544";


    public static void init(){
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
