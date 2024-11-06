package gestiongimnasio;

import javax.swing.ImageIcon;

public class FlechaVerde extends javax.swing.JFrame {

    private ImageIcon imgDC; // Guardamos el icono original para reutilizarlo

    public FlechaVerde() {
        initComponents();
                 // Llamamos al método para cargar la imagen
       
    }

    public void cargarImagen() {
        // Cargar la imagen original solo una vez
        imgDC = new ImageIcon(getClass().getResource("gymm.jpg"));
             InicioGotham.setIcon(imgDC);
             InicioGotham.setText(null);
  

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InicioGotham = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InicioGotham.setText("hola");
        InicioGotham.setMaximumSize(new java.awt.Dimension(480, 270));
        InicioGotham.setMinimumSize(new java.awt.Dimension(480, 270));
        InicioGotham.setName(""); // NOI18N
        InicioGotham.setPreferredSize(new java.awt.Dimension(420, 270));
        getContentPane().add(InicioGotham, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InicioGotham;
    // End of variables declaration//GEN-END:variables



    
    
    
    
    

}
