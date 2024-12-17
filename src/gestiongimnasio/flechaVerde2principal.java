
package gestiongimnasio;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JPanel;

public class flechaVerde2principal  extends javax.swing.JFrame {
  private ImageIcon imgDc;
  
    public flechaVerde2principal() {
        initComponents();
        
        setTitle("Ventana Principal");
        // Centrar la ventana y ajustar su tamaño antes de cargar la imagen
        setSize(800, 600);
        setLocationRelativeTo(null); // Centrar la ventana
        setResizable(false);// que no sea redimensionable
         imgDc = new ImageIcon(getClass().getResource("super.png"));
           
            Image superescala = imgDc.getImage().getScaledInstance(
            150, 200, Image.SCALE_SMOOTH);
            suup.setIcon(new ImageIcon(superescala));
            suup.setText(null); // Quitar el texto de "hola"
            imgDc = new ImageIcon(getClass().getResource("pesa.png"));        
            Image pesaescala = imgDc.getImage().getScaledInstance(
            150, 150, Image.SCALE_SMOOTH);
            pesao.setIcon(new ImageIcon(pesaescala));
            pesao.setText(null); // Quitar el texto de "hola"
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        suup = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pesao = new javax.swing.JLabel();
        baticueva = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnconfi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Inicio");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        suup.setText("super");
        jPanel2.add(suup);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setLayout(new java.awt.BorderLayout());

        pesao.setText("jLabel3");
        jPanel3.add(pesao, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        baticueva.setBackground(new java.awt.Color(0, 0, 204));
        baticueva.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("BIENVENIDOS A EL SUPER GYM DE DC");
        jLabel1.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel5.add(jLabel1);

        baticueva.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(baticueva, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        mnconfi.setText("Configuración");
        jMenuBar1.add(mnconfi);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baticueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenu mnconfi;
    private javax.swing.JLabel pesao;
    private javax.swing.JLabel suup;
    // End of variables declaration//GEN-END:variables

    public void ClickConfigura(MouseListener l) {
        mnconfi.addMouseListener(l);
    }

    public JMenu getMnconfi() {
        return mnconfi;
    }

    public JPanel getBaticueva() {
        return baticueva;
    }

    public void setBaticueva(String color) {
        switch(color){
            case "rojo":
        baticueva.setBackground(Color.red);
        break;
            case "verde":
        baticueva.setBackground(Color.green);
                break;

            case "rosa":
        baticueva.setBackground(Color.pink);
                break;

            case "lila":
        baticueva.setBackground(new Color(102,51,255));
                break;

        case "def":
        baticueva.setBackground(new Color(0,0,204));
                break;


        }
    }
    
    
}
