package abstract_factory.luxury_cars;

import abstract_factory.Car;
import abstract_factory.CarFactory;

public class LuxuryCar implements CarFactory{

    @Override
    public Car getCarInstance(int price) {
        if(price>1000000) return new LuxuryCar1();
        // if(price<2000000) return new LuxuryCar2();
        // if(price<3000000) return new LuxuryCar3();
        return null;
    }

}