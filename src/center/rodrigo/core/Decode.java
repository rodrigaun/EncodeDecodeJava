package center.rodrigo.core;

import java.util.Base64;

public class Decode {

    public String decodificar(String texto) {
        
        return new String(Base64.getDecoder().decode(texto));
        
    }
    
}
