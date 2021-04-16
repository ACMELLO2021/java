import java.util.Scanner;
public class Uri1064 { 
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
int qtde = 0;
float num;
float soma = 0;
float media;

 

for (int contador=1; contador <= 6; contador = contador + 1){
    num = teclado.nextFloat();
if (num > 0){
    qtde = qtde + 1;
    soma = soma + num;
}
}
media = soma / qtde;
System.out.println(qtde+ " valores positivos");
System.out.printf ("%.1f\n", media);
    }
}