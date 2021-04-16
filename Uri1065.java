import java.util.Scanner;
public class Uri1065 { 
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
int qtde = 0;
int num;
for (int contador=1; contador <= 5; contador = contador + 1){
    num = teclado.nextInt();
    if (num %2 == 0){
        qtde = qtde + 1;
        }}
System.out.println(qtde+ " valores pares");
}
}