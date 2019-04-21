import Cars.Bus;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class MainStarter {
    public static void main(String[] args) throws IOException {
      // Могу ли я тут оберунуть в иф, для выбора старта одной из машин

        MainStarter mainStarter = new MainStarter();

        Scanner input = new Scanner(System.in);

        System.out.print("What type of car do you want? Bus is 1, Passenger Car is 2, Truck is 3" + '\n'
                + " Type of car  =  ");
            int typeOfCar = input.nextInt();
            System.out.println(typeOfCar);

            if (typeOfCar == 1){
                Bus run = new Bus();



            }

    }
}
