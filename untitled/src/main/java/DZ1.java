//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.*;
public class DZ1 {
    public static void main(String[] args) {
        // 1.
        Random random = new Random();
        int i = new Random().nextInt(0, 2001);
        System.out.println("Случайное число ('i'): \n" + i);
        // 2.
        int n = 0;
        int m = 2;
        for (int j = 1; m <= i; j++){
            m = m * 2;
            n = j;
        }
        System.out.println("Старший бит: " + n);
        // 3.
        System.out.println("'n' равно " + n);
        ArrayList<Integer> m1 = new ArrayList<>();
        for (int j = i; j <= Short.MAX_VALUE; j++){
            if (j % n == 0) m1.add(j);
        }
        System.out.println("Массив 'm1' чисел, кратных 'n': " + m1);

        // 4.
        System.out.println("'n' равно " + n);
        ArrayList<Integer> m2 = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j <= i; j++){
            if (j % n != 0) m2.add(j);
        }
        System.out.println("Массив 'm2' чисел, некратных 'n': " + m2);
    }
}
