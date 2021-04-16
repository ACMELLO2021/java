import java.util.Scanner;
public class Uri1073 { 
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
int x, quadrado;
    x = teclado.nextInt();
    for(int qtde = 2; qtde <=x; qtde=qtde + 2){
        if ( x % 2 ==0 && x > 5 && x < 2000){
            quadrado  = qtde * qtde;
            System.out.println(qtde + "^" + "2" + " = " + quadrado);}
        else if ( x % 2 !=0 && x > 5 && x < 2000){
            quadrado  = qtde * qtde;
            System.out.println(qtde + "^" + "2" + " = " + quadrado); }
            
        
    }  
}
}
