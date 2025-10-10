/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

/**
 *https://github.com/Stanis232/POO.git
 * @author stanis
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contacto stanis = new Contacto("Stanis", "stanis@gmail.com" , 693755169);
        Contacto pedro = new Contacto("Pedro", "pedro@gmail.com" , 693755269);
         Contacto pedrocopion= new Contacto("pedrocopion", "pedro@gmail.com" , 693755269);
         MiMiniWhatsapp w1= new MiMiniWhatsapp(stanis);
         
        /* System.out.println(pedrocopion.equals(pedro));
         //true es q si es el mismo , falso q son diferentes
          System.out.println(pedrocopion.equals(stanis));
          */
          Mensaje m1 = new Mensaje("Holaaaaa", stanis, pedro);
           Mensaje m2 = new Mensaje("adiosss", pedro, stanis);
           Mensaje m3 = new Mensaje("invalido", pedro, pedrocopion);
           
          /*System.out.println(m1.getMensaje());
           System.out.println(m2.getMensaje());
            System.out.println(m3.getMensaje());*/
          w1.enviarMensajes(m1);
             
              System.out.println( w1.enviarMensajes(m2));
              w1.mostrarMensajes();
          
          
    }
    
}
