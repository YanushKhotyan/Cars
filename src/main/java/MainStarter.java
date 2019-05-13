import jdk.management.resource.internal.inst.InitInstrumentation;
import jsonParser.JsonParser;
import singleton.LazyInitializedSingleton;

import java.io.IOException;
import java.util.Scanner;
import org.apache.log4j.Logger;

import static jsonParser.JsonConstants.JSON_CAR;

public class MainStarter {


    public static void main(String[] args) throws IOException {
    // Реализация синглтона
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();

        Logger logger = Logger.getLogger(MainStarter.class);

        MainStarter mainStarter = new MainStarter();

        JsonParser jsonParser = new JsonParser(JSON_CAR);

        Scanner input = new Scanner(System.in);



        System.out.println("Choose key? [Bus - 1, PassengerCar - 2, Truck - 3]" + '\n'
                + " Key of car  =  ");

//        int typeOfCar = input.nextInt();
        int favoriteCar = input.nextInt();

//        jsonParser.printCarByKey(typeOfCar);
        jsonParser.getYourFavoriteCar(favoriteCar);

        logger.info("Kaneshna Nixya sebe!");
    }
}
