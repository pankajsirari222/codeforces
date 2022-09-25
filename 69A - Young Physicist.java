import java.util.*;
class YoungPhysicist {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }  
        }

        int x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            x += arr[i][0];
            y += arr[i][1];
            z += arr[i][2];
        }

        if(x == 0 && y==0 && z==0)    {
            System.out.println("YES");
        }
        else System.out.println("NO");

            sc.close();
    }

}