import java.util.Scanner;
public class preco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float tara = sc.nextFloat();
        float peso = sc.nextFloat();
        float preco = sc.nextFloat();
        sc.close();
        System.out.printf("%.2f\n", (peso - tara) * preco);
    }
}