package mx.com.fca.unam.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import static mx.com.fca.unam.constants.CommonConstants.EMPTY;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.service.GetUserService;

public class ECommerceView1 extends javax.swing.JFrame {
    
    private GetUserService getUserService;
    private ECommerceViewBuild eCommerceViewBuild;
    private ECommerceView2 eCommerceView2;
    
    public ECommerceView1() {
        getUserService = new GetUserService();
        eCommerceViewBuild =  new ECommerceViewBuild();
        eCommerceView2 = new ECommerceView2();
        
        initComponents();
        errorLabel.setVisible(false);
                
        setLocationRelativeTo(null);
        registerUser();
        validateData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        notAccountLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        nameECommerceLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        loginLabel.setText("Iniciar sesión");

        userNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userNameLabel.setText("Nombre de usuario");

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordLabel.setText("Contraseña");

        userTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        enterButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enterButton.setText("Entrar");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        notAccountLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        notAccountLabel.setText("¿No tienes una cuenta?");

        registerButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        registerButton.setText("Registrarse");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        nameECommerceLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nameECommerceLabel.setText("Amazon");

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(253, 0, 0));
        errorLabel.setText("Nombre de usuario y/o contraseña incorrecta. Vuelva a intentarlo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enterButton)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameECommerceLabel)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(notAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nameECommerceLabel)
                .addGap(111, 111, 111)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(enterButton)
                .addGap(18, 18, 18)
                .addComponent(errorLabel)
                .addGap(18, 18, 18)
                .addComponent(notAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel nameECommerceLabel;
    private javax.swing.JLabel notAccountLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables

    
    private void validateData() {
        ActionListener button = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = getUserService.getUser(userTextField.getText(), passwordTextField.getText());
                
                if (Optional.ofNullable(user).isPresent()) {
                    userTextField.setText(EMPTY);
                    passwordTextField.setText(EMPTY);
                    eCommerceViewBuild.setVisible(true);
                } else {
                    errorLabel.setVisible(true);
                }
            }
        };
        enterButton.addActionListener(button);
    }
    
    private void registerUser() {
         ActionListener button = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eCommerceView2.setVisible(true);
            }
        };
        registerButton.addActionListener(button);
    }
    
    
}
