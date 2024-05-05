package mx.com.fca.unam.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.service.product.PostProductService;

public class ECommerceView3 extends javax.swing.JFrame {
    

    public ECommerceView3() {
        postProductService = new PostProductService();
        
        initComponents();
        errorLabel.setVisible(false);
        registerMessageLabel.setVisible(false);
        setLocationRelativeTo(null);
        
        registerProduct();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameECommerceLabel = new javax.swing.JLabel();
        createProductLabel = new javax.swing.JLabel();
        eanLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        typeProductLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        eanTextField = new javax.swing.JTextField();
        typeProductComboBox = new javax.swing.JComboBox<>();
        errorLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        registerMessageLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userValueLabel = new javax.swing.JLabel();
        typeUserLabel = new javax.swing.JLabel();
        typeUserValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameECommerceLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nameECommerceLabel.setText("Amazon");

        createProductLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        createProductLabel.setText("Alta de productos");

        eanLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        eanLabel.setText("EAN");

        priceLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        priceLabel.setText("Precio");

        descriptionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        descriptionLabel.setText("Descripción");

        typeProductLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        typeProductLabel.setText("Tipo");

        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        eanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eanTextFieldActionPerformed(evt);
            }
        });

        typeProductComboBox.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        typeProductComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogramo", "Pieza" }));
        typeProductComboBox.setToolTipText("");
        typeProductComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeProductComboBoxActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(253, 0, 0));
        errorLabel.setText("Por favor, ingrese numeros");

        addButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addButton.setText("Agregar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        registerMessageLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        registerMessageLabel.setForeground(new java.awt.Color(51, 204, 0));
        registerMessageLabel.setText("Producto registrado correctamente");

        userLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userLabel.setText("Usuario:");

        userValueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userValueLabel.setText("U");

        typeUserLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        typeUserLabel.setText("Tipo de usuario:");

        typeUserValueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        typeUserValueLabel.setText("U");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeUserLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeUserValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameECommerceLabel)
                        .addGap(244, 244, 244))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(createProductLabel)
                                .addGap(171, 171, 171))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(addButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(registerMessageLabel)))
                                .addGap(139, 139, 139))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(priceLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(typeProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(typeProductLabel)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(errorLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descriptionLabel)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(61, 61, 61))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameECommerceLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLabel)
                            .addComponent(userValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeUserLabel)
                            .addComponent(typeUserValueLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createProductLabel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eanLabel)
                    .addComponent(descriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(typeProductLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addGap(38, 38, 38)
                .addComponent(addButton)
                .addGap(34, 34, 34)
                .addComponent(registerMessageLabel)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void eanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eanTextFieldActionPerformed

    private void typeProductComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeProductComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeProductComboBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel createProductLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel eanLabel;
    private javax.swing.JTextField eanTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameECommerceLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel registerMessageLabel;
    private javax.swing.JComboBox<String> typeProductComboBox;
    private javax.swing.JLabel typeProductLabel;
    private javax.swing.JLabel typeUserLabel;
    private javax.swing.JLabel typeUserValueLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userValueLabel;
    // End of variables declaration//GEN-END:variables
    
    private PostProductService postProductService;
    
    public void addInformationUser(User user) {
        userValueLabel.setText(user.getName());
        typeUserValueLabel.setText(user.getType());
    }
    
    private void registerProduct() {
        ActionListener button = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double price = 0.0;
                boolean flagError = true;
                
                try {
                    price = Double.parseDouble(priceTextField.getText());
                } catch (Exception ex) {
                    flagError = false;
                    errorLabel.setVisible(true);
                }
                
                if (flagError) {
                    
                    boolean result = postProductService.saveProduct(eanTextField.getText(), 
                        descriptionTextArea.getText(), price, 
                        typeProductComboBox.getSelectedItem().toString());
                    registerMessageLabel.setVisible(result);
                    
                    if (result) {
                        errorLabel.setVisible(false);
                        registerMessageLabel.setVisible(true);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {

                        }

                        registerMessageLabel.setVisible(false);
                    }
                }
                
            }
        };
        addButton.addActionListener(button);
        
    }
    
}
