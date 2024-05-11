package mx.com.fca.unam.view;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static mx.com.fca.unam.constants.CommonConstants.EMPTY;
import static mx.com.fca.unam.constants.CommonConstants.OPERATOR;
import static mx.com.fca.unam.constants.CommonConstants.FINAL_TEXT;
import static mx.com.fca.unam.constants.CommonConstants.PIEZA;
import static mx.com.fca.unam.constants.CommonConstants.KILOGRAMO;
import static mx.com.fca.unam.constants.CommonConstants.EAN;
import static mx.com.fca.unam.constants.CommonConstants.DESCRIPTION;
import static mx.com.fca.unam.constants.CommonConstants.PRICE;
import static mx.com.fca.unam.constants.CommonConstants.AMMOUNT;
import mx.com.fca.unam.constants.MessagesConstants;
import mx.com.fca.unam.model.OnlineCar;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.service.onlinecar.GetAllOnlineCarService;
import mx.com.fca.unam.service.onlinecar.PostOnlineCarService;
import mx.com.fca.unam.service.onlinecar.PutOnlineCarService;
import mx.com.fca.unam.service.product.GetAllProductService;
import mx.com.fca.unam.service.product.PutProductService;

public class ECommerceView4 extends javax.swing.JFrame {
    
    private final GetAllProductService getAllProductService;
    private final PutProductService putProductService;
    private final GetAllOnlineCarService getAllOnlineCarService;
    private final PostOnlineCarService postOnlineCarService;
    private final PutOnlineCarService putOnlineCarService;
    private List<OnlineCar> onlineCars;

    public ECommerceView4() {
        getAllProductService = new GetAllProductService();
        putProductService = new PutProductService();
        getAllOnlineCarService = new GetAllOnlineCarService();
        postOnlineCarService = new PostOnlineCarService();
        putOnlineCarService = new PutOnlineCarService();
        onlineCars = getAllOnlineCarService.getOnlineCar();
        
        initComponents();
        setLocationRelativeTo(null);
        activeUpdate(false);
        showProducts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelProduct = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jComboBoxProduct = new javax.swing.JComboBox<>();
        jLabelSetPrice = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        nameECommerceLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userValueLabel = new javax.swing.JLabel();
        jSpinnerPrice = new javax.swing.JSpinner();
        jTextFieldGetPrice = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jLabelSetTotal = new javax.swing.JLabel();
        typeUserLabel = new javax.swing.JLabel();
        typeUserValueLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        updateProductLabel = new javax.swing.JLabel();
        jTextFieldAmountU = new javax.swing.JTextField();
        jLabelAmountO = new javax.swing.JLabel();
        jTextFieldUpdateProduct = new javax.swing.JTextField();
        typeProductLabel = new javax.swing.JLabel();
        typeProductComboBox = new javax.swing.JComboBox<>();
        activeCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(642, 523));

        jTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EAN", "DESCRIPCIÓN", "TIPO", "PRECIO", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabelProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelProduct.setText("PRODUCTO");

        jLabelAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAmount.setText("CANTIDAD");

        jLabelPrice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPrice.setText("PRECIO");

        jComboBoxProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductActionPerformed(evt);
            }
        });

        jLabelSetPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelSetPrice.setText("PRECIO");

        addButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addButton.setText("Agregar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        nameECommerceLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nameECommerceLabel.setText("Amazon");

        userLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userLabel.setText("Usuario:");

        userValueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userValueLabel.setText("U");

        jSpinnerPrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSpinnerPrice.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jTextFieldGetPrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTotal.setText("TOTAL");
        jLabelTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelSetTotal.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelSetTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSetTotal.setText("$ 0.0 MX");

        typeUserLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        typeUserLabel.setText("Tipo de usuario:");

        typeUserValueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        typeUserValueLabel.setText("U");

        updateButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateButton.setText("Actualizar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        updateProductLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateProductLabel.setText("PRODUCTO");

        jTextFieldAmountU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelAmountO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAmountO.setText("PRECIO");

        jTextFieldUpdateProduct.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        typeProductLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        typeProductLabel.setText("TIPO");

        typeProductComboBox.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        typeProductComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogramo", "Pieza" }));
        typeProductComboBox.setToolTipText("");

        activeCheckbox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        activeCheckbox.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeUserLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeUserValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameECommerceLabel)
                        .addGap(247, 247, 247))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelProduct)
                                    .addComponent(jLabelAmount))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldGetPrice)
                                    .addComponent(jComboBoxProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelSetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(updateProductLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldUpdateProduct)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(updateButton)
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabelSetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(activeCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(typeProductLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelAmountO, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(typeProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldAmountU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameECommerceLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLabel)
                            .addComponent(userValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeUserLabel)
                            .addComponent(typeUserValueLabel))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProduct)
                    .addComponent(jComboBoxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrice)
                    .addComponent(jLabelSetPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAmount)
                    .addComponent(jTextFieldGetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSetTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateProductLabel)
                            .addComponent(jTextFieldUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activeCheckbox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAmountU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAmountO)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeProductLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelSetPrice.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        final String name = jComboBoxProduct.getSelectedItem().toString();
        Double account = 0.0;
        final Product product = getAllProductService.getProducts().stream()
                .filter(value -> value.getDescription().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow();
        
        if (PIEZA.equalsIgnoreCase(product.getType())) {
            account = Double.valueOf(jSpinnerPrice.getValue().toString());
        } else if (KILOGRAMO.equalsIgnoreCase(product.getType())){
            account = Double.valueOf(jTextFieldGetPrice.getText());
        }
        
        boolean flag = postOnlineCarService.saveProductToCar(product, account);
        
        if (flag) {
            showProducts();
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void jComboBoxProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductActionPerformed
        if(Optional.ofNullable(jComboBoxProduct.getSelectedItem()).isPresent()) {
            updatePrice();
            imputPrice();
            setProductName();
        }
    }//GEN-LAST:event_jComboBoxProductActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String productName = jComboBoxProduct.getSelectedItem().toString();
        Product product = getAllProductService.getProducts().stream()
                .filter(value -> value.getDescription().equals(productName))
                .findFirst()
                .orElseThrow();
        String description = jTextFieldUpdateProduct.getText();
        Double price = Double.valueOf(jTextFieldAmountU.getText());
        String type = typeProductComboBox.getSelectedItem().toString();
        boolean isActive = activeCheckbox.isSelected();
        Product newProduct = new Product(description, price, type, isActive);
        
        boolean flag = putProductService.updateProduct(product, newProduct);
        
        if (flag) {
            imputProducts();
            validateOnlineCar(product.getEan(), newProduct, !isActive);
            jTextFieldUpdateProduct.setText(EMPTY);
            jTextFieldAmountU.setText(EMPTY);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activeCheckbox;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> jComboBoxProduct;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelAmountO;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProduct;
    private javax.swing.JLabel jLabelSetPrice;
    private javax.swing.JLabel jLabelSetTotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerPrice;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldAmountU;
    private javax.swing.JTextField jTextFieldGetPrice;
    private javax.swing.JTextField jTextFieldUpdateProduct;
    private javax.swing.JLabel nameECommerceLabel;
    private javax.swing.JComboBox<String> typeProductComboBox;
    private javax.swing.JLabel typeProductLabel;
    private javax.swing.JLabel typeUserLabel;
    private javax.swing.JLabel typeUserValueLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateProductLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userValueLabel;
    // End of variables declaration//GEN-END:variables

    private void imputProducts() {
        updateComboBox(getAllProductService.getProducts().stream().map(Product::getDescription).collect(Collectors.toList()));
    }
    
    private void updateTotal(List<OnlineCar> onlineCars) {
        final Double total = onlineCars.stream()
                .mapToDouble(value -> value.getPrice() * value.getAccount())
                .sum();
        jLabelSetTotal.setText(String.format(FINAL_TEXT, total));
    }
    
    public void addInformationUser(User user) {
        userValueLabel.setText(user.getName());
        typeUserValueLabel.setText(user.getType());
        
        if(OPERATOR.equals(user.getType())) {
            userValueLabel.setText(user.getName());
            typeUserValueLabel.setText(user.getType());
            activeUpdate(false);
        }
        
        imputProducts();
        
    }
    
    private void updateComboBox(List<String> productsName) {
        jComboBoxProduct.removeAllItems();
        productsName.forEach(name -> jComboBoxProduct.addItem(name));
    }
    
    private void updatePrice() {
        String name = jComboBoxProduct.getSelectedItem().toString();
        String value = getAllProductService.getProducts().stream()
                .filter(product -> product.getDescription().equalsIgnoreCase(name))
                .findFirst()
                .map(Product::getPrice)
                .map(String::valueOf)
                .orElseThrow();
        
        jLabelSetPrice.setText(String.format(FINAL_TEXT, value));
                
    }
    
    private void imputPrice() {
        String name = jComboBoxProduct.getSelectedItem().toString();
        String value = getAllProductService.getProducts().stream()
                .filter(product -> product.getDescription().equalsIgnoreCase(name))
                .findFirst()
                .map(Product::getType)
                .orElse(EMPTY);
        
        if (PIEZA.equals(value)) {
            jSpinnerPrice.setVisible(true);
            jTextFieldGetPrice.setVisible(false);
        } else if (KILOGRAMO.equals(value)) {
            jSpinnerPrice.setVisible(false);
            jTextFieldGetPrice.setVisible(true);
        }
                
    }
    
    private void showProducts() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(EAN);
        model.addColumn(DESCRIPTION);
        model.addColumn(PRICE);
        model.addColumn(AMMOUNT);
        
        onlineCars = getAllOnlineCarService.getOnlineCar();
        
        if (!onlineCars.isEmpty()) {
            onlineCars.forEach(onlineCars -> {
            model.addRow(new Object[]{
                onlineCars.getEan(),
                onlineCars.getDescription(),
                onlineCars.getPrice(),
                onlineCars.getAccount()
                });
            });
            updateTotal(onlineCars);
        }
        
        jTable.setModel(model);
    }
    
    private void activeUpdate(boolean flag) {
        updateProductLabel.setVisible(flag);
        jTextFieldUpdateProduct.setVisible(flag);
        jLabelAmountO.setVisible(flag);
        jTextFieldAmountU.setVisible(flag);
        typeProductLabel.setVisible(flag);
        typeProductComboBox.setVisible(flag);
        updateButton.setVisible(flag);
        activeCheckbox.setVisible(flag);
    }
    
    private void setProductName() {
        String name = jComboBoxProduct.getSelectedItem().toString();
        jTextFieldUpdateProduct.setText(name);
    }
    
    private void validateOnlineCar(String ean, Product product, boolean isActive) {
        OnlineCar onlineCar = getAllOnlineCarService.getOnlineCar().stream()
                .filter(value -> value.getEan().equals(ean))
                .findFirst()
                .orElse(null);
        
        if (Objects.nonNull(onlineCar) && isActive) {
            JOptionPane.showMessageDialog(rootPane, String.format(MessagesConstants.REMOVE_PRODUCT, onlineCar.getDescription()));
        }
        
        putOnlineCarService.updateOnlineCar(onlineCar, product, !isActive);
        
        showProducts();
    }
    
}
