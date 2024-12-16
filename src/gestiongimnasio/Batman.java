
package gestiongimnasio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;

public class Batman implements MouseListener {
    private Superman ElModelin;
    private FlechaVerde1Carga OjoPiojo;
    private flechaVerde2principal ojoelpiojo;
    private dialogandoConFlechaVerde conver;

    public Batman(Superman ElModelin, FlechaVerde1Carga OjoPiojo) {
        this.ElModelin = ElModelin;
        this.OjoPiojo = OjoPiojo;
        this.ojoelpiojo=new flechaVerde2principal();
        this.ojoelpiojo.ClickConfigura(this);  // Agregar el listener al menú Configuración

    }
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
    private void abrirVentanaPrincipal() {
        // Cerrar la pantalla de carga
        OjoPiojo.dispose();
        System.out.println("cargado");
        // Mostrar la ventana principal
        ojoelpiojo.setVisible(true);
        System.out.println("Principal abierta");
       
    }

   
   

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("aaaa");
        if (e.getSource()==ojoelpiojo.getMnconfi()){
            abriendoo();
            System.out.println("abriendo configuracion");
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
    
    
     private void abriendoo() {
     conver=new dialogandoConFlechaVerde(ojoelpiojo,true);
     conver.setVisible(true); // Mostrar el JDialog
    }
    
    
    
}
