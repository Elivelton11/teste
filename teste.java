//imports
import java.io.IOException;
import java.util.Scanner;
  
public class Principal {
    private static Fibonacci fib;
    private static Scanner entrada;
     
    public static void main ( String args [ ] ) {
        double num = 0;
        entrada = new Scanner ( System.in );
        fib = new Fibonacci ();
        do {
            System.out.println ( "Entre com um numero não negativo ou \"-1\" para sair: ");
            num = entrada.nextDouble();
            if ( num == -1 )
                System.exit ( 0 );
            System.out.println ( "O " + num + “-esimo termo de Fibonacci eh: " + fib.CalcularFibonacci( num ) );
        } while ( num >= 0 );
    }
}



//imports
// Não há
 
public class Fibonacci {
    //Atributos
    private static int conta_chamada = 0; //conta o número de chamadas recursivas

    public double CalcularFibonacci ( double num ) {
        conta_chamada++;
        System.out.println ( "Chamada recursiva nr: " + conta_chamada );
        if ( num != 2 && num != 1 )
            return CalcularFibonacci ( num - 1 ) + CalcularFibonacci (num – 2);
        else
            return 1;
    }    
}
