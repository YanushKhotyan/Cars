package carNameList;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class carsList {
    public carsList(ArrayList<String> carsNameList, HashMap<Integer, String> carsNameHashMap) {
        this.carsNameList = carsNameList;
        this.carsNameHashMap = carsNameHashMap;
    }

    @Override
    public String toString() {
        return "carsList{" +
                "carsNameList=" + carsNameList +
                ", carsNameHashMap=" + carsNameHashMap +
                '}';
    }

    public ArrayList<String> getCarsNameList() {
        return carsNameList;
    }

    public void setCarsNameList(ArrayList<String> carsNameList) {
        this.carsNameList = carsNameList;
    }

    public HashMap<Integer, String> getCarsNameHashMap() {
        return carsNameHashMap;
    }

    public void setCarsNameHashMap(HashMap<Integer, String> carsNameHashMap) {
        this.carsNameHashMap = carsNameHashMap;
    }


    ArrayList<String> carsNameList = new ArrayList<>();
    HashMap<Integer, String> carsNameHashMap = new HashMap<>();
    Logger logger = Logger.getLogger(carsList.class);

    @Test
    public  void addCarsMakeToList(){
        carsNameList.add(0,"Mercedes-benz");
        carsNameList.add(1,"Audi");
        carsNameList.add(2,"BMW");

        logger.info("Array: " + carsNameList.size());
        logger.info("To array:" + Arrays.toString(carsNameList.toArray()));
    }



}
