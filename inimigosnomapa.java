import java.util.Scanner;

public class inimigosnomapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte QInimigos = sc.nextByte();
        byte[] xy = new byte[QInimigos];
        byte I = 0, II = 0, III = 0, IV = 0;
        for (byte i = 0; i < xy.length; i++) {
            byte x = sc.nextByte();
            byte y = sc.nextByte();
            if (x > 0 && y > 0) {
                I++;
            } else if (x < 0 && y > 0) {
                IV++;
            } else if (x < 0 && y < 0) {
                III++;
            } else if (x > 0 && y < 0) {
                II++;
            }
        }
        sc.close();
        System.out.printf("I = %d\nII = %d\nIII = %d\nIV = %d\n", I, II, III, IV);
    }
}