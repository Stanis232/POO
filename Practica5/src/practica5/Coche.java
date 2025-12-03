/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author stanis
 */
public class Coche {
    private String nombre;
    private double velCurva,velRecta;
    
    private final double ACELERARECTA = 5;
    private final double ACELERACURVA = 5;
    private final double FRENARECTA = 5;
    private final double FRENACURVA = 5;
    private final double MEJORA = 15;

    public String getNombre() {
        return nombre;
    }

   
    public double getVelRecta() {
        return velRecta;
    }

    public double getVelCurva() {
        return velCurva;
    }

    public void setVelCurva(double velCurva) {
        
         if (velCurva >= 0){
           this.velCurva = velCurva;
        }
    }

    public void setVelRecta(double velRecta) {
        
        if (velRecta >= 0){
            this.velRecta = velRecta;  
        }
      
    }

    public Coche(String nombre, double velCurva, double velRecta) {
         if (nombre==null) {
            this.nombre = "";        
        }else             this.nombre = nombre;        

        if (velCurva>=0) {
            this.velCurva = velCurva;
        
        }
         if (velRecta>=0) {
        this.velRecta = velRecta;
        
        }
    }

    public Coche(String nombre) {
       if (nombre==null) {
            this.nombre = "";        
        }else             this.nombre = nombre; 
        this.velCurva = 0;
        this.velRecta = 0;
    }

    public Coche(String nombre, double velRecta) {
                if (nombre==null) {
            this.nombre = "";        
        }else             this.nombre = nombre;         
             if (velRecta>=0) {
        this.velRecta = velRecta;
        
        }

             this.velCurva = 0;

    }
            public Coche(String nombre, Coche c){
        
                
                 if (nombre==null) {
            this.nombre = "";        
        }else        this.nombre = nombre;
        this.velCurva= c.getVelCurva();
        this.velRecta =    c.getVelRecta();   
    
    } 
            
            public void acelerarRecta(){
               
                    this.velRecta=this.velRecta+ACELERARECTA;
               
            }
            public void acelerarCurva(){
                this.velCurva=this.velCurva+ACELERACURVA;
            }
             public void frenaCurva(){
                 this.velCurva=this.velCurva-FRENACURVA;
                 if(velCurva<=0){
                     this.velCurva=0;
                 }
                
            }
             public void frenaRecta(){
                this.velRecta=this.velRecta-FRENARECTA;
                if(velRecta<=0){
                     this.velRecta=0;
                 }
                
            }
             public void mejora(){
                 this.velRecta+=MEJORA;
                 this.velCurva+=MEJORA;
             }
             public double tiempoRecta(double metros){
                 if(this.velRecta!=0){
                     return ((metros/this.velRecta)*3600);
                 }return -1;
             }
             
             public double tiempoCurva(double metros){
                 if(this.velCurva!=0){
                     return ((metros/this.velCurva)*3600);
                 }return -1;
             }
             /*
             public boolean isDeteneido(){
                 if(this.velRecta<=0 ||this.velCurva<=0){
                     return true;
                     
                         
                     }
                 return false;
             }*/
             
             //profe sol
             public boolean estaDetenido() {
    return (velRecta == 0 || velCurva == 0);
}
             
             
          public double tiempoCircuito(Circuito cir){
                 if(!estaDetenido()){
                     return(this.tiempoRectaCircuito(cir)+ this.tiempoCurvaCircuito(cir));
                 }else 
                     return -1;
                 
             }

    private double tiempoRectaCircuito(Circuito cir) {
            double tiempo=0 ;
        double[] rectas = cir.getRectas();
        for (int i = 0; i < rectas.length; i++) {
            
            
            tiempo+= this.tiempoRecta(rectas[i]);
        }
        
        
        return tiempo;
    }

    private double tiempoCurvaCircuito(Circuito cir) {
            double tiempo=0 ;
        double[] curvas = cir.getCurvas();
        for (int i = 0; i < curvas.length; i++) {
            
            
            tiempo+= this.tiempoCurva(curvas[i]);
        }
        
        
        return tiempo;
    }
    
    
    private double competir(Coche original, Coche otro, Circuito cir, int numvueltas){
       
        double   c1 = original.tiempoCircuito(cir);
        double   c2 = otro.tiempoCircuito(cir);
    }
}
