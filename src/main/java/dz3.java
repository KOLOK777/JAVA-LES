//Пусть дан произвольный список из 100 целых чисел.
import java.util.*;
public class dz3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка (>= 100): ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++){
            numbers.add(new Random().nextInt(150));
        }
        System.out.println("0. Получился массив целых чисел (" + size + " элементов списка): " + numbers);

//        1) Нужно удалить из него чётные числа
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) numbers2.add(numbers.get(i));
        }
        System.out.print("1. Получился массив нечетных чисел: " + numbers2);
//        2) Найти минимальное значение
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) min = numbers.get(i);
        }
        System.out.print("\n");
        System.out.println("2. Минимаьный элемент: '" + min + "'.");
//        3) Найти максимальное значение
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) max = numbers.get(i);
        }
        System.out.println("3. Максимаьный элемент: '" + max + "'.");
//        4) Найти среднее значение
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double doublesum = sum;
        double average = doublesum / numbers.size();
        System.out.println("4. Среднее значение: '" + average + "'.");
//        5) Отсортировать значение по возрастанию
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("4. Отсортированный массив: " + numbers);
    }
}