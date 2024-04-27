import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] findArrayOfSimpleNumbers(int minNumber, int maxNumber) {
        int min = Math.min(minNumber, maxNumber);
        int max = Math.max(minNumber, maxNumber);

        List<Integer> temp = new ArrayList<>();
        if (min <= 2 && max >= 2) {
            temp.add(2);
        }

        if (min <= 3 && max >= 3) {
            temp.add(3);
        }

        boolean numberIsSimple = false;

        label:
        for (int i = min; i <= max; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    numberIsSimple = false;
                    continue label;
                } else {
                    numberIsSimple = true;
                }
            }
            if (numberIsSimple) {
                temp.add(i);
            }
        }

        int[] simpleNumbers = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            simpleNumbers[i] = temp.get(i);
        }

        return simpleNumbers;
    }
}

