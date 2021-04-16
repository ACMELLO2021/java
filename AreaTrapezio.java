import java.util.Scanner;
// O nome do public class deve ter o mesmo nome no arquivo .java
public class AreaTrapezio {
    public static void main(String[] args) {
        System.out.println("Calculo da area de um trapezio"); 
Scanner teclado = new Scanner(System.in);
double    basemaior;
double    basemenor;
double    altura;
double    area;
        System.out.println("Digite a medida da base maior do trapezio =" );
        basemaior = teclado.nextDouble();
        System.out.println("Voce digitou = " + basemaior);
        System.out.println("Digite a medida da base menor do trapezio =");
        basemenor = teclado.nextDouble();
        System.out.println("Voce digitou = " + basemenor);
        System.out.println("Digite a medida da altura do trapezio =");
        altura = teclado.nextDouble();
        System.out.println("Voce digitou = " + altura);
        area = (basemaior + basemenor) * altura / 2;
        System.out.println(" A area do Trapezio e =" + area);
            }
}