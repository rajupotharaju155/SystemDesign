package structural_design_patterns.composite_example;

public class Start {
    public static void main(String[] args) {
        Leaf keyboard = new Leaf("Keyboard", 400);
        Leaf mouse = new Leaf("mouse", 100);
        Leaf monitor = new Leaf("monitor", 1000);
        Leaf ram = new Leaf("ram", 3000);
        Leaf hdd = new Leaf("hdd", 2500);
        Leaf cpu = new Leaf("CPU", 3500);

        Composite cabinet = new Composite("Cabinet", 500);
        Composite motherBoard = new Composite("MotherBoard", 6000);
        Composite peripheralDevices = new Composite("Peripheral", 60000);       
        
        Composite computer = new Composite("Computer", 100000);  //root

        motherBoard.addComposite(ram);
        motherBoard.addComposite(cpu);

        cabinet.addComposite(motherBoard);
        cabinet.addComposite(hdd);
        
        peripheralDevices.addComposite(monitor);
        peripheralDevices.addComposite(keyboard);
        peripheralDevices.addComposite(mouse);

        //finally
        computer.addComposite(cabinet); 
        computer.addComposite(peripheralDevices);

        computer.showDetails(); //call showDetails on root
    }



}
