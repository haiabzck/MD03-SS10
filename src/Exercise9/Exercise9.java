package Exercise9;

public class Exercise9 {
    public static void main(String[] args) {
        ConcactManager manager = new ConcactManager();

        System.out.println("--- THỬ NGHIỆM THÊM LIÊN LẠC ---");
        manager.addContact(new Contact("Nguyễn Văn A", "0912345678"));
        manager.addContact(new Contact("Trần Thị B",   "0987654321"));
        manager.addContact(new Contact("Lê Văn C",     "0905556667"));

        // Thử thêm liên lạc có SĐT TRÙNG LẶP với Nguyễn Văn A (Màn hình sẽ báo lỗi)
        manager.addContact(new Contact("Phạm Minh D",  "0912345678"));

        // In danh sách lần 1
        manager.display();

        System.out.println("--- THỬ NGHIỆM TÌM KIẾM LIÊN LẠC ---");
        String searchPhone = "0987654321";
        Contact found = manager.search(searchPhone);
        if (found != null) {
            System.out.println("Tìm thấy: " + found);
        } else {
            System.out.println("Không tìm thấy liên lạc có số: " + searchPhone);
        }
        System.out.println();

        System.out.println("--- THỬ NGHIỆM XÓA LIÊN LẠC ---");
        // Xóa liên lạc của Trần Thị B
        manager.remove("0987654321");

        // In danh sách sau khi xóa để kiểm tra kết quả
        manager.display();
    }
}
