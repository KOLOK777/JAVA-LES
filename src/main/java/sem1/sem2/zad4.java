package sem1.sem2;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class zad4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();
            int length = str.length();
            if (str.equals("")) {
                throw new RuntimeException("Пустые строки вводить нельзя. ");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
