package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {
    public static String APK;
    public static class Users {
        public static String user_Fahim;
        public static String user_Haseeb;
        public static String user_Polash;
        public static String user_Ashik;
        public static String user_Siam;
        public static String password;
    }

    public static String[] readJsonData() {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("src/main/java/TestData.json")) {
            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            {// Read data from the "APK" object
                JSONObject APKObject = (JSONObject) jsonObject.get("APK");
                APK = (String) APKObject.get("Name");
            }
            {// Read data from the "Login" object
                JSONObject loginObject = (JSONObject) jsonObject.get("Login");
                Users.user_Fahim = (String) loginObject.get("user_Fahim");
                Users.user_Polash = (String) loginObject.get("user_Polash");
                Users.user_Siam = (String) loginObject.get("user_Siam");
                Users.user_Ashik = (String) loginObject.get("user_Ashik");
                Users.user_Haseeb = (String) loginObject.get("user_Haseeb");
                Users.password = (String) loginObject.get("password");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return new String[]{};
    }
}

