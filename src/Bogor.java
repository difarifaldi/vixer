import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Difarifaldi
 */
public class Bogor extends javax.swing.JFrame {

    /**
     * Creates new form Bogor
     */
    public Bogor() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        PPQ = new javax.swing.JTextArea();
        J3 = new javax.swing.JCheckBox();
        J4 = new javax.swing.JCheckBox();
        J5 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        TA = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        TD = new javax.swing.JLabel();
        k2 = new javax.swing.JTextField();
        k1 = new javax.swing.JTextField();
        Kembali = new javax.swing.JButton();
        cek = new javax.swing.JButton();
        cmbPilih = new javax.swing.JComboBox<String>();
        J1 = new javax.swing.JCheckBox();
        J6 = new javax.swing.JCheckBox();
        J2 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PPQ.setColumns(20);
        PPQ.setForeground(new java.awt.Color(153, 153, 0));
        PPQ.setRows(5);
        jScrollPane1.setViewportView(PPQ);

        J3.setText("Masker");

        J4.setText("Rontgen");

        J5.setText("Konsultasi Dokter");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TA.setForeground(new java.awt.Color(153, 153, 0));

        jButton2.setBackground(new java.awt.Color(249, 38, 19));
        jButton2.setText("Keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        k2.setForeground(new java.awt.Color(153, 153, 0));

        k1.setForeground(new java.awt.Color(153, 153, 0));

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        cek.setText("Cek");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });

        cmbPilih.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "(Pilih Rumah Sakit)", "RSUD Cibinong", "RS Azra", "RS Bogor Medical Center", " " }));

        J1.setText("Rapid Test");
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        J6.setText("Hand Sanitizer");

        J2.setText("X-Ray");

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Bogor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("VIXER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J1)
                                    .addComponent(J2)
                                    .addComponent(J3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(J5)
                                            .addComponent(J4)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cek)
                                            .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TD, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TA, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J1)
                            .addComponent(J4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J2)
                            .addComponent(J5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J3)
                            .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J6)
                            .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kembali)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String RS = cmbPilih.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null,"Anda Sudah Terdaftar"+RS);
        System.exit(0);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int response =JOptionPane.showConfirmDialog(this, "Apakah Ingin Keluar", "",JOptionPane.OK_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if(response ==JOptionPane.OK_OPTION){
           System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        int response =JOptionPane.showConfirmDialog(this, "Apakah Ingin Keluar", "",JOptionPane.OK_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if(response ==JOptionPane.OK_OPTION){
            RMH rgf = new RMH();
            rgf.setVisible(true);
            rgf.pack();
            rgf.setLocationRelativeTo(null);
            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_KembaliActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
        String RS = cmbPilih.getSelectedItem().toString();
        String lapor;
        lapor =" ";
        int cek =0;
        if(RS=="(Pilih Rumah Sakit)"){
            JOptionPane.showMessageDialog(null,"Anda Belum Memlilih Rumah Sakit",
                "Warning",JOptionPane.ERROR_MESSAGE);
        }
        if(RS=="RSUD Cibinong"){
            PPQ.setText(lapor+="----------RSUD Cibinong----------"+"\n");

        }
        if(RS=="RS Azra"){
            PPQ.setText(lapor+="----------RS Azra----------"+"\n");

        }
        if(RS=="RS Bogor Medical Center"){
            PPQ.setText(lapor+="-----------RS Bogor Medical Center----------"+"\n");

        }
        if(J1.isSelected()){
            int total;
            total= 500000;
            cek =cek+total;
            PPQ.setText(lapor +=J1.getText()+" Seharga "+" Rp."+total+"\n");
        }
        if(J2.isSelected()){
            int total;
            total= 350000;
            cek =cek+total;
            PPQ.setText(lapor +=J2.getText()+" Seharga "+" Rp."+total+"\n");
        }
        if(J4.isSelected()){
            int total;
            total= 200000;
            cek =cek+total;
            PPQ.setText(lapor +=J4.getText()+" Seharga" +" Rp."+total+"\n");
        }
        if(J5.isSelected()){
            int total;
            total= 50000;
            cek =cek+total;
            PPQ.setText(lapor +=J5.getText()+" Seharga "+" Rp."+total+"\n");
        }
        if(J3.isSelected()){
            int total;
            int jumlah=Integer.parseInt(k1.getText());
            total= 20000*jumlah;
            cek =cek+total;
            PPQ.setText(lapor +=J3.getText()+" Seharga" +" Rp."+total+"\n");
        }
        if(J6.isSelected()){
            int total;
            int jumlah=Integer.parseInt(k2.getText());
            total= 30000*jumlah;
            cek =cek+total;
            PPQ.setText(lapor +=J6.getText()+" Seharga "+" Rp."+total+"\n");
        }
        TA.setText("Total Bayar  = "+cek);
        
    }//GEN-LAST:event_cekActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bogor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bogor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bogor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bogor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bogor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox J1;
    private javax.swing.JCheckBox J2;
    private javax.swing.JCheckBox J3;
    private javax.swing.JCheckBox J4;
    private javax.swing.JCheckBox J5;
    private javax.swing.JCheckBox J6;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextArea PPQ;
    private javax.swing.JTextField TA;
    private javax.swing.JLabel TD;
    private javax.swing.JButton cek;
    private javax.swing.JComboBox<String> cmbPilih;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField k1;
    private javax.swing.JTextField k2;
    // End of variables declaration//GEN-END:variables
}
