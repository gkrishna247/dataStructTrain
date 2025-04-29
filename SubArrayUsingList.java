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
    public static void printSub1(int arr[], int n, int s, int e, ArrayList<Integer> sa) {
        if (s == n) {
            return;
        }
        if (e == n) {
            sa.clear();
            printSub1(arr, n, s + 1, s + 1, sa);
            return;
        }
        sa.add(arr[e]);
        System.out.println(sa);
        printSub1(arr, n, s, e + 1, sa);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printSub(a, n);
        printSubUseIndex(a, n, 0, 0);
        printSub1(a, n, 0, 0, new ArrayList<>());

        sc.close();
    }
}