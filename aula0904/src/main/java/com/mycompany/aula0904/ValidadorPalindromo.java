

package com.mycompany.aula0904;


import java.text.Normalizer;

public class ValidadorPalindromo {
    
     public static boolean ePalindromo(String imput) {       
        
         String normalizado = Normalizer.normalize(imput, Normalizer.Form.NFD);
         String semAcentos = normalizado.replaceAll("\\p{InCombiningDiacriticalMarks}+","");
         
         String limpo = semAcentos.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         
         String fraseInvertida = new StringBuilder(limpo).reverse().toString();
        
        return limpo.equals(fraseInvertida);
    }

    
    
    
}
