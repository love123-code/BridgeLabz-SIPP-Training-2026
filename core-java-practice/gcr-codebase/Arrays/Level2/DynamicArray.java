import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int[] digits = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            digits[i] = num.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(digits));
    }
}