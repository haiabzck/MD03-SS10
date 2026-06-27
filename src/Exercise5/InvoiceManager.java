package Exercise5;

import java.util.ArrayList;
import java.util.List;

public class InvoiceManager implements Manage<Invoice>{
    public List<Invoice> invoices;
    public InvoiceManager() {
        invoices = new ArrayList<>();
    }

    @Override
    public void add(Invoice item) {
        invoices.add(item);
    }

    @Override
    public void update(int index, Invoice item) {
        if (index >= 0 && index < invoices.size()) {
            invoices.set(index, item);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < invoices.size()){
            invoices.remove(index);
        }
    }

    @Override
    public void display() {
        if (invoices.isEmpty()) {
            System.out.println("Chưa có hóa đơn nào trong danh sách.");
        } else {
            for (int i = 0; i < invoices.size(); i++) {
                System.out.println((i + 1) + ". " + invoices.get(i));
            }
        }
    }
}
