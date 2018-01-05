/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.coperation;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akass
 */
public class Display_loan extends javax.swing.JPanel {
    Connection con=null;
    DefaultTableModel dtm=null;
    /**
     * Creates new form Display_loan
     */
    public Display_loan() {
        initComponents();
        con=DBconnection.makeconnection();
        String sql="SELECT * FROM loan WHERE 1=1";
        
        dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0); //its removes the blank table and set rows to zero.
                
                try{
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(sql);
                     int i=1;
                    while(rs.next()){
                        dtm.addRow(new Object[]{i++,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
                      
                    }
                    

                   
                }
                catch(Exception e){
                    System.out.println("Query not executed ");
                }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        Search_n = new javax.swing.JTextField();
        Pay = new javax.swing.JLabel();
        ref = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1100, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 710));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "S.No", "Account ID", "Name", "Issue Date", "Loan Amount", "Rate", "Duration", "Interest", "Tota Amount", "Date for Payment", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(1).setMinWidth(80);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(3).setMinWidth(120);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(5).setMinWidth(40);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(6).setMinWidth(60);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(9).setMinWidth(120);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(9).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(10).setMinWidth(60);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(10).setMaxWidth(60);
        }

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Pay.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        Pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookIssue.png"))); // NOI18N
        Pay.setText("Paid");
        Pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PayMouseExited(evt);
            }
        });

        ref.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        ref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        ref.setText("Refresh");
        ref.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refMouseExited(evt);
            }
        });

        Title.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 0, 0));
        Title.setText("Loan List");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bar1.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search_n, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search))
                    .addComponent(jScrollPane1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ref, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(Pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search_n, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        //Filtering code
        String name=Search_n.getText();
        String sql="SELECT * FROM loan WHERE 1=1"; //this selects all the rows
        if(!"".equals(name)){
            sql+=" AND Name LIKE '"+name+"%'"; //if blank will not return anything
            //displaying filtered names
            con=DBconnection.makeconnection();
            dtm=(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0); //its removes the blank table and set rows to zero.

            try{
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                int i=1;
                while(rs.next()){
                    dtm.addRow(new Object[]{i++,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});

                }
            }
            catch(Exception e){
                System.out.println("Query not executed");
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void PayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseClicked

        //using mouse to delete the data permanently

        int noofselectedrows= jTable1.getSelectedRowCount();

        if(noofselectedrows>0){
            int rowno=jTable1.getSelectedRow();

            // System.out.println(rowno); // kati no ko row select bhayo bhanera dekhauchha
            Object aid=jTable1.getValueAt(rowno, 1);//this line gies the id of the table like 1,2,3
            int confirmdelete=JOptionPane.showConfirmDialog(this, "Are you sure loan is Paid?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
            //System.out.println(confirmdelete);
            //   System.out.println(cid);
            
            String sql="DELETE FROM loan WHERE AID='"+aid+"'";
            String sql2="UPDATE loan_history SET Payment='Paid' WHERE AID='"+aid+"'";
            if(confirmdelete==0){
                dtm.removeRow(rowno);//this removable is remoaved by the model
                /* int count=0;
                 try{
                    //counthing total members from active accounts
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("SELECT * FROM account WHERE Status='Active'");
                    while(rs.next()){
                        count++;
                    }          
                     System.out.println(count);
                }catch(Exception e){
                    System.out.println("query not executed");
                }
                try{
                    //now this step is to access interest collected from table capital
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("SELECT * FROM capital WHERE Name='Capital'");
                    Double interest = 0.0,share=0.0;
                    while(rs.next()){
                        interest=rs.getDouble(5);
                    }
                    share=interest/count;
                    
                    
                    //inserting into active a/c shares
                    st.execute("UPDATE account SET Share=Share+"+new DecimalFormat(".0").format(share)+" WHERE Status='Active'");                 
                }catch(Exception e){
                    System.out.println("query not executed");
                }*/
                try{
                    //now this step is to update in database aswell
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("SELECT * FROM loan WHERE Aid='"+aid+"'");
                    Double interest = 0.0,amount=0.0;
                    while(rs.next()){
                        interest=rs.getDouble(8);
                        amount=rs.getDouble(5);
                    }
                    System.out.println(interest);
                    //inserting into interest received/ interest collected
                    st.execute("UPDATE capital SET Interest_collected=Interest_collected+"+interest+" WHERE Name='Capital'");
                    st.execute("UPDATE capital SET Fol=Fol-"+amount+" WHERE Name='Capital'");
                    st.execute("UPDATE capital SET Itbc=Itbc-"+interest+" WHERE Name='Capital'");
              
                  //now this step is to delete prmanently in database aswell
                    st.executeUpdate(sql);
                    st.executeUpdate(sql2);
                    
                }catch(Exception e){
                    System.out.println("query not executed");
                }
               
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please select a record", "Alert",JOptionPane.PLAIN_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_PayMouseClicked

    private void refMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseClicked
        HomeFrame.changePanel(new Display_loan());        // TODO add your handling code here:
    }//GEN-LAST:event_refMouseClicked

    private void PayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseEntered
        Pay.setOpaque(true);
        Pay.setBackground(Color.pink);         // TODO add your handling code here:
    }//GEN-LAST:event_PayMouseEntered

    private void PayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseExited
        Pay.setBackground(Color.white);
        Pay.setOpaque(false);        // TODO add your handling code here:
    }//GEN-LAST:event_PayMouseExited

    private void refMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseEntered
        ref.setOpaque(true);
        ref.setBackground(Color.pink);         // TODO add your handling code here:
    }//GEN-LAST:event_refMouseEntered

    private void refMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseExited
        ref.setBackground(Color.white);
        ref.setOpaque(false);         // TODO add your handling code here:
    }//GEN-LAST:event_refMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pay;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Search_n;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ref;
    // End of variables declaration//GEN-END:variables
}
