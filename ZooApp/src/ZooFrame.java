import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class ZooFrame extends javax.swing.JFrame {
 private Zoo zoo;
 
    public ZooFrame() {
        initComponents();
        zoo = new Zoo(1);
        initializeZoo();
    }
    private void initializeZoo() {
        // Initialize your zoo with the required parameters
        zoo = new Zoo(3); // Initial cage count is set to 3 for this example
        // Add animals to the zoo (similar to your Main class)
        Herbivore elephant = new Herbivore("Coco", "Elephant", "Uuuuunnn");
        Predator lion = new Predator("Milo", "Lion", "Arrrr");
        Predator wolf = new Predator("Duke", "Wolf", "how how");

        try {
            zoo.addAnimal(wolf, 0);
            zoo.addAnimal(wolf, 0);
            zoo.addAnimal(wolf, 0);
            zoo.addCages(2);
            zoo.addAnimal(elephant, 1);
            zoo.addAnimal(elephant, 1);
            zoo.addAnimal(lion, 2);
        } catch (Exception e) {
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAddanimal = new javax.swing.JButton();
        btAddcage = new javax.swing.JButton();
        btWalkthrought = new javax.swing.JButton();
        btAnimaltypecount = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AnimalClasses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btAddanimal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAddanimal.setText("Add animal");
        btAddanimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddanimalActionPerformed(evt);
            }
        });

        btAddcage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAddcage.setText("Add cage");
        btAddcage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddcageActionPerformed(evt);
            }
        });

        btWalkthrought.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btWalkthrought.setText("Walk througth");
        btWalkthrought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWalkthroughtActionPerformed(evt);
            }
        });

        btAnimaltypecount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAnimaltypecount.setText("Animal type count");
        btAnimaltypecount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnimaltypecountActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        AnimalClasses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AnimalClasses.setText("Animal classes");
        AnimalClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalClassesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btAddcage, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAddanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btWalkthrought)
                        .addGap(18, 18, 18)
                        .addComponent(btAnimaltypecount, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(AnimalClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddcage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btWalkthrought, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnimaltypecount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AnimalClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddanimalActionPerformed
String name = JOptionPane.showInputDialog("Enter animal name:");
        String type = JOptionPane.showInputDialog("Enter animal type (Herbivore/Predator):");
        String animalClass = JOptionPane.showInputDialog("Enter animal class:");
        String sound = JOptionPane.showInputDialog("Enter animal sound:");

        try {
            Animal animal;
            if ("Herbivore".equalsIgnoreCase(type)) {
                animal = new Herbivore(name, animalClass, sound);
            } else if ("Predator".equalsIgnoreCase(type)) {
                animal = new Predator(name, animalClass, sound);
            } else {
                throw new IllegalArgumentException("Invalid animal type. Please enter Herbivore or Predator.");
            }

            int cageIndex = Integer.parseInt(JOptionPane.showInputDialog("Enter cage index:"));
            zoo.addAnimal(animal, cageIndex - 1); // Subtract 1 to convert to array index

            JOptionPane.showMessageDialog(this, "Animal added successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAddanimalActionPerformed

    private void btAddcageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddcageActionPerformed
    try {
        int additionalCageCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of additional cages:"));
        zoo.addCages(additionalCageCount);

        JOptionPane.showMessageDialog(this, "Cages added successfully!");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btAddcageActionPerformed

    private void btWalkthroughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWalkthroughtActionPerformed
    String walkResult = walkThroughZoo();
    jTextArea1.setText(walkResult);
    }//GEN-LAST:event_btWalkthroughtActionPerformed

    private void btAnimaltypecountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnimaltypecountActionPerformed
    displayAnimalTypeCount();
    }//GEN-LAST:event_btAnimaltypecountActionPerformed

    private void AnimalClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalClassesActionPerformed
    displayUniqueAnimalClasses();
    }//GEN-LAST:event_AnimalClassesActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ZooFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZooFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZooFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZooFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZooFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnimalClasses;
    private javax.swing.JButton btAddanimal;
    private javax.swing.JButton btAddcage;
    private javax.swing.JButton btAnimaltypecount;
    private javax.swing.JButton btWalkthrought;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

private String walkThroughZoo() {
    StringBuilder result = new StringBuilder();

    // Iterate through the cages and append the formatted output to the StringBuilder
    for (int i = 0; i < zoo.getCages().length; i++) {
        java.util.List<Animal> animals = zoo.getCages()[i].getAnimals();
        if (!animals.isEmpty()) {
            result.append("Cage ").append(i + 1).append(": ");
            for (Animal animal : animals) {
                result.append(animal.getAnimalSound()).append(" ");
            }
            result.append("\n");
        } else {
            result.append("Cage ").append(i + 1).append(": empty.\n");
        }
    }
    result.append("----------------------\n");

    return result.toString();
}
private void displayAnimalTypeCount() {
    Map<String, Integer> animalTypeCounts = zoo.countAnimalTypes();
    
    // Assuming jTextArea1 is the name of your JTextArea component
    jTextArea1.setText(""); // Clear the text area before displaying new output
    
    // Append the formatted output to the text area
    jTextArea1.append("\nAnimal Type Counts:\n");
    for (Map.Entry<String, Integer> entry : animalTypeCounts.entrySet()) {
        jTextArea1.append(entry.getKey() + ": " + entry.getValue() + "\n");
    }
}
    private void displayUniqueAnimalClasses() {
    Set<String> uniqueAnimalClasses = zoo.getUniqueAnimalClasses();
    
    // Assuming jTextArea1 is the name of your JTextArea component
    jTextArea1.setText(""); // Clear the text area before displaying new output
    
    // Append the formatted output to the text area
    jTextArea1.append("\nUnique Animal Classes:\n");
    jTextArea1.append(uniqueAnimalClasses.toString() + "\n");
    }
}
