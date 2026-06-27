package Exercise3;


public class User {
    private String name;
    private String email;
    private String numberPhone;

    public User() {
    }
    public User(String name,String email, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Tên : " + name + " , Số điện thoại : " + numberPhone + " , Email : " + email + " ";
    }
}
