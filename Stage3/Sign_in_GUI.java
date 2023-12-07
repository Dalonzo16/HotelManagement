
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Devon
 */
public class Sign_in_GUI extends javax.swing.JFrame {
    private Hotel hotel;
    private static final String fileName = "Guests.csv";
    private static final String delimiter = ",";

    /**
     * Creates new form Sign_in_GUI
     * @param hotel
     */
    public Sign_in_GUI(Hotel hotel) {
        initComponents();
        this.hotel = hotel;
        errorMessage.setVisible(false);
        readCSV();
    }

    public Sign_in_GUI() {
        
        initComponents();
        errorMessage.setVisible(false);
        readCSV();
    }
    
    private void readCSV(){
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line = "";
            String[] temp;
            
            while((line = br.readLine()) != null){
                int counter = 1;
                temp = line.split(delimiter);
                for(String filed : temp){
                    
                }
                Reservation reservation = hotel.getAllReservations().get(counter);
                String firstName = temp[0];
                String lastName = temp[1];
                String phoneNumber = temp[2];
                String email = temp[3];
                String creditCardNum = temp[4];
                Guest guest = new Guest(firstName,lastName,phoneNumber,email, creditCardNum, reservation);
                counter++;
                hotel.addGuest(guest);
                System.out.println(hotel.getAllGuests());
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,"Error reading this file");
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

        SignIn_Label = new javax.swing.JLabel();
        employeeId_txt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        employeePW_txt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignIn_Label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SignIn_Label.setText("Sign In");

        employeeId_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeId_txtActionPerformed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Employee ID:");

        jLabel2.setText("Password:");

        errorMessage.setForeground(java.awt.Color.red);
        errorMessage.setText("*incorrect password");

        employeePW_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePW_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(SignIn_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(employeeId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(employeePW_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(loginBtn)))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(SignIn_Label)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(employeeId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeePW_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(errorMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBtn)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeeId_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeId_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeId_txtActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        int employeeID = Integer.parseInt(employeeId_txt.getText());
        String password = String.valueOf(employeePW_txt.getPassword());
        Map<Integer, Employee> employee = hotel.getEmployees();
        Employee anEmployee = employee.get(employeeID);
        Set<Integer> keySet = employee.keySet();
                    
        if(keySet.contains(employeeID)) // if the employee ID exists
        {
            if(anEmployee instanceof Manager) // if the employee is a receptionist or a manager
            {

                if(password.compareTo(employee.get(employeeID).getPassword()) == 0) // if the password is correct
                {
                    ManagerOptionsGUI manager = new ManagerOptionsGUI(hotel);
                    manager.setVisible(true);
                }
                else
                {
                    errorMessage.setVisible(true);
                }
            }
            else if(anEmployee instanceof Receptionist)
            {
                if(password.compareTo(employee.get(employeeID).getPassword()) == 0) // if the password is correct
                {
                    
                }
                else
                {
                    System.out.println("Incorrect password.");
                }
            }
            else if (anEmployee instanceof Employee){
                if(password.compareTo(employee.get(employeeID).getPassword()) == 0) // if the password is correct
                {
                    
                }
                else
                {
                    System.out.println("Incorrect password.");
                }
            }
        }
        else
        {
            System.out.println("User ID does not exist.");
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void employeePW_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeePW_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeePW_txtActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign_in_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_in_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_in_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_in_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_in_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignIn_Label;
    private javax.swing.JTextField employeeId_txt;
    private javax.swing.JPasswordField employeePW_txt;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginBtn;
    // End of variables declaration//GEN-END:variables
}
