package JsonParser;

import Cars.Bus;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;

public class JsonParser {

//    JsonParser parser = new JsonParser();

    private HashMap<String, Object> map = new HashMap<String, Object>();
    static ObjectMapper mapper = new ObjectMapper();


    public JsonParser(HashMap<String, Object> map) throws IOException {
        this.map =   mapper.readValue(JsonParser.class.getResourceAsStream("/CarsObject.json"), Bus.class);
    }

    public JsonParser() throws IOException {

    }

    public static void main(String[] args) throws IOException {
//        mapper.readValue(new File("//CarsObject.json"), Cars.class);

    }
}
