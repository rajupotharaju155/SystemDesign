package abstract_factory.luxury_cars;

import abstract_factory.Car;

public class LuxuryCar1 implements Car {
    String name = "LuxuryCar1";

    @Override
    public String getName() {
        return name;
    }
}
