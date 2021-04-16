import java.util.Scanner;
public class Uri1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int      NumFunc;
int      NumHtrab;
double   ValHora;
double   SalFunc;
                NumFunc = teclado.nextInt();
                NumHtrab = teclado.nextInt();
                ValHora = teclado.nextDouble();
                SalFunc = NumHtrab*ValHora;
                System.out.println("NUMBER = " + NumFunc);
        System.out.printf("SALARY = U$ %.2f\n", SalFunc);
            }
}