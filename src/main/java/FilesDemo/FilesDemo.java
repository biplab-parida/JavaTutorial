package FilesDemo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;


public class FilesDemo {
    public static void main(String[] args) {
        readAsJsonObject();
        readAsJsonObject2();
        readPropertiesFile();
        readAsString();
        readAsString2();
    }

    private static void readAsJsonObject() {
        try {
            FileReader reader = new FileReader("src/main/resources/jsonTutorial1.json");
            JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
            System.out.println(obj.get("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAsJsonObject2() {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/jsonTutorial1.json");
            InputStreamReader reader = new InputStreamReader(fis);
            JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
            System.out.println(obj.get("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAsString() {
        StringBuilder sb = new StringBuilder();

        try (FileInputStream fis = new FileInputStream("src/main/resources/jsonTutorial1.json");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader reader = new BufferedReader(isr)) {

            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }

            String jsonAsString = sb.toString();
            System.out.println(jsonAsString);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readAsString2() {
        try {
            String str = Files.readString(Paths.get("src/main/resources/jsonTutorial1.json"));
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void readPropertiesFile() {
        Properties prop = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            prop.load(fis);
            System.out.println("User Name: " + prop.getProperty("username"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}