import java.util.Scanner;
public class Uri1070 { 
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
int x, valimpar1, valimpar2, valimpar3, valimpar4, valimpar5, valimpar6;
    x = teclado.nextInt();
        if (x %2 == 0){
            valimpar1 = x + 1 ;
            valimpar2 = valimpar1 + 2;
            valimpar3 = valimpar2 + 2;
            valimpar4 = valimpar3 + 2;
            valimpar5 = valimpar4 + 2;
            valimpar6 = valimpar5 + 2; }
        else {
            valimpar1 = x ;
            valimpar2 = valimpar1 + 2;
            valimpar3 = valimpar2 + 2;
            valimpar4 = valimpar3 + 2;
            valimpar5 = valimpar4 + 2;
            valimpar6 = valimpar5 + 2; }
           
        System.out.println( valimpar1 );
        System.out.println( valimpar2 );
        System.out.println( valimpar3 );
        System.out.println( valimpar4 );
        System.out.println( valimpar5 );
        System.out.println( valimpar6 );
}
}