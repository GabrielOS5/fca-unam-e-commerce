package mx.com.fca.unam.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mx.com.fca.unam.service.user.PostUserService;

public class ECommerceView2 extends javax.swing.JFrame {
    
    private PostUserService postUserService;

    public ECommerceView2() {
        postUserService = new PostUserService();
        
        initComponents();
        registerMessageLabel.setVisible(false);
        setLocationRelativeTo(null);
        registerData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createUserLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        entityFederativeComboBox = new javax.swing.JComboBox<>();
        entityFederativeLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        nameECommerceLabel = new javax.swing.JLabel();
        registerMessageLabel = new javax.swing.JLabel();
        typeUserLabel = new javax.swing.JLabel();
        typeUserComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createUserLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        createUserLabel.setText("Crear usuario");

        userNameLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userNameLabel.setText("Nombre de usuario");

        emailLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailLabel.setText("Correo electrónico");

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordLabel.setText("Contraseña");

        entityFederativeComboBox.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        entityFederativeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Ciudad de México", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        entityFederativeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entityFederativeComboBoxActionPerformed(evt);
            }
        });

        entityFederativeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        entityFederativeLabel.setText("Entidad federativa");

        phoneLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        phoneLabel.setText("Teléfono");

        userTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        emailTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        passwordTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        phoneTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        nameECommerceLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nameECommerceLabel.setText("Amazon");

        registerMessageLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        registerMessageLabel.setForeground(new java.awt.Color(51, 204, 0));
        registerMessageLabel.setText("Usuario registrado correctamente");

        typeUserLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        typeUserLabel.setText("Tipo de usuario");

        typeUserComboBox.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        typeUserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Operador" }));
        typeUserComboBox.setToolTipText("");
        typeUserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeUserComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(createUserLabel)
                        .addGap(172, 172, 172))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveButton)
                            .addGap(222, 222, 222))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameLabel)
                                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(passwordTextField)
                                            .addGap(42, 42, 42)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(entityFederativeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(entityFederativeLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(typeUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typeUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameECommerceLabel)
                .addGap(251, 251, 251))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(registerMessageLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameECommerceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(createUserLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entityFederativeLabel)
                    .addComponent(typeUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entityFederativeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(registerMessageLabel)
                .addGap(49, 49, 49))
        );

        emailTextField.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entityFederativeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entityFederativeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entityFederativeComboBoxActionPerformed

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed

    }//GEN-LAST:event_userTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void typeUserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeUserComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeUserComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createUserLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> entityFederativeComboBox;
    private javax.swing.JLabel entityFederativeLabel;
    private javax.swing.JLabel nameECommerceLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel registerMessageLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> typeUserComboBox;
    private javax.swing.JLabel typeUserLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
    
    private void registerData() {
        ActionListener button = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag = postUserService.saveUser(userTextField.getText(), 
                        emailTextField.getText(), 
                        passwordTextField.getText(),
                        phoneTextField.getText(), 
                        entityFederativeComboBox.getSelectedItem().toString(),
                        typeUserComboBox.getSelectedItem().toString());
                
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                        
                }
                setVisible(false);
            }
        };
        saveButton.addActionListener(button);
    }
}
