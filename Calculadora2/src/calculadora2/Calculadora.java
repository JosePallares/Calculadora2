package calculadora2;

public class Calculadora extends javax.swing.JFrame {

    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtOperacion = new javax.swing.JLabel();
        TxtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_AC = new javax.swing.JButton();
        btn_cambiosigno = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_sin = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_tg = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_coma = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(209, 209, 209));

        TxtOperacion.setFont(new java.awt.Font("Apple Color Emoji", 0, 18)); // NOI18N
        TxtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        TxtResultado.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        TxtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(TxtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        jPanel2.setBackground(new java.awt.Color(209, 209, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_AC.setBackground(new java.awt.Color(255, 255, 255));
        btn_AC.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_AC.setForeground(new java.awt.Color(0, 0, 0));
        btn_AC.setText("AC");
        btn_AC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ACActionPerformed(evt);
            }
        });
        jPanel2.add(btn_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        btn_cambiosigno.setBackground(new java.awt.Color(255, 255, 255));
        btn_cambiosigno.setFont(new java.awt.Font("Apple Color Emoji", 0, 14)); // NOI18N
        btn_cambiosigno.setForeground(new java.awt.Color(0, 0, 0));
        btn_cambiosigno.setText("+/-");
        btn_cambiosigno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cambiosigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiosignoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cambiosigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 60));

        btn_porcentaje.setBackground(new java.awt.Color(255, 255, 255));
        btn_porcentaje.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(0, 0, 0));
        btn_porcentaje.setText("%");
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 60));

        btn_dividir.setBackground(new java.awt.Color(245, 137, 44));
        btn_dividir.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_dividir.setForeground(new java.awt.Color(0, 0, 0));
        btn_dividir.setText("/");
        btn_dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 60, 60));

        btn_sin.setBackground(new java.awt.Color(245, 137, 44));
        btn_sin.setFont(new java.awt.Font("Apple Color Emoji", 0, 16)); // NOI18N
        btn_sin.setForeground(new java.awt.Color(0, 0, 0));
        btn_sin.setText("SIN");
        btn_sin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        btn_7.setBackground(new java.awt.Color(255, 255, 255));
        btn_7.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(0, 0, 0));
        btn_7.setText("7");
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 60));

        btn_8.setBackground(new java.awt.Color(255, 255, 255));
        btn_8.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(0, 0, 0));
        btn_8.setText("8");
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 60));

        btn_9.setBackground(new java.awt.Color(255, 255, 255));
        btn_9.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(0, 0, 0));
        btn_9.setText("9");
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 60));

        btn_multiplicar.setBackground(new java.awt.Color(245, 137, 44));
        btn_multiplicar.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_multiplicar.setForeground(new java.awt.Color(0, 0, 0));
        btn_multiplicar.setText("X");
        btn_multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 60));

        btn_cos.setBackground(new java.awt.Color(245, 137, 44));
        btn_cos.setFont(new java.awt.Font("Apple Color Emoji", 0, 16)); // NOI18N
        btn_cos.setForeground(new java.awt.Color(0, 0, 0));
        btn_cos.setText("COS");
        btn_cos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, 60));

        btn_4.setBackground(new java.awt.Color(255, 255, 255));
        btn_4.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(0, 0, 0));
        btn_4.setText("4");
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 60));

        btn_5.setBackground(new java.awt.Color(255, 255, 255));
        btn_5.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(0, 0, 0));
        btn_5.setText("5");
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 60));

        btn_6.setBackground(new java.awt.Color(255, 255, 255));
        btn_6.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(0, 0, 0));
        btn_6.setText("6");
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, 60));

        btn_resta.setBackground(new java.awt.Color(250, 87, 31));
        btn_resta.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(0, 0, 0));
        btn_resta.setText("-");
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 60, 60));

        btn_tg.setBackground(new java.awt.Color(250, 87, 31));
        btn_tg.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_tg.setForeground(new java.awt.Color(0, 0, 0));
        btn_tg.setText("TG");
        btn_tg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tgActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 60, 60));

        btn_1.setBackground(new java.awt.Color(255, 255, 255));
        btn_1.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(0, 0, 0));
        btn_1.setText("1");
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 60, 60));

        btn_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_2.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(0, 0, 0));
        btn_2.setText("2");
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 60, 60));

        btn_3.setBackground(new java.awt.Color(255, 255, 255));
        btn_3.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(0, 0, 0));
        btn_3.setText("3");
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, 60));

        btn_suma.setBackground(new java.awt.Color(245, 137, 44));
        btn_suma.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(0, 0, 0));
        btn_suma.setText("+");
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 60, 60));

        btn_e.setBackground(new java.awt.Color(245, 137, 44));
        btn_e.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_e.setForeground(new java.awt.Color(0, 0, 0));
        btn_e.setText("e");
        btn_e.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eActionPerformed(evt);
            }
        });
        jPanel2.add(btn_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 60, 60));

        btn_0.setBackground(new java.awt.Color(255, 255, 255));
        btn_0.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(0, 0, 0));
        btn_0.setText("0");
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 60));

        btn_coma.setBackground(new java.awt.Color(255, 255, 255));
        btn_coma.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_coma.setForeground(new java.awt.Color(0, 0, 0));
        btn_coma.setText(",");
        btn_coma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 60, 60));

        btn_igual.setBackground(new java.awt.Color(245, 137, 44));
        btn_igual.setFont(new java.awt.Font("Apple Color Emoji", 0, 24)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(0, 0, 0));
        btn_igual.setText("=");
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 130, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 360, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ACActionPerformed
        TxtOperacion.setText("");
        TxtResultado.setText("");
    }//GEN-LAST:event_btn_ACActionPerformed

    private void btn_cambiosignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiosignoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cambiosignoActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumero("%");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        addNumero("/");
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinActionPerformed
        addNumero("sin");
    }//GEN-LAST:event_btn_sinActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumero("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumero("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumero("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        addNumero("x");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
        addNumero("cos");
    }//GEN-LAST:event_btn_cosActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumero("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumero("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumero("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addNumero("-");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_tgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tgActionPerformed
        addNumero("tg");
    }//GEN-LAST:event_btn_tgActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumero("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumero("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumero("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumero("+");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eActionPerformed
        addNumero("e");
    }//GEN-LAST:event_btn_eActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumero("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comaActionPerformed
        addNumero(",");
    }//GEN-LAST:event_btn_comaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        addNumero("=");
    }//GEN-LAST:event_btn_igualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumero (String digito){
        TxtOperacion.setText(TxtOperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtOperacion;
    private javax.swing.JLabel TxtResultado;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_AC;
    private javax.swing.JButton btn_cambiosigno;
    private javax.swing.JButton btn_coma;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_e;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_sin;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
