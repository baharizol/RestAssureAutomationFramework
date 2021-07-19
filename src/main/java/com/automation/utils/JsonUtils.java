package com.automation.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtils {

    public static void readJson(String fileName) {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Tamplates\\"+ fileName +"json";
        try {
            String text = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileAsString(String file) throws IOException {
            return new String(Files.readAllBytes(Paths.get(file)));
    }


    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Tamplates\\demo_1.json";
        try {
            JSONParser parser = new JSONParser();
            //Use JSONObject for simple JSON and JSONArray for array of JSON.
            JSONObject data = (JSONObject) parser.parse(
                    new FileReader(filePath));//path to the JSON file.

            String json = data.toJSONString();
            System.out.println(json);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
