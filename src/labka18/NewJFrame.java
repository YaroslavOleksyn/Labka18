/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labka18;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        Arrays.setEditable(false);
        SortButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Arrays = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Generate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CountArray = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LowerBorder = new javax.swing.JTextField();
        UpperBorder = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        SortedWith = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        SortedWithout = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AllArrays2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        AllArrays1 = new javax.swing.JTextArea();
        SortButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Arrays.setColumns(20);
        Arrays.setRows(5);
        jScrollPane1.setViewportView(Arrays);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Згенеровані масиви");

        Generate.setText("Згенерувати");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Верхня межа");

        CountArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountArrayActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Кількість масивів");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Нижня межа");

        LowerBorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowerBorderActionPerformed(evt);
            }
        });

        UpperBorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperBorderActionPerformed(evt);
            }
        });

        SortedWith.setColumns(20);
        SortedWith.setRows(5);
        jScrollPane2.setViewportView(SortedWith);

        SortedWithout.setColumns(20);
        SortedWithout.setRows(5);
        jScrollPane3.setViewportView(SortedWithout);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Відсортовані масиви без потоків");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Відсортовані масиви з потоками");

        AllArrays2.setColumns(20);
        AllArrays2.setRows(5);
        jScrollPane4.setViewportView(AllArrays2);

        AllArrays1.setColumns(20);
        AllArrays1.setRows(5);
        jScrollPane5.setViewportView(AllArrays1);

        SortButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SortButton1.setText("Відсортувати");
        SortButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(123, 123, 123))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(UpperBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LowerBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(CountArray, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addGap(76, 76, 76))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(SortButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CountArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LowerBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpperBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Generate)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SortButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        // TODO add your handling code here:
        if (CountArray.getText().isEmpty() || LowerBorder.getText().isEmpty() || UpperBorder.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Заповніть всі значення", "Помилка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            int count = Integer.parseInt(CountArray.getText());
            int lower = Integer.parseInt(LowerBorder.getText());
            int upper = Integer.parseInt(UpperBorder.getText());
            if (lower >= upper) {
                JOptionPane.showMessageDialog(this, "Верхня межа повинна бути більшою за нижню", "Помилка", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Arrays.setText("");
            for (int i = 0; i < count; i++) {
                int size = (int) (Math.random() * (count - 1)) + 2;
                StringBuilder arrayString = new StringBuilder();
                for (int j = 0; j < size; j++) {
                    int number = (int) (Math.random() * (upper - lower + 1)) + lower;
                    arrayString.append(number);
                    if (j < size - 1) {
                        arrayString.append(" ");
                    }
                }
                Arrays.append(arrayString.toString().trim() + "\n");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введіть коректні дані", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
        SortButton1.setEnabled(true);
    }//GEN-LAST:event_GenerateActionPerformed
    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private void mergeSortAndDisplay() {
        String[] lines = Arrays.getText().split("\\n");
        List<Integer> mergedList = new ArrayList<>();

        for (String line : lines) {
            String[] numbers = line.split(" ");
            for (String number : numbers) {
                mergedList.add(Integer.valueOf(number));
            }
        }
        int[] mergedArray = mergedList.stream().mapToInt(Integer::intValue).toArray();
        bubbleSort(mergedArray);

        StringBuilder sortedArrayString = new StringBuilder();
        for (int i = 0; i < mergedArray.length; i++) {
            sortedArrayString.append(mergedArray[i]);
            if (i < mergedArray.length - 1) {
                sortedArrayString.append(" ");
            }
        }
        AllArrays1.setText(sortedArrayString.toString());
    }

    private void mergeSortAndDisplayeThread() {
        String[] lines = Arrays.getText().split("\\n");
        List<SortingThread> threads = new ArrayList<>();

        for (String line : lines) {
            String[] numbers = line.split(" ");
            int[] array = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }

            SortingThread sortingThread = new SortingThread(array);
            threads.add(sortingThread);
            sortingThread.start(); 
        }
        for (SortingThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
        }
        List<Integer> mergedList = new ArrayList<>();
        for (SortingThread thread : threads) {
            String sortedArrayString = thread.getSortedArrayStringBuilder().toString();
            String[] numbers = sortedArrayString.split(" ");
            for (String number : numbers) {
                mergedList.add(Integer.valueOf(number));
            }
        }

        int[] mergedArray = mergedList.stream().mapToInt(Integer::intValue).toArray();
        bubbleSort(mergedArray);
        StringBuilder sortedArrayString = new StringBuilder();
        for (int i = 0; i < mergedArray.length; i++) {
            sortedArrayString.append(mergedArray[i]);
            if (i < mergedArray.length - 1) {
                sortedArrayString.append(" ");
            }
        }
        AllArrays2.setText(sortedArrayString.toString());
    }
    private void sortArraysWhithout() {
        String[] lines = Arrays.getText().split("\\n");
        for (String line : lines) {
            String[] numbers = line.split(" ");
            int[] array = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            bubbleSort(array);
            for (int i = 0; i < array.length; i++) {
                SortedWithout.append(String.valueOf(array[i]));
                if (i < array.length - 1) {
                    SortedWithout.append(" ");
                }
            }
            SortedWithout.append("\n");
        }
    }

    private void sortArraysWhith() {
        String[] lines = Arrays.getText().split("\\n");
        List<SortingThread> threads = new ArrayList<>();

        for (String line : lines) {
            String[] numbers = line.split(" ");
            int[] array = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }

            SortingThread sortingThread = new SortingThread(array);
            threads.add(sortingThread);
            sortingThread.start();
        }

        for (SortingThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
        }
        for (SortingThread thread : threads) {
            SortedWith.append(thread.getSortedArrayStringBuilder().toString() + "\n");
        }
    }
    private void CountArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountArrayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountArrayActionPerformed

    private void LowerBorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowerBorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LowerBorderActionPerformed

    private void UpperBorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperBorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpperBorderActionPerformed

    private void SortButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButton1ActionPerformed
        // TODO add your handling code here:
        SortedWithout.setText("");
        SortedWith.setText("");
        sortArraysWhithout();
        sortArraysWhith();
        mergeSortAndDisplay();
        mergeSortAndDisplayeThread();
    }//GEN-LAST:event_SortButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AllArrays1;
    private javax.swing.JTextArea AllArrays2;
    private javax.swing.JTextArea Arrays;
    private javax.swing.JTextField CountArray;
    private javax.swing.JButton Generate;
    private javax.swing.JTextField LowerBorder;
    private javax.swing.JButton SortButton1;
    private javax.swing.JTextArea SortedWith;
    private javax.swing.JTextArea SortedWithout;
    private javax.swing.JTextField UpperBorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}