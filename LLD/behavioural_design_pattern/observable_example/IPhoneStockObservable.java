package behavioural_design_pattern.observable_example;

public class IPhoneStockObservable implements StockObservable{
    int iPhoneStockCount=0;
    IPhoneStockObservable(int initialPhoneStockCount){
        this.iPhoneStockCount = initialPhoneStockCount;
    }


    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (NotificationObserver observer : observerList) {
            observer.update(iPhoneStockCount);
        }
    }

    @Override
    public void setStock(int newCount) {
        if(newCount !=0 && iPhoneStockCount==0){
            iPhoneStockCount = newCount;
            notifyObservers();
        }
        iPhoneStockCount = newCount;
    }

    @Override
    public int getStockCount() {
        System.out.println("Available stock count: "+iPhoneStockCount);
        return iPhoneStockCount;
    }
}
