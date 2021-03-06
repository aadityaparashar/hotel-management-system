
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srlab14
 */
public class AvailableRooms extends javax.swing.JFrame {

    /**
     * Creates new form AvailableRooms
     */
    public AvailableRooms() {
        initComponents();
    }

public static Connection getConnection() throws ClassNotFoundException {

    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7240131","sql7240131","AP6aPLz3tL");
        return con;
    }

    catch(Exception e){
        System.out.println(e.getMessage());
        return null;
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(1080, 900));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Customer Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 440, 130, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Details:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 210, 130, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "Delux", "Suite", "Cottage", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(260, 350, 105, 27);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Fare"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(540, 230, 530, 210);

        jButton1.setText("Check Avaibility");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 390, 330, 29);

        jButton2.setText("Book Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 440, 120, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Room Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 340, 130, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 440, 80, 26);

        jLabel6.setText("Arrival Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 260, 74, 16);

        jLabel7.setText("Departure Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 300, 95, 16);

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        jLabel2.setText("The Tropical");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 320, 60);

        jLabel8.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jLabel8.setText("AP Group of Hotels");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 70, 140, 15);

        jButton3.setText("Back to Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 530, 130, 29);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(170, 250, 230, 26);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(170, 290, 230, 26);

        jButton4.setText("Check Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(270, 480, 110, 29);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(180, 480, 80, 26);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Room No.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 480, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        DefaultTableModel model=(DefaultTableModel)
        jTable1.getModel();
        model.getDataVector().removeAllElements();
    
        try{
            Connection con = getConnection();
            Statement stmt=(Statement) con.createStatement();
            String query="";
            if (jComboBox1.getSelectedIndex()==0){
                query="Select RoomNo, Roomtype, fare From roombooking where booked='no';";
            }
            if (jComboBox1.getSelectedIndex()==1){
                query="Select RoomNo, Roomtype, fare From roombooking where Roomtype='Deluxe' and booked='no';";
            }
            if (jComboBox1.getSelectedIndex()==2){
                query="Select RoomNo, Roomtype, fare From roombooking where Roomtype='Suite' and booked='no';";
            }
            if (jComboBox1.getSelectedIndex()==3){
                query="Select RoomNo, Roomtype, fare From roombooking where Roomtype='Cottage' and booked='no';";
            } 
     
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                String RoomNo=rs.getString("RoomNo");    
                String Roomtype=rs.getString("Roomtype");
                String fare=rs.getString("fare");
                model.addRow(new Object[] {RoomNo,Roomtype,fare});
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        int i = jTable1.getSelectedRow();
        Object a = jTable1.getValueAt(i,0);
        String b= a.toString();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String arrival= sdf.format(jDateChooser1.getDate());
        String departure = sdf.format(jDateChooser2.getDate());
        System.out.println(departure);
        System.out.println(arrival);
        String customerid=jTextField1.getText();
        try{
            Connection con = getConnection();
            Statement stmt =(Statement) con.createStatement();
            String query="select * from CustomerRegistration where CustomerId='"+customerid+"';";
            ResultSet rs=stmt.executeQuery(query);

            if (rs.next()){
            try{
                Connection con1 = getConnection();
                Statement stmt1=(Statement) con.createStatement();
                Statement stmt2=(Statement) con.createStatement();
                Statement stmt3=(Statement) con.createStatement();
                String query1="Update roombooking set arrivaldate='"+arrival+"' where roomno='"+b+"';";
                String query2= "Update roombooking set departuredate='"+departure+"' where roomno='"+b+"';";
                String query3= "Update roombooking set booked='yes' where roomno='"+b+"';";
                stmt1.executeUpdate(query1);
                stmt2.executeUpdate(query2);
                stmt3.executeUpdate(query3);
                JOptionPane.showMessageDialog(this, "room has been booked");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }    

            }
            else{    
                JOptionPane.showMessageDialog(this, "Please enter a valid customerid or register a new one from Customer Registration Page");
            }
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        DefaultTableModel model=(DefaultTableModel)
        jTable1.getModel();
        model.setRowCount(0);
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Home e = new Home();
    e.setVisible(true);
    this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String r = jTextField2.getText(); 
        try{
                Connection con = getConnection();
                Statement stmt =(Statement) con.createStatement();
                String query1="Update roombooking set arrivaldate= NULL where roomno='"+r+"';";
                String query2= "Update roombooking set departuredate=NULL where roomno='"+r+"';";
                String query3= "Update roombooking set booked='no' where roomno='"+r+"';";
                String query4= "Update roombooking set cleaned='no' where roomno='"+r+"';";
                stmt.executeUpdate(query1);
                stmt.executeUpdate(query2);
                stmt.executeUpdate(query3);
                stmt.executeUpdate(query4);
                JOptionPane.showMessageDialog(this, "The room has been checked out");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    DefaultTableModel model=(DefaultTableModel)
    jTable1.getModel();
    model.setRowCount(0);
    jTextField1.setText("");
    jTextField2.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailableRooms().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
