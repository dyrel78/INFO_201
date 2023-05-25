/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package milestone3.gui;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.Collection;
import milestone3.dao.ProductCollectionDAO;
import milestone3.domain.*;
import milestone3.helpers.SimpleListModel;

/**
 *
 * @author dyrellumiwes
 */
public class AddProduct extends javax.swing.JDialog {

    private ProductCollectionDAO dao = new ProductCollectionDAO();
    private Product product;
     private boolean editingMode;

    /**
     * Creates new form AddProduct
     */
    public AddProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          txtCategory.setEditable(true);
        //Initialize product data field
        product = new Product();
          editingMode = false;

    }
    
     public AddProduct(Product editedProduct) {
        initComponents();
        txtCategory.setEditable(true);
        this.setModal (true);
        this.setAlwaysOnTop (true);
        
        //Set product data field to resultant parameter
        product = editedProduct;
        editingMode = true;
        
        //param values
        this.txtID.setText(editedProduct.getProductId());
        this.txtName.setText(editedProduct.getName());
        this.txtDescription.setText(editedProduct.getDescription());
        this.txtCategory.getModel().setSelectedItem(editedProduct.getCategory());
        this.txtListPrice.setText(editedProduct.getListPrice().toString());
        this.txtQuantityInStock.setText(editedProduct.getQuantityInStock().toString());
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionPane = new javax.swing.JOptionPane();
        titleAddProduct = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        labelCategory = new javax.swing.JLabel();
        labelListPrice = new javax.swing.JLabel();
        labelQuantityInStock = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtListPrice = new javax.swing.JTextField();
        txtQuantityInStock = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        SimpleListModel categoryDropDown = new SimpleListModel();
        ProductCollectionDAO categoryDao = new ProductCollectionDAO();
        Collection<String> categories = categoryDao.getCategories();  categoryDropDown.updateItems(categories);
        txtCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleAddProduct.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleAddProduct.setText("Product Editor");

        labelID.setText("ID: ");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        labelName.setText("Name:");

        labelDescription.setText("Description:");

        labelCategory.setText("Category:");

        labelListPrice.setText("List Price:");

        labelQuantityInStock.setText("Quantity in Stock");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtDescription);

        txtCategory.setModel(categoryDropDown);
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCategory, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelListPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelQuantityInStock, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(45, 45, 45)
                                .addComponent(btnCancel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtID)
                            .addComponent(txtName)
                            .addComponent(txtCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtListPrice)
                            .addComponent(txtQuantityInStock)
                            .addComponent(jScrollPane3))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 147, Short.MAX_VALUE)
                .addComponent(titleAddProduct)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescription)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelListPrice)
                    .addComponent(txtListPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantityInStock)
                    .addComponent(txtQuantityInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    
                  

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    this.dispose();
    
    // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) /*throws NumberFormatException */ {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        try{
            //Get values from text boxes
            String id = txtID.getText();
            String name = txtName.getText();
            String description = txtDescription.getText();
            String category = (String) txtCategory.getSelectedItem();
            String price = txtListPrice.getText();
            String quantity = txtQuantityInStock.getText();
            
            //Change string --> BigDecimal
            BigDecimal priceBigDecimal = new BigDecimal(price);
            BigDecimal quantityBigDecimal = new BigDecimal(quantity);
            
            //set product data field values
            product.setProductId(id);
            product.setName(name);
            product.setDescription(description);
            product.setCategory(category);
            product.setListPrice(priceBigDecimal);
            product.setQuantityInStock(quantityBigDecimal);
            
            //Product id must be unique
            if(dao.searchById(id) != null && !editingMode){
                //Display warning message
                optionPane.showMessageDialog(this, "Product Id must be unique.", "Id is taken!", optionPane.WARNING_MESSAGE);
                
            }else if(id==null || name==null || description==null || category==null ||price==null || quantity==null && !editingMode){
                optionPane.showMessageDialog(this, "Fields can not be blank.", "Error!", optionPane.ERROR_MESSAGE);
            }else{
                //Save product and dispose form
                dao.saveProduct(product);
                dispose();
            }
            
          // throw new NumberFormatException("Custom NumberFormatException");

        }catch (Exception e){
            
           optionPane.showMessageDialog(this,"Price and/or Quantity must be a number!","Error!",optionPane.ERROR_MESSAGE);
        }//catch (NullPointerException ex){
       //  optionPane.showMessageDialog(this, "Fields can not be blank.", "Error!", optionPane.ERROR_MESSAGE);
         //optionPane.showMessageDialog(this, ex.getMessage(), "Error!", optionPane.ERROR_MESSAGE);
        //}
      // dao.saveProduct(product);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_TAB) {
  // consume the key press so that a tab character does not get entered into the text area
  evt.consume();

  // transfer the focus
  txtDescription.transferFocus();
}        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionKeyPressed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelListPrice;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelQuantityInStock;
    private javax.swing.JOptionPane optionPane;
    private javax.swing.JLabel titleAddProduct;
    private javax.swing.JComboBox<String> txtCategory;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtListPrice;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantityInStock;
    // End of variables declaration//GEN-END:variables
}
