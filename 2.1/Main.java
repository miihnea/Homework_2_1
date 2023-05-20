import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Config config = Config.getInstance();

        Object obj = new JSONParser().parse(new FileReader("Config.json"));
        JSONObject jo = (JSONObject) obj;

        config.setColor((String)jo.get("color"));
        config.setWeight((long)jo.get("weight"));

        config.showContent();
    }


}
