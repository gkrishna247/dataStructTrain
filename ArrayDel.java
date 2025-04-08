public class ArrayDel {
    public static void main(String[] args){
        int n=4;
        int a[]={1,2,3,4};
        int val=3;
        for(int i=0;i<n;i++){
            if(a[i]==val){
                for(int j=i;j<n-1;j++){
                    a[j]=a[j+1];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
