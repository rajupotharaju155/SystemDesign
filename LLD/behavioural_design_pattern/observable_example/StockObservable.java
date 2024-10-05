package behavioural_design_pattern.observable_example;
import java.util.ArrayList;
import java.util.List;
/**
 * StockObservable
 */
public interface StockObservable {
    List<NotificationObserver> observerList = new ArrayList<>();
    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void notifyObservers();
    public void setStock(int count);
    public int getStockCount();
}
