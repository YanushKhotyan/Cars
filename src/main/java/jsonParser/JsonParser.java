package jsonParser;

import cars.*;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import singleton.Singleton;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class JsonParser {


    private String jsonFilePath;
    private HashMap<String, Object> jsonToMap = null;
    private HashMap<Integer, String> jsonToMapToList = null;
    static ObjectMapper mapper = new ObjectMapper();

    Singleton singleton = new Singleton();

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

    public Mercedes getMercedes(String jsonKey) {

        jsonToMap = null;

        Mercedes mercedes = new Mercedes("Mercedes-benz", "Benz");

        try {

            jsonToMap = (HashMap<String, Object>) getJsonMap().get(jsonKey);

            mercedes.setColorBlack((String) jsonToMap.get("colorBlack"));
            mercedes.setColorWhite((String) jsonToMap.get("colorWhite"));
            mercedes.setColorCustom((String) jsonToMap.get("colorCustom"));
            mercedes.setModelE211((String) jsonToMap.get("modelE211"));
            mercedes.setModelE212((String) jsonToMap.get("modelE212"));
            mercedes.setModelE213((String) jsonToMap.get("modelE213"));
            mercedes.setFourSecondTo100KmH((String) jsonToMap.get("fourSecondTo100KmH"));
            mercedes.setSevenSecondTo100KmH((String) jsonToMap.get("sevenSecondTo100KmH"));
            mercedes.setTwelveSecondTo100KmH((String) jsonToMap.get("twelveSecondTo100KmH"));
            mercedes.setTwoLiterMotor((String) jsonToMap.get("twoLiterMotor"));
            mercedes.setThreeLiterMotor((String) jsonToMap.get("threeLiterMotor"));
            mercedes.setSixAndThreeLiterMotor((String) jsonToMap.get("sixAndThreeLiterMotor"));


        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return mercedes;
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
            case 4:
                logger.info(this.getMercedes("Mercedes").getColorBlack().toString());
                break;
            default:
                logger.info("Car type is not found!");
                break;
        }
    }

    public Porshe getCustomCar(String jsonKey) {
        jsonToMap = null;
        Porshe porshe = new Porshe();

        try {
            jsonToMapToList = (HashMap<Integer, String>) getJsonMap().get(jsonKey);

            HashMap<Integer, String> map = new HashMap<Integer, String>();
            map.put(1, "Green");
            map.put(2, "Red");
            map.put(3, "Yellow");
            map.put(4, "Blue");

            List<String> list = new ArrayList<String>(map.values());
            for (String s : list) {
                System.out.println(s);
            }

            porshe.setColors((String) jsonToMap.get("Green"));
            porshe.setSeconds((String) jsonToMap.get("4 seconds"));
            porshe.setHorsepower((String) jsonToMap.get("150Hp"));



        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return porshe;
    }

    public void getYourFavoriteCar(int favoriteCar) {

        switch (favoriteCar) {
            case 1:
                logger.info(this.getMercedes("Mercedes").getColorWhite().toString());
                logger.info(this.getMercedes("Mercedes").getTwelveSecondTo100KmH().toString());
                logger.info(this.getMercedes("Mercedes").getModelE211().toString());
                logger.info(this.getMercedes("Mercedes").getTwoLiterMotor().toString());
                break;
            case 2:
                logger.info(this.getTruck("Truck").toString());
                break;
            case 3:
                logger.info(this.getPassagerCar("PassengerCar").toString());
                break;
            case 4:
                logger.info(this.getMercedes("Mercedes").getColorBlack().toString());
                break;
            case 5:
                logger.info(this.getCustomCar("Colors").getColors().toString());
                logger.info(this.getCustomCar("Hoursepower").getHorsepower().toString());
                logger.info(this.getCustomCar("SecondTo100km").getSeconds().toString());

            default:
                logger.info("Car type is not found!");
                break;
        }
    }

}
