
/**
 * @author Franco Acosta
 */

public class Calculadoranet extends javax.swing.JFrame {

    /**
     * creamos las variables cadenadeNumeros va a guardar todos los numeros que     */
    private String cadenadeNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    /**
     * Creo la Calculadoranet
     */
    public Calculadoranet() {
        initComponents();
        this.setTitle("Calculadoranet");
        this.setLocationRelativeTo(null);
    }

    /* aca defino las caracteristicas de los botones de la calculadora
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        BotonCE = new javax.swing.JButton();
        BotonRaiz = new javax.swing.JButton();
        BotonDivision = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        BotonMultiplicacion = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonMenos = new javax.swing.JButton();
        BotonCero = new javax.swing.JButton();
        BotonPunto = new javax.swing.JButton();
        BotonMasoMenos = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        Muestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new java.awt.GridLayout(5, 4));

        BotonCE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonCE.setText("CE");
        BotonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCEActionPerformed(evt);
            }
        });
        jPanel5.add(BotonCE);

        BotonRaiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonRaiz.setText("√\t");
        jPanel5.add(BotonRaiz);

        BotonDivision.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonDivision.setText("/");
        jPanel5.add(BotonDivision);

        botonC.setText("C");
        jPanel5.add(botonC);

        Boton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton7);

        Boton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton8);

        Boton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton9);

        BotonMultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonMultiplicacion.setText("x");
        jPanel5.add(BotonMultiplicacion);

        Boton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton4);

        Boton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton5);

        Boton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton6);

        BotonSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });
        jPanel5.add(BotonSuma);

        Boton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton1);

        Boton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton2);

        Boton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        jPanel5.add(Boton3);

        BotonMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonMenos.setText("-");
        BotonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosActionPerformed(evt);
            }
        });
        jPanel5.add(BotonMenos);

        BotonCero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonCero.setText("0");
        BotonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCeroActionPerformed(evt);
            }
        });
        jPanel5.add(BotonCero);

        BotonPunto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonPunto.setText(".");
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });
        jPanel5.add(BotonPunto);

        BotonMasoMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonMasoMenos.setText("+/-");
        BotonMasoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMasoMenosActionPerformed(evt);
            }
        });
        jPanel5.add(BotonMasoMenos);

        BotonIgual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        jPanel5.add(BotonIgual);

        etiquetaNumeros.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        Muestra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Muestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Muestra.setText("10+5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Muestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Muestra, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMasoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMasoMenosActionPerformed

    }//GEN-LAST:event_BotonMasoMenosActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton 7 remplazarlo por el numero 7 
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "7";
        } else {
            //si el panel etiquetanumeros no es 0 concatenar el numero 7
            cadenadeNumeros += "7";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;

    }//GEN-LAST:event_Boton7ActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
        if (punto== true){
            if(cadenadeNumeros.equals("")){
                cadenadeNumeros="0.";
            }else{
                cadenadeNumeros +=".";
            }
            etiquetaNumeros.setText(cadenadeNumeros);
            punto = false;
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton 8 remplazarlo por el numero 8 
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "8";
        } else {
            //si el panel etiquetanumeros no es 0 concatenar el numero 8
            cadenadeNumeros += "8";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "9";
        } else {
            cadenadeNumeros += "9";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "4";
        } else {
            cadenadeNumeros += "4";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton 6 remplazarlo por el numero 6
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "6";
        } else {
            //si el panel etiquetanumeros no es 0 concatenar el numero 6
            cadenadeNumeros += "6";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton 5 remplazarlo por el numero 5 
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "5";
        } else {
            //si el panel etiquetanumeros no es 0 concatenar el numero 5
            cadenadeNumeros += "5";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton 1 remplazarlo por el numero 1 
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "1";
        } else {
            //si el panel etiquetanumeros no es 0 concatenar el numero 1
            cadenadeNumeros += "1";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton2 remplazarlo por el numero 2
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "2";
        } else {
            //si el panel etiquetanumeros no es 0 concatenar el numero 2
            cadenadeNumeros += "2";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton3 remplazarlo por el numero 3
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "3";
        } else {
            //si el panel etiquetanumeros no es 0 concatenar el numero 3
            cadenadeNumeros += "3";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true;
    }//GEN-LAST:event_Boton3ActionPerformed

    private void BotonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCeroActionPerformed
        //aca indico que si en el panel etiquetanumeros es igual a 0 al tocar el boton0 no lo remplazo 
        if (etiquetaNumeros.getText().equals("0")) {
            cadenadeNumeros = "0";
        } else {
            //concatenar el numero 0
            cadenadeNumeros += "0";
        }
        etiquetaNumeros.setText(cadenadeNumeros);
        activado = true; //se va a poder usar la calculadora
    }//GEN-LAST:event_BotonCeroActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenadeNumeros);
            //guarda el numero y lo coloca en Muestra con el signo "+"
            Muestra.setText(cadenadeNumeros + " + ");
            cadenadeNumeros = "";
            operacion = "sumar";

            activado = true; //no se puede seguir usando la calculadora
        }
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        double segundoNumero;
        if (operacion.equals("nula")) {
            etiquetaNumeros.setText(cadenadeNumeros);
        } else if (operacion.equals("sumar")) {
            segundoNumero = Double.parseDouble(cadenadeNumeros);
            resultado = primerNumero + segundoNumero;;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenadeNumeros = String.valueOf(resultado);
            operacion = "nula";

            //ValueOf convierte la cadena en un valor entero
        } else if (operacion.equals("restar")) {
            segundoNumero = Double.parseDouble(cadenadeNumeros);
            resultado = primerNumero - segundoNumero;;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenadeNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("multiplicar")) {
            segundoNumero = Double.parseDouble(cadenadeNumeros);
            resultado = primerNumero * segundoNumero;;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenadeNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenadeNumeros);
            if (segundoNumero == 0) {
                etiquetaNumeros.setText("NoSeDividePor0");
            } else {
                resultado = primerNumero / segundoNumero;;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenadeNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }

        Muestra.setText("");
        activado = true;
        punto = false;
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenadeNumeros);
            Muestra.setText(cadenadeNumeros + " - ");
            cadenadeNumeros = "";
            operacion = "restar";

            activado = false;
        }
    }//GEN-LAST:event_BotonMenosActionPerformed

    private void BotonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCEActionPerformed
        Muestra.setText("");
        etiquetaNumeros.setText("0");
        operacion = "nula";
        cadenadeNumeros = "";
        activado = true;
        punto = true;
    }//GEN-LAST:event_BotonCEActionPerformed

    /**
     * @param args the comma line arguments
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
            java.util.logging.Logger.getLogger(Calculadoranet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadoranet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadoranet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadoranet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display theform */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadoranet().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonCE;
    private javax.swing.JButton BotonCero;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMasoMenos;
    private javax.swing.JButton BotonMenos;
    private javax.swing.JButton BotonMultiplicacion;
    private javax.swing.JButton BotonPunto;
    private javax.swing.JButton BotonRaiz;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JLabel Muestra;
    private javax.swing.JButton botonC;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
