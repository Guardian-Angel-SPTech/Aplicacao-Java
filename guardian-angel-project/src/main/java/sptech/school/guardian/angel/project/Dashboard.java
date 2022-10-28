package sptech.school.guardian.angel.project;

import com.github.britooo.looca.api.core.Looca;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Dashboard extends javax.swing.JFrame {

    private static final int N = 2;
    private static final Random random = new Random();
    private int n = 1;

    private void display() {
        JFrame f = new JFrame("Guardian Angel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JTabbedPane jtp = new JTabbedPane();
        jtp.add("CPU", createPane(1));
        jtp.add("RAM", createPane(2));
        jtp.add("Disco", createPane(3));
        f.add(jtp, BorderLayout.CENTER);
        JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    InformacoesLooca il = new InformacoesLooca();

    private ChartPanel createPane(Integer numero) {
        final XYSeries series = new XYSeries("Data");
        int x = 0;
        Looca looca = new Looca();
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            if (numero == 1) {
                series.add(i, looca.getProcessador().getUso());
            } else if (numero == 2) {
                series.add(i, looca.getMemoria().getEmUso());
            } else {
                series.add(i, 70);
            }
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numero == 1) {
                    series.add(series.getItemCount(), looca.getProcessador().getUso());
                } else if (numero == 2) {
                    series.add(series.getItemCount(), looca.getMemoria().getEmUso());
                } else {
                    series.add(series.getItemCount(), 70);
                }
            }
        }).start();

        JFreeChart chart;

        if (numero == 1) {
            chart = ChartFactory.createXYLineChart("Porcemtagem de uso da CPU", "Leitura",
                    "Medida", dataset, PlotOrientation.VERTICAL , false, false, false);
        } else if (numero == 2) {
            chart = ChartFactory.createXYLineChart("Porcentagem de uso da Memória RAM", "Leitura",
                    "Medida", dataset, PlotOrientation.VERTICAL, false, false, false);
        } else {
            chart = ChartFactory.createXYLineChart("Porcentagem total usado do Disco", "Leitura",
                    "Medida", dataset, PlotOrientation.VERTICAL, false, false, false);
        }

        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(854, 480);
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().display();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
