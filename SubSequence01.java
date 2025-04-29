import java.util.*;

public class SubSequence01{
    public static void printSubSequence(int[] arr,int n,int i,ArrayList<Integer> s){
        if(i==n){
            System.out.println(s);
            return;
        }
        s.add(arr[i]);
        printSubSequence(arr, n, i+1, s);
        s.remove(s.size()-1);
        printSubSequence(arr, n, i+1, s);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList <Integer>sub=new ArrayList<>();
        printSubSequence(arr,n,0,sub);
        sc.close();
    }
}