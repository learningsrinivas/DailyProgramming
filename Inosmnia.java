
import java.util.HashMap;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int T = 0; T < testCases; T++) {
            int N = scanner.nextInt();
            if(N==0)
            {
                System.out.println("Insomnia");
                continue;
            }
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int number = N;
            int multiply = 1;
            while(hashMap.size() < 10) {
                int n = number = multiply * N;
                while (n > 0) {
                    int digit = n % 10;
                    n = n / 10;
                    if (!hashMap.containsKey(digit)) {
                        hashMap.put(digit, 1);
                    }
                }
                multiply = multiply+1;
            }
            System.out.println("given number is :   "+N);
            System.out.println("Answer  :   "+number);
            System.out.println("HashMap size    : "+hashMap.size());
        }
    }
}
//except zero all numbers will contain the numbers
//so keep on incrementing the number until hashmap size is 10.



