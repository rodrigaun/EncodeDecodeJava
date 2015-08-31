package center.rodrigo.core;

import java.util.Base64;

public class Encode {

    public String codificar(String texto) {
        
        byte[] message = texto.getBytes();
        return Base64.getEncoder().encodeToString(message);
    }
    
}
