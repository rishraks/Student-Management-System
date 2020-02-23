import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class All_Records extends javax.swing.JFrame {

   
     public All_Records(){
    
      initComponents();
      
    }
 
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SP = new javax.swing.JPanel();
        SL = new javax.swing.JLabel();
        RP = new javax.swing.JPanel();
        RL = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        DP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        SP.setBackground(new java.awt.Color(255, 255, 255));
        SP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SP.setPreferredSize(new java.awt.Dimension(192, 56));
        SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SPMouseExited(evt);
            }
        });

        SL.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 13)); // NOI18N
        SL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SL.setText("SHOW");

        javax.swing.GroupLayout SPLayout = new javax.swing.GroupLayout(SP);
        SP.setLayout(SPLayout);
        SPLayout.setHorizontalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SL, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        SPLayout.setVerticalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SPLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(SL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(SP);
        SP.setBounds(736, 692, 196, 56);

        RP.setBackground(new java.awt.Color(255, 255, 255));
        RP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        RP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RP.setPreferredSize(new java.awt.Dimension(133, 44));

        RL.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        RL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RL.setText("RETURN");
        RL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RPLayout = new javax.swing.GroupLayout(RP);
        RP.setLayout(RPLayout);
        RPLayout.setHorizontalGroup(
            RPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RL, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        RPLayout.setVerticalGroup(
            RPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RL, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel2.add(RP);
        RP.setBounds(266, 694, 192, 56);

        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        jPanel2.add(img);
        img.setBounds(1013, 220, 254, 238);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_info/delete.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 770);

        tb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID NO", "NAME", "CLASS", "DOB", "GENDER", "SCHOOL", "BOARD", "ADDRESS", "CITY", "PIN CODE", "MOBILE NO", "EMAIL ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb.setOpaque(false);
        tb.setRowHeight(25);
        tb.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tb.setShowVerticalLines(false);
        tb.getTableHeader().setReorderingAllowed(false);
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        DP.setBackground(new java.awt.Color(0, 102, 102));
        DP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DPMouseDragged(evt);
            }
        });
        DP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DPMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 75)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALL RECORDS");

        javax.swing.GroupLayout DPLayout = new javax.swing.GroupLayout(DP);
        DP.setLayout(DPLayout);
        DPLayout.setHorizontalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DPLayout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        DPLayout.setVerticalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1280, 770));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DPMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_DPMousePressed

    private void DPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DPMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_DPMouseDragged

    private void RLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RLMouseClicked
       Menu_page mn=new Menu_page();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RLMouseClicked

    private void RLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RLMouseEntered
        RL.setForeground(Color.WHITE);
        RP.setBackground(new Color(255,51,51));
        RP.setBorder(new LineBorder(new Color(255,51,51),1,true));
    }//GEN-LAST:event_RLMouseEntered

    private void RLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RLMouseExited
        RL.setForeground(new Color(0,0,0));
        RP.setBackground(Color.WHITE);
        RP.setBorder(new LineBorder(new Color(255,153,51),1,true));
    }//GEN-LAST:event_RLMouseExited

    private void SPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMouseClicked
        DefaultTableModel md=(DefaultTableModel)tb.getModel();
        tb.setOpaque(false);
        tb.getTableHeader().setBackground(new Color(0,255,255));
        tb.getTableHeader().setForeground(Color.BLACK);
        tb.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,13));
       try
       {
           Class.forName("java.sql.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
           Statement st=con.createStatement();
           String q="Select * from records;";
           ResultSet rs=st.executeQuery(q);
           while(rs.next())
           {
              int id=rs.getInt("idn");
              String nm=rs.getString("name");
              String cl=rs.getString("class");
              String db=rs.getString("dob");
              String g=rs.getString("gender");
              String sc=rs.getString("school");
              String br=rs.getString("board");
              String ad=rs.getString("address");
              String ct=rs.getString("city");
              int pn=rs.getInt("pincode");
              Long mb=rs.getLong("mobile_no");
              String em=rs.getString("email");
              
              md.addRow(new Object[] {id,nm,cl,db,g,sc,br,ad,ct,pn,mb,em});
           }
           rs.close();
           con.close();
           st.close();
       }
       catch(Exception e)
       {
          System.out.println(e); 
       }
    }//GEN-LAST:event_SPMouseClicked

    private void SPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMouseEntered
        SL.setForeground(Color.WHITE);
        SP.setBackground(new Color(255,51,51));
        SP.setBorder(new LineBorder(new Color(255,51,51),1,true));
    }//GEN-LAST:event_SPMouseEntered

    private void SPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMouseExited
        SL.setForeground(new Color(0,0,0));
        SP.setBackground(Color.WHITE);
        SP.setBorder(new LineBorder(new Color(255,153,51),1,true));
    }//GEN-LAST:event_SPMouseExited

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
               int i=tb.getSelectedRow();
               TableModel m=tb.getModel();
             
              
              
    }//GEN-LAST:event_tbMouseClicked
private int xMouse,yMouse;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new All_Records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DP;
    private javax.swing.JLabel RL;
    private javax.swing.JPanel RP;
    private javax.swing.JLabel SL;
    private javax.swing.JPanel SP;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables

    /*private Object userList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void show_user() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        
}
