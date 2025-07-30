import com.mycompany.GereEscola.Pessoa;

class Derivada extends Pessoa {
    public Derivada ( String nome , String id ) {
        super ( nome , id );
    }
    public String getNome ( ) {
        return recuperarNome ( );
    }
}
public class Principal {
     public static void main ( String args [ ] ) {
        Derivada Der = new Derivada ( "Marcos" , "A1" );
        System.out.println ( Der.getNome() );
     }
}
