import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.URL;
import java.net.URLConnection;

public class Q2 {


    static URL url;
    static URLConnection conn;
    static JSONParser parser = new JSONParser();
    static JSONObject JSONobject;

    public static String TIMEZONE;
    public static String COUNTRYCODE;

    final static String urlString = String.format("https://api.wheretheiss.at/v1/coordinates/%s,%s", Q1.LATITUDE, Q1.LONGITUDE);

    public static void init(){
        try {
            url = new URL(urlString);
            conn = url.openConnection();
            Object obj=parser.parse(new String(conn.getInputStream().readAllBytes()));
            JSONobject=(JSONObject) obj;
        }catch (Exception ignored){}

        TIMEZONE= JSONobject.get("timezone_id").toString();
        COUNTRYCODE= JSONobject.get("country_code").toString().equals("??") ?"N.A.":JSONobject.get("country_code").toString();
    }


}
