import Cars.Bus;

import java.io.IOException;
import java.util.Scanner;

public class MainStarter {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("What type of car do you want? Bus is 1, Passenger Car is 2, Truck is 3" + '\n'
                + " Type of car  =  ");
        int typeOfCar = input.nextInt();
        System.out.println(typeOfCar);

        if (typeOfCar == 1) {
//            Bus bus = new Bus();
//            bus.limitFuel();
//            bus.speed();
            System.out.println("What color and complications we have");


        }

    }
}
