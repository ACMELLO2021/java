import java.util.Scanner;
public class Uri1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int      N;
int      H, Min, S, resto;
                N = teclado.nextInt(); 
                H = N / 3600;
                resto = N % 3600;
                Min = resto / 60;
                S = resto % 60;
                System.out.println(H + ":" + Min + ":" + S);
                                }
}