public class Exercise1 {

    public static void question1(Account account) {
        int roundedSalary = Math.round(account.salary);

        System.out.println("Luong Account (float): " + account.salary);
        System.out.println("Luong Account (lam tron): " + roundedSalary);
    }

    public static int question2() {
        int randomNumber = (int) (Math.random() * 100000); // 0 -> 99999
        String result = String.format("%05d", randomNumber);
        System.out.println("So ngau nhien 5 chu so: " + result);
        return randomNumber;
    }

    public static double question4(int a, int b) {
        if (b == 0) {
            System.out.println("Khong the chia cho 0!");
            return 0;
        }
        double result = (double) a / b;
        System.out.println("Thuong cua " + a + " / " + b + " = " + result);
        return result;
    }

    public static void question3(int number) {
        // Cach 1: convert sang String, lay 2 ky tu cuoi
        String str = String.format("%05d", number);
        String lastTwoStr = str.substring(str.length() - 2);
        System.out.println("2 so cuoi (Cach 1 - String): " + lastTwoStr);

        // Cach 2: chia lay du cho 100
        int lastTwoInt = number % 100;
        System.out.println("2 so cuoi (Cach 2 - %100):   " + lastTwoInt);
    }
}