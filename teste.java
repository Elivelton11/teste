class Concreta extends IdUnico {
        public void imprimeCod () {
            System.out.println( seed );
    }
}      
public class Principal {
        public static void main(String[] args) {
            Concreta conc = new Concreta ();
        conc.imprimeCod();
    }
}
