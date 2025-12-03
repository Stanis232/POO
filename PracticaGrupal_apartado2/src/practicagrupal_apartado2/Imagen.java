package practicagrupal_apartado2;

import java.time.LocalDateTime;


public class Imagen extends Prueba{
    private String rutaImagen;

    public Imagen(String rutaImagen, LocalDateTime fecha, String centro, String rutaInforme) {
        super(fecha, centro, rutaInforme);
        this.rutaImagen = rutaImagen;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

   
    //TODO: visualizarImagen
    public void visualizarImagen(String rutaImagen){
        
    }
    
}
