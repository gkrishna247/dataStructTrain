import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nod=0,count=0,cd;
        for(int i=N;i!=0;i/=10){
            nod++;
            cd=i%10;
            if ((nod%2==0)&&(cd%2==0)){
                count++;
            }
            if ((nod%2!=0)&&(cd%2!=0)){
                count++;
            }
            System.out.println(nod+"-"+cd+"-"+count);
        }
        if ((nod%2==0)&&(nod==count)){
            System.out.println("IS LUCKY");
        }
        else{
            System.out.println("IS NOT LUCKY"+nod+count);
        }
        sc.close();
    }
    
}
