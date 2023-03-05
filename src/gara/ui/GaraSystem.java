/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gara.ui;

import gara.utils.Auth;
import gara.modal.NhanVien;
import gara.utils.MsgBox;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.event.MouseEvent;

/**
 *
 * @author PC
 */
public class GaraSystem extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form GaraSystem
     */
    public GaraSystem() {
        initComponents();
        init();
        setLocationRelativeTo(null); 
    }

    

    void init() {
        this.startDongHo();
        lblHInh.setIcon(new ImageIcon(new ImageIcon("src//gara//ui//img//image_processing20220220-30893-f7j4tu.jpg").getImage().getScaledInstance(lblHInh.getWidth(), lblHInh.getHeight(), Image.SCALE_DEFAULT)));     
        jLabel9.setIcon(new ImageIcon(new ImageIcon("src//gara//ui//img//motor-service-logo-motorbike-services-design-industry-vector-motorcycle-icon-transportation-sign-objects-symbol-regular-168874639.jpg").getImage().getScaledInstance(jLabel9.getWidth(),jLabel9.getHeight(),Image.SCALE_DEFAULT)));
        System.out.printf("",lblHInh.getWidth(),lblHInh.getHeight());
        if(Auth.user.getChucVu()==false){
            lblQLNV.setEnabled(false);
        }
        layTenNV();
        System.out.println(""+lblHInh.getHeight());
        System.out.println(""+lblHInh.getWidth());
    }
    public void layTenNV() {
        lblTenNV.setText("Tên NV: " + Auth.user.getTenNV());
        String ChucVu = Auth.user.getChucVu()? "Quản Lý" : "Nhân Viên";
        lblChucVu.setText("Chức Vụ: " + ChucVu);
    }
    Welcome wc=new Welcome();
    QLKHJPanel qlkh = new QLKHJPanel();
    QLNVJPanel qlnv = new QLNVJPanel();
    QLHDJPanel qlhd = new QLHDJPanel();
    TonKhoJPanel tk = new TonKhoJPanel();
    ThongKeJPanel tke = new ThongKeJPanel();
    
    public void resetMau() {
        lblQLKH.setBackground(new Color(102, 102, 102));
        lblQLNV.setBackground(new Color(102, 102, 102));
        lblQLHD.setBackground(new Color(102, 102, 102));
        lblTonKho.setBackground(new Color(102, 102, 102));
        lblThongKe.setBackground(new Color(102, 102, 102));
    }

    void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy" + "||" + "hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            lblTime.setText(formater.format(new Date()));
        }).start();
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
        jPanel3 = new javax.swing.JPanel();
        lblQLKH = new javax.swing.JLabel();
        lblQLHD = new javax.swing.JLabel();
        lblQLNV = new javax.swing.JLabel();
        lblTonKho = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Tabp = new javax.swing.JTabbedPane();
        lblHInh = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        lblQLKH.setBackground(new java.awt.Color(255, 255, 255));
        lblQLKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQLKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLKH.setText("Quản Lý Khách Hàng");
        lblQLKH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblQLKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQLKH.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblQLKH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblQLKHMouseMoved(evt);
            }
        });
        lblQLKH.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                lblQLKHMouseWheelMoved(evt);
            }
        });
        lblQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLKHMouseClicked(evt);
            }
        });
        jPanel3.add(lblQLKH);

        lblQLHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQLHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLHD.setText("Quản Lý Hóa Đơn");
        lblQLHD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblQLHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQLHD.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblQLHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLHDMouseClicked(evt);
            }
        });
        jPanel3.add(lblQLHD);

        lblQLNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQLNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLNV.setText("Quản Lý Nhân Viên");
        lblQLNV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblQLNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQLNV.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLNVMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblQLNVMousePressed(evt);
            }
        });
        jPanel3.add(lblQLNV);

        lblTonKho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTonKho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTonKho.setText("Quản lý linh kiện ");
        lblTonKho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTonKho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTonKho.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblTonKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTonKhoMouseClicked(evt);
            }
        });
        jPanel3.add(lblTonKho);

        lblThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setText("Thống Kê");
        lblThongKe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThongKe.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
        });
        jPanel3.add(lblThongKe);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 153, 220, 580));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gara/ui/img/motor-service-logo-motorbike-services-design-industry-vector-motorcycle-icon-transportation-sign-objects-symbol-regular-168874639.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, -1));

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 51));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gara/ui/img/Clock.png"))); // NOI18N
        jPanel2.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        lblChucVu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChucVu.setText("Chức Vụ:");
        jPanel2.add(lblChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 220, 30));

        lblTenNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenNV.setText("Tên NV:");
        jPanel2.add(lblTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 220, 30));

        Tabp.addTab("Welcome", lblHInh);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabp, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabp)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu3.setText("Đăng Xuất");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Thoát");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblQLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLKHMouseClicked
        Tabp.removeAll();
        Tabp.addTab("Quản Lý Khách Hàng", qlkh);
        resetMau();
        lblQLKH.setBackground(Color.red);
    }//GEN-LAST:event_lblQLKHMouseClicked

    private void lblQLKHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLKHMouseMoved

    }//GEN-LAST:event_lblQLKHMouseMoved

    private void lblQLKHMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_lblQLKHMouseWheelMoved


    }//GEN-LAST:event_lblQLKHMouseWheelMoved

    private void lblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNVMouseClicked
        if(Auth.user.getChucVu()==true){Tabp.removeAll();
        Tabp.addTab("Quản Lý Nhân Viên", qlnv);
        resetMau();
        lblQLNV.setBackground(Color.red);}
        else{
            
            MsgBox.alert(this,"Bạn không có quyền xem thông tin này!");
        }
    }//GEN-LAST:event_lblQLNVMouseClicked

    private void lblQLHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLHDMouseClicked
        Tabp.removeAll();
        Tabp.addTab("Quản Lý Hóa Đơn", qlhd);
        resetMau();
        lblQLHD.setBackground(Color.red);
    }//GEN-LAST:event_lblQLHDMouseClicked

    private void lblTonKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTonKhoMouseClicked
        Tabp.removeAll();
        Tabp.addTab("Tồn kho", tk);
        resetMau();
        lblTonKho.setBackground(Color.red);
    }//GEN-LAST:event_lblTonKhoMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        Tabp.removeAll();
        Tabp.addTab("Thống kê", tke);
        resetMau();
        lblThongKe.setBackground(Color.red);
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblQLNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNVMousePressed
        if(Auth.user.getChucVu()==false){
            
        }
            
    }//GEN-LAST:event_lblQLNVMousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       Tabp.removeAll();
       Tabp.addTab("Welcome",wc);
        resetMau();
   
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       Auth.clear();
       this.dispose();
       DangNhap dn=new DangNhap();
       dn.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(GaraSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GaraSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GaraSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GaraSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GaraSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabp;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHInh;
    private javax.swing.JLabel lblQLHD;
    private javax.swing.JLabel lblQLKH;
    private javax.swing.JLabel lblQLNV;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTonKho;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            Date now = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("kk:mm:ss");
            String time = simpleDateFormat.format(now);
            lblTime.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

}
