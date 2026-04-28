import java.util.List;
import java.util.Scanner;

public class Exercise4 {

    public static void question1(Scanner scanner) {
        System.out.print("Nhap xau ki tu: ");
        String input = scanner.nextLine();

        // trim() bo khoang trang 2 dau, split theo 1 hoac nhieu khoang trang
        String[] words = input.trim().split("\\s+");
        int count = input.trim().isEmpty() ? 0 : words.length;
        System.out.println("So luong tu: " + count);
    }

    public static void question2(Scanner scanner) {
        System.out.print("Nhap xau s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhap xau s2: ");
        String s2 = scanner.nextLine();
        String result = s1.concat(s2);
        // s1 = s1 + s2; // Cach 1: noi chuoi bang toan tu +
        // s3 = s1 + s2; // Cach 2: noi chuoi bang toan tu +
        // Cach 3: StringBuilder
        // StringBuffer s3 = new StringBuilder(s1);
        // s3.append(s1).append(s2);
        // String result = s3.toString(); //vì StringBuilder không phải là String, cần chuyển đổi sang String
        //StringBuffer trả về 
        System.out.println("Ket qua noi chuoi: " + result);
    }

    public static void question3(Scanner scanner) {
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        // Viet hoa chu cai dau moi tu
        String[] words = name.trim().split("\\s+"); //\\s+ là regex khớp 1 hoặc nhiều khoảng trắng (space, tab...)
        StringBuilder result = new StringBuilder(); // dùng StringBuilder để tối ưu hiệu suất khi nối chuỗi trong vòng lặp
        // dùng StringBuilder cho đơn luồng, StringBuffer cho đa luồng
        for (String word : words) {
            if (!word.isEmpty()) { // kiểm tra nếu từ không rỗng (tránh trường hợp có nhiều khoảng trắng liên tiếp)
                result.append(Character.toUpperCase(word.charAt(0))) // charater.toUpperCase dùng để viết hoa ký tự đầu tiên của từ
                      .append(word.substring(1).toLowerCase()) //word.substring(1) lấy phần còn lại của từ sau ký tự đầu tiên, toLowerCase() để đảm bảo các ký tự sau được viết thường
                      .append(" ");
            }
            // substring(begin, end) lấy từ index begin đến end - 1, substring(begin) lấy từ index begin đến hết chuỗi
        }

        System.out.println("Ten sau khi chuan hoa: " + result.toString().trim());
    }

    public static void question4(Scanner scanner) {
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ky tu thu " + (i + 1) + " la: " + name.charAt(i));
        }
    }

    public static void question5(Scanner scanner) {
        System.out.print("Nhap ho: ");
        String lastName = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String firstName = scanner.nextLine();
        System.out.println("Ho va ten day du: " + lastName + " " + firstName);
    }

    public static void question6(Scanner scanner) {
        System.out.print("Nhap ho va ten day du: ");
        String fullName = scanner.nextLine().trim();
        String[] parts = fullName.split("\\s+");
        if (parts.length < 3) {
            System.out.println("Vui long nhap du ho, ten dem va ten.");
            return;
        }
        System.out.println("Ho la: " + parts[0]);
        StringBuilder middleName = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            middleName.append(parts[i]).append(" ");
        }
System.out.println("Ten dem la: " + middleName.toString().trim());
        System.out.println("Ten la: " + parts[parts.length - 1]);
    }

    public static void question7(Scanner scanner) {
        System.out.print("Nhap ho va ten: ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }
        System.out.println("Sau khi chuan hoa: " + result.toString().trim());
    }

    public static void question8(List<Group> groups) {
        System.out.println("Cac group chua chu 'Java':");
        for (Group group : groups) {
            if (group.groupName.contains("Java")) {
                System.out.println(group.groupName);
            }
        }
    }

    public static void question9(List<Group> groups) {
        System.out.println("Cac group tên là 'Java':");
        for (Group group : groups) {
            if (group.groupName.equals("Java")) {
                System.out.println(group.groupName);
            }
        }
    }
    public static void question10(Scanner scanner) {
        System.out.print("Nhap chuoi 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhap chuoi 2: ");
        String s2 = scanner.nextLine();

        // nhớ check hai chuỗi xem có bằng nhau không trước rồi mới đảo ngược để so sánh
        // cách 1: tự viết hàm đảo ngược chuỗi
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            System.out.println("Ko phải là chuỗi đảo ngược nhau (do độ dài khác nhau)");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                System.out.println("Ko phải là chuỗi đảo ngược nhau");
                return;
            }
        }
        System.out.println("Hai chuỗi là đảo ngược của nhau");
        // cách 2: dùng StringBuilder có sẵn để đảo ngược chuỗi
         // String reversed = new StringBuilder(s1).reverse().toString();
        // System.out.println(reversed.equals(s2) ? "OK" : "KO");
    }

    public static void question11(Scanner scanner) {
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        int count = 0;
        for (char c : input.toCharArray()) { 
            //toCharArray dùng để chuyển đổi chuỗi thành một mảng các ký tự, 
            // sau đó có thể duyệt qua từng ký tự trong chuỗi bằng vòng lặp for-each
            if (c == 'a') count++;
        }
        System.out.println("So lan xuat hien ky tu 'a': " + count);
    }

    public static void question12(Scanner scanner) {
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println("Chuoi dao nguoc: " + reversed);

        // Cach 2: dung StringBuilder da co san
        // String reversed = new StringBuilder(input).reverse().toString(); 
        // System.out.println("Chuoi dao nguoc: " + reversed);
    }

    public static void question13(Scanner scanner) {
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        if (input == null || input.isEmpty()) {
            System.out.println("false");
            return;
        }
        boolean hasDigit = false;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        System.out.println(hasDigit ? "false" : "true");
    }

    public static void question14(Scanner scanner) {
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        System.out.print("Nhap ky tu can thay: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.print("Nhap ky tu moi: ");
        char newChar = scanner.nextLine().charAt(0);
        System.out.println("Ket qua: " + input.replace(oldChar, newChar));
    }

    public static void question15(Scanner scanner) {
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine().trim();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                result.append(words[i]);
                if (i > 0) result.append(" ");
            }
        }
        System.out.println("Ket qua: " + result.toString().trim());
    }

    public static void question16(Scanner scanner) {
        System.out.print("Nhap chuoi: ");
        String str = scanner.nextLine();
        System.out.print("Nhap so n: ");
        int n = Integer.parseInt(scanner.nextLine().trim());
        if (n <= 0 || str.length() % n != 0) {
            System.out.println("KO");
            return;
        }
        for (int i = 0; i < str.length(); i += n) {
            System.out.println(str.substring(i, i + n));
        }
    }
}
