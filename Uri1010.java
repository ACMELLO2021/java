import java.util.Scanner;
public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int      CodPeca1, CodPeca2;
int      NumPeca1, NumPeca2;
double   ValUnitPeca1, ValUnitPeca2;
double   ValPagar;
                CodPeca1 = teclado.nextInt(); NumPeca1 = teclado.nextInt(); ValUnitPeca1 = teclado.nextDouble();
                CodPeca2 = teclado.nextInt(); NumPeca2 = teclado.nextInt(); ValUnitPeca2 = teclado.nextDouble();
                ValPagar = (NumPeca1 * ValUnitPeca1) + (NumPeca2 * ValUnitPeca2);                         
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ValPagar);
            }
}