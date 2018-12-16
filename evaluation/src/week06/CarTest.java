package week06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CarTest {

    @Test
    void testAutomaticCar() {
        AutomaticCar bmv = new AutomaticCar("Bmv");
        String message = bmv.drive();
        Assertions.assertEquals("Automatic Bmv", message);
    }

    @Test
    void testManualCar() {
        ManualCar bmv = new ManualCar("Bmv");
        String message = bmv.drive();
        Assertions.assertEquals("Manual Bmv", message);
    }
}