//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с
//разными телефонами, их необходимо считать, как одного человека с разными телефонами.
//Вывод должен быть отсортирован по убыванию числа телефонов.
import java.util.*;
public class dz5 {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        addPhone(phoneBook, "Ваня", "+7-916-123-4567");
        addPhone(phoneBook, "Ваня", "+7-903-353-6554");
        addPhone(phoneBook, "Игорь", "+7-963-101-1232");
        addPhone(phoneBook, "Софья", "+7-916-123-4567");
        addPhone(phoneBook, "Ваня", "+7-911-505-8798");
        addPhone(phoneBook, "Игорь", "+7-912-202-5423");
        ArrayList<String> sortedPhoneBook = new ArrayList<>();

        for (String s: phoneBook.keySet()){
            sortedPhoneBook.add(s);
        }

        Collections.sort(sortedPhoneBook, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return phoneBook.get(o2).size() - phoneBook.get(o1).size();
            }
        });
        int i;
        for (i = 0; i < phoneBook.size(); i++) {
            System.out.println(sortedPhoneBook.get(i) + phoneBook.get(sortedPhoneBook.get(i)));
        }
        }



    private static void addPhone(HashMap<String, ArrayList<String>> phoneBook, String name, String phone){
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phone);
    }

//        for (var item : names.entrySet()) {
//            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//        }
//        System.out.println(phones);

    }


