/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherPackage;

import connectionPackage.DBconnection;
import static connectionPackage.DBconnection.connect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author halla
 */
public class TitleQuiz extends javax.swing.JFrame {
    String user;
    /**
     * Creates new form TitleQuiz
     */
    public TitleQuiz() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }
    public TitleQuiz(String user) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        this.user=user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextFTitleExam = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ADDBTN = new javax.swing.JButton();
        CANCELBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1965, 1080));

        jPanel1.setLayout(null);

        TextFTitleExam.setIcon(new javax.swing.ImageIcon("C:\\Users\\halla\\Desktop\\TitleQuizzes.png")); // NOI18N
        TextFTitleExam.setText("jLabel1");
        jPanel1.add(TextFTitleExam);
        TextFTitleExam.setBounds(0, 0, 1965, 768);

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(700, 250, 440, 40);

        ADDBTN.setText("jButton1");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ADDBTN);
        ADDBTN.setBounds(813, 350, 230, 80);

        CANCELBTN.setText("jButton2");
        CANCELBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELBTNActionPerformed(evt);
            }
        });
        jPanel1.add(CANCELBTN);
        CANCELBTN.setBounds(820, 470, 220, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public int getID(String user) {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Teacher_Account WHERE TA_Username = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return rs.getInt("TA_ID");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error");
            System.out.println(e);
        }

        return 0;
    }
    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        try {
            Connection con = DBconnection.connect();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM QuizesTitle WHERE TA_ID = ? AND QT_Title = ?");
            int mama= getID(user);
            pst.setInt(1,mama);
            pst.setString(2, TextFTitleExam.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Title Already Exist");
                return;
            } else {
                pst.close();
                rs.close();
                pst = con.prepareStatement("INSERT INTO QuizesTitle(TA_ID,QT_Title) VALUES(?,?)");
                pst.setInt(1,  mama);
                pst.setString(2, TextFTitleExam.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Success2");
                AddExamWithTitleFrame exam = new AddExamWithTitleFrame(user,TextFTitleExam.getText());
                exam.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void CANCELBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELBTNActionPerformed
        TeacherHomeFrame home = new TeacherHomeFrame();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CANCELBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TitleQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitleQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitleQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitleQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JButton CANCELBTN;
    private javax.swing.JLabel TextFTitleExam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
