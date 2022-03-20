import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;


public class Inicio extends javax.swing.JFrame {
    
    public static String nombre="";
    private static Scanner sc;
    private static String user, pass;
    private static int intentos;
    //Image icono = Toolkit.getDefaultToolkit().getImage("D:\\Usuarios\\Giovanni Carrillo\\Descargas\\icono50.png");  


    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setIconImage(icono);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInicS = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        btnInicS1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnInicS2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 229, 228));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btnInicS.setBackground(new java.awt.Color(255, 255, 255));
        btnInicS.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        btnInicS.setText("Iniciar Sesión");
        btnInicS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 195, 176), 2, true));
        btnInicS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicSActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel4.setText("Contraseña");

        txtUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtContra.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraKeyPressed(evt);
            }
        });

        btnInicS1.setBackground(new java.awt.Color(255, 255, 255));
        btnInicS1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        btnInicS1.setText("Registrarse");
        btnInicS1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 195, 176), 2, true));
        btnInicS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicS1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel6.setText("Usuario o correo electrónico");

        btnInicS2.setBackground(new java.awt.Color(255, 255, 255));
        btnInicS2.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        btnInicS2.setText("Salir");
        btnInicS2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 195, 176), 2, true));
        btnInicS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicS2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInicS1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInicS, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInicS2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicS)
                    .addComponent(btnInicS2)
                    .addComponent(btnInicS1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnInicSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicSActionPerformed
        VentanaPrincipalCliete vC = new VentanaPrincipalCliete();
        vC.setVisible(true);
        this.setVisible(false);
        
        if( "admin".equals(txtUsuario.getText())){
            CalendarioAdministrador cA = new CalendarioAdministrador();
            cA.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnInicSActionPerformed

    private void txtContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            ValidarDatos();
        }
    }//GEN-LAST:event_txtContraKeyPressed

    private void btnInicS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicS1ActionPerformed
        Registrarse v = new Registrarse();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicS1ActionPerformed

    private void btnInicS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicS2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnInicS2ActionPerformed
    private void ValidarDatos(){
          if(validaCampo(txtUsuario))return;
        if(validaCampo(txtContra))return;     
    }    private boolean validaCampo(JTextField t){
        try{
            estaVacio(t);
        }catch(ProyectoException e){
            showMessageDialog(this,e.getMessage()); t.requestFocus();
            return true;
        }
        return false;
    }
    
    private void estaVacio(JTextField t)throws ProyectoException{
        String cad=t.getText().trim();
        if(cad.equals(""))throw new ProyectoException("Campo vacio");
    }

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicS;
    private javax.swing.JButton btnInicS1;
    private javax.swing.JButton btnInicS2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables


}
