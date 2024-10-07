package abstract_factory.economic_cars;

import abstract_factory.Car;
import abstract_factory.CarFactory;

public class EconomicCar implements CarFactory{

    @Override
    public Car getCarInstance(int price) {
        if(price<100000) return new EcomomicCar1();
        // if(price<200000) return new EcomomicCar2();
        // if(price<300000) return new EcomomicCar3();
        return null;
    }
    
}
