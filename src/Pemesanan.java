
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mokleters
 */
public class Pemesanan extends javax.swing.JFrame {

    /**
     * Creates new form Pemesanan
     */
    public Pemesanan() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        makanan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalMinum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tanggal = new com.toedter.calendar.JDateChooser();
        jumlahMakan = new javax.swing.JTextField();
        hargaMakan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        minuman = new javax.swing.JTextField();
        hargaMinum = new javax.swing.JTextField();
        jumlahMinum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        thmn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save1 = new javax.swing.JButton();
        totalMakan = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        makMin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        total = new javax.swing.JButton();
        thmk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("PRIMETIME", 1, 36)); // NOI18N
        jLabel1.setText("Resto Ala-Ala");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 380, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Kasir :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(710, 10, 90, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Joice Jessica");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(790, 10, 90, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, -1, 900, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama Makanan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 130, 120, 20);
        jPanel1.add(makanan);
        makanan.setBounds(10, 150, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Harga");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 180, 50, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Jumlah");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 180, 50, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total Harga Minuman");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 470, 140, 20);

        totalMinum.setEnabled(false);
        jPanel1.add(totalMinum);
        totalMinum.setBounds(10, 490, 220, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tanggal Transaksi");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 70, 120, 20);
        jPanel1.add(tanggal);
        tanggal.setBounds(10, 90, 220, 30);
        jPanel1.add(jumlahMakan);
        jumlahMakan.setBounds(120, 200, 70, 30);
        jPanel1.add(hargaMakan);
        hargaMakan.setBounds(10, 200, 70, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nama Minuman");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 340, 120, 20);
        jPanel1.add(minuman);
        minuman.setBounds(10, 360, 220, 30);
        jPanel1.add(hargaMinum);
        hargaMinum.setBounds(10, 420, 70, 30);

        jumlahMinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahMinumActionPerformed(evt);
            }
        });
        jPanel1.add(jumlahMinum);
        jumlahMinum.setBounds(120, 420, 70, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Jumlah");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(120, 400, 50, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Harga");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 400, 50, 20);

        thmn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thmn.setText("Total");
        jPanel1.add(thmn);
        thmn.setBounds(10, 530, 90, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tgl_transaksi", "nmMakanan", "hrgMakanan", "jmlMakanan", "nmMinuman", "hrgMinuman", "jmlMinuman", "totalHrg"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 80, 610, 210);

        save1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel1.add(save1);
        save1.setBounds(10, 640, 90, 30);

        totalMakan.setEnabled(false);
        jPanel1.add(totalMakan);
        totalMakan.setBounds(10, 260, 220, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Total Harga Makanan");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 240, 140, 20);

        makMin.setEnabled(false);
        jPanel1.add(makMin);
        makMin.setBounds(10, 590, 220, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Makanan + Minuman");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 570, 140, 20);

        total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total.setText("Total");
        jPanel1.add(total);
        total.setBounds(140, 640, 90, 30);

        thmk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thmk.setText("Total");
        jPanel1.add(thmk);
        thmk.setBounds(10, 300, 90, 30);

        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 310, 80, 40);

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 310, 90, 40);

        jButton3.setText("REFRESH");
        jPanel1.add(jButton3);
        jButton3.setBounds(470, 310, 90, 40);

        jButton4.setText("PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(570, 310, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 780);

        setBounds(0, 0, 911, 745);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tanggal.setCalendar(null);
        makanan.setText("");
        hargaMakan.setText("");
        jumlahMakan.setText("");
        totalMakan.setText("");
        minuman.setText("");
        hargaMinum.setText("");
        jumlahMinum.setText("");
        totalMinum.setText("");
        makMin.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jumlahMinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahMinumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahMinumActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String Tanggal = dateFormat.format(tanggal.getDate());
        
         if (Tanggal.equals("") || "".equals(makanan.getText()) || "".equals(hargaMakan.getText()) ||
                "".equals(jumlahMakan.getText()) || "".equals(minuman.getText()) || hargaMinum.getText().equals("") ||
                 jumlahMinum.getText().equals("") || makMin.getText().equals("") ) 
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            String JK = "";
            if (rdLaki.isSelected()) {
                JK = "L";
            } else {
                JK = "P";
            }
            String SQL = "INSERT INTO `t_siswa`(`NIS`, `NamaSiswa`, `JenisKelamin`, `Kelas`, `Email`, `Alamat`) VALUES ('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+JK+"','"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "Gagal", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_save1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargaMakan;
    private javax.swing.JTextField hargaMinum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlahMakan;
    private javax.swing.JTextField jumlahMinum;
    private javax.swing.JTextField makMin;
    private javax.swing.JTextField makanan;
    private javax.swing.JTextField minuman;
    private javax.swing.JButton save1;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JButton thmk;
    private javax.swing.JButton thmn;
    private javax.swing.JButton total;
    private javax.swing.JTextField totalMakan;
    private javax.swing.JTextField totalMinum;
    // End of variables declaration//GEN-END:variables
}
