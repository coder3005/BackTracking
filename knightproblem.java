//knight problem (horse)
package BackTracking;

public class solution {
    public static void KnightPaths(int arr[][], int i, int j, int N, int moveNumber) {
        if(i<0 || j<0 || i>=N || j>=N) {
            return;
        }
        if(arr[i][j]!=0) { // we have been at this point before
            return;
        }
        arr[i][j]=moveNumber;
        if(moveNumber==N*N-1) {
            printArr(arr);
            return;
        }

        KnightPaths(arr,i-2,j+1,N,moveNumber+1);
        KnightPaths(arr,i-1,j+2,N,moveNumber+1);
        KnightPaths(arr,i+1,j+2,N,moveNumber+1);
        KnightPaths(arr,i+2,j+1,N,moveNumber+1);
        KnightPaths(arr,i+2,j-1,N,moveNumber+1);
        KnightPaths(arr,i+1,j-2,N,moveNumber+1);
        KnightPaths(arr,i-1,j-2,N,moveNumber+1);
        KnightPaths(arr,i-2,j-1,N,moveNumber+1);

        arr[i][j]=0; //you can visit this cell as part of some other parts
    }
    public static void printArr(int arr[][]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        KnightPaths(new int[8][8],0,0,8,0);
    }
}


