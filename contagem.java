import java.util.Scanner;
import java.util.Arrays;
public class contagem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        short[] v = new short[n];
        for(byte i = 0; i < n; i++){
            v[i] = sc.nextShort();
        }
        sc.close();
        Arrays.sort(v);
        boolean flag = true;
        for(short i = 1; i <= 200; i++){
            if(Arrays.binarySearch(v, (short)i) < 0 && i <= v[v.length - 1]) {
                System.out.printf("%d\n", i);
                flag = false;
            }
        }
        if(flag){
            System.out.printf("bom trabalho\n");
        }
    }
}