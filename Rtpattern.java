import java.util.Scanner;
public class Rtpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=1;
        for(int r=0;r<n;r++){
            for(int c=0;c<=r;c++){
                System.out.print(t);
                t++;
            }
            System.out.println();
        }
        sc.close();
    }
}
