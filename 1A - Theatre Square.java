import java.util.*;
class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            long n = sc.nextInt();
            long m = sc.nextInt();
            long a = sc.nextInt();
            long x = 0, y = 0;

            x = n/a;
            y = m/a;

            if(n%a !=0) x++;
            if(m%a !=0) y++;
            System.out.println(x*y);

            // System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));       //One line solution
           
        sc.close();

    }
}
