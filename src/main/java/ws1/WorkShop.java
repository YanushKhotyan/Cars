package ws1;


import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WorkShop
{
    ArrayList<String> kList = new ArrayList<>();
    HashMap<Integer, String> kHashMap = new HashMap<>();
    Logger logger = Logger.getLogger(WorkShop.class);

    @Test
    public void wsTest2()
    {
        kList.add("Ferrary");
        kList.add("Audi");
        kList.set(1, "BMW");
        kList.add(0,"Alfa");
        assert kList.contains("BMW");
        int ind = kList.indexOf("Ferrary");
        logger.info("Index: " + ind);
        logger.info("Array: " + kList.size());
        logger.info("To array:" + Arrays.toString(kList.toArray()));


    }
}
