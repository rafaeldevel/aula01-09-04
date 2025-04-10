/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.aula0904.ValidadorPalindromo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ValidadorPalindromoTest {
     @ParameterizedTest
     @CsvSource({
         
         "ana, true",
         "Tres pratos de trigo para 3 tigres tristes, false",
         "Ame a ema, true",
         "Socorram-me subi no ônibus em Marrocos, true",
         "Dirigir o carro, false",
         
         
     })
     
       void deveVerificarSeEhPalindromo(String imput, boolean esperado) {
        assertEquals(esperado, ValidadorPalindromo.ePalindromo(imput));
}
}

