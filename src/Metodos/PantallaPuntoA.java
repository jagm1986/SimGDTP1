package Metodos;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class PantallaPuntoA extends javax.swing.JFrame {

    private MetodoGeneracionRND metodo;
    
    private ArrayList<Double> numerosGenerados;
    private int N;
    private ArrayList<Intervalo> filasTabla;

    public PantallaPuntoA() {
        initComponents();
        numerosGenerados = new ArrayList<>();

        txtA.setEnabled(false);
        txtC.setEnabled(false);
        txtM.setEnabled(false);
        txtRaiz.setEnabled(false);
        proxVeinteButton.setEnabled(false);
        proxButton.setEnabled(false);
        desdeHastaButton.setEnabled(false);
        hastaFinalButton.setEnabled(false);
        listarDesdeTxt.setEnabled(false);
        listarHastaTxt.setEnabled(false);
        txtNumeroGeneraciones.setEnabled(false);

        lblA.setEnabled(false);
        lblC.setEnabled(false);
        lblIngresoParametros.setEnabled(false);
        lblM.setEnabled(false);
        lblRaiz.setEnabled(false);
        this.setLocationRelativeTo(null);
        btnGenerarNumeros.setEnabled(false);
        this.setResizable(false);


    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAlgoritmo = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdMixto = new javax.swing.JRadioButton();
        rdMultiplicativo = new javax.swing.JRadioButton();
        lblA = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        lblC = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        txtM = new javax.swing.JTextField();
        lblM = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();
        txtRaiz = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNumerosGenerados = new javax.swing.JTable();
        btnGenerarNumeros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblIngresoParametros = new javax.swing.JLabel();
        txtNumeroGeneraciones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        proxVeinteButton = new javax.swing.JButton();
        proxButton = new javax.swing.JButton();
        hastaFinalButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        listarDesdeTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        listarHastaTxt = new javax.swing.JTextField();
        desdeHastaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Punto A");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        rdMixto.setBackground(new java.awt.Color(153, 255, 153));
        grupoAlgoritmo.add(rdMixto);
        rdMixto.setText("Congruencial mixto");
        rdMixto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdMixtoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdMixtoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rdMixtoMouseReleased(evt);
            }
        });
        rdMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMixtoActionPerformed(evt);
            }
        });
        rdMixto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rdMixtoPropertyChange(evt);
            }
        });

        rdMultiplicativo.setBackground(new java.awt.Color(153, 255, 153));
        grupoAlgoritmo.add(rdMultiplicativo);
        rdMultiplicativo.setText("Congruencial Multiplicativo");
        rdMultiplicativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdMultiplicativoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdMultiplicativoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rdMultiplicativoMouseReleased(evt);
            }
        });
        rdMultiplicativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMultiplicativoActionPerformed(evt);
            }
        });

        lblA.setText("A");

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        lblC.setText("C");

        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });

        txtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMKeyTyped(evt);
            }
        });

        lblM.setText("M");

        lblRaiz.setText("X0");

        txtRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaizActionPerformed(evt);
            }
        });
        txtRaiz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRaizKeyTyped(evt);
            }
        });

        tablaNumerosGenerados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Orden", "Numero Aleatorio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaNumerosGenerados);

        btnGenerarNumeros.setBackground(new java.awt.Color(51, 204, 255));
        btnGenerarNumeros.setText("Generar numeros aleatorios");
        btnGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumerosActionPerformed(evt);
            }
        });

        jLabel1.setText("Método:");

        lblIngresoParametros.setText("Parámetros:");

        txtNumeroGeneraciones.setText("50000");
        txtNumeroGeneraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroGeneracionesActionPerformed(evt);
            }
        });

        jLabel2.setText("n");

        proxVeinteButton.setText("Listar proximos 20");
        proxVeinteButton.setName("ProxVeinte"); // NOI18N
        proxVeinteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxVeinteButtonActionPerformed(evt);
            }
        });

        proxButton.setText("Listar proximo");
        proxButton.setName("ProxVeinte"); // NOI18N
        proxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxButtonActionPerformed(evt);
            }
        });

        hastaFinalButton.setText("Listar hasta el final");
        hastaFinalButton.setName("ProxVeinte"); // NOI18N
        hastaFinalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaFinalButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Listar desde:");

        listarDesdeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarDesdeTxtActionPerformed(evt);
            }
        });
        listarDesdeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listarDesdeTxtKeyTyped(evt);
            }
        });

        jLabel4.setText("hasta:");

        listarHastaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarHastaTxtActionPerformed(evt);
            }
        });
        listarHastaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listarHastaTxtKeyTyped(evt);
            }
        });

        desdeHastaButton.setText("Listar");
        desdeHastaButton.setName("ProxVeinte"); // NOI18N
        desdeHastaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desdeHastaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIngresoParametros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtA))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtM))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtC))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblRaiz)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdMixto)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdMultiplicativo)))))
                        .addGap(133, 133, 133))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGenerarNumeros)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(proxVeinteButton)
                                .addGap(71, 71, 71)
                                .addComponent(proxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hastaFinalButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(listarDesdeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listarHastaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(desdeHastaButton)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rdMixto)
                    .addComponent(rdMultiplicativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIngresoParametros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaiz)
                    .addComponent(txtRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblM)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblC)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarNumeros)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proxVeinteButton)
                    .addComponent(proxButton)
                    .addComponent(hastaFinalButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(listarDesdeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(listarHastaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desdeHastaButton))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroGeneracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroGeneracionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroGeneracionesActionPerformed

    private void btnGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumerosActionPerformed

      

            if (txtRaiz.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor para cada parámetro esencial", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                txtRaiz.requestFocus();
                return;
            }

            if (txtA.getText().trim().equals("") ) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor para cada parámetro esencial", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                txtA.requestFocus();
                return;
            }

            if (txtC.getText().trim().equals("")) {
                if (rdMixto.isSelected()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor para cada parámetro esencial", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                    txtC.requestFocus();
                    return;
                }
            }

            if (txtM.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor para cada parámetro esencial", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                txtM.requestFocus();
                return;
            }

            if (txtNumeroGeneraciones.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor para cada parámetro esencial", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                txtM.requestFocus();
                return;

            }

            long a = 0, c = 0, m = 0, x = 0, n = 0;
            numerosGenerados = new ArrayList<Double>();
            try {
                a = Long.parseLong(txtA.getText());
                x = Long.parseLong(txtRaiz.getText());
                m = Long.parseLong(txtM.getText());
                c = Long.parseLong(txtC.getText());
                n = Long.parseLong(txtNumeroGeneraciones.getText());
            } catch (NumberFormatException e) {
            }

            //Validaciones para 𝑎∈ℤ, 1≤𝑎≤𝑚, 𝑥0∈ℤ, 0≤𝑥0≤𝑚−1, 𝑐∈ℤ, 0≤𝑐≤𝑚, 𝑚∈ℤ.
            if (a<1 || a>m){
                JOptionPane.showMessageDialog(new JFrame(), "El valor de 'a' no puede ser menor a 1 o mayor a m", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                txtA.requestFocus();
                return;
            }

            if(x<0 || x>m-1)
            {
                JOptionPane.showMessageDialog(new JFrame(), "El valor de la semilla 'x' no puede ser menor a 0 o mayor a m-1", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                txtRaiz.requestFocus();
                return;
            }

            if(c<0 || x>m)
            {
                JOptionPane.showMessageDialog(new JFrame(), "El valor de la semilla 'c' no puede ser menor a 0 o mayor a m", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                txtC.requestFocus();
                return;
            }

            if (rdMixto.isSelected()) {
                metodo = new MetodoMixto(x);
            }

            if (rdMultiplicativo.isSelected()) {
                c = 0;
                metodo = new MetodoMultiplicativo(x);
                n = Integer.parseInt(txtNumeroGeneraciones.getText());
                // provisorio por alguna razon.
            }

          
            GeneradorNumerosAleatorios gnd = new GeneradorNumerosAleatorios();

            boolean considerarUno = false;

            double rnd;
            for (int i = 0; i < n; i++) {
               
                    rnd = gnd.generarAleatorioUniforme(0, 1, metodo, a, c, m);

                    rnd = (double) Math.round(rnd * 10000d) / 10000d;
                    numerosGenerados.add(rnd);
                }
            desdeHastaButton.setEnabled(true);
            listarDesdeTxt.setEnabled(true);
            listarHastaTxt.setEnabled(true);
            
            if(numerosGenerados.size()>20){
                ArrayList temp = new ArrayList(numerosGenerados.subList(0,20));
                TablaNumeros modeloTablaNumeros = new TablaNumeros(temp);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
                proxButton.setEnabled(true);
                proxVeinteButton.setEnabled(true);
                
                hastaFinalButton.setEnabled(true);
            }
            else{
                TablaNumeros modeloTablaNumeros = new TablaNumeros(numerosGenerados);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
            }
                //se va repitiendo el metodo de forma secuencial a medida que se van cargando los numeros aleatorios en la lista//
                //y luego cuando estan todos se cargan en la tabla que se inserta en la pantalla//
                
                
    }//GEN-LAST:event_btnGenerarNumerosActionPerformed

    private void txtRaizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRaizKeyTyped

        String textoPrevio = txtRaiz.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            
            txtRaiz.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtRaizKeyTyped

    private void txtRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaizActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtRaizActionPerformed

    private void txtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyTyped

        String textoPrevio = txtM.getText();
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtM.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtMKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped

        String textoPrevio = txtC.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtC.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped

        String textoPrevio = txtA.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtA.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtAKeyTyped

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void rdMultiplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMultiplicativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMultiplicativoActionPerformed

    private void rdMultiplicativoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMultiplicativoMouseReleased

        txtA.setEnabled(true);
        txtC.setEnabled(false);
       
        txtM.setEnabled(true);
        txtRaiz.setEnabled(true);

        lblA.setEnabled(true);
        lblC.setEnabled(false);
       
        lblIngresoParametros.setEnabled(true);

        lblM.setEnabled(true);
        lblRaiz.setEnabled(true);

        btnGenerarNumeros.setEnabled(true);

        txtRaiz.requestFocus();
    }//GEN-LAST:event_rdMultiplicativoMouseReleased

    private void rdMultiplicativoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMultiplicativoMousePressed
        if (!rdMultiplicativo.isSelected()) {
            txtA.setText("");
            txtC.setText("");
            txtM.setText("");
            txtRaiz.setText("");
        }
    }//GEN-LAST:event_rdMultiplicativoMousePressed

    private void rdMultiplicativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMultiplicativoMouseClicked

    }//GEN-LAST:event_rdMultiplicativoMouseClicked

    private void rdMixtoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rdMixtoPropertyChange

    }//GEN-LAST:event_rdMixtoPropertyChange

    private void rdMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMixtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMixtoActionPerformed

    private void rdMixtoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMixtoMouseReleased

        txtA.setEnabled(true);
        txtC.setEnabled(true);

        txtM.setEnabled(true);
        txtRaiz.setEnabled(true);

        lblA.setEnabled(true);
        lblC.setEnabled(true);

        lblIngresoParametros.setEnabled(true);
        lblM.setEnabled(true);
     
        lblRaiz.setEnabled(true);

        btnGenerarNumeros.setEnabled(true);

        txtRaiz.requestFocus();
    }//GEN-LAST:event_rdMixtoMouseReleased

    private void rdMixtoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMixtoMousePressed
        if (!rdMixto.isSelected()) {
            txtA.setText("");
            txtC.setText("");
            txtM.setText("");
            txtRaiz.setText("");
        }
    }//GEN-LAST:event_rdMixtoMousePressed

    private void rdMixtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMixtoMouseClicked

    }//GEN-LAST:event_rdMixtoMouseClicked

    private void proxVeinteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxVeinteButtonActionPerformed
        // TODO add your handling code here:
        if(numerosGenerados.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Debe generar numeros primero", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                return;
        }
        if(numerosGenerados.size() < 20){
            JOptionPane.showMessageDialog(new JFrame(), "No hay mas numeros para mostrar", "Limite alcanzado", JOptionPane.WARNING_MESSAGE);
                return;
        }
        
        int cant = tablaNumerosGenerados.getRowCount();
        
        if(cant + 20 < numerosGenerados.size()){
        ArrayList temp = new ArrayList(numerosGenerados.subList(0,cant + 20));
                TablaNumeros modeloTablaNumeros = new TablaNumeros(temp);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
        }
        else{ 
            if (cant == numerosGenerados.size()){
                JOptionPane.showMessageDialog(new JFrame(), "No hay mas numeros para mostrar", "Limite alcanzado", JOptionPane.WARNING_MESSAGE);
                return;
            }
                TablaNumeros modeloTablaNumeros = new TablaNumeros(numerosGenerados);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
                
                
        }
    }//GEN-LAST:event_proxVeinteButtonActionPerformed

    private void proxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxButtonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(numerosGenerados.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Debe generar numeros primero", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                return;
        }
        //Esto creo que no hace falta
        if(numerosGenerados.size() < 20){
            JOptionPane.showMessageDialog(new JFrame(), "No hay mas numeros para mostrar", "Limite alcanzado", JOptionPane.WARNING_MESSAGE);
                return;
        }
        
        int cant = tablaNumerosGenerados.getRowCount();
        
        if(cant + 1 < numerosGenerados.size()){
        ArrayList temp = new ArrayList(numerosGenerados.subList(0,cant + 1));
                TablaNumeros modeloTablaNumeros = new TablaNumeros(temp);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
        }
        else{ 
            if (cant == numerosGenerados.size()){
                JOptionPane.showMessageDialog(new JFrame(), "No hay mas numeros para mostrar", "Limite alcanzado", JOptionPane.WARNING_MESSAGE);
                return;
            }
                TablaNumeros modeloTablaNumeros = new TablaNumeros(numerosGenerados);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
                
                
        }
    }//GEN-LAST:event_proxButtonActionPerformed

    private void hastaFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaFinalButtonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(numerosGenerados.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Debe generar numeros primero", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                return;
        }
        if(numerosGenerados.size() < 20){
            JOptionPane.showMessageDialog(new JFrame(), "No hay mas numeros para mostrar", "Limite alcanzado", JOptionPane.WARNING_MESSAGE);
                return;
        }
        int cant = tablaNumerosGenerados.getRowCount();
        if (cant == numerosGenerados.size()){
                JOptionPane.showMessageDialog(new JFrame(), "No hay mas numeros para mostrar", "Limite alcanzado", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
                TablaNumeros modeloTablaNumeros = new TablaNumeros(numerosGenerados);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
    }//GEN-LAST:event_hastaFinalButtonActionPerformed

    private void listarDesdeTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listarDesdeTxtKeyTyped
        // TODO add your handling code here:
        String textoPrevio = listarDesdeTxt.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            listarDesdeTxt.setText(textoPrevio);
        }
    }//GEN-LAST:event_listarDesdeTxtKeyTyped

    private void listarHastaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listarHastaTxtKeyTyped
        // TODO add your handling code here:
         String textoPrevio = listarHastaTxt.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            listarHastaTxt.setText(textoPrevio);
        }
    }//GEN-LAST:event_listarHastaTxtKeyTyped

    private void desdeHastaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desdeHastaButtonActionPerformed
        // TODO add your handling code here:
        int desde = 0;
         int hasta = 0; 
         if(numerosGenerados.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Debe generar numeros primero", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                return;
        }
         
         if (listarDesdeTxt.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor en 'desde'", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                listarDesdeTxt.requestFocus();
                return;
            }
         
          if (listarHastaTxt.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor en 'hasta'", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                listarHastaTxt.requestFocus();
                return;
            }
         try{
         desde = Integer.parseInt(listarDesdeTxt.getText());
         hasta = Integer.parseInt(listarHastaTxt.getText());
         }catch (NumberFormatException e) {
         }
          if(desde <= numerosGenerados.size() && desde!=0){
              if(hasta > desde && hasta <= numerosGenerados.size()){
                 ArrayList temp = new ArrayList(numerosGenerados.subList(desde-1,hasta));
                TablaNumeros modeloTablaNumeros = new TablaNumeros(temp);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
              }else if(hasta == desde) {
                  ArrayList temp = new ArrayList(numerosGenerados.subList(desde,hasta));
                TablaNumeros modeloTablaNumeros = new TablaNumeros(temp);
                tablaNumerosGenerados.setModel(modeloTablaNumeros);
              }else{
                  JOptionPane.showMessageDialog(new JFrame(), "El parametro 'hasta' no es correcto", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                return;
              }
          }
          else{
              JOptionPane.showMessageDialog(new JFrame(), "El parametro 'desde' no es correcto", "Parámetro incorrecto", JOptionPane.WARNING_MESSAGE);
                return;
          }
    }//GEN-LAST:event_desdeHastaButtonActionPerformed

    private void listarHastaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarHastaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarHastaTxtActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void listarDesdeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarDesdeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarDesdeTxtActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPuntoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPuntoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPuntoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPuntoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPuntoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarNumeros;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton desdeHastaButton;
    private javax.swing.ButtonGroup grupoAlgoritmo;
    private javax.swing.JButton hastaFinalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblIngresoParametros;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JTextField listarDesdeTxt;
    private javax.swing.JTextField listarHastaTxt;
    private javax.swing.JButton proxButton;
    private javax.swing.JButton proxVeinteButton;
    private javax.swing.JRadioButton rdMixto;
    private javax.swing.JRadioButton rdMultiplicativo;
    private javax.swing.JTable tablaNumerosGenerados;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtNumeroGeneraciones;
    private javax.swing.JTextField txtRaiz;
    // End of variables declaration//GEN-END:variables
}
