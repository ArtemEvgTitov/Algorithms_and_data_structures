package Lesson_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Для описания сложности существует общепринятая нотация - О(f(n)), где n -
 * размер входных данных.
 * ------------------------------------
 * Правила объединения сложности
 * Вызов нескольких методов на каждом шаге: O(2n) == O(n)
 * Обход половины размерности массива:
 * O(n/2) == O(n)
 * Цифровые множители сокращаются.
 * Вызов нескольких методов вне цикла:
 * O(2+n) == O(n). Цифровые слагаемые сокращаются 
 * ------------------------------------
 * method1() - имеет сложность O(n^3)
 * method2() - имеет сложность O(n^2)
 * Если внутри method1() будет вызываться method2(),
 * то их сложности перемножаются:
 * O(n^3) * O(n^2) == O(n^5)
 * Если методы будут вызываться последовательно, то
 * их сложности складываются, т.е. берется
 * максимальная из них:
 * O(n^3) + O(n^2) == O(n^3)
 */
public class Lesson_1 {
    /**
     * Какая бывает сложность алгоритмов
     * ● O(1) - константная. Не зависит от объема данных.
     * Например - поиск по хэш-таблице
     * ● O(log n) - логарифмическая. Увеличение размера
     * почти не сказывается на количестве итераций.
     * Например - бинарный поиск, поиск по
     * сбалансированному дереву
     * ● O(n) - линейная. Увеличение сложности эквивалентно
     * увеличению размера. Например - поиск по
     * неотсортированному массиву
     * ● O(n * log n) - увеличение размера заметно
     * сказывается на сложности. Например - быстрая
     * сортировка
     * ● O(n^2) - квадратичная. Увеличение размера очень
     * сильно сказывается на сложности. Например -
     * пузырьковая сортировка
     * ● O(2^n) - экспоненциальная. С увеличением размера
     * на 1, сложность возрастает вдвое
     */

    public static void main(String[] args) {
        // List<Integer> avaibleDivider = findSimpleNumbers(100);
        // for (Integer integer : avaibleDivider) {
        // System.out.println(integer);
        // }
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(1, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());
    }

    /**
     * Алгоритм перебора массива циклом for
     * имеет сложность O(n). С ростом n на x, количество
     * шагов алгоритма тоже вырастает на x
     * ------------------------------------
     * Линейная зависимость
     */
    public static List<Integer> findAvaibleDivinder(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Использование вложенного цикл for уже будет
     * имеет сложность O(n^2), например, при n = 3 цикл
     * сделает 9 итераций, а при n = 4 уже 16 и т.д.
     * ------------------------------------
     * Квадратичная зависимость
     */
    public static List<Integer> findSimpleNumbers(int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * 2^(n-1)
     * ------------------------------------
     * Экспоненциальная зависимость
     */
    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fib(position - 1, counter) + fib(position - 2, counter);
    }

}