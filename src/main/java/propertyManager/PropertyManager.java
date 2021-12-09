package propertyManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
    private static String badPassword;
    private static String badUserName;
    private static String goodPassword;
    private static String goodUserName;
    private static String driverPath;
    private static String URL;

    public static PropertyManager getInstance(){
        Properties stream = new Properties();
        PropertyManager PM = new PropertyManager();

        try {
            FileInputStream input = new FileInputStream("src/main/resources/configuration.properties");
            stream.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        badPassword = stream.getProperty("badPassword");
        badUserName = stream.getProperty("badUserName");
        goodPassword = stream.getProperty("goodPassword");
        goodUserName = stream.getProperty("goodUserName");
        driverPath = stream.getProperty("driverPath");
        URL = stream.getProperty("URL");

        return PM;
    }

    public static String getURL() {
        return URL;
    }

    public static String getDriverPath() {
        return driverPath;
    }

    public static String getGoodUserName() {
        return goodUserName;
    }

    public static String getGoodPassword() {
        return goodPassword;
    }

    public static String getBadPassword() {
        return badPassword;
    }

    public static String getBadUserName() {
        return badUserName;
    }
}

