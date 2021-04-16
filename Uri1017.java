import java.util.Scanner;
public class Uri1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int      Tempo, VelMedia;
double   Distancia, CombNecess;
                Tempo = teclado.nextInt(); 
                VelMedia = teclado.nextInt(); 
                Distancia = Tempo * VelMedia;
                CombNecess = Distancia/12;
        System.out.printf("%.3f\n", CombNecess);
            }
}