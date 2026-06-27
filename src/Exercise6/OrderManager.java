package Exercise6;

import java.util.ArrayList;
import java.util.List;

public class OrderManager implements Manage<Order> {
    public List<Order> orders;
    public OrderManager() {
        orders = new ArrayList<>();
    }

    @Override
    public void add(Order item) {
        orders.add(item);
    }

    @Override
    public void update(int index, Order item) {
        if (index >= 0 && index < orders.size()) {
            orders.set(index, item);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < orders.size()){
            orders.remove(index);
        }
    }

    @Override
    public void display() {
        if (orders.isEmpty()) {
            System.out.println("Chưa có hóa đơn nào trong danh sách.");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println((i + 1) + ". " + orders.get(i));
            }
        }
    }
}
