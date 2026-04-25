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
        System.out.println("Ket qua noi chuoi: " + result);
    }

    public static void question3(Scanner scanner) {
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        // Viet hoa chu cai dau moi tu
        String[] words = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
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
        System.out.println("Ten dem la: " + parts[parts.length - 2]);
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

    public static void question8(Scanner scanner) {
        System.out.print("Nhap danh sach group (cach nhau bang dau phay): ");
        String input = scanner.nextLine();
        String[] groups = input.split(",");
        System.out.println("Cac group chua chu 'Java':");
        for (String group : groups) {
            if (group.trim().contains("Java")) {
                System.out.println(group.trim());
            }
        }
    }

    public static void question9(Scanner scanner) {
        System.out.print("Nhap danh sach group (cach nhau bang dau phay): ");
        String input = scanner.nextLine();
        String[] groups = input.split(",");
        System.out.println("Cac group ten la 'Java':");
        for (String group : groups) {
            if (group.trim().equals("Java")) {
                System.out.println(group.trim());
            }
        }
    }

    public static void question10(Scanner scanner) {
        System.out.print("Nhap chuoi 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhap chuoi 2: ");
        String s2 = scanner.nextLine();
        String reversed = new StringBuilder(s1).reverse().toString();
        System.out.println(reversed.equals(s2) ? "OK" : "KO");
    }

    public static void question11(Scanner scanner) {
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        int count = 0;
        for (char c : input.toCharArray()) {
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
