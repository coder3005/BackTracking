/*numbers of ways a rat to reach from (0,0) to (n-1,n-1) in n*n matrix where in array 
'0' represents that position is blocked while '1' is represent that position is open for moving and you can move in any direction up,down,right,left*/
package BackTracking;

public class solution {
    public static void ratMaze(int arr[][], int i, int j, int N, boolean visited[][], String psf) {
        if(i<0 || j<0 || i>=N || j>=N) {
            return;
        }
        if(arr[i][j]==0 || visited[i][j]==true) {
            return;
        }
        if(i==N-1 && j==N-1) {
            System.out.println("reached destination with path "+psf);
            return;
        }

        visited[i][j]=true;

        ratMaze(arr,i-1,j,N,visited,psf+"U"); //up
        ratMaze(arr,i+1,j,N,visited,psf+ "D"); //down
        ratMaze(arr,i,j-1,N,visited,psf+ "L"); //left
        ratMaze(arr,i,j+1,N,visited,psf+ "R"); //right

        visited[i][j]=false; //you can visit this cell as part of some other parts
    }
    
    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},
                {1,1,0,1},
                {0,1,0,0,},
                {1,1,1,1}};
        int N=arr.length;
        boolean visited[][]=new boolean[N][N];
        ratMaze(arr,0,0,arr.length,visited,"");
    }
}


