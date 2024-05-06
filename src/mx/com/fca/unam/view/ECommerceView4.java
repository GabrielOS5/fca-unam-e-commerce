package mx.com.fca.unam.view;

import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import static mx.com.fca.unam.constants.CommonConstants.FINAL_TEXT;
import static mx.com.fca.unam.constants.CommonConstants.PIEZA;
import static mx.com.fca.unam.constants.CommonConstants.KILOGRAMO;
import static mx.com.fca.unam.constants.CommonConstants.EAN;
import static mx.com.fca.unam.constants.CommonConstants.DESCRIPTION;
import static mx.com.fca.unam.constants.CommonConstants.PRICE;
import static mx.com.fca.unam.constants.CommonConstants.AMMOUNT;
import mx.com.fca.unam.model.OnlineCar;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.service.onlinecar.GetAllOnlineCarService;
import mx.com.fca.unam.service.onlinecar.PostOnlineCarService;
import mx.com.fca.unam.service.product.GetAllProductService;

public class ECommerceView4 extends javax.swing.JFrame {
    
    private final GetAllProductService getAllProductService;
    private final GetAllOnlineCarService getAllOnlineCarService;
    private final PostOnlineCarService postOnlineCarService;
    private final List<Product> products;
    private List<OnlineCar> onlineCars;

    public ECommerceView4() {
        getAllProductService = new GetAllProductService();
        getAllOnlineCarService = new GetAllOnlineCarService();
        postOnlineCarService = new PostOnlineCarService();
        products = getAllProductService.getProducts();
        onlineCars = getAllOnlineCarService.getOnlineCar();
        
        initComponents();
        setLocationRelativeTo(null);
        imputProducts();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(642, 523));

        jTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EAN", "DESCRIPCIÓN", "PRECIO", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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

        jLabelSetTotal.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelSetTotal.setText("$ 0.0 MX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(jComboBoxProduct, 0, 157, Short.MAX_VALUE)
                                    .addComponent(jSpinnerPrice))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelSetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabelSetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
                            .addComponent(userValueLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProduct)
                    .addComponent(jLabelPrice)
                    .addComponent(jComboBoxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSetPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAmount)
                    .addComponent(jTextFieldGetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal)
                    .addComponent(jLabelSetTotal))
                .addGap(43, 43, 43))
        );

        jLabelSetPrice.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        final String name = jComboBoxProduct.getSelectedItem().toString();
        Double account = 0.0;
        final Product product = products.stream()
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
        updatePrice();
        imputPrice();
    }//GEN-LAST:event_jComboBoxProductActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> jComboBoxProduct;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProduct;
    private javax.swing.JLabel jLabelSetPrice;
    private javax.swing.JLabel jLabelSetTotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerPrice;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldGetPrice;
    private javax.swing.JLabel nameECommerceLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userValueLabel;
    // End of variables declaration//GEN-END:variables

    private void imputProducts() {
        updateComboBox(products.stream().map(Product::getDescription).collect(Collectors.toList()));
    }
    
    private void updateTotal(List<OnlineCar> onlineCars) {
        final Double total = onlineCars.stream()
                .mapToDouble(value -> value.getPrice() * value.getAccount())
                .sum();
        jLabelSetTotal.setText(String.format(FINAL_TEXT, total));
    }
    
    public void addInformationUser(User user) {
        userValueLabel.setText(user.getName());
    }
    
    private void updateComboBox(List<String> productsName) {
        productsName.forEach(name -> jComboBoxProduct.addItem(name));
    }
    
    private void updatePrice() {
        String name = jComboBoxProduct.getSelectedItem().toString();
        String value = products.stream()
                .filter(product -> product.getDescription().equalsIgnoreCase(name))
                .findFirst()
                .map(Product::getPrice)
                .map(String::valueOf)
                .orElseThrow();
        
        jLabelSetPrice.setText(String.format(FINAL_TEXT, value));
                
    }
    
    private void imputPrice() {
        String name = jComboBoxProduct.getSelectedItem().toString();
        String value = products.stream()
                .filter(product -> product.getDescription().equalsIgnoreCase(name))
                .findFirst()
                .map(Product::getType)
                .orElse("");
        
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
}
