////Разработать программу, имитирующую поведение коллекции HashSet. В программе содать:
//// 1) метод add добавляющий элемент,
//// 2) метод toString возвращающий строку с элементами множества
////*3)и метод позволяющий читать элементы по индексу.
////*Реализовать все методы из семинара. Формат данных Integer.
//import java.util.*;
//public class dz6 {
//    public static void main(String[] args) {
//        Set set1 = new Set();
//        System.out.println(set1.add(555));
//        System.out.println(set1.add(123));
////        set1.add(555);
////        set1.add(123);
//        HashSet set2 = new HashSet();
//        System.out.println(set1.makeString());
////        Iterator<Integer> it = set1.iterator();
////        while (it.hasNext()) {
////            System.out.println(it.hasNext());
//        }
//    }
//
//    class Set<E>{
//        private HashMap<E, Object> set=new HashMap<>();
//
//        private static final Object VALL=new Object();
//
//        public boolean add(E tel){
//            return set.put(tel, VALL)==null;
//            }
//
//        public boolean makeString(String name,String tel){
//            return set.put((E) tel, VALL)==null;
//            }
//        }
////        public bolean readElementByIndex(String name,String phone){
////            return set.get();
////            }
////        }
////        // keysettoArray ?????
////    }
////        public bolean remove(E, phone){
////            return set.remove(phone) == VALL;
////        }
////        public int size(){
////            return set.size();
////        }
////        public boolean isEmpty(){
////            return set.isEmpty();
////        }
////
////
////        static ArrayList<Integer> sortdata_age_and_gender() {
////            ArrayList<Integer> sorted_keys = new ArrayList<>();
////            sorted_keys.addALL(sortdata_age());
////            int tmp;
////            int k = 0;
////            ArrayList<Integer> sorted_keys1 = new ArrayList<>();
////            sorted_keys1.addALL(sortes_keys);
////            for (i = 0; i < keys.sizde() - 1; i++) {
////                if (gender.get(sorted_keys.get(i)).toLowerCase().equals("ж")) {
////                    tmp = sorted_keys1.get(k);
////                    sorted_keys1.remove(k);
////                    sorted_keys1.add(tmp);
////                } else k += 1;
////
////            }
////        }
////
////
////
////
//////        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
//////        System.out.println(a); // [1, 2, 3, 4, 5, 6]
