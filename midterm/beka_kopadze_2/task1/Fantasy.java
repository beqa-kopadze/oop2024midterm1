package midterm.beka_kopadze_2.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Beqa Kopadze";

    @Override
    public String getFolk1() {
        return "Folk1 implementation";
    }

    @Override
    public String getCoffee2() {
        return "Coffee2 implementation";
    }

    @Override
    public String methodBrightness3(String argHashing5) {
        // Implement the method logic here
        return "Brightness3 implementation for " + argHashing5;
    }

    @Override
    public List<String> methodUniform4(String argAccessories6) {
        // Implement the method logic here
        List<String> result = new ArrayList<>();
        result.add("Uniform4 implementation for " + argAccessories6);
        return result;
    }

    @Override
    public String toString() {
        String result = "Fantasy class implemented by " + studentName;
        return result;
    }
}
