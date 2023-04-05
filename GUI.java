package juegoproyecto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author gonza
 */
public class GUI extends javax.swing.JFrame {

    private Thread hora; // BORRAR SI NO SIRVE
    private Tablero t;
    private Figura figura;
    private Timer hilo;

    public GUI() {
        t = new Tablero(24, 12);
        figura = new Figura();
        
        initComponents();
        
        figura.crearFigura();
        t.agregar(figura);
        control();
        

    }
    
    /// ESTE METODO ES PARA COLOCAR LA HORA NADA MAS A MEDIO DE PRUEBA4
   
     
     //TERMINA LA PRUEBA PARA LA HORA

    public void imprimeTetris() {
        for (int i = 0; i < t.getTablero().length; i++) {
            for (int j = 0; j < t.getTablero()[0].length; j++) {

                JLabel label = new JLabel();
                label.setOpaque(true);

                if (t.getTablero()[i][j] == 0) {
                    label.setBackground(Color.black);
                } else {

                    label.setBackground(Color.green);

                }
                panel1.add(label);
            }

        }
    }
    
  
    //segundo panel donde sale la figura a salir
    
   

    public void refrescar() {
        panel1.removeAll();
        imprimeTetris();
        revalidate();
    }

    public void control() {

        hilo = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                //todo lo que ponga aqui se va a repetir la cantidad a milisegundos
                if (t.getCaer()) {   //if (tablero.getCaer()) {
                    System.out.println(t.getCaer());
                    t.desciende(figura);
                    refrescar();
                    System.out.println("PRIMERO");
                } else {
                    hilo.stop();
                    figura.crearFigura();

                    t.agregar(figura);
                    t.setCaer(true);
                    refrescar();
                    control();

                }

            }
        });

        hilo.start();
    }

    {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panel1.setLayout(new java.awt.GridLayout(24, 12, 1, 1));

        panel2.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 271, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_RIGHT) {
            t.moverFigura(figura);
        }
         if (evt.getKeyCode() == evt.VK_LEFT) {
            t.moverFiguraIzquierda(figura);
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
