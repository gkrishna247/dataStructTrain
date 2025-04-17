import java.util.Scanner;
public class ArrayProblem01 {
    public static boolean isEqual(int [] a,int [] b){
        if(a.length!=b.length){
            return false;
        }else{
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean isPalindrome(int [] arr){
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-i+1]){
                return false;
            }
        }
        return true;
    }
    public static int[] sortedWaveArray(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[2*i];
            arr[2*i]=arr[(2*i)+1];
            arr[(2*i)+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter elements of first array: ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.print("Enter elements of second array: ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        if(isEqual(arr1, arr2)){
            System.out.println("The two arrays are equal");
            if(isPalindrome(arr1)){
                System.out.println("And also these arrays are palindrome");
            }else{
                System.out.println("It is not a palindrome");
            }
        }else{
            System.out.println("The arrays are not equal");
            int sum1=0,sum2=0;
            for(int i=0;i<arr1.length;i++){
                sum1+=arr1[i];
            }
            for(int i=0;i<arr2.length;i++){
                sum2+=arr2[i];
            }
            if(sum1>sum2){
                System.out.println("Sum of array 1 is greater");
                int res[]=sortedWaveArray(arr1);
                System.out.println("The sorted wave array of array 1 is ");
                for(int i=0;i<n1;i++){
                    System.out.print(res[i]+" ");
                }
            }else{
                System.out.println("Sum of array 2 is greater");
                int res[]=sortedWaveArray(arr2);
                System.out.println("The sorted wave array of array 2 is ");
                for(int i=0;i<n2;i++){
                    System.out.print(res[i]+" ");
                }
            }
        }
        sc.close();
    }
}
