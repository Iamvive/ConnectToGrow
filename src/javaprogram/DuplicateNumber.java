package javaprogram;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] num = {1, 1, 2, 2, 6, 6, 3, 4, 5, 5};
        boolean isMatched = false;

        for (int i = 0; i < num.length; i++) {
            if (isMatched) {
                break;
            }

            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    isMatched = true;
                    System.out.println("The duplicate number is: " + num[i] + " on index: " + i);
                }
            }
        }
    }
}
