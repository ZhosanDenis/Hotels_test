import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] findCommonDivisors(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > maxNumber) {
                maxNumber = value;
            }
        }

        Set<Integer> allDivisors = new HashSet<>();

        for (int element : arr) {
            for (int j = 1; j < maxNumber; j++) {
                if (element % j == 0) {
                    allDivisors.add(j);
                }
            }
        }

        List<Integer> temp = new ArrayList<>();

        boolean isCommonDivisor = false;

        label:
        for (Integer divisor : allDivisors) {
            for (int element : arr) {
                if (element % divisor != 0) {
                    isCommonDivisor = false;
                    continue label;
                } else {
                    isCommonDivisor = true;
                }
            }
            if (isCommonDivisor) {
                temp.add(divisor);
            }
        }

        int[] commonDivisors = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            commonDivisors[i] = temp.get(i);
        }

        return commonDivisors;
    }
}

