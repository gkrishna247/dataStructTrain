import java.util.*;

public class SubArrayUsingList {

    public static void printSub(int arr[],int n){
        if(n==0){
            return;
        }else{
            for(int i=0;i<arr.length-n+1;i++){
                for(int j=i;j<i+n;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
            printSub(arr, n-1);
        }
    }
    public static void printSubUseIndex(int arr[],int n,int s,int e){
        if(s==n){
            return;
        }else{
            for(int i=s;i<=e;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            if(e<n-1){
                printSubUseIndex(arr, n, s, e+1);
            }else{
                printSubUseIndex(arr, n, s+1, s+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // printSub(a, n);
        // printSubUseIndex(a, n, 0,0);

        sc.close();
    }
}