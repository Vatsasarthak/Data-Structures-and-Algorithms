import java.util.*;
public class SetZerosMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n =sc.nextInt();
        System.out.println("Enter the number of column ");
        int m=sc.nextInt();
        int[][] mat= new int[n][m];
        System.out.println("Give the MAtrix");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    mat[i][j]=0;
                }
            }
        }
        System.out.println("The Resukted Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j] + "");
            }
            System.out.println();
        }
        }
    }