/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinalpoo;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IGOR BATISTA
 */
public class CadDefensor extends javax.swing.JFrame {

    static Object getcadDef() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Defensor a = new Defensor();
    
    private static CadDefensor uniCadDef;
    
    public static CadDefensor getCadDef() {
        if (uniCadDef == null) {
            uniCadDef = new CadDefensor();
        }
        return uniCadDef;
    }
    /**
     * Creates new form cadDef
     */
    public CadDefensor() {
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

        rotNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rotNumCamisa = new javax.swing.JLabel();
        cxNumCamisa = new javax.swing.JTextField();
        rotAltura = new javax.swing.JLabel();
        cxAltura = new javax.swing.JTextField();
        rotPeso = new javax.swing.JLabel();
        cxPeso = new javax.swing.JTextField();
        rotAPosicao = new javax.swing.JLabel();
        cxPosicao = new javax.swing.JTextField();
        rotClube = new javax.swing.JLabel();
        cxClube = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotNome.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rotNome.setText("NOME");
        rotNome.setAlignmentX(0.5F);

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        rotNumCamisa.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rotNumCamisa.setText("NUMERO");
        rotNumCamisa.setAlignmentX(0.5F);

        cxNumCamisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumCamisaActionPerformed(evt);
            }
        });

        rotAltura.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rotAltura.setText("PESO");
        rotAltura.setAlignmentX(0.5F);

        cxAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAlturaActionPerformed(evt);
            }
        });

        rotPeso.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rotPeso.setText("ALTURA");
        rotPeso.setAlignmentX(0.5F);

        cxPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPesoActionPerformed(evt);
            }
        });

        rotAPosicao.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rotAPosicao.setText("POSICAO");
        rotAPosicao.setAlignmentX(0.5F);

        cxPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPosicaoActionPerformed(evt);
            }
        });

        rotClube.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rotClube.setText("CLUBE");
        rotClube.setAlignmentX(0.5F);

        cxClube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClubeActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotClube)
                            .addGap(18, 18, 18)
                            .addComponent(cxClube))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotAPosicao)
                            .addGap(18, 18, 18)
                            .addComponent(cxPosicao))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotAltura)
                            .addGap(18, 18, 18)
                            .addComponent(cxPeso))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotPeso)
                            .addGap(18, 18, 18)
                            .addComponent(cxAltura))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotNome)
                            .addGap(18, 18, 18)
                            .addComponent(cxNome))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotNumCamisa)
                            .addGap(18, 18, 18)
                            .addComponent(cxNumCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 30, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotNumCamisa)
                    .addComponent(cxNumCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotPeso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rotAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cxPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rotAPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cxPosicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotClube)
                    .addComponent(cxClube, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxClubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClubeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClubeActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consDefNum();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        insDef();
        limpar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        altDefNum();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excDefNum();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void cxNumCamisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumCamisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumCamisaActionPerformed

    private void cxAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAlturaActionPerformed

    private void cxPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPesoActionPerformed

    private void cxPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPosicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPosicaoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

   public void excDefNum(){
       a = new Defensor();
       a.setNumCamisa(Integer.parseInt(cxNumCamisa.getText()));
       
       a = BancoDefensor.getBancoDefensor().delDefNum(a);
       
       if(a != null){
           JOptionPane.showMessageDialog(
                   null,
                   "Numero de camisa nao cadastrado",
                   "Ecluindo Jogador",
                   1
           );
       }
       else{
            JOptionPane.showMessageDialog(
                null,
                "Defensor EXCLUIDO com sucesso",
                "Excluindo de Jogador",
                1
            );     
       }
       limpar();
   }
    /**
     *
     */
    public void consDefNum(){
        
        a = new Defensor();
        a.setNumCamisa(Integer.parseInt(cxNumCamisa.getText()));
         
        a = BancoDefensor.getBancoDefensor().consDefNum(a);
        
        
        if(a != null){
            cxNumCamisa.setText(Integer.toString(a.getNumCamisa()));
            cxNome.setText(a.getNome());
            cxAltura.setText(Integer.toString((int) a.getAltura()));
            cxPeso.setText(Integer.toString((int) a.getPeso()));
            cxPosicao.setText(a.getPosicao());
            
            
            JOptionPane.showMessageDialog(
                    null,
                    "Defensor encontrado com sucesso!",
                    "Consulta de Defensor",
                    1
            
                );
            }
            else{
                JOptionPane.showMessageDialog(
                    null,
                        "Camisa nao encontrada",
                        "Consulta de Defensor",
                        1
                );    
            }
            limpar();    
    
    }
    
    public void altDefNum(){
        a = new Defensor();
        a.setNumCamisa(Integer.parseInt(cxNumCamisa.getText()));
        
        a = BancoDefensor.getBancoDefensor().altDefNum(a);
        
        if(a != null){
            
            cxNumCamisa.setText(Integer.toString(a.getNumCamisa()));
            cxNome.setText(a.getNome());
            cxAltura.setText(Integer.toString((int) a.getAltura()));
            cxPeso.setText(Integer.toString((int) a.getPeso()));
            cxPosicao.setText(a.getPosicao());
           
            
            JOptionPane.showMessageDialog(
                    null,
                    "Defensor alterado com sucesso!",
                    "Alteracao de Defensor",
                    1
            
                );
            }
        else{
            JOptionPane.showMessageDialog(
                    null,
                        "Camisa nao encontrada",
                        "Consulta de Defensor",
                        1
            );
        }
        limpar();
        
    }
    public void insDef(){
        a = new Defensor();
        a.setNumCamisa(Integer.parseInt(cxNumCamisa.getText()));
        a.setNome(cxNome.getText());
        a.setAltura(Double.parseDouble(cxAltura.getText()));
        a.setPeso(Double.parseDouble(cxPeso.getText()));
        a.setPosicao(cxPosicao.getText());
        
        
        a = BancoDefensor.getBancoDefensor().cadDef(a);
        
        if(a != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Defensor cadastrada com sucesso!",
                    "Cadastro de Defensor",
                    1
            );     
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "NumCamisa DUPLICADO!",
                    "Cadastro de Defensor",
                    1
            );         
        }
    
    }
    public void limpar(){
        cxNumCamisa.setText("");
        cxNome.setText("");
        cxAltura.setText("");
        cxPeso.setText("");
        cxPosicao.setText("");
       
    }
    	public void sair(){
		int confirm = JOptionPane.showConfirmDialog(
				null,
				"Deseja realmente sair",
				"Saida",
				JOptionPane.YES_NO_OPTION
			);

		if(confirm == 0){
			//System.exit(0);
			dispose();
		}
	}
        
        
       
                
            
        
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField cxAltura;
    private javax.swing.JTextField cxClube;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumCamisa;
    private javax.swing.JTextField cxPeso;
    private javax.swing.JTextField cxPosicao;
    private javax.swing.JLabel rotAPosicao;
    private javax.swing.JLabel rotAltura;
    private javax.swing.JLabel rotClube;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNumCamisa;
    private javax.swing.JLabel rotPeso;
    // End of variables declaration//GEN-END:variables
}