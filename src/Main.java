public class Main {
    public static void main(String[] args) {

    }

    public static String computerNumber(int number) {
        int ones = number % 10;
        int tens = number % 100;

        String result = number + " компьютер";
        String ending;

        switch (ones) {
            case 1 -> {
                if (tens == 11) {
                    ending = "ов";
                } else {
                    ending = "";
                }
            }
            case 2, 3, 4 -> {
                if (tens == 12 || tens == 13 || tens == 14) {
                    ending = "ов";
                } else {
                    ending = "а";
                }
            }
            default -> ending = "ов";
        }

        return result + ending;
    }
}

