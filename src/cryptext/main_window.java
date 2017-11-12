/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptext;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class main_window extends javax.swing.JFrame {

    /**
     * Creates new form main_window
     */
    public main_window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_text_clar = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_text_cifrat = new javax.swing.JTextArea();
        radio_cezar = new javax.swing.JRadioButton();
        radio_playfair = new javax.swing.JRadioButton();
        txt_cheie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radio_cifrare = new javax.swing.JRadioButton();
        radio_descifrare = new javax.swing.JRadioButton();
        radio_vigenere = new javax.swing.JRadioButton();
        btn_procesare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criptare text");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Textul original");

        txt_text_clar.setColumns(20);
        txt_text_clar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_text_clar.setRows(5);
        jScrollPane1.setViewportView(txt_text_clar);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Algoritm : ");

        txt_text_cifrat.setColumns(20);
        txt_text_cifrat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_text_cifrat.setRows(5);
        jScrollPane2.setViewportView(txt_text_cifrat);

        buttonGroup1.add(radio_cezar);
        radio_cezar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio_cezar.setSelected(true);
        radio_cezar.setText("Cezar");

        buttonGroup1.add(radio_playfair);
        radio_playfair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio_playfair.setText("Playfair");

        txt_cheie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_cheie.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cheie :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Textul procesat");
        jLabel5.setToolTipText("");

        buttonGroup2.add(radio_cifrare);
        radio_cifrare.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio_cifrare.setSelected(true);
        radio_cifrare.setText("Cifrare");

        buttonGroup2.add(radio_descifrare);
        radio_descifrare.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio_descifrare.setText("Descifrare");

        buttonGroup1.add(radio_vigenere);
        radio_vigenere.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio_vigenere.setText("Vigenere");

        btn_procesare.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_procesare.setText("Procesare");
        btn_procesare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_procesareMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radio_cezar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radio_playfair)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radio_vigenere)
                                    .addGap(30, 30, 30)
                                    .addComponent(radio_cifrare)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radio_descifrare)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_cheie, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_procesare, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(radio_cezar)
                    .addComponent(radio_playfair)
                    .addComponent(txt_cheie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(radio_vigenere)
                    .addComponent(btn_procesare)
                    .addComponent(radio_cifrare)
                    .addComponent(radio_descifrare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_procesareMouseClicked
        
        if (txt_cheie.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Cheia este vida, trebuie sa introduceti o cheie.", "Criptext",  JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (radio_cezar.isSelected())
           if (radio_cifrare.isSelected())
               txt_text_cifrat.setText(cezar.encrypt(txt_text_clar.getText().toLowerCase(), txt_cheie.getText().length()));
            else
               txt_text_cifrat.setText(cezar.decrypt(txt_text_clar.getText().toLowerCase(), txt_cheie.getText().length()));
        
        if (radio_vigenere.isSelected())
            if (radio_cifrare.isSelected())
             txt_text_cifrat.setText(vigenere.encrypt(txt_text_clar.getText().toUpperCase(),txt_cheie.getText().toUpperCase()));
            else
             txt_text_cifrat.setText(vigenere.decrypt(txt_text_clar.getText().toUpperCase(),txt_cheie.getText().toUpperCase()));   
        
        if (radio_playfair.isSelected())
        {
            String text_clar = txt_text_clar.getText().toLowerCase();
            if ( text_clar.length() % 2 != 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Textul in clar are lungime impara, i se mai adauga un 'q'.", "Criptext",  JOptionPane.INFORMATION_MESSAGE);
                text_clar = text_clar + 'q' ;
                txt_text_clar.setText(text_clar);
            } // pentru a se obtine un text de lungime para.
                     
            playfair x = new playfair();
            x.setKey(txt_cheie.getText());
            x.KeyGen();
            
            if (radio_cifrare.isSelected())
             txt_text_cifrat.setText(x.encryptMessage(text_clar));
            else
             txt_text_cifrat.setText(x.decryptMessage(text_clar));   
            
        }
        
       
    }//GEN-LAST:event_btn_procesareMouseClicked

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
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesare;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radio_cezar;
    private javax.swing.JRadioButton radio_cifrare;
    private javax.swing.JRadioButton radio_descifrare;
    private javax.swing.JRadioButton radio_playfair;
    private javax.swing.JRadioButton radio_vigenere;
    private javax.swing.JTextField txt_cheie;
    private javax.swing.JTextArea txt_text_cifrat;
    private javax.swing.JTextArea txt_text_clar;
    // End of variables declaration//GEN-END:variables
}