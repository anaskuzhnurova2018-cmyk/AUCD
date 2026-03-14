public class task9_8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5};
        int current_reachable_sum = 0;
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > current_reachable_sum + 1) {
                System.out.println(current_reachable_sum + 1);
                flag = true;
                break;
            } else {
                current_reachable_sum += a[i];
            }
        }

        if (!flag) {
            System.out.println(current_reachable_sum + 1);
        }
    }
}

/*
8. Дан неубывающий массив положительных целых чисел a[1]a[2] . . . a[n].
Найти наименьшее целое положительное число, не представимое в виде суммы нескольких элементов этого массива
(каждый элемент массива может быть использован не более одного раза).
Число действий порядка O(n).
**/