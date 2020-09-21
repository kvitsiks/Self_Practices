package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        /*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
         */
//        ArrayList<String> list = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            list.add(scan.nextLine());
//        }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (String each: list) {
//            if (each.length() > max) {
//                max = each.length();
//            }
//        }
//        for (String each: list) {
//            if (each.length() < min) {
//                min = each.length();
//            }
//        }
//        String maxi = "";
//        String mini = "";
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).length() == max) {
//                maxi = list.get(i);
//            } else if (list.get(i).length() == min) {
//                mini = list.get(i);
//            }
//        }
//        System.out.println(maxi);
//        System.out.println(mini);
//        System.out.println(list.indexOf(maxi) > list.indexOf(mini) ? mini : maxi);

//        /*
//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
//потом тот, который для x%2, потом последний.
//
//Требования:
//•	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел).
//    Первый список будет главным, а остальные - дополнительными.
//•	Считать 20 чисел с клавиатуры и добавить их в главный список.
//•	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
//•	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
//•	Добавить в третий дополнительный список все остальные числа из главного.
//•	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
//•	Программа должна вывести три дополнительных списка, используя метод printList.
//         */
//        //напишите тут ваш код
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        printList(list);
//    }
//
//    public static void printList(ArrayList<Integer> list) {
//        //напишите тут ваш код
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 20; i++) {
//            list.add(scan.nextInt());
//        }
//        ArrayList<Integer> list3 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        ArrayList<Integer> listBoth = new ArrayList<Integer>();
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                list2.add(list.get(i));
//            } else if (list.get(i) % 3 == 0) {
//                list3.add(list.get(i));
//            } else listBoth.add(list.get(i));
//        }
//        System.out.println(list3);
//        System.out.println(list2);
//        System.out.println(listBoth);
//
//    }

//        ArrayList<String> list = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            list.add(scan.nextLine());
//        }
//        list.remove(2);
//        ArrayList<String> list2 = new ArrayList<>();
//        for (int i = list.size() - 1; i >= 0; i--) {
//            list2.add(list.get(i));
//        }
//        for (String each : list2) {
//            System.out.println(each);
//        }

        /*
//1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.
//         */
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("мама", "мыла", "раму"));
//        for (int i = 0; i < 5; i += 2) {
//            list.add(i + 1, "именно");
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


//        /*
//        Требования:
//•	Программа не должна считывать данные с клавиатуры.
//•	Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение:
//    слова содержащие и букву "р" и букву "л" - их нужно оставить.
//•	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом).
//    Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
//•	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
//•	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
//         */
//        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("роза");
//        strings.add("лоза");
//        strings.add("лира");
//        strings = fix(strings);
//
//        for (String string : strings) {
//            System.out.println(string);
//        }
//
//
//    }
//
//    public static ArrayList<String> fix(ArrayList<String> strings) {
//        //напишите тут ваш код
//        strings.removeIf(p -> p.contains("р") && !p.contains("л"));
//        for (int i = 0; i < strings.size(); i++) {
//            if (!strings.get(i).contains("р") & strings.get(i).contains("л")) {
//                strings.add(strings.size() - 1, strings.get(i));
//                i++;
//            }
//        }
//        return strings;
//    }

//        /*
//1. Введи с клавиатуры 10 слов в список строк.
//2. Метод doubleValues должен удваивать слова по принципу:
//"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//3. Выведи результат на экран, каждое значение с новой строки.
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай 10 строк с клавиатуры и добавь их в список.
//•	Метод doubleValues должен удваивать элементы списка по принципу
//    "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
//•	Выведи получившийся список на экран, каждый элемент с новой строки.
//         */
//
//        // Считать строки с консоли и объявить ArrayList list тут
//        ArrayList<String> list = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            list.add(scan.nextLine());
//        }
//
//        ArrayList<String> result = doubleValues(list);
//
//        // Вывести на экран result
//        for (String each : result) {
//            System.out.println(each);
//        }
//    }
//
//    public static ArrayList<String> doubleValues(ArrayList<String> list) {
//        //напишите тут ваш код
//        for (int i = 0; i < list.size(); i += 2) {
//            list.add(i + 1, list.get(i));
//        }
//        return list;
//    }


//    /*
//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента,
//    нарушающего такую упорядоченность.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай 10 строк с клавиатуры и добавь их в список.
//•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
//•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на
//    экран индекс первого элемента, нарушающего такую упорядоченность.
//     */
//        ArrayList<String> list = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            list.add(scan.nextLine());
//        }
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i).length() < list.get(i + 1).length()){
//            } else {
//                System.out.println(list.indexOf(list.get(i)));
//                break;
//            }
//        }

        /*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
Требования:
•	В классе Solution создай статический публичный метод int[] getInts().
•	Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
•	В методе main создай и проициализируй массив с помощью метода getInts(),
    найди и выведи через пробел максимальный и минимальный элемент массива.
•	Используй цикл for.
         */
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            list.add(scan.nextInt());
        }

        int maximum = 0;
        int minimum = 0;

        //напишите тут ваш код
        maximum = Collections.max(list);
        minimum = Collections.min(list);

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
}
