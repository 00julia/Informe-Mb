import java.util.*;
import java.lang.Math;

public class Mega {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int mb;
        
        System.out.println("informe a quantidade de Mb");
        mb = input.nextInt();
        if (mb < 100) {
            System.out.println("O valor a ser pago é de R$40,00");
        } else {
            mb = (mb - 100) * 2 + 40;
            System.out.println("o valor a ser pago é R$" + mb + ",00");
        }
    }
}
