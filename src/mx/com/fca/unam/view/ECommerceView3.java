package mx.com.fca.unam.view;

import java.util.UUID;
import javax.swing.JOptionPane;
import static mx.com.fca.unam.constants.MessagesConstants.SAVE_PRODUCT;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.service.product.PostProductService;

public class ECommerceView3 extends javax.swing.JFrame {

    private final PostProductService postProductService;
    
    private final ECommerceView4 eCommerceView4;
    
    private User user;
    
    public ECommerceView3(ECommerceView4 eCommerceView4) {
        postProductService = new PostProductService();
        this.eCommerceView4 = eCommerceView4;
        
        initComponents();
        errorLabel.setVisible(false);
        setLocationRelativeTo(null);
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
        userLabel = new javax.swing.JLabel();
        userValueLabel = new javax.swing.JLabel();
        typeUserLabel = new javax.swing.JLabel();
        typeUserValueLabel = new javax.swing.JLabel();
        showProductsButton = new javax.swing.JButton();
        genereEanButton = new javax.swing.JButton();

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

        priceTextField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        eanTextField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
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

        userLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userLabel.setText("Usuario:");

        userValueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userValueLabel.setText("U");

        typeUserLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        typeUserLabel.setText("Tipo de usuario:");

        typeUserValueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        typeUserValueLabel.setText("U");

        showProductsButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        showProductsButton.setText("VER PRODUCTOS");
        showProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductsButtonActionPerformed(evt);
            }
        });

        genereEanButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        genereEanButton.setText("Generar");
        genereEanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genereEanButtonActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(addButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(createProductLabel)
                                .addGap(171, 171, 171))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(priceLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(priceTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(errorLabel))
                                    .addComponent(eanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(genereEanButton))
                                    .addComponent(eanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descriptionLabel)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(typeProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typeProductLabel)))
                                .addGap(61, 61, 61))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(showProductsButton)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eanLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genereEanButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceLabel)
                            .addComponent(typeProductLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addGap(38, 38, 38)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(showProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
        Double price = 0.0;
        boolean flagError = true;

        try {
            price = Double.valueOf(priceTextField.getText());
        } catch (NumberFormatException ex) {
            flagError = false;
            errorLabel.setVisible(true);
        }

        if (flagError) {

            boolean result = postProductService.saveProduct(eanTextField.getText(),
                    descriptionTextArea.getText(), price,
                    typeProductComboBox.getSelectedItem().toString());

            if (result) {
                errorLabel.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, SAVE_PRODUCT);
                
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void showProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductsButtonActionPerformed
        setVisible(false);
        eCommerceView4.addInformationUser(user);
        eCommerceView4.setVisible(true);
    }//GEN-LAST:event_showProductsButtonActionPerformed

    private void genereEanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genereEanButtonActionPerformed
        eanTextField.setText(UUID.randomUUID().toString());
    }//GEN-LAST:event_genereEanButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel createProductLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel eanLabel;
    private javax.swing.JTextField eanTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton genereEanButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameECommerceLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton showProductsButton;
    private javax.swing.JComboBox<String> typeProductComboBox;
    private javax.swing.JLabel typeProductLabel;
    private javax.swing.JLabel typeUserLabel;
    private javax.swing.JLabel typeUserValueLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userValueLabel;
    // End of variables declaration//GEN-END:variables

    public void addInformationUser(User user) {
        this.user = user;
        userValueLabel.setText(user.getName());
        typeUserValueLabel.setText(user.getType());
    }

}
