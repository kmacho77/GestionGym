
package gestiongimnasio;

import java.awt.event.MouseListener;
import javax.swing.JButton;


public class dialogandoConFlechaVerde extends javax.swing.JDialog {

  
    public dialogandoConFlechaVerde(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         
        setTitle("Ventana de configuración");
        // Centrar la ventana y ajustar su tamaño antes de cargar la imagen
        setSize(800, 600);
        setLocationRelativeTo(null); // Centrar la ventana
        setResizable(false);// que no sea redimensionable
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        paneela = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btroj = new javax.swing.JButton();
        brver = new javax.swing.JButton();
        btros = new javax.swing.JButton();
        btlil = new javax.swing.JButton();
        btdef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(473, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("AJUSTES");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(60, 316));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(60, 316));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel4.setLayout(new java.awt.BorderLayout());

        paneela.setBackground(new java.awt.Color(204, 204, 0));
        paneela.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 204)));
        paneela.setLayout(new javax.swing.BoxLayout(paneela, javax.swing.BoxLayout.LINE_AXIS));

        jToolBar1.setBackground(new java.awt.Color(0, 0, 153));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        btroj.setBackground(new java.awt.Color(204, 0, 0));
        btroj.setText("BG_Rojo");
        btroj.setFocusable(false);
        btroj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btroj.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btroj);

        brver.setBackground(new java.awt.Color(0, 153, 51));
        brver.setText("BG_Verde");
        brver.setFocusable(false);
        brver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(brver);

        btros.setBackground(new java.awt.Color(255, 102, 255));
        btros.setText("BG_Rosa");
        btros.setFocusable(false);
        btros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrosActionPerformed(evt);
            }
        });
        jToolBar1.add(btros);

        btlil.setBackground(new java.awt.Color(51, 0, 204));
        btlil.setText("BG_Lila");
        btlil.setFocusable(false);
        btlil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btlil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btlil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlilActionPerformed(evt);
            }
        });
        jToolBar1.add(btlil);

        btdef.setText("BG_Default");
        btdef.setFocusable(false);
        btdef.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btdef.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btdef);

        paneela.add(jToolBar1);

        jPanel4.add(paneela, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btlilActionPerformed

    private void btrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btrosActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brver;
    private javax.swing.JButton btdef;
    private javax.swing.JButton btlil;
    private javax.swing.JButton btroj;
    private javax.swing.JButton btros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel paneela;
    // End of variables declaration//GEN-END:variables

public void Clickroj(MouseListener l) {
        btroj.addMouseListener(l);
    }
public void Clickver(MouseListener l) {
    System.out.println("asigna escucha");
        brver.addMouseListener(l);
        
    }
public void Clicklil(MouseListener l) {
        btlil.addMouseListener(l);
    }
public void Clickdef(MouseListener l) {
        btdef.addMouseListener(l);
    }
public void Clickros(MouseListener l) {
        btros.addMouseListener(l);
    }

    public JButton getBrver() {
        return brver;
    }

    public JButton getBtdef() {
        return btdef;
    }

    public JButton getBtlil() {
        return btlil;
    }

    public JButton getBtroj() {
        return btroj;
    }

    public JButton getBtros() {
        return btros;
    }






}



