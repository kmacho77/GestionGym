
package gestiongimnasio;


public class GestionGymDC {

    public static void main(String[] args) {
       
        FlechaVerde1Carga Vistoso=new FlechaVerde1Carga();
        Superman Modelin=new Superman();
        Batman Controladisimo=new Batman(Modelin,Vistoso);
        
        Controladisimo.iniciar();
        
    }
    
}
