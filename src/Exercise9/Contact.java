package Exercise9;

import java.util.Objects;

public class Contact {
    private static int idCounter = 1;

    private int id;
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.id = idCounter++;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // phương thức equals() và hashCode() để đảm bảo Set lưu ko trùng lặp
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
    @Override
    public String toString() {
        return "ID : " + id + " , Tên : " + name + " , Số điện thoại : " + phoneNumber + " ";
    }
}
