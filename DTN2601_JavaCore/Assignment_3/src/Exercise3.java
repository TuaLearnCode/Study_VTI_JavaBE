public class Exercise3 {

    public static void question1() {
        Integer salary = 7000;
        float salaryFloat = salary.floatValue();

        System.out.printf("Luong (float, 2 so thap phan): %.2f%n", salaryFloat);
    }

    public static void question2() {
        String str = "12345679";
        int number = Integer.parseInt(str);
        System.out.println("String \"" + str + "\" -> int: " + number);
    }

    public static void question3() {
        Integer number = Integer.valueOf("12345679");
        int primitive = number;

        System.out.println("Integer.valueOf(\"12345679\") -> int: " + primitive);
    }
}
