package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

    private static Properties property=new Properties();
    static{

        try{
            property.load(new FileInputStream(new File(System.getProperty("user.dir")+"/test-data/config.properties")));
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }



    }

    public static String propertyGet(String key){
        return property.getProperty(key);
    }
}
