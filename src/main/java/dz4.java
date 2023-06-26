//1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол
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
            System.out.print("Введите фамилию: ");
            surname.add(scanner.nextLine());
            System.out.print("Введите имя: ");
            name.add(scanner.nextLine());
            System.out.print("Введите отчество: ");
            givenname.add(scanner.nextLine());
            System.out.print("Введите возраст: ");
            age.add(Integer.parseInt(scanner.nextLine()));
            System.out.print("Введите пол: ");
            gender.add(scanner.nextLine());
        }

        name.add("Петр");
        name.add("Василиса");
        name.add("Петр");
        name.add("Рммма");
        name.add("Лев");
        surname.add("Иванов");
        surname.add("Петрова");
        surname.add("Васечкин");
        surname.add("Фролова");
        surname.add("Кротов");
        givenname.add("Иванович");
        givenname.add("Петровна");
        givenname.add("Васильевич");
        givenname.add("Евгеньевна");
        givenname.add("Иванович");
        age.add(33);
        age.add(55);
        age.add(48);
        age.add(33);
        age.add(41);
        gender.add("м");
        gender.add("ж");
        gender.add("м");
        gender.add("ж");
        gender.add("м");

        System.out.println(surname);
        System.out.println(name);
        System.out.println(givenname);
        System.out.println(age);
        System.out.println(gender);
//2. вывод в формате Фамилия И.О. возраст пол
        for (int i = 0; i < surname.size(); i++) {
            System.out.print((i + 1) + ". ФИО: '" + surname.get(i) + " " + name.get(i).charAt(0) + "." + givenname.get(i).charAt(0) + ".'");
            System.out.println(", возраст: '" + age.get(i) + "', пол: '" + gender.get(i) + "'.");
        }
//3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
        System.out.print("Хотите выйти? (y/n): ");
        String exit = scanner.nextLine();
        if (exit.equals("y")) System.exit(0);
//4. реализовать сортировку по возрасту с использованием индексов
        ArrayList<Integer> idSortAge = new ArrayList<>();
        for (int i = 0; i < age.size(); i++) {
            idSortAge.add(i);
        }
        Collections.sort(idSortAge, (o1, o2) -> age.get(o1) - age.get(o2));

        System.out.println(idSortAge);
        for (int i = 0; i < surname.size(); i++) {
            System.out.print((i + 1) + ". ФИО: '" + surname.get(idSortAge.get(i)) + " " + name.get(idSortAge.get(i)).charAt(0) + "." + givenname.get(idSortAge.get(i)).charAt(0) + ".'");
            System.out.println(", возраст: '" + age.get(idSortAge.get(i)) + "', пол: '" + gender.get(idSortAge.get(i)) + "'.");
        }
//5. реализовать сортировку по возрасту и полу с использованием индексов
        ArrayList<Integer> idSortM = new ArrayList<>();
        ArrayList<Integer> idSortF = new ArrayList<>();
        for (int i = 0; i < idSortAge.size(); i++) {
            if (gender.get(i).equals("м")) idSortM.add(idSortAge.get(i));
            else idSortF.add(idSortAge.get(i));
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(idSortM);
        list.addAll(idSortF);

        System.out.println(idSortF);
        System.out.println(idSortM);
        System.out.println(list);
//            for (int i = 0; i < surname.size(); i++) {
//                System.out.print((i + 1) + ". ФИО: '" + surname.get(idSortAge.get(i)) + " " + name.get(idSortAge.get(i)).charAt(0) + "." + givenname.get(idSortAge.get(i)).charAt(0) + ".'");
//                System.out.println(", возраст: '" + age.get(idSortAge.get(i)) + "', пол: '" + gender.get(idSortAge.get(i)) + "'.");

        }
    }
