class Answer {
    public static void arrayOutOfBoundsException() {
        int[] a = {};
        a = new int[]{4, 5};
        a[2] = 1;
    }
    public static void divisionByZero() {
        int b = 1;
        int c = 0;
        int d = b / c;
    }
    public static void numberFormatException() {
        String d = "a";
        int f = Integer.parseInt(d);
    }

}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
            }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
            }
        try {
            ans.divisionByZero();
            }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
            }
        try {
            ans.numberFormatException();
        }
        catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
            }
    }
}
