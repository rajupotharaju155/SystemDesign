package abstract_factory;

import abstract_factory.economic_cars.EconomicCar;
import abstract_factory.luxury_cars.LuxuryCar;

public class AbsractFactory {
    public CarFactory getCarFactoryInstance(String carType){
        if(carType=="economic") return new EconomicCar();
        if(carType=="luxury") return new LuxuryCar();
        return null;
    }
}
