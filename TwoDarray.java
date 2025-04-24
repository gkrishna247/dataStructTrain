public class TwoDarray {
    public static void main(String[] args) {
        int [][] arr=new int[10][8];

        for(int i=0;i<10;i++){
            for(int j=0;j<8;j++){
                arr[i][j]=i+j+1;
            }
        }
        // print the 2D array
        for(int i=0;i<10;i++){
            for(int j=0;j<8;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // display number of rows and columns
        System.out.println("Number of rows: "+arr.length);
        System.out.println("Number of columns: "+arr[0].length);
        // display the first row and last column    
        System.out.println("First row: ");
    }
}
