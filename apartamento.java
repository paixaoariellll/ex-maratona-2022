import java.util.Scanner;
import java.util.Locale;

public class apartamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float inicial = sc.nextFloat();
        float apartamento = sc.nextFloat();
        float juros = sc.nextFloat();
        sc.close();
        int mes = 0;
        while (inicial < apartamento) {
            inicial += (inicial * juros) / 100;
            mes++;
        }
        if (mes <= 0) {
            System.out.printf("pode comprar agora\n");
        } else if (mes == 1) {
            System.out.printf("possivel em " + mes + " mes\n");
        } else {
            System.out.printf("possivel em " + mes + " meses\n");
        }
    }
}