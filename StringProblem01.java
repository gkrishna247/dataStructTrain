import java.util.Scanner;
public class StringProblem01 {
    //kk
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }else{
            int freq1[]=new int[256];
            int freq2[]=new int[256];
            for(int i=0;i<s.length();i++){
                freq1[s.charAt(i)]++;
                freq2[t.charAt(i)]++;
            }
            for(int i=0;i<256;i++){
                if(freq1[i]!=freq2[i]){
                    System.out.println(freq1[i]+"--"+freq2[i]);
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1=sc.nextLine();
        System.out.print("Enter the second String: ");
        String s2=sc.nextLine();
        if(isAnagram(s1, s2)){
            System.out.println("The given strings are Anagram");
            int freq[]=new int[256];
            for(int i=0;i<s1.length();i++){
                freq[s1.charAt(i)]++;
            }
            int ua[]=new int[26];
            int la[]=new int[26];
            for(int i='A';i<='Z';i++){
                ua[i-'A']=freq[i];
            }
            for(int i='a';i<='z';i++){
                la[i-'a']=freq[i];
            }
            String ss="";
            for(int i=0;i<26;i++){
                if(ua[i]>0){
                    for(int j=0;j<ua[i];j++){
                        ss+=(char)(i+'A');
                    }
                }
                if(la[i]>0){
                    for(int j=0;j<la[i];j++){
                        ss+=(char)(i+'a');
                    }
                }
            }
            System.out.println("The Sorted string is: "+ss);

        }else{
            System.out.println("The given strings are not Anagram");
        }

        sc.close();
    }
}
