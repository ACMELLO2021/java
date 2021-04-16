import java.util.Scanner;
public class Uri1066 { 
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
int qtdepar= 0;
int qtdeimpar= 0;
int qtdepositivo= 0;
int qtdenegativo= 0;
int num;
for (int contador=1; contador <= 5; contador = contador + 1){
    num = teclado.nextInt();
    if (num %2 == 0){
        qtdepar = qtdepar + 1;
        }
        else{
        qtdeimpar = qtdeimpar +1; }
    if (num > 0){
        qtdepositivo = qtdepositivo + 1;
        }
        else if (num <0) {
        qtdenegativo = qtdenegativo +1; 
        }
    }
System.out.println(qtdepar + " valor(es) par(es)");
System.out.println(qtdeimpar + " valor(es) impar(es)");
System.out.println(qtdepositivo + " valor(es) positivo(s)");
System.out.println(qtdenegativo + " valor(es) negativo(s)");
}
}