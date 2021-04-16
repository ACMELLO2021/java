import java.util.Scanner;
public class Uri1047 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int      hi;
int      mi;
int      hf;
int      mf;
int      tempoH;
int      tempoM;
int      tempofinalH;
int      tempofinalM;
double   resto;
         hi = teclado.nextInt(); 
         mi = teclado.nextInt();
         hf = teclado.nextInt();
         mf = teclado.nextInt();

         tempoH = (hf-hi);
         tempoM = (mf-mi);
         
         if(tempoH < 24){
             tempoH = tempoH + 24;
         }
         if( tempoH <=24 && tempoM >=1 ){
             tempoH = tempoH * 60;
             tempoM = tempoM + tempoH;
             tempofinalH = tempoM / 60;
             resto = tempoM % 60;
             tempofinalM = resto / 60   ;      
            System.out.println("O JOGO DUROU" + tempofinalH + "HORA(S) E " + tempofinalM + "MINUTO(S)"  );}       
    } 
}                