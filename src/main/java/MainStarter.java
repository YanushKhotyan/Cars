import jsonParser.JsonParser;
import singleton.LazyInitializedSingleton;

import java.io.IOException;
import java.util.Scanner;

import static jsonParser.JsonConstants.JSON_CAR;

public class MainStarter {


    public static void main(String[] args) throws IOException {
    // Реализация синглтона
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();

        MainStarter mainStarter = new MainStarter();

        JsonParser jsonParser = new JsonParser(JSON_CAR);

        Scanner input = new Scanner(System.in);

        System.out.print("Choose key? [Bus - 1, PassengerCar - 2, Truck - 3]" + '\n'
                + " Key of car  =  ");

        int typeOfCar = input.nextInt();

        jsonParser.printCarByKey(typeOfCar);

        System.out.println("Kaneshna Nixya sebe!");
    }
}
