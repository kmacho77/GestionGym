
package gestiongimnasio;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;

public class Batman implements MouseListener {
    private Superman ElModelin;
    private FlechaVerde1Carga OjoPiojo;
    private flechaVerde2principal ojoelpiojo;
    private dialogandoConFlechaVerde conver;
/**
 * 
 * @param ElModelin modelo del programa
 * @param OjoPiojo vista del programa
 * inicia todas las clases y añade lso escuchadores 
 */
    public Batman(Superman ElModelin, FlechaVerde1Carga OjoPiojo) {
        this.ElModelin = ElModelin;
        this.OjoPiojo = OjoPiojo;
        this.ojoelpiojo=new flechaVerde2principal();
        this.conver=new dialogandoConFlechaVerde(ojoelpiojo,true);
        this.ojoelpiojo.ClickConfigura(this); 
        this.conver.Clickdef(this);
        this.conver.Clicklil(this);
        this.conver.Clickroj(this);
        this.conver.Clickros(this);
        this.conver.Clickver(this);
// Agregar el listener al menú Configuración
        
    }
    /**
     * activa la pantalla de carga y pone un temporizador para 
     * activar la principal
     */
     public void iniciar() {
        // Mostrar la pantalla de carga
        OjoPiojo.setVisible(true);

        // Simular la carga por 3 segundos y luego abrir la ventana principal
        Timer timer = new Timer(5000, (ActionEvent e) -> {
            abrirVentanaPrincipal(); // Transición a la ventana principal
        });
        timer.setRepeats(false);
        timer.start();
    }
     /**
      * desactivar la pantalla de carga y activar la principal
      */
    private void abrirVentanaPrincipal() {
        // Cerrar la pantalla de carga
        OjoPiojo.dispose();
        System.out.println("cargado");
        // Mostrar la ventana principal
        ojoelpiojo.setVisible(true);
        System.out.println("Principal abierta");
       
    }

   
   
/**
 * 
 * @param e evento del click mouse
 * hacer acciones en el programa dependiendo de la opcion pulsada
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("aaaa");
        if (e.getSource()==ojoelpiojo.getMnconfi()){
            abriendoo();
            System.out.println("abriendo configuracion");
        }
        if(e.getSource()==conver.getBrver()){
            System.out.println("cambiando a verde...");
            ojoelpiojo.setBaticueva("verde");
        }
        if(e.getSource()==conver.getBtroj()){
            System.out.println("cambiando a rojo...");
            ojoelpiojo.setBaticueva("rojo");
        }
        if(e.getSource()==conver.getBtlil()){
            System.out.println("cambiando a lila...");
            ojoelpiojo.setBaticueva("lila");
        }
        if(e.getSource()==conver.getBtdef()){
            System.out.println("cambiando a default...");
            ojoelpiojo.setBaticueva("def");
        }
        if(e.getSource()==conver.getBtros()){
            System.out.println("cambiando a rosa...");
            ojoelpiojo.setBaticueva("rosa");
        }
        
        
        
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    /**
     * metodo para hacer visible el jdialog dialogandoconflechaverde
     */
     private void abriendoo() {
     conver.setVisible(true); // Mostrar el JDialog
    }
    
    
    
}
