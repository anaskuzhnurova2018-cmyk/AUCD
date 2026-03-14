import java.util.Arrays;
import java.util.Comparator;

public class Task9_9 {
    public static void main(String[] args) {
        Integer[] a = {301, 234, 342, 511, 989};

        //если сортировать по младшему разряду: 301 511 342 234 989

        int c[] = new int[10];
        for (int i = 0; i < a.length; i++) c[a[i] % 10] += 1;

        int d[] = new int[10];
        d[0] = 0;
        for (int i = 1; i < 10; ++i) d[i] = d[i - 1] + c[i - 1];

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[d[a[i] % 10]] = a[i];
            d[a[i] % 10] += 1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }

        /*String[] m = new String[a.length];
        // O(n * log (max(a)))
        for (int i = 0; i < a.length; i++) {
            m[i] = String.valueOf(a[i]);
        }

        int r = 0;

        Arrays.sort(m, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (r > o1.length() - 1 && r > o2.length() - 1) return 0;
                if (r > o1.length() && r == o2.length())
                return o2.charAt(r) - o1.charAt(r);
            }
        });

        for (int i : a) {
            System.out.print(i);
        }

        System.out.println();


        System.out.println(r);*/
    }
}
