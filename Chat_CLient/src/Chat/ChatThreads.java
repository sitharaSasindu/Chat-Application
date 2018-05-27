package Chat;

/**
 *
 * @author sithara
 * 2016372
 * w1654468
 */

import chat.ChatThread;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ChatThreads extends javax.swing.JFrame {
    
    public static String title;
    public static String author;
    public static String lastEdited;

   
    public ChatThreads() {
        initComponents();
         setTitle("Chat Threads");
        pack();
        setLocationRelativeTo(null);
         setResizable(false);
      
        showChatThreads();
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        addthread = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        editThread1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(153, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title", "Last Edited", "By"
            }
        ));
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.setGridColor(new java.awt.Color(51, 51, 255));
        jTable1.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("SS Chat");

        addthread.setBackground(new java.awt.Color(0, 153, 204));
        addthread.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addthread.setText("Add Conversation");
        addthread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addthreadActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 153, 204));
        logout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        editThread1.setBackground(new java.awt.Color(0, 153, 204));
        editThread1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        editThread1.setText("Edit  Conversation");
        editThread1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editThread1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(addthread, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(editThread1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editThread1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addthread, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       Main main = new Main();
       main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void addthreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addthreadActionPerformed
        CreateThread newthread=new CreateThread();//redirect to add a new thread
        newthread.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addthreadActionPerformed

    private void editThread1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editThread1ActionPerformed
      
        int rowNo=jTable1.getSelectedRow();// selected thread will be edited in editThread indow
        
            title=jTable1.getValueAt(rowNo, 0).toString();
            author=jTable1.getValueAt(rowNo,1).toString();
            lastEdited=jTable1.getValueAt(rowNo, 2).toString();
           
            EditThread edit=new EditThread();
            edit.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_editThread1ActionPerformed

    public void showChatThreads(){
        List<ChatThread> chatThreads = WebClient.getThreadData();//creating an arraylist to store data
        String col[]={"Title","Admin","Last Edited"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
       
        jTable1.setModel(tableModel);
        Object[] rowData=new Object[3];

        for(int i=0;i<chatThreads.size();i++){//adding data to the table 
            rowData[0]=chatThreads.get(i).getTitle();
            rowData[1]=chatThreads.get(i).getAuthor();
            rowData[2]=chatThreads.get(i).getLastEdited();
            tableModel.addRow(rowData);
        
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addthread;
    private javax.swing.JButton editThread1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}

