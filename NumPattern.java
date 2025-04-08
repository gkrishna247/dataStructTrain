import java.util.Scanner;
public class NumPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int r=1;r<=n;r++){
            int t=r;
            for(int c=0;c<=n-r;c++){
                System.out.print(t+" ");
                t+=n-c;
            }
            System.out.println();
        }
        sc.close();
    }

}
