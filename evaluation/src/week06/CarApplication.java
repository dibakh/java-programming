package week06;

import java.util.Arrays;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        List<String> carsBrand = Arrays.asList("Audi", "Mercedes", "Seat", "Skoda", "Tesla", "Bmw", "Peugeot", "Citroen", "Jeep", "Ferrari");

        Hansel hansel = new Hansel();

        for (String brand : carsBrand) {
            Car nextCar = Cars.getNextCar(brand);
            hansel.haveATry(nextCar);
        }


    }
}
