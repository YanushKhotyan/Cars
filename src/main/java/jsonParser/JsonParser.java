package jsonParser;

import cars.Bus;
import cars.PassengerCar;
import cars.Truck;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import singleton.LazyInitializedSingleton;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class JsonParser {



    private String jsonFilePath;
    private HashMap<String, Object> jsonToMap = null;
    static ObjectMapper mapper = new ObjectMapper();

    LazyInitializedSingleton lazyInitializedSingleton = new LazyInitializedSingleton();

    Logger logger = Logger.getLogger(JsonParser.class);

    public JsonParser(String jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
    }

    public HashMap<String, Object> getJsonMap() {
        try {
            jsonToMap = mapper.readValue(
                    new File(jsonFilePath),
                    new TypeReference<Map<String, Object>>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("JSON file was serialized to Map!");
        return jsonToMap;
    }

    public Bus getBus(String jsonKey) {
        jsonToMap = null;
        Bus bus = new Bus("Audi", "S5");
        try {
            jsonToMap = (HashMap<String, Object>) getJsonMap().get(jsonKey);
            bus.setColor((String) jsonToMap.get("color"));
            bus.setName((String) jsonToMap.get("name"));
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return bus;

    }

    public Truck getTruck(String jsonKey) {
        jsonToMap = null;
        Truck truck = new Truck("Bmw", "535");
        try {
            jsonToMap = (HashMap<String, Object>) getJsonMap().get(jsonKey);
            truck.setWeight((String) jsonToMap.get("weight"));
            truck.setThrust((String) jsonToMap.get("thrust"));
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return truck;
    }

    public PassengerCar getPassagerCar(String jsonKey) {
        jsonToMap = null;
        PassengerCar passengerCar = new PassengerCar("KIA", "True");
        try {
            jsonToMap = (HashMap<String, Object>) getJsonMap().get(jsonKey);
            passengerCar.setMaxSpeed((String) jsonToMap.get("maxSpeed"));
            passengerCar.setLowCost((String) jsonToMap.get("lowCost"));
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return passengerCar;
    }

    public void printCarByKey(int input) {

        switch (input) {
            case 1:
                logger.info(this.getBus("Bus").toString());
                break;
            case 2:
                logger.info(this.getTruck("Truck").toString());
                break;
            case 3:
                logger.info(this.getPassagerCar("PassengerCar").toString());
                break;
            default:
                logger.info("Car type is not found!");
        }
    }
}
