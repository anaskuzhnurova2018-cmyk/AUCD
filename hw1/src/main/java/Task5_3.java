import java.util.Arrays;
import java.util.Stack;

public class Task5_3 {
    public static void main(String[] args) {
        int[] array = {2, 10, 1, 24, 100, 35, -2, 33, 5};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(findSmallNeighbour(array)));
    }

    public static int[] findSmallNeighbour(int [] array) {
        int size = array.length;
        int[] result = new int[size];
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && array[i] <= array[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek() + 1;
            }

            stack.push(i);
        }
        return result;
    }
}

/*
3. Для заданного числового массива а для каждого элемента a[i] найти индекс ближайшего меньшего элемента.
Если такого элемента нет - вернуть 0. (Сложность O(n))
* */