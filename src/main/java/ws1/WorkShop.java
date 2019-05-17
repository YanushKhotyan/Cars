package ws1;

import jsonParser.JsonParser;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class WorkShop{

    Logger logger = Logger.getLogger(WorkShop.class);

    ArrayList<String> cList = new ArrayList<String>();
    HashMap<String, Object> cHashMap = new HashMap<>();

    @Test
    public void wsTest1(){
        cList.add("Mercedes-benz");
        cList.add("BMW");
        cList.set(1, "Audi");
        cList.add(0, "Fiat");
        assert cList.contains("Audi");
        int ind = cList.indexOf("Mercedes-benz");
        logger.info("Index: " + ind);
        logger.info("Array: " + cList.size());
        logger.info("To array:" + Arrays.toString(cList.toArray()));

    }





}
