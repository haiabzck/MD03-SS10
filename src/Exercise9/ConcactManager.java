package Exercise9;

import java.util.HashSet;

public class ConcactManager {
    public HashSet<Contact> contacts = new HashSet<>();

    public void addContact(Contact contact){
        if (contacts.add(contact)) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Lỗi: SĐT đã tồn tại");
        }
    }

    public void remove(String phoneNumber){
        Contact target = search(phoneNumber);

        if(target != null){
            contacts.remove(target);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Lỗi: SĐT không tồn tại");
        }
    }

    public Contact search(String phoneNumber){
        if(contacts.isEmpty()){
            System.out.println("Danh bạ rỗng");
            return null;
        }
        Contact newContact = new Contact("",phoneNumber);
        if (contacts.contains(newContact)){
            for (Contact contact :contacts){
                if(contact.getPhoneNumber().equals(phoneNumber)){
                    return contact;
                }
            }
        }
        return null;
    }

    public void display() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ hiện tại đang trống.");
        } else {
            for (Contact contact :contacts) {
                System.out.println((contact));
            }
        }
    }
}
