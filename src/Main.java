public class Main {
    public static void main(String[] args) {
        printMultiplicationTable(5);
    }

    public static void printMultiplicationTable(int number) {
        int[][] table = new int[number][number];

        System.out.print("   ");

        for (int i = 0; i < table[0].length; i++) {
            System.out.print((i + 1) + " ");
        }

        System.out.println();

        for (int i = 0; i < table.length; i++) {
            System.out.print((i + 1) + "| ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print((j + 1) * (i + 1) + " ");
            }
            System.out.println();
        }
    }
}

