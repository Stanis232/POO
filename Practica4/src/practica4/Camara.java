/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author stanis
 */
public class Camara {
    private String ip;

    public Camara() {
        this.ip ="127.0.0.1";
    }

    public Camara(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }
    public boolean equals(Object p){
        if (this==p) return true;
        if (p==null) return false;
        if(getClass()!=p.getClass()) return false;
        Camara otraCamara = (Camara) p;
        
        //se podria probar tambien igualando otros atributos pero con tfn es suficiente
        return (this.getIp().equals(otraCamara.getIp()));
    }
    
    
}
