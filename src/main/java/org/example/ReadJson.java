package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {
    public static String apk;
    public static class Invoices {
        public static String Invioces_number;
    }

    public static String[] readJsonData() {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("src/main/TestData.json")) {
            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            {// Read data from the "apk" object
                JSONObject loginObject = (JSONObject) jsonObject.get("apk");
                apk = (String) loginObject.get("apk");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return new String[]{};
    }
}

