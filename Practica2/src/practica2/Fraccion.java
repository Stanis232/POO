/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

/**
 *
 * @author s.yaruchyk.2023
 */
public class Fraccion {
    
    
    private int numerador;
    private int denominador;

    public Fraccion() {
        numerador = 1;
        denominador = 1;
    }

    public Fraccion(int denominador) {
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if(denominador!=0){
            this.denominador = denominador;
        }
        
    }
     public Fraccion(Fraccion f){
          this.numerador = f.getNumerador();
        this.denominador = f.getDenominador();
     }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
     public Fraccion suma(Fraccion f, Fraccion f2){
        int numerador1 = f.getNumerador();
        
        int denominador1 = f.getDenominador();
        int numerador2 = f2.getNumerador();
        int denominador2 = f2.getDenominador();
        int sumaNumerador= numerador1 * denominador2 + denominador1 * numerador2;
        
             int sumaDenominador=  denominador2 * denominador1;
        
        //Falta ver como lo hago para que sea disto de 0
        
       
         return new Fraccion(sumaNumerador,sumaDenominador);
         
         
     }
      public Fraccion resta(Fraccion f, Fraccion f2){
        int numerador1 = f.getNumerador();
        int denominador1 = f.getDenominador();
        int numerador2 = f2.getNumerador();
        int denominador2 = f2.getDenominador();
        int restaNumerador= numerador1 * denominador2 - denominador1 * numerador2;
        int restaDenominador=  denominador2 * denominador1;
         return new Fraccion(restaNumerador,restaDenominador);
         
         
     }
      
      public Fraccion multi(Fraccion f, Fraccion f2){
        int numerador1 = f.getNumerador();
        int denominador1 = f.getDenominador();
        int numerador2 = f2.getNumerador();
        int denominador2 = f2.getDenominador();
        int multiNumerador= numerador1 * numerador2;
        int multiDenominador=  denominador2 * denominador1;
         return new Fraccion(multiNumerador,multiDenominador);
         
         
     }
      public Fraccion division(Fraccion f, Fraccion f2){
        int numerador1 = f.getNumerador();
        int denominador1 = f.getDenominador();
        int numerador2 = f2.getNumerador();
        int denominador2 = f2.getDenominador();
        int diviNumerador= numerador1 * denominador2;
       int diviDenominador =  denominador1 * numerador2;
         return new Fraccion(diviNumerador,diviDenominador);
         
         
     }
      
       public int numEntero(){
                return numerador/denominador;
        }
       public double numReal(){
           
           
           //(double) del parentesis hace que se vea la fraccion entera no entiendo del todo pq?
                 return (double) numerador/denominador;
        }
       

        public String toString() { return numerador + "/" + denominador; }
      
        public Fraccion copia(){
        return new Fraccion(numerador,denominador);
     
        }
        
         public boolean equals(Object p){
        if (this==p) return true;
        if (p==null) return false;
        if(getClass()!=p.getClass()) return false;
        Fraccion c = (Fraccion) p;
        return ((getNumerador() == c.getNumerador() && (getDenominador() == c.getDenominador())));
    }
         //creo que aqui sea hace static para no equivocarse con el numerador y denominador. this *** creo *** y para que solo se pueda acceder a este metodo desde esta clase
         private static int mcd(int numerador, int denominador){
             numerador = Math.abs(numerador);
               denominador = Math.abs(denominador);
                while (denominador != 0) {
            int t = numerador % denominador;
                    numerador = denominador;
                    denominador = t;
    }
            return numerador == 0 ? 1 : numerador;    
         }
   public void  simplificar(){
       if (numerador==0) {
           denominador=1;
           return;
       }
       int simpli = mcd(numerador, denominador);
                 numerador /= simpli;
                    denominador /= simpli;
   }
    /**
     * @param args the command line arguments
     */
  
    
}
