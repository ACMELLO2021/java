import java.util.Scanner;
// O nome do public class deve ter o mesmo nome no arquivo .java
public class AreaTriangulo {
    public static void main(String[] args) {
        System.out.println("Calculo da area de um triangulo"); 
Scanner teclado = new Scanner(System.in);
double    area;
double    base;
double    altura;
        System.out.println("Digite a medida da base do triangulo =" );
        base = teclado.nextDouble();
        System.out.println("Voce digitou = " + base);
        System.out.println("Digite a medida da altura do triangulo =");
        altura = teclado.nextDouble();
        System.out.println("Voce digitou = " + altura);
        area = base * altura /2;
        System.out.println(" A area do Triangulo e =" + area);
            }
}