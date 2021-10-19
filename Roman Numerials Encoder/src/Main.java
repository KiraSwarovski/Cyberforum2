import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {
    static final int MAX_REPEAT = 3;
    static final int[] DISCHARGES = {1, 10, 100, 1000};
    static Queue<Integer> numbers = new ArrayDeque<>();
    static StringBuilder sb;
    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(solution(9));
    }

    public static String solution(int n) {
        sb = new StringBuilder();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        numGen(n, map);
        while (!numbers.isEmpty()) {
            romeNumCreator(numbers.poll());
        }


        return sb.toString();
    }


    static Queue<Integer> numGen(int n, Map<Integer, String> map) {

        //int[] discharges = {1, 10, 100, 1000};
        String s = String.valueOf(n);
        int length = s.length();

        do {
            if (map.containsKey(n)) {
                numbers.add(n);
                break;
            }
            int temp = n / DISCHARGES[length - 1];
            if (temp == 0) {
                length--;
                continue;
            }
            n %= DISCHARGES[length - 1];

            int num = temp * DISCHARGES[length - 1];
            numbers.add(num);

            length--;


        } while (length > 0);

        return numbers;
    }

    static void romeNumCreator(int num) {

        int n = num;
        if (map.containsKey(n)) {
            sb.append(map.get(n));
            return;
        }
        int length = String.valueOf(n).length();
        int count = n / DISCHARGES[length - 1];
        if (count <= MAX_REPEAT) {
            while (count > 0) {
                sb.append(map.get(DISCHARGES[length - 1]));
                count--;
            }
        } else if (map.containsKey(n + DISCHARGES[length - 1])) {
            sb.append(map.get(DISCHARGES[length - 1])).append(map.get(n + DISCHARGES[length - 1]));


        } else {
            int sum = 0;
            int res = n;
            do {
                res -= DISCHARGES[length - 1];
                sum += DISCHARGES[length - 1];

            } while (!map.containsKey(res));
            sb.append(map.get(res));
            romeNumCreator(sum);
        }
    }
}