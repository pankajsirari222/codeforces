import java.util.*;
class general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int maxi=0,mini=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]>max) {
                    max = arr[i];
                    maxi = i;
                } 
                if(arr[i]<=min)  {
                    min = arr[i];
                    mini=i;
                }
            }
            if(arr[0]==max) maxi=0;
            
            if(maxi>mini) {
                mini++;
            }

            System.out.println(maxi + (n-1) - mini);
             
        sc.close();

    }
}
