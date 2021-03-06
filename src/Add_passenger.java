
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Himanshu
 */
public class Add_passenger extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    Statement stmt;
    public String depart, arrive, duration;
    public String user;
    public String password;

    public Add_passenger(String depart, String arrive, String duration, String user, String password) {
        initComponents();
        this.depart = depart;
        this.arrive = arrive;
        this.duration = duration;
        this.user = user;
        this.password = password;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            //JOptionPane.showMessageDialog(this,"Driver Loaded...");
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
                //JOptionPane.showMessageDialog(null,"Connection Established...");
            } catch (SQLException ex) {
                System.out.println("Connection Not Established");
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Not Loaded");
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Enter Your Name");
            jTextField1.setForeground(Color.gray);
        }
        if (jTextField2.getText().equals("")) {
            jTextField2.setText("Enter Your Age");
            jTextField2.setForeground(Color.gray);
        }
        if (jTextField3.getText().equals("")) {
            jTextField3.setText("Enter Your Aadhar Number");
            jTextField3.setForeground(Color.gray);
        }
        if (jTextField4.getText().equals("")) {
            jTextField4.setText("Enter Your Name");
            jTextField4.setForeground(Color.gray);
        }
        if (jTextField5.getText().equals("")) {
            jTextField5.setText("Enter Your Age");
            jTextField5.setForeground(Color.gray);
        }
        if (jTextField6.getText().equals("")) {
            jTextField6.setText("Enter Your Aadhar Number");
            jTextField6.setForeground(Color.gray);
        }
        if (jTextField7.getText().equals("")) {
            jTextField7.setText("Enter Your Name");
            jTextField7.setForeground(Color.gray);
        }
        if (jTextField8.getText().equals("")) {
            jTextField8.setText("Enter Your Age");
            jTextField8.setForeground(Color.gray);
        }
        if (jTextField9.getText().equals("")) {
            jTextField9.setText("Enter Your Aadhar Number");
            jTextField9.setForeground(Color.gray);
        }
        jTextField2.setSize(6, 146);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jComboBox2.setVisible(false);
        jTextField6.setVisible(false);
        jButton2.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jComboBox3.setVisible(false);
        jTextField9.setVisible(false);
        jButton3.setVisible(false);
        jTextField11.setVisible(false);
        jTextField12.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();

        jTextField12.setText("jTextField12");

        jTextField11.setText("jTextField11");

        jTextField15.setText("Train Name");

        jTextField16.setText("Class Selected");

        jTextField14.setText("Availability");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField13.setText("Date");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Add Passengers");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add your Prefernces", "Lower", "Middle", "Upper" }));

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jButton1.setText("Add other Passenger");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add your Prefernces", "Lower", "Middle", "Upper" }));

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jButton2.setText("Add other Passenger");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });

        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add your Prefernces", "Lower", "Middle", "Upper" }));

        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });

        jButton3.setText("Add other Passenger");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Confirm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField10.setText("jTextField10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jTextField5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField6)
                            .addComponent(jTextField3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(254, 254, 254)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jComboBox1)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Payment pay = new Payment(depart, arrive, duration, user, password);
        try {
            int count = 0;
            int flag = 0;
            String a = jTextField3.getText();
            String b = jTextField6.getText();
            String c = jTextField9.getText();
            if (!jTextField1.getText().equals("Enter Your Name") && !jTextField2.getText().equals("Enter Your Age") && jComboBox1.getSelectedIndex() != 0 && !jTextField3.getText().equals("Enter Your Aadhar Number")) {
                String sql = "insert into passenger_deatails values (?, ?, ?, ?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jTextField2.getText());
                ps.setString(3, jComboBox1.getSelectedItem().toString());
                ps.setString(4, jTextField3.getText());
                // ps.setString(5,"xnsasaj");
                count++;
                if (a.length() != 12) {
                    JOptionPane.showMessageDialog(null, "Aadhar length not equal to 12!!");
                    flag = 0;
                } else {
                    ps.execute();
                    flag = 1;
                }
                if (!jTextField4.getText().equals("Enter Your Name") && !jTextField5.getText().equals("Enter Your Age") && jComboBox2.getSelectedIndex() != 0 && !jTextField6.getText().equals("Enter Your Aadhar Number")) {
                    ps = con.prepareStatement(sql);
                    ps.setString(1, jTextField4.getText());
                    ps.setString(2, jTextField5.getText());
                    ps.setString(3, jComboBox2.getSelectedItem().toString());
                    ps.setString(4, jTextField6.getText());
                    //ps.setString(5,"xnsasaj");
                    count++;
                    if (b.length() != 12) {
                        JOptionPane.showMessageDialog(null, "Aadhar length not equal to 12!!");
                        flag = 0;
                    } else {
                        ps.execute();
                        flag = 1;
                    }
                    if (!jTextField7.getText().equals("Enter Your Name") && !jTextField8.getText().equals("Enter Your Age") && jComboBox3.getSelectedIndex() != 0 && !jTextField9.getText().equals("Enter Your Aadhar Number")) {
                        ps = con.prepareStatement(sql);
                        ps.setString(1, jTextField7.getText());
                        ps.setString(2, jTextField8.getText());
                        ps.setString(3, jComboBox3.getSelectedItem().toString());
                        ps.setString(4, jTextField9.getText());
                        //ps.setString(5,"xnsasaj");
                        count++;
                        if (c.length() != 12) {
                            JOptionPane.showMessageDialog(null, "Aadhar length not equal to 12!!");
                            flag = 0;
                        } else {
                            ps.execute();
                            int yesorno = JOptionPane.showConfirmDialog(null, "Do you Confirm", "Proceed", JOptionPane.YES_NO_OPTION);
                            if (yesorno == 0) {
                                //Payment pay = new Payment();
                                dispose();
                                pay.setVisible(true);
                            }
                        }
                    }
                    if (count == 2 && flag == 1) {
                        int yesorno = JOptionPane.showConfirmDialog(null, "Do you Confirm", "Proceed", JOptionPane.YES_NO_OPTION);
                        if (yesorno == 0) {
                            //Payment pay = new Payment();
                            dispose();
                            pay.setVisible(true);
                        }
                    }
                }
                if (count == 1 && flag == 1) {
                    int yesorno = JOptionPane.showConfirmDialog(null, "Do you Confirm", "Proceed", JOptionPane.YES_NO_OPTION);
                    if (yesorno == 0) {

                        dispose();
                        pay.setVisible(true);
                    }
                }
                //System.out.print(jTextField12.getText());
                int fare = Integer.parseInt(jTextField12.getText());
                jTextField11.setText("" + count);
                //System.out.print(jTextField11.getText());
                int no = Integer.parseInt(jTextField11.getText());
                int total_fare = fare * no;
                //System.out.print(total_fare);
                pay.jTextField5.setText("" + total_fare);
                //pay.jTextField7.setText(jTextField11.getText());
                pay.jTextField7.setText(jTextField15.getText());
                pay.jTextField8.setText(jTextField16.getText());
                pay.jTextField9.setText(jTextField13.getText());
                pay.jLabel7.setText("" + count);
                int avaail = Integer.parseInt(jTextField14.getText());
                if (count > avaail) {
                    JOptionPane.showMessageDialog(null, "You can not book tickets greater than availability!!!");
                    pay.dispose();
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
        try {
            String sql3 = "delete from passenger_deatails";
            ps = con.prepareStatement(sql3);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jComboBox2.setVisible(true);
        jTextField6.setVisible(true);
        jButton2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jComboBox3.setVisible(true);
        jTextField9.setVisible(true);
        jButton3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "You can add maximum of 3 passenegers at a time!!");// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (jTextField1.getText().equals("Enter Your Name")) {
            jTextField1.setText("");
            jTextField1.setForeground(Color.black);
        } else if (jTextField1.getText().equals("")) {
            jTextField1.setText("Enter Your Name");
            jTextField1.setForeground(Color.gray);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Enter Your Name");
            jTextField1.setForeground(Color.gray);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if (jTextField2.getText().equals("Enter Your Age")) {
            jTextField2.setText("");
            jTextField2.setForeground(Color.black);
        } else if (jTextField2.getText().equals("")) {
            jTextField2.setText("Enter Your Age");
            jTextField2.setForeground(Color.gray);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (jTextField2.getText().equals("")) {
            jTextField2.setText("Enter Your Age");
            jTextField2.setForeground(Color.gray);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if (jTextField3.getText().equals("Enter Your Aadhar Number")) {
            jTextField3.setText("");
            jTextField3.setForeground(Color.black);
        } else if (jTextField3.getText().equals("")) {
            jTextField3.setText("Enter Your Aadhar Number");
            jTextField3.setForeground(Color.gray);
        }   // // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().equals("")) {
            jTextField3.setText("Enter Your Aadhar Number");
            jTextField3.setForeground(Color.gray);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        if (jTextField4.getText().equals("Enter Your Name")) {
            jTextField4.setText("");
            jTextField4.setForeground(Color.black);
        } else if (jTextField4.getText().equals("")) {
            jTextField4.setText("Enter Your Name");
            jTextField4.setForeground(Color.gray);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4FocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        if (jTextField5.getText().equals("Enter Your Age")) {
            jTextField5.setText("");
            jTextField5.setForeground(Color.black);
        } else if (jTextField5.getText().equals("")) {
            jTextField5.setText("Enter Your Age");
            jTextField5.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        if (jTextField5.getText().equals("")) {
            jTextField5.setText("Enter Your Age");
            jTextField5.setForeground(Color.gray);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        if (jTextField6.getText().equals("Enter Your Aadhar Number")) {
            jTextField6.setText("");
            jTextField6.setForeground(Color.black);
        } else if (jTextField6.getText().equals("")) {
            jTextField6.setText("Enter Your Aadhar Number");
            jTextField6.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        if (jTextField6.getText().equals("")) {
            jTextField6.setText("Enter Your Aadhar Number");
            jTextField6.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        if (jTextField7.getText().equals("Enter Your Name")) {
            jTextField7.setText("");
            jTextField7.setForeground(Color.black);
        } else if (jTextField7.getText().equals("")) {
            jTextField7.setText("Enter Your Name");
            jTextField7.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        if (jTextField7.getText().equals("")) {
            jTextField7.setText("Enter Your Name");
            jTextField7.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        if (jTextField8.getText().equals("Enter Your Age")) {
            jTextField8.setText("");
            jTextField8.setForeground(Color.black);
        } else if (jTextField8.getText().equals("")) {
            jTextField8.setText("Enter Your Age");
            jTextField8.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        if (jTextField8.getText().equals("")) {
            jTextField8.setText("Enter Your Age");
            jTextField8.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        if (jTextField9.getText().equals("Enter Your Aadhar Number")) {
            jTextField9.setText("");
            jTextField9.setForeground(Color.black);
        } else if (jTextField9.getText().equals("")) {
            jTextField9.setText("Enter Your Aadhar Number");
            jTextField9.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        if (jTextField9.getText().equals("")) {
            jTextField9.setText("Enter Your Aadhar Number");
            jTextField9.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if (jTextField4.getText().equals("")) {
            jTextField4.setText("Enter Your Name");
            jTextField4.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_passenger(null, null, null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField13;
    public javax.swing.JTextField jTextField14;
    public javax.swing.JTextField jTextField15;
    public javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
