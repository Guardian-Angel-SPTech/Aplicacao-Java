/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sptech.school.guardian.angel.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author aluno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        textoLogin = new javax.swing.JLabel();
        textoEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botaoDeNaoTemLogin = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        imagemDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Guardian Angel");
        setMinimumSize(new java.awt.Dimension(854, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        textoLogin.setBackground(new java.awt.Color(0, 0, 0));
        textoLogin.setFont(new java.awt.Font("URW Palladio L", 1, 24)); // NOI18N
        textoLogin.setForeground(new java.awt.Color(0, 0, 0));
        textoLogin.setText("Login");
        getContentPane().add(textoLogin);
        textoLogin.setBounds(394, 140, 70, 32);

        textoEmail.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        textoEmail.setForeground(new java.awt.Color(0, 0, 0));
        textoEmail.setText("Email:");
        getContentPane().add(textoEmail);
        textoEmail.setBounds(320, 200, 50, 20);
        textoEmail.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ainda não possui Login?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 330, 140, 20);

        inputEmail.setBackground(new java.awt.Color(204, 204, 204));
        inputEmail.setForeground(new java.awt.Color(0, 0, 0));
        inputEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });
        getContentPane().add(inputEmail);
        inputEmail.setBounds(320, 230, 210, 30);

        botaoEntrar.setBackground(new java.awt.Color(10, 35, 66));
        botaoEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEntrar.setText("Entrar");
        botaoEntrar.setBorder(null);
        botaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar);
        botaoEntrar.setBounds(380, 380, 90, 30);

        jLabel2.setFont(new java.awt.Font("URW Palladio L", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 270, 70, 20);

        botaoDeNaoTemLogin.setBackground(new java.awt.Color(243, 243, 243));
        botaoDeNaoTemLogin.setFont(new java.awt.Font("URW Palladio L", 0, 12)); // NOI18N
        botaoDeNaoTemLogin.setForeground(new java.awt.Color(0, 0, 204));
        botaoDeNaoTemLogin.setText("Clique aqui.");
        botaoDeNaoTemLogin.setBorder(null);
        botaoDeNaoTemLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoDeNaoTemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeNaoTemLoginActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDeNaoTemLogin);
        botaoDeNaoTemLogin.setBounds(460, 330, 70, 20);

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(320, 290, 210, 30);

        imagemDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginFundo.png"))); // NOI18N
        imagemDeFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(imagemDeFundo);
        imagemDeFundo.setBounds(0, -30, 854, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void botaoDeNaoTemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeNaoTemLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDeNaoTemLoginActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        // TODO add your handling code here:
        String emailLogin = inputEmail.getText();
        String senhaLogin = jPasswordField1.getText();
        InformacoesLooca il = new InformacoesLooca();

        if (funcEmailExiste() && funcSenhaExiste()) {
            Main main = new Main();
            main.setVisible(true);

            this.dispose();
        } else {
            ErroLogin erro = new ErroLogin();
            erro.setVisible(true);
        }


    }//GEN-LAST:event_botaoEntrarActionPerformed

        ConexaoMySql conexao = new ConexaoMySql();
        JdbcTemplate con = conexao.getConexao();
        List<Funcionario> infFunc = con.query("SELECT * FROM funcionario", new BeanPropertyRowMapper(Funcionario.class));
        
    public Boolean funcEmailExiste() {
        String emailLogin = inputEmail.getText();
        Boolean existe = false;

        for (Funcionario funcionario : infFunc) {
            if (funcionario.getEmail().equals(emailLogin)) {
                existe = true;
            }
        }
        return existe;
    }

    public Boolean funcSenhaExiste() {
        String senhaLogin = jPasswordField1.getText();
        Boolean existe = false;

        for (Funcionario funcionario : infFunc) {
            if (funcionario.getSenha().equals(senhaLogin)) {  
                existe = true;
            }
        }
        return existe;
    }

    public List informacoesLogado() {
        List<Funcionario> funcionario = null;
        String emailLogin = inputEmail.getText();
        String senhaLogin = jPasswordField1.getText();
        List<Funcionario> infs = con.query
        ("SELECT * FROM funcionario where email = ? " , new BeanPropertyRowMapper(Funcionario.class), emailLogin);
        if (funcEmailExiste() && funcSenhaExiste()) {
            funcionario = infs;
        } 
            return funcionario;  
    }
   public String getEmailLogado(){
       return inputEmail.getText();
   }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDeNaoTemLogin;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel imagemDeFundo;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel textoEmail;
    private javax.swing.JLabel textoLogin;
    // End of variables declaration//GEN-END:variables
}
