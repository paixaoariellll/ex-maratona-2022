import java.util.Scanner;
public class retangulo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short ql = sc.nextShort();
        short qc = sc.nextShort();
        short n1 = sc.nextShort();
        short n2 = sc.nextShort();
        sc.close();
        long[][] mat = new long[ql][qc];
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i == 0){
                    mat[i][j] = 0;
                } else if(j == (qc - 1)){
                    mat[i][j] = 1;
                } else if(i == (ql - 1)){
                    mat[i][j] = 2;
                } else if(j == 0) {
                    mat[i][j] = 3;
                } else {
                    mat[i][j] = (long) (mat[i - 1][j] + mat[i][j - 1] + mat[i - 1][j - 1]);
                }
            }
        }
        System.out.printf("%d\n", mat[n1 - 1][n2 - 1]);
    }
}