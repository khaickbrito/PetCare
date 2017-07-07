/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TelaPrincipal;

import Facade.Facade;
import Interface.Busca.BuscarCliente;
import Model.*;
import Interface.*;
import Interface.Cadastro.*;
import Interface.Busca.*;
import Interface.Pefil.*;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author KHAICK O. BRITO
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private Facade facade;
    private String[] aux;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        facade = new Facade();
        aux = new String[30];
        Date data = new Date();
        initComponents();
//        Iterator it = facade.vacinacoesDoDia(data);
//        int i = 0;
//        while (it.hasNext()) {
//            String aux = (String) it.next();
//            this.aux[i] = aux;
//            i++;
//            listaVacinacoes.setListData(this.aux);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVacinacoes = new javax.swing.JList();
        atualizarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastrarMenu = new javax.swing.JMenu();
        cadastrarClienteMenu = new javax.swing.JMenuItem();
        vacina = new javax.swing.JMenuItem();
        buscarMenu = new javax.swing.JMenu();
        buscarClienteMenu = new javax.swing.JMenuItem();
        buscarVacinaMenu = new javax.swing.JMenuItem();
        Animal = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AmigoVet");
        setResizable(false);

        listaVacinacoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaVacinacoes.setToolTipText("");
        listaVacinacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(listaVacinacoes);

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("VACINAÇÕES DO DIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(atualizarButton)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(132, 132, 132))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(atualizarButton)
                .addGap(42, 42, 42))
        );

        cadastrarMenu.setText("Cadastrar");

        cadastrarClienteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        cadastrarClienteMenu.setText("Cliente");
        cadastrarClienteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteMenuActionPerformed(evt);
            }
        });
        cadastrarMenu.add(cadastrarClienteMenu);

        vacina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        vacina.setText("Vacina");
        vacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinaActionPerformed(evt);
            }
        });
        cadastrarMenu.add(vacina);

        jMenuBar1.add(cadastrarMenu);

        buscarMenu.setText("Buscar");
        buscarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuActionPerformed(evt);
            }
        });

        buscarClienteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        buscarClienteMenu.setText("Cliente");
        buscarClienteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteMenuActionPerformed(evt);
            }
        });
        buscarMenu.add(buscarClienteMenu);

        buscarVacinaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        buscarVacinaMenu.setText("Vacina");
        buscarVacinaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVacinaMenuActionPerformed(evt);
            }
        });
        buscarMenu.add(buscarVacinaMenu);

        Animal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        Animal.setText("Animal");
        Animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalActionPerformed(evt);
            }
        });
        buscarMenu.add(Animal);

        jMenuBar1.add(buscarMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuActionPerformed
        
    }//GEN-LAST:event_buscarMenuActionPerformed

    private void buscarVacinaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVacinaMenuActionPerformed
        new BuscarVacina(facade).setVisible(true);
    }//GEN-LAST:event_buscarVacinaMenuActionPerformed

    private void buscarClienteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteMenuActionPerformed
        new BuscarCliente(facade).setVisible(true);
    }//GEN-LAST:event_buscarClienteMenuActionPerformed

    private void AnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalActionPerformed
        new BuscarAnimal(facade).setVisible(true);
    }//GEN-LAST:event_AnimalActionPerformed
    
    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        Date data = new Date();
        Iterator it = facade.vacinacoesDoDia(data);
        int i = 0;
        while (it.hasNext()) {
            String aux = (String) it.next();
            i++;
            i++;
            listaVacinacoes.setListData(this.aux);
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void vacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinaActionPerformed
        new CadastroDeVacina(facade).setVisible(true);
    }//GEN-LAST:event_vacinaActionPerformed

    private void cadastrarClienteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteMenuActionPerformed
        new CadastroDeCliente(facade).setVisible(true);
    }//GEN-LAST:event_cadastrarClienteMenuActionPerformed
    

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Animal;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JMenuItem buscarClienteMenu;
    private javax.swing.JMenu buscarMenu;
    private javax.swing.JMenuItem buscarVacinaMenu;
    private javax.swing.JMenuItem cadastrarClienteMenu;
    private javax.swing.JMenu cadastrarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaVacinacoes;
    private javax.swing.JMenuItem vacina;
    // End of variables declaration//GEN-END:variables
}