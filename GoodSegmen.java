import java.util.Arrays;
import java.util.Scanner;

public class GoodSegmen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] badNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            badNumbers[i] = scanner.nextInt();
        }
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        Arrays.sort(badNumbers);
        int max = 0;

        if (lowerLimit < badNumbers[0])
            max = (badNumbers[0])  - lowerLimit;



        int diff = 0;

        int i;
        for ( i = 1; i < badNumbers.length; i++) {
            if (badNumbers[i] < upperLimit) {
                 diff = badNumbers[i] - badNumbers[i - 1];
                 diff--;
            }else {
                diff = upperLimit -badNumbers[i - 1];
                break;
            }
           max = Math.max(diff,max);
        }

        if (upperLimit > badNumbers[badNumbers.length-1]) {
             diff = upperLimit - badNumbers[badNumbers.length-1];
                max = Math.max(diff,max);
        }


        System.out.println(max);
    }


}
