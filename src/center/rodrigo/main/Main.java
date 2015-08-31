package center.rodrigo.main;

import center.rodrigo.core.Decode;
import center.rodrigo.core.Encode;

public class Main {

    public static void main(String[] args) {

        Encode encode = new Encode();
        String s = encode.codificar("Hello Wolrd");
        System.out.println("Texto Codificado:\n" + s);
        
        Decode decode = new Decode();
        s = decode.decodificar(s);
        System.out.println("\nTexto Decodificado:\n" + s);
        
    }

}
