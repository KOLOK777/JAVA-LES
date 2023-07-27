package sem1.sem2;
import java.util.Scanner;
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
//пользователя ввод данных.
public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нецелое число: ");
        while(true){
            try{
                float number = Float.parseFloat(scanner.nextLine());
                System.out.println("Ваше число успешно записано: " + number);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Введите правильное значение, нецелое число: ");
            }
        }


    }
}
