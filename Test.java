import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the n2: ");
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("n1: " + n1 + " n2: " + n2);
    }
}
