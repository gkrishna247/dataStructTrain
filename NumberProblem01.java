import java.util.Scanner;

public class NumberProblem01 {
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }else if(num==2){
            return true;
        }else if(num>2 && num%2==0){
            return false;
        }else{
            for(int i=3;i<num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean isAnagram(int n1,int n2){
        int freq1[]=new int[10];
        int freq2[]=new int[10];
        for(int i=n1;i!=0;i/=10){
            freq1[i%10]++;
        }
        for(int i=n2;i!=0;i/=10){
            freq2[i%10]++;
        }
        for(int i=0;i<10;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;  
    }
    public static boolean isPalindrome(int num){
        int rev=0;
        for(int i=num;i!=0;i/=10){
            rev=(rev*10)+(i%10);
        }
        if(num==rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0,prod=1;
        for(int i=n;i!=0;i/=10){
            sum+=(i%10);
            prod*=(i%10);
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The product is: "+prod);
        if(isPrime(sum) && isPrime(prod)){
            System.out.println("Both are prime");
        }else if(isPrime(sum)){
            System.out.println("Sum is prime");
        }else if(isPrime(prod)){
            System.out.println("Product is prime");
        }else{
            System.out.println("Both are Not prime");
        }
        if(isAnagram(sum, prod)){
            System.out.println("Both are anagrams to each other");
        }else{
            System.out.println("It is not a Anagram");
        }
        if(isPalindrome(sum) && isPalindrome(prod)){
            System.out.println("Both are palindrome");
        }else if(isPalindrome(sum)){
            System.out.println("Sum is palindrome");
        }else if(isPalindrome(prod)){
            System.out.println("Product is palindrome");
        }else{
            System.out.println("Both are Not palindrome");
        }


        sc.close();
    }
}