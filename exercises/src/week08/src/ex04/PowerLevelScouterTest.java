package ex04;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {

    @Test
    void scout() {
        PowerLevelScouter powerLevelScouter = new PowerLevelScouter ( );
        Integer answer = powerLevelScouter.scout ("Diba");
        Integer expected=368;

        Assert.assertEquals (expected,answer);
    }

    @Test
    void scoutEnhanced() {
        PowerLevelScouter powerLevelScouter = new PowerLevelScouter ( );
        Integer answer = powerLevelScouter.scoutEnhanced ("Diba");
        Integer expected=400;

        Assert.assertEquals (expected,answer);
    }
}