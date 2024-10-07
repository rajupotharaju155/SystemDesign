package abstract_factory;

public class Start {
    public static void main(String[] args) {
        CarFactory economicCatFactory = new AbsractFactory().getCarFactoryInstance("economic"); //get Factory first
        CarFactory premiumCatFactory = new AbsractFactory().getCarFactoryInstance("luxury"); //get Factory first

        Car economicCar1 = economicCatFactory.getCarInstance(50000); //get instance secondaly
        Car premiumCar1 = premiumCatFactory.getCarInstance(5000000); //get instance secondaly
 
        System.out.println(economicCar1.getName());
        System.out.println(premiumCar1.getName());
    }
}
