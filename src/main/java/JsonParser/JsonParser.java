package JsonParser;

import Cars.Bus;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonParser
{

//    JsonParser parser = new JsonParser();

    private String jsonFilePath;
    private HashMap<String, Object> jsonToMap = null;
    static ObjectMapper mapper = new ObjectMapper();

    public JsonParser(String jsonFilePath)
    {
        this.jsonFilePath = jsonFilePath;
    }

    public HashMap<String, Object> getJsonMap() throws IOException
    {
        try
        {
            jsonToMap = mapper.readValue(
                    new File(jsonFilePath),
                    new TypeReference<Map<String, Object>>()
                    {
                    });
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("JSON file was serialized to Map!");
        return jsonToMap;
    }

    public Bus getBus(String jsonKey) throws IOException
    {
        jsonToMap = null;
        Bus bus = new Bus("Audi", "S5");
        try{
            jsonToMap = (HashMap<String, Object>) getJsonMap().get(jsonKey);
            bus.setColor((String) jsonToMap.get("color"));
        }catch (Exception e){
            e.getLocalizedMessage();
        }
      return bus;

    }


}
