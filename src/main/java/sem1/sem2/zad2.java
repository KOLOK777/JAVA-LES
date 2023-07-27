package sem1.sem2;

import java.util.ArrayList;

// исправить код
public class zad2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[] {1, 2, 3, 5, 6, 7, 9, 8, 2, 3, 80};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        catch (Exception e) {
            System.out.println("Вот такая ошибка: " + e);
        }

    }
}