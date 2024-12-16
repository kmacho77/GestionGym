
package gestiongimnasio;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JMenu;

public class flechaVerde2principal  extends javax.swing.JFrame {

  
    public flechaVerde2principal() {
        initComponents();
        
        setTitle("Ventana Principal");
        // Centrar la ventana y ajustar su tamaño antes de cargar la imagen
        setSize(800, 600);
        setLocationRelativeTo(null); // Centrar la ventana
        setResizable(false);// que no sea redimensionable
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnconfi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnconfi.setText("Configuración");
        jMenuBar1.add(mnconfi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnconfi;
    // End of variables declaration//GEN-END:variables

    public void ClickConfigura(MouseListener l) {
        mnconfi.addMouseListener(l);
    }

    public JMenu getMnconfi() {
        return mnconfi;
    }
    
}
