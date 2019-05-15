import jsonParser.JsonParser;
import singleton.Singleton;

import java.util.Scanner;

import org.apache.log4j.Logger;

import static jsonParser.JsonConstants.JSON_CAR;

public class MainStarter {


    public static void main(String[] args) {
        // Реализация синглтона
        Singleton singleton = Singleton.getInstance();

        Logger logger = Logger.getLogger(MainStarter.class);

        MainStarter mainStarter = new MainStarter();

        JsonParser jsonParser = new JsonParser(JSON_CAR);

        Scanner input = new Scanner(System.in);


        logger.info("Choose key? [Bus - 1, PassengerCar - 2, Truck - 3]" + '\n'
                + " Key of car  =  ");

        int typeOfCar = input.nextInt();
        int favoriteCar = input.nextInt();
        String customCar = String.valueOf(input.nextInt());

        jsonParser.printCarByKey(typeOfCar);
        jsonParser.getYourFavoriteCar(favoriteCar);
        jsonParser.getCustomCar(customCar);


        logger.info("Kaneshna Nixya sebe!");
    }
}
