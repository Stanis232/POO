/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoavanzadopoo;

/**
 *
 * @author stanis
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorRomanos {

    public static void main(String[] args) {
        
        // Identificador de números romanos
      
        Pattern patronRomanos = 
        Pattern.compile("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        Matcher m = 
        patronRomanos.matcher("MCMXCIV");
        if (m.find()) {
            System.out.println("Número romano válido");
        } else {
            System.out.println("Número romano inválido");
        }
        
        // Divide por coma, punto y coma 
        String entrada = "mesa,silla; lámpara sofa"; 
        String[] items = entrada.split("[,;\\s]+"); 
        for (String item : items) { System.out.println(item); } 
        // Salida limpia: // mesa // silla // lámpara // sofa
        
        
    }
}
