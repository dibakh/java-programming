package ex04;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {
    private String name = "Susana";
    private PowerLevelScouter powerLevelScouter = new PowerLevelScouter ( );

    @Test
    void scout() {
        Integer answer = powerLevelScouter.scout (name);
        Integer expected = 368;

        Assert.assertEquals (expected, answer);
    }

    @Test
    void scoutEnhanced() {
        Integer answer = powerLevelScouter.scoutEnhanced (name);
        Integer expected = 400;

        Assert.assertEquals (expected, answer);
    }
}