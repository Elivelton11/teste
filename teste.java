package com.mycompany.pctAlfa;
import java.util.Random;
public class IdUnico extends Random {
    private Float seed;   
    public IdUnico ( ) {
        seed = nextFloat ();
    }
    private interface iCodigo {
        public void imprimeCod ();
    }
}
