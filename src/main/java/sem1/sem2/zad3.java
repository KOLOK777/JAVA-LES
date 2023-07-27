package sem1.sem2;

// исправить код
public class zad3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            String c = null;
            System.out.println(c.toString());
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = new int[] {1,2,3};
            abc[3] = 9;
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...: " + e);
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
