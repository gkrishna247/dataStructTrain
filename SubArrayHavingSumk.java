import java.util.*;

public class SubArrayHavingSumk{
    public static void printSubHaveSumk(int arr[],int n,int k,int s,int e){
        if(s==n){
            return;
        }else{
            int sum=0;
            for(int i=s;i<=e;i++){
                sum+=arr[i];
            }
            if(sum==k){
                for(int i=s;i<=e;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            if(e<n-1){
                printSubHaveSumk(arr, n, k, s, e+1);
            }else{
                printSubHaveSumk(arr, n, k, s+1, s+1);
            }
        }
    }
    public static void printSubSumIsK(int arr[], int n, int k, int s, int e,int sum,ArrayList<Integer> sa) {
        if (s == n) {
            return;
        }
        if (e == n) {
            sa.clear();
            printSubSumIsK(arr, n, k, s+1, s+1, 0, sa);
            return;
        }
        sa.add(arr[e]);
        sum+=arr[e];
        if(sum==k){
            System.out.println(sa);
        }
        printSubSumIsK(arr, n, k, s, e+1, sum, sa);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter valur of n: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter array Elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the valur of'k': ");
        int k=sc.nextInt();
        ArrayList <Integer> sub=new ArrayList<>();
        printSubSumIsK(a, n, k, 0, 0, 0, sub);

        sc.close();
    }
}