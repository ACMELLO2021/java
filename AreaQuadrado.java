import java.util.Scanner;
// O nome do public class deve ter o mesmo nome no arquivo .java
public class AreaQuadrado {
    public static void main(String[] args) {
        System.out.println("Calculo da area de um quadrado"); 
Scanner teclado = new Scanner(System.in);
double    area;
double    lado;
        System.out.println("Digite a medida do lado do quadrado =" );
        lado = teclado.nextDouble();
        System.out.println("Voce digitou = " + lado);
        area = lado*lado;
        System.out.println(" A area do Quadrado e =" + area);
            }
}