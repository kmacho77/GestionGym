package gestiongimnasio;

import java.awt.Image;
import javax.swing.ImageIcon;

public class FlechaVerde1Carga extends javax.swing.JFrame {
    private ImageIcon imgDC; 
    public FlechaVerde1Carga() {
        initComponents();
        setTitle("Cargando...");
        System.out.println("cargando...");
        // Centrar la ventana y ajustar su tamaño antes de cargar la imagen
        setSize(800, 600);
        setLocationRelativeTo(null); // Centrar la ventana
        setResizable(false);// que no sea redimensionable
        // Escuchador para cargar la imagen cuando la ventana esté lista
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                cargarImagen();
            }
        });
    }

    public void cargarImagen() {
        // Cargar la imagen desde los recursos
        imgDC = new ImageIcon(getClass().getResource("gym.jpg")); // Ruta correcta (verifica esto)
           
            Image imagenEscalada = imgDC.getImage().getScaledInstance(
            InicioGotham.getWidth(), InicioGotham.getHeight(), Image.SCALE_SMOOTH);
            InicioGotham.setIcon(new ImageIcon(imagenEscalada));
            InicioGotham.setText(null); // Quitar el texto de "hola"
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InicioGotham = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InicioGotham.setText("hola");
        InicioGotham.setName(""); // NOI18N
        InicioGotham.setPreferredSize(new java.awt.Dimension(420, 270));
        getContentPane().add(InicioGotham, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InicioGotham;
    // End of variables declaration//GEN-END:variables




}
