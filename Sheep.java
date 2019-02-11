import java.util.*;
class Sheep
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int test = scanner.nextInt();
        while(test-->0) {
            HashSet<Integer> numbers = new HashSet<>();
            int initialValue = scanner.nextInt();
            if(initialValue == 0) {
                System.out.println("Insomnia");
                continue;
            }
            boolean flag = true;
            int i = 1;
            while(flag) {
                int x = initialValue * i;
                while(x>0) {
                    numbers.add(x%10);
                    x/=10;
                }
                if(numbers.size() == 10) {
                    System.out.println(initialValue*i);
                    flag = false;
                }
                i++;
            }
        }
        scanner.close();
    }
}
