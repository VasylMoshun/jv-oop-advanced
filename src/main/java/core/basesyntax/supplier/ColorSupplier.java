package core.basesyntax.supplier;

import core.basesyntax.figures.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random;
    public String getRandomColor() {

        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
