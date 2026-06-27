package Exercise3;

import java.util.LinkedList;

public class UserManager {
    private LinkedList<User> users = new LinkedList<>();

    public void add(User user) {
        users.add(user);
    }
     public boolean removeUser(String email){
        return users.removeIf(user -> user.getEmail().equals(email));
     }
    public void display() {
        if (users.isEmpty()){
            System.out.println("Chưa có người dùng nào trong danh sách.");
        }else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
