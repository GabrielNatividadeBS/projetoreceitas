
package main;

import java.awt.CardLayout;
import java.awt.Color;


public class Main extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());

    
    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu1.moverIniciar(Main.this);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBorda1 = new swing.PainelBorda();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        menu1 = new componente.Menu();
        painelGradiente1 = new com.mycompany.sistemareceitas.menusistema.componente.Painel_Gradiente.PainelGradiente();
        painelGradiente2 = new com.mycompany.sistemareceitas.menusistema.componente.Painel_Gradiente.PainelGradiente();
        abapesquisa = new javax.swing.JTextField();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        jComboBox1 = new javax.swing.JComboBox<>();
        painelMain = new javax.swing.JPanel();
        Inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Adicionar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Remover = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        painelBorda1.setBackground(new java.awt.Color(255, 255, 255));
        painelBorda1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover1.setBackground(new java.awt.Color(66, 134, 244));
        rSButtonHover1.setText("Adicionar");
        rSButtonHover1.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        rSButtonHover1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rSButtonHover1.setIconTextGap(0);
        rSButtonHover1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        painelBorda1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 224, -1));

        rSButtonHover2.setBackground(new java.awt.Color(66, 134, 244));
        rSButtonHover2.setText("Inicio");
        rSButtonHover2.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        rSButtonHover2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rSButtonHover2.setIconTextGap(0);
        rSButtonHover2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        painelBorda1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 224, -1));

        rSButtonHover5.setBackground(new java.awt.Color(66, 134, 244));
        rSButtonHover5.setText("Remover");
        rSButtonHover5.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        rSButtonHover5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rSButtonHover5.setIconTextGap(0);
        rSButtonHover5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });
        painelBorda1.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 224, -1));
        painelBorda1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 566));

        painelGradiente1.setCorFinal(new java.awt.Color(55, 73, 105));
        painelGradiente1.setCorInicial(new java.awt.Color(66, 134, 244));
        painelGradiente1.setRaioBorda(0);
        painelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelBorda1.add(painelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, 813, -1));

        painelGradiente2.setCorFinal(new java.awt.Color(66, 143, 224));
        painelGradiente2.setCorInicial(new java.awt.Color(66, 134, 244));
        painelGradiente2.setRaioBorda(0);

        abapesquisa.setBackground(new java.awt.Color(66, 134, 244));
        abapesquisa.setFont(new java.awt.Font("Raleway Light", 2, 14)); // NOI18N
        abapesquisa.setForeground(new java.awt.Color(255, 255, 255));
        abapesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        abapesquisa.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        abapesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abapesquisaActionPerformed(evt);
            }
        });

        rSButtonHover6.setBackground(new java.awt.Color(66, 121, 204));
        rSButtonHover6.setText("Buscar");
        rSButtonHover6.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        rSButtonHover6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rSButtonHover6.setIconTextGap(0);
        rSButtonHover6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(66, 121, 204));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Doce", "Salgado", "Almoço", "Janta" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelGradiente2Layout = new javax.swing.GroupLayout(painelGradiente2);
        painelGradiente2.setLayout(painelGradiente2Layout);
        painelGradiente2Layout.setHorizontalGroup(
            painelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradiente2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(abapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        painelGradiente2Layout.setVerticalGroup(
            painelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGradiente2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(painelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(abapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        painelBorda1.add(painelGradiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 820, -1));

        painelMain.setBackground(new java.awt.Color(255, 255, 255));
        painelMain.setLayout(new java.awt.CardLayout());

        Inicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Raleway ExtraBold", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagina 1");

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        painelMain.add(Inicio, "inicio");

        Adicionar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Raleway ExtraBold", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pagina 2");

        javax.swing.GroupLayout AdicionarLayout = new javax.swing.GroupLayout(Adicionar);
        Adicionar.setLayout(AdicionarLayout);
        AdicionarLayout.setHorizontalGroup(
            AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        AdicionarLayout.setVerticalGroup(
            AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        painelMain.add(Adicionar, "adicionar");

        Remover.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Raleway ExtraBold", 3, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pagina 3");

        javax.swing.GroupLayout RemoverLayout = new javax.swing.GroupLayout(Remover);
        Remover.setLayout(RemoverLayout);
        RemoverLayout.setHorizontalGroup(
            RemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        RemoverLayout.setVerticalGroup(
            RemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        painelMain.add(Remover, "remover");

        painelBorda1.add(painelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 110, 815, 456));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        CardLayout card = (CardLayout) painelMain.getLayout();
        card.show(painelMain, "adicionar");
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        CardLayout card = (CardLayout) painelMain.getLayout();
        card.show(painelMain, "inicio");
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void abapesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abapesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abapesquisaActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        CardLayout card = (CardLayout) painelMain.getLayout();
        card.show(painelMain, "remover");
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adicionar;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel Remover;
    private javax.swing.JTextField abapesquisa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private componente.Menu menu1;
    private swing.PainelBorda painelBorda1;
    private com.mycompany.sistemareceitas.menusistema.componente.Painel_Gradiente.PainelGradiente painelGradiente1;
    private com.mycompany.sistemareceitas.menusistema.componente.Painel_Gradiente.PainelGradiente painelGradiente2;
    private javax.swing.JPanel painelMain;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    // End of variables declaration//GEN-END:variables
}
