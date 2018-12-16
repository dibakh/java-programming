package week06.ex05;

import java.util.List;

public class VisaCard extends CreditCard {
    public VisaCard(String name, List<Integer> expetctedLength, List<String> expectedStartWith) {
        super(name, expetctedLength, expectedStartWith);
    }
}