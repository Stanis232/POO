package practicagrupal_apartado2;

import java.util.ArrayList;

public class Plantilla {
    private ArrayList <Usuario> listaUsuarios;
    
    public Plantilla(){
        listaUsuarios = new ArrayList<> ();
    }
    
    
    public boolean agregar(Usuario u){
        if(!this.listaUsuarios.contains(u)){
            return listaUsuarios.add(u);
        }
        else{
            return false;
        }
    }
     public boolean eliminar(Usuario u){
         return listaUsuarios.remove(u);
     }
     
     
    public Usuario getUsuarioPorDNI(String DNI){
         for( Usuario u : listaUsuarios){
             if(u.getDNI().equalsIgnoreCase(DNI)) return u;
         }
         return null;
     }
    
    public Usuario getUsuariosPorCIPA(long CIPA){
         for( Usuario u : listaUsuarios){
             if(u.getCIPA() == CIPA) return u;
         }
         return null;
     }
    
        
    public Usuario autenticacion(String DNI){
        return getUsuarioPorDNI(DNI);
    }    
    
    public Usuario autenticacion(long CIPA){
         return getUsuariosPorCIPA(CIPA);
    }
        
       
}
