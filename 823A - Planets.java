import java.util.*;
class Planets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            
            int arr[] = new int[n]; 
            for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int ct = 1, res = 1;
            
            for (int i = 1; i < n; i++) {
                if(arr[i]==arr[i-1]) {
                    ct++;
                }
                else {
                    if(ct > c) {
                        res+=c;
                    }
                    else {
                        res+=ct;
                    }
                    ct = 1;
                }
            }
            if(ct > 1)  {
                if(ct > c) {
                    res+=c-1;
                }
                else {
                    res+=ct-1;
                }
            }
            System.out.println(res);
        }
        
        sc.close();

    }
}
