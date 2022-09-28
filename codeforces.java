import java.util.*;
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            
            if(a%b==0)  System.out.println(0);
            else {
                long res = b - a%b;
                System.out.println(res);
            }
        }
           
        sc.close();

    }
}
