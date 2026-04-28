import java.util.Arrays;

public class Exercise5 {

    public static void question1(Department[] departments) {
        System.out.println(departments[0].toString());
    }

    public static void question2(Department[] departments) {
        for (Department d : departments) {
            System.out.println(d.toString());
        }
    }

    public static void question3(Department[] departments) {
        System.out.println(departments[0].departmentName);
    }

    public static void question4(Department[] departments) {
        boolean result = departments[0].departmentName.equals("Phong A");
        System.out.println("Phong ban thu 1 co ten la 'Phong A': " + result);
    }

    public static void question5(Department[] departments) {
        boolean result = departments[0].equals(departments[1]);
        System.out.println("Phong ban 1 va 2 bang nhau: " + result);
    }

    public static void question6() {
        Department[] departments = {
            new Department(1, "Sale"),
            new Department(2, "Marketing"),
            new Department(3, "Accounting"),
            new Department(4, "Boss of director"),
            new Department(5, "Waiting room")
        };
        Arrays.sort(departments);
        for (Department d : departments) {
            System.out.println(d.departmentName);
        }
    }

    public static void question7() {
        Department[] departments = {
            new Department(1, "Sale"),
            new Department(2, "Marketing"),
            new Department(3, "Accounting"),
            new Department(4, "Boss of director"),
            new Department(5, "waiting room")
        };

        // Sort departments theo lastWords (chữ cái đầu đã thành thường)
        Arrays.sort(departments, (a, b) -> {
            String lastA = a.departmentName.trim().split("\\s+")[a.departmentName.trim().split("\\s+").length - 1];
            String lastB = b.departmentName.trim().split("\\s+")[b.departmentName.trim().split("\\s+").length - 1];
            lastA = Character.toLowerCase(lastA.charAt(0)) + lastA.substring(1);
            lastB = Character.toLowerCase(lastB.charAt(0)) + lastB.substring(1);
            return lastA.compareTo(lastB);
        });

        // In ra tên gốc theo thứ tự đã sort
        System.out.println("Sau khi sort theo tu cuoi:");
        for (Department d : departments) {
            System.out.println(d.departmentName);
        }
    }
}