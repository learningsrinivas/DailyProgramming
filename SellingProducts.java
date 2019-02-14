import java.util.*;

public class SellingProducts {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else
                hashMap.put(arr[i],1);
        }
       int m = scanner.nextInt();
       List<Integer> values = new ArrayList<>(hashMap.values());
       Collections.sort(values);

       for(int i=0;i<values.size();i++){
           if(m > values.get(i)){
               m = m - values.get(i);
               values.set(i,0);
           }else{
               values.set(i,values.get(i)-m);
               m = 0;
           }
       }
        int count = (int) values.stream().filter(t -> t > 0).count();
        System.out.println(count);
    }
}
