import java.util.Scanner;
public class Uri1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
double      Sal;
double      Reajuste, NovoSal;
         Sal = teclado.nextDouble(); 
         if(Sal >=0 && Sal <=400 ){
            Reajuste = Sal * 0.15;
            NovoSal = Sal + Reajuste;
            System.out.printf("Novo salario = %.2f\n", NovoSal);
            System.out.printf("Reajuste ganho = %.2f\n", Reajuste);  
            System.out.println("Em percentual = 15 %" );}
         else
         if(Sal >=400.01 && Sal <=800 ){
            Reajuste = Sal * 0.12;
            NovoSal = Sal + Reajuste;
            System.out.printf("Novo salario = %.2f\n", NovoSal);
            System.out.printf("Reajuste ganho = %.2f\n", Reajuste);  
            System.out.println("Em percentual = 12 %" );}
         else
         if(Sal >=800.01 && Sal <=1200 ){
            Reajuste = Sal * 0.10;
            NovoSal = Sal + Reajuste;
            System.out.printf("Novo salario = %.2f\n", NovoSal);
            System.out.printf("Reajuste ganho = %.2f\n", Reajuste);  
            System.out.println("Em percentual = 10 %" );} 
         else
         if(Sal >=1200.01 && Sal <=2000 ){
            Reajuste = Sal * 0.07;
            NovoSal = Sal + Reajuste;
            System.out.printf("Novo salario = %.2f\n", NovoSal);
            System.out.printf("Reajuste ganho = %.2f\n", Reajuste);  
            System.out.println("Em percentual = 7 %" );} 
        else
         if(Sal >2000){
            Reajuste = Sal * 0.04;
            NovoSal = Sal + Reajuste;
            System.out.printf("Novo salario = %.2f\n", NovoSal);
            System.out.printf("Reajuste ganho = %.2f\n", Reajuste);  
            System.out.println("Em percentual = 4 %" );}    
         }          
    }                 