
package gestiongimnasio;

public class Batman {
    private Superman ElModelin;
    private FlechaVerde OjoPiojo;

    public Batman(Superman ElModelin, FlechaVerde OjoPiojo) {
        this.ElModelin = ElModelin;
        this.OjoPiojo = OjoPiojo;
        OjoPiojo.setVisible(true);
        OjoPiojo.cargarImagen();
    }
    
    
    
}
