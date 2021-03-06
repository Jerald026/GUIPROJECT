/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherPackage;

/**
 *
 * @author Ringo
 */
public class AddExamWithTitleFrame extends javax.swing.JFrame {

    private String user;
    private String title;

    /**
     * Creates new form AddExamWithTitleFrame
     */
    public AddExamWithTitleFrame() {
        initComponents();
    }

    public AddExamWithTitleFrame(String user, String title) {
        this.user = user;
        this.title = title;
        initComponents();
        LabelTitleEXAM.setText(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitleEXAM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QUESTIONSLIST = new javax.swing.JList<>();
        CREATEBTN = new javax.swing.JButton();
        DELETEBTN = new javax.swing.JButton();
        UPDATEBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitleEXAM.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LabelTitleEXAM.setText("TITLE OF THE EXAM HERE");

        QUESTIONSLIST.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(QUESTIONSLIST);

        CREATEBTN.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        CREATEBTN.setText("CREATE QUESTION");
        CREATEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEBTNActionPerformed(evt);
            }
        });

        DELETEBTN.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        DELETEBTN.setText("DELETE QUESTION");
        DELETEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEBTNActionPerformed(evt);
            }
        });

        UPDATEBTN.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        UPDATEBTN.setText("UPDATE QUESTION");
        UPDATEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(LabelTitleEXAM))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CREATEBTN)
                            .addComponent(DELETEBTN)
                            .addComponent(UPDATEBTN))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitleEXAM)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(CREATEBTN)
                        .addGap(18, 18, 18)
                        .addComponent(DELETEBTN)
                        .addGap(18, 18, 18)
                        .addComponent(UPDATEBTN)
                        .addContainerGap(130, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CREATEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEBTNActionPerformed
        CreateQuestionFrame create = new CreateQuestionFrame();
        create.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CREATEBTNActionPerformed

    private void DELETEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEBTNActionPerformed

    private void UPDATEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDATEBTNActionPerformed

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
            java.util.logging.Logger.getLogger(AddExamWithTitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddExamWithTitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddExamWithTitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddExamWithTitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddExamWithTitleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CREATEBTN;
    private javax.swing.JButton DELETEBTN;
    private javax.swing.JLabel LabelTitleEXAM;
    private javax.swing.JList<String> QUESTIONSLIST;
    private javax.swing.JButton UPDATEBTN;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
