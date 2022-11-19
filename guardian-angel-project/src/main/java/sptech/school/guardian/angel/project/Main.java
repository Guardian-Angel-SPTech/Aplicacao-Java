package sptech.school.guardian.angel.project;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        printInfos();

    }

    List<Sistema> sistemasAbertos = new ArrayList();
    List<Dashboard> dashAbertos = new ArrayList();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoBemVindo = new javax.swing.JLabel();
        mudarNome = new javax.swing.JLabel();
        textoStatus = new javax.swing.JLabel();
        textoCPU = new javax.swing.JLabel();
        statusCPU = new javax.swing.JLabel();
        textoRAM = new javax.swing.JLabel();
        statusRAM = new javax.swing.JLabel();
        textDisco = new javax.swing.JLabel();
        statusDisco = new javax.swing.JLabel();
        mainLogo = new javax.swing.JLabel();
        mainBotaoPropiedades = new javax.swing.JButton();
        mainBotaoSair = new javax.swing.JButton();
        textoProcessos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        processoTextArea = new javax.swing.JTextArea();
        mainBotaoDash = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Guardian Angel");
        setMinimumSize(new java.awt.Dimension(854, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 153, 153)));

        textoBemVindo.setForeground(new java.awt.Color(0, 0, 0));
        textoBemVindo.setText("Seja bem vindo");

        mudarNome.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        mudarNome.setForeground(new java.awt.Color(0, 0, 0));
        mudarNome.setText("NOME");

        textoStatus.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        textoStatus.setForeground(new java.awt.Color(0, 0, 0));
        textoStatus.setText("Status:");

        textoCPU.setForeground(new java.awt.Color(0, 0, 0));
        textoCPU.setText("CPU:");

        statusCPU.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        statusCPU.setForeground(new java.awt.Color(0, 0, 0));
        statusCPU.setText("Bom/Ok/Péssimo");

        textoRAM.setForeground(new java.awt.Color(0, 0, 0));
        textoRAM.setText("RAM:");

        statusRAM.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        statusRAM.setForeground(new java.awt.Color(0, 0, 0));
        statusRAM.setText("Bom/Ok/Péssimo");

        textDisco.setForeground(new java.awt.Color(0, 0, 0));
        textDisco.setText("Disco :");

        statusDisco.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        statusDisco.setForeground(new java.awt.Color(0, 0, 0));
        statusDisco.setText("Vazio/Médio/Cheio");

        mainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo200x200.png"))); // NOI18N

        mainBotaoPropiedades.setBackground(new java.awt.Color(10, 35, 66));
        mainBotaoPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        mainBotaoPropiedades.setText("Propriedades");
        mainBotaoPropiedades.setBorder(null);
        mainBotaoPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainBotaoPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBotaoPropiedadesActionPerformed(evt);
            }
        });

        mainBotaoSair.setBackground(new java.awt.Color(10, 35, 66));
        mainBotaoSair.setForeground(new java.awt.Color(255, 255, 255));
        mainBotaoSair.setText("Sair");
        mainBotaoSair.setBorder(null);
        mainBotaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainBotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoStatus)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoBemVindo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mudarNome))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(mainLogo)
                            .addGap(25, 25, 25))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(textoRAM)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(statusRAM))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(textoCPU)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(statusCPU))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mainBotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mainBotaoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textDisco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(statusDisco))))
                            .addGap(35, 35, 35)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBemVindo)
                    .addComponent(mudarNome))
                .addGap(48, 48, 48)
                .addComponent(textoStatus)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCPU)
                    .addComponent(statusCPU))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoRAM)
                    .addComponent(statusRAM))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDisco)
                    .addComponent(statusDisco))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainBotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainBotaoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 260, 480);

        textoProcessos.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        textoProcessos.setForeground(new java.awt.Color(0, 0, 0));
        textoProcessos.setText("Processos:");
        getContentPane().add(textoProcessos);
        textoProcessos.setBounds(500, 60, 120, 22);

        processoTextArea.setBackground(new java.awt.Color(204, 204, 204));
        processoTextArea.setColumns(20);
        processoTextArea.setRows(5);
        processoTextArea.setBorder(null);
        processoTextArea.setEnabled(false);
        jScrollPane3.setViewportView(processoTextArea);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(300, 100, 500, 320);

        mainBotaoDash.setBackground(new java.awt.Color(10, 35, 66));
        mainBotaoDash.setForeground(new java.awt.Color(255, 255, 255));
        mainBotaoDash.setText("Dasboard");
        mainBotaoDash.setBorder(null);
        mainBotaoDash.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainBotaoDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBotaoDashActionPerformed(evt);
            }
        });
        getContentPane().add(mainBotaoDash);
        mainBotaoDash.setBounds(730, 20, 90, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void mainBotaoPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBotaoPropiedadesActionPerformed
        // TODO add your handling code here:

        Sistema propriedades = new Sistema();
        sistemasAbertos.add(propriedades);

        for (Sistema sistema : sistemasAbertos) {
            sistema.setVisible(false);
        }

        propriedades.dispose();

        propriedades.setVisible(true);

    }//GEN-LAST:event_mainBotaoPropiedadesActionPerformed

    private void mainBotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBotaoSairActionPerformed
        // TODO add your handling code here:

        Login login = new Login();

        login.setVisible(true);

        timer.cancel();

        this.dispose();

    }//GEN-LAST:event_mainBotaoSairActionPerformed

    private void mainBotaoDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBotaoDashActionPerformed

        Dashboard dash = new Dashboard();

        Boolean trava = true;

        if (trava == true) {
            dash.display();
            trava = false;
        } else {
            dash.dispose();
            trava = true;
        }

    }//GEN-LAST:event_mainBotaoDashActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    InformacoesLooca il = new InformacoesLooca();
    Timer timer = new Timer();
    Looca looca = new Looca();
    ProcessoGrupo processoGrupo = looca.getGrupoDeProcessos();
    List<Processo> processos = processoGrupo.getProcessos();
    ConexaoAzure conexao = new ConexaoAzure();
    ConexaoMySql conexaoMy = new ConexaoMySql();
    JdbcTemplate conMy = conexaoMy.getConexao();
    JdbcTemplate con = conexao.getConexao();
    Login login = new Login();
    String insertionRam = "INSERT INTO registro(fkMaquina, componente, registroComponente, horaRegistro, dataRegistro) values ( 1, 1, ?, ?, ?)";
    String insertionCPU = "INSERT INTO registro(fkMaquina, componente, registroComponente, horaRegistro, dataRegistro) values (1, 2, ?, ?, ?)";
    String insertionDisco = "INSERT INTO registro(fkMaquina, componente, registroComponente, horaRegistro, dataRegistro) values (1, 3, ?, ?, ?)";
    String insertionProcesso = "INSERT INTO processo(fkMaquina, nomeProcesso, usoCpu, horaRegistro, dataRegistro) values ( 1, ?, ?, ?, ?)";

    public void printInfos() {
        Integer delay = 0;
        Integer intervalo = 1;

        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                while (rootPaneCheckingEnabled) {
                    Date dataHoraAtual = new Date();
                    String data = new SimpleDateFormat("yyyy/MM/dd").format(dataHoraAtual);
                    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
                    String texto = "";
                    processoTextArea.setText(texto);
                    statusCPU.setText(String.format("%.2f%% - %s ", il.processador.getUso(), il.validacaoCPU()));
                    statusRAM.setText(String.format("%.2f%% - %s", il.porcentagemRam(), il.validacaoRam()));
                    statusDisco.setText(String.format("%d%% - %s", il.exibirMemoriaDisco(), il.validacaoVolume()));

                    for (Processo processo : processos) {
                        if (processo.getUsoCpu() >= 5) {
                            texto += String.format("Nome:  %s  \n  Uso da CPU: %.2f \n", processo.getNome(), processo.getUsoCpu());
                            con.update(insertionProcesso, processo.getNome(), processo.getUsoCpu(), hora, data);
                            conMy.update(insertionProcesso, processo.getNome(), processo.getUsoCpu(), hora, data);
                        }
                    }
                    processoTextArea.setText(texto);
                    con.update(insertionRam, il.porcentagemRam(), hora, data);
                    con.update(insertionCPU, il.processador.getUso(), hora, data);
                    con.update(insertionDisco, il.porcentagemRam(), hora, data);

                    conMy.update(insertionRam, il.porcentagemRam(), hora, data);
                    conMy.update(insertionCPU, il.processador.getUso(), hora, data);
                    conMy.update(insertionDisco, il.porcentagemRam(), hora, data);
                    il.timer(7000);
                }

            }
        },
                delay, intervalo
        );
    }

    //timer
    //TimerTask

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mainBotaoDash;
    private javax.swing.JButton mainBotaoPropiedades;
    private javax.swing.JButton mainBotaoSair;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JLabel mudarNome;
    private javax.swing.JTextArea processoTextArea;
    private javax.swing.JLabel statusCPU;
    private javax.swing.JLabel statusDisco;
    private javax.swing.JLabel statusRAM;
    private javax.swing.JLabel textDisco;
    private javax.swing.JLabel textoBemVindo;
    private javax.swing.JLabel textoCPU;
    private javax.swing.JLabel textoProcessos;
    private javax.swing.JLabel textoRAM;
    private javax.swing.JLabel textoStatus;
    // End of variables declaration//GEN-END:variables
}
