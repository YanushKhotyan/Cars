package JsonParser;


import Cars.Cars;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JsonParser {

    public List<Cars> getCars(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<Cars> methodList = new ArrayList<>();
        try{
            methodList = Arrays.asList(mapper.readValue(json, Cars[].class));
        } catch (IOException e){
            System.out.println(e);
        }
        return methodList;
    }


}
