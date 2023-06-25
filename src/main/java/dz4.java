//1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//2. вывод в формате Фамилия И.О. возраст пол
//3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
//4. реализовать сортировку по возрасту с использованием индексов
//5. реализовать сортировку по возрасту и полу с использованием индексов
import java.util.*;
public class dz4 {
    public static void main(String[] args) {

        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> givenname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cколько людей вы введете: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.print("Введите Вашу фамилию: ");
            surname.add(scanner.nextLine());
            System.out.print("Введите Ваше имя: ");
            name.add(scanner.nextLine());
            System.out.print("Введите Ваше отчество: ");
            givenname.add(scanner.nextLine());
            System.out.print("Введите Ваш возраст: ");
            age.add(Integer.parseInt(scanner.nextLine()));
            System.out.print("Введите Ваш пол: ");
            gender.add(scanner.nextLine());
        }
        ArrayList<String> String;
        name = {"Петр", "Василиса", "Петр", "Рммма", "Лев"};
//        surname.add("Иванов", "Петрова", "Васечкин", "Фролова", "Кротов");
//        name.add("Петр", "Василиса", "Петр", "Рммма", "Лев");
//        givenname.add("Иванович", "Петровна", "Васильевич", "Евгеньевна", "Иванович");
//        age.add(25, 55, 48, 33, 41);
//        gender.add("м", "ж", "м", "ж", "м");

        System.out.println(surname);
        System.out.println(name);
        System.out.println(givenname);
        System.out.println(age);
        System.out.println(gender);
    }
}
