/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author stanis
 */
public class Punto {
    private  int x;
    private  int y;
    
    public Punto() {
       
    }
    public Punto(int num) {
        x=num;
    }
     public Punto(int num1, int num2) {
        x=num1;
        y=num2;
    }
    public Punto(Punto p){
        x=p.getX();
        y=p.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
     public void desplazarX(int num1){
      x= this.x + num1; 
     //x+=num1; segun falax
      
    }
      public void desplazarY(int num1){
      y= this.y + num1; 
     //xy+=num1; segun falax y la profa
      
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
     public void desplazarXY(int num1, int num2){
    desplazarX(num1);
     desplazarY(num2);
      
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    @Override
     public boolean equals(Object o){ //solucion profe
         if (this == o) {
             return true;
         }
         if (o==null || getClass() !=o.getClass() ) {
            return false;
        }
       Punto otro = (Punto) o;
       return x== otro.x && y == otro.y;
     }
     
     
     //mario
     public Punto copia (Punto p){
         return new Punto(p.getX(), p.getY());
     }
     
     //profe
     public Punto copia2 (){
         return new Punto(x,y);
     }
}
