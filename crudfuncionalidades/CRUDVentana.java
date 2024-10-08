package crudfuncionalidades;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CRUDVentana extends javax.swing.JFrame {

    /**
     * Creates new form CRUDVentana
     */
    public CRUDVentana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        readButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FRIENDS PROGRAM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Number");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        readButton.setText("Read");
        readButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(readButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(readButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        try {
                
            String newName = txtName.getText();
            long newNumber = Long.parseLong(txtNumber.getText());
            String name;
            long number;
            String nameNumberString;
            int index;

            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                String[] lineSplit = nameNumberString.split("!");

                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }

            if (found == false) {

                nameNumberString = newName + "!" + String.valueOf(newNumber);

                raf.writeBytes(nameNumberString);

                raf.writeBytes(System.lineSeparator());

                JOptionPane.showMessageDialog(null, "Contacto adicionado",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

                raf.close();
            }

            else {

                raf.close();
                JOptionPane.showMessageDialog(null, "El contacto con ese nombre ya existe",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        catch (IOException ioe) {

            System.out.println(ioe);
        }

        catch (NumberFormatException nef) {

            System.out.println(nef);
        }
    }                                            

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
          
        try {
            
            String newName = txtName.getText();
            
            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                String[] lineSplit = nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                
                if (name.equals(newName)) {
                    found = true;
                    txtNumber.setText(String.valueOf(number));
                    break;
                }                               
                               
            }
        }

            catch (IOException ioe) {

                System.out.println(ioe);
            }
            catch (NumberFormatException nef)
            {

                System.out.println(nef);
            }
    }                                          

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        try {

            String newName = txtName.getText();
            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                String[] lineSplit = nameNumberString.split("!");

                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(newName)) {
                    found = true;
                    break;
                }
            }

            if (found == true) {

                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer()
                        < raf.length()) {

                    nameNumberString = raf.readLine();

                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);

                    if (name.equals(newName)) {

                        continue;
                    }

                    tmpraf.writeBytes(nameNumberString);

                    tmpraf.writeBytes(
                            System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer()
                        < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();

                tmpFile.delete();

                JOptionPane.showMessageDialog(null, "El contacto ha sido eliminado",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }

            else {

                raf.close();

                JOptionPane.showMessageDialog(null, "El contacto no existe",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }                                            

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        txtName.setText("");
        txtNumber.setText("");
    }                                           

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
    
            String nametoUpdate = txtName.getText();
            long numbertoUpdate = Long.parseLong(txtNumber.getText());
            String name;
            long number;
            String nameNumberString;
            int index;

            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // if condition to find existence of record.
                if (name.equals(nametoUpdate)
                    || number == numbertoUpdate) {
                    found = true;
                    break;
                }
            }
 
            // Update the contact if record exists.
            if (found == true) {
 
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");
 
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
 
                // Set file pointer to start
                raf.seek(0);
 
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()
                       < raf.length()) {
 
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);
 
                    // Check if the fetched contact
                    // is the one to be updated
                    if (name.equals(nametoUpdate)) {
 
                        // Update the number of this contact
                        nameNumberString
                            = name + "!"
                              + String.valueOf(numbertoUpdate);
                    }
 
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
 
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }
 
                // The contact has been updated now
                // So copy the updated content from
                // the temporary file to original file.
 
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
 
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
 
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
 
                // Closing the resources.
                tmpraf.close();
                raf.close();
 
                // Deleting the temporary file
                tmpFile.delete();
 
                JOptionPane.showMessageDialog(null, "El contacto ha sido actualizado",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
 
            // The contact to be updated
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                JOptionPane.showMessageDialog(null, "El contacto no existe",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
        }
 
        catch (IOException ioe) {
            System.out.println(ioe);
        }
 
        catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    }                                            

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
            java.util.logging.Logger.getLogger(CRUDVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton clearButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton readButton;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JButton updateButton;
    // End of variables declaration                   
}
