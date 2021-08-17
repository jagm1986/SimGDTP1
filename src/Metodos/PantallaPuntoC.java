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
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class PantallaPuntoC extends javax.swing.JFrame {

    private MetodoGeneracionRND metodo;
    private ArrayList<Double> numerosGenerados;
    private int N;
    private ArrayList<Intervalo> filasTabla;
    

    public PantallaPuntoC() {
        initComponents();
        numerosGenerados = new ArrayList<>();


        this.setLocationRelativeTo(null);
        this.setResizable(false);


    }

   

    private void crearIntervalos() {
        int cantIntervalos=0;
        try{
        cantIntervalos = Integer.parseInt(txtIntervalos.getText());}
        catch(Exception e){
            
        }
        filasTabla = new ArrayList<>(cantIntervalos);

        float yi = 0;

        int tamañoMuestra = Integer.parseInt(txtNumeroGeneraciones.getText());

        double frecuenciaEsperadaPorIntervalo = (double) tamañoMuestra/ (double) cantIntervalos;
        frecuenciaEsperadaPorIntervalo =   (double) Math.round(frecuenciaEsperadaPorIntervalo * 10000d) / 10000d;
        for (int i = 0; i < cantIntervalos; i++) {
            Intervalo aux = new Intervalo(yi, yi + (1f / (float) cantIntervalos), frecuenciaEsperadaPorIntervalo);

         
            filasTabla.add(aux);
  
            yi += (1f / (float) cantIntervalos);
            
        }
        

    }

    private void cargarGrillaManual() {
        Object[][] matrizTabla = new Object[filasTabla.size() + 1][5];
        int i = 0;
        double acumuladorFrecuenciaObservada = 0, acumuladorEstadistico = 0;
        for (Intervalo intervaloActual : filasTabla) {
            intervaloActual.generarEstadistico();
            matrizTabla[i][0] = intervaloActual.nombreIntervalo();// fila i columna intervalo
            matrizTabla[i][1] = intervaloActual.getFrecuenciaObservada();// fila i columna frecuencia observada
            matrizTabla[i][2] = intervaloActual.getFrecuenciaEsperada();// fila i columna frecuencia esperada
            matrizTabla[i][3] = intervaloActual.getEstadistico();//fila i columna estadistico
            acumuladorEstadistico += intervaloActual.getEstadistico();
            intervaloActual.setValorEstadisticoAcumulado((double) Math.round(acumuladorEstadistico * 10000d) / 10000d);
            matrizTabla[i][4] = intervaloActual.getValorEstadisticoAcumulado();
            acumuladorFrecuenciaObservada += intervaloActual.getFrecuenciaObservada();;

            i++;
        }
        matrizTabla[i][0] = "Total";
        matrizTabla[i][1] = acumuladorFrecuenciaObservada;
        matrizTabla[i][2] = acumuladorFrecuenciaObservada;
        matrizTabla[i][3] = (double) Math.round(acumuladorEstadistico * 10000d) / 10000d ;
        matrizTabla[i][4] = (double) Math.round(acumuladorEstadistico * 10000d) / 10000d ;
        String[] NombresDeColumnas = new String[]{"Intervalo", "Frecuencia observada", "Frecuencia esperada", "Estadístico de la prueba", "Estadistico Acumulado"};

        tablaFrecuencia.setModel(new DefaultTableModel(matrizTabla, NombresDeColumnas));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAlgoritmo = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNumeroGeneraciones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGraficar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFrecuencia = new javax.swing.JTable();
        btnCargarTablaIntervalos = new javax.swing.JButton();
        cmbSignificancia = new javax.swing.JComboBox<>();
        btnPruebaJi = new javax.swing.JButton();
        lblResultadoPrueba = new javax.swing.JLabel();
        txtIntervalos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNumerosGenerados = new javax.swing.JTable();
        txtRaiz = new javax.swing.JTextField();
        lblRaiz = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        lblM = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        lblC = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Punto C");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 650));

        txtNumeroGeneraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroGeneracionesActionPerformed(evt);
            }
        });
        txtNumeroGeneraciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroGeneracionesKeyTyped(evt);
            }
        });

        jLabel2.setText("n:");

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        tablaFrecuencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Intervalo", "Frecuencia observada", "Frecuencia esperada", "Estadístico de la prueba"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaFrecuencia);

        btnCargarTablaIntervalos.setText("Llenar Tabla Intervalos");
        btnCargarTablaIntervalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaIntervalosActionPerformed(evt);
            }
        });

        cmbSignificancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.90", "0.95", "0.975", "0.99", "0.995" }));
        cmbSignificancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSignificanciaActionPerformed(evt);
            }
        });

        btnPruebaJi.setText("Realizar prueba Ji-Cuadrado");
        btnPruebaJi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaJiActionPerformed(evt);
            }
        });

        txtIntervalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntervalosActionPerformed(evt);
            }
        });
        txtIntervalos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntervalosKeyTyped(evt);
            }
        });

        jLabel3.setText("Intervalo:");

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

        lblRaiz.setText("X0");

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

        lblM.setText("M");

        txtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCargarTablaIntervalos)

                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblC)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtC))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblM)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtM))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtA))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(lblRaiz)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87)
                        .addComponent(btnGraficar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmbSignificancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPruebaJi))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(txtNumeroGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarTablaIntervalos)
                    .addComponent(btnGraficar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPruebaJi)
                    .addComponent(cmbSignificancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())

        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)

        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPruebaJiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaJiActionPerformed

        String seleccionado = (String)cmbSignificancia.getSelectedItem();
        System.out.println(seleccionado);

        double valorSeleccionado = Double.parseDouble(seleccionado);
        double valorSeleccionable = valorSeleccionado * 1000;

        int selector = (int) valorSeleccionable;

        //Realizacion de prueba ji-cuadrado.

        AbstractTableModel modeloTabla = (AbstractTableModel) tablaFrecuencia.getModel();

        int cantidadFilas = modeloTabla.getRowCount();
        int cantidadColumnas = modeloTabla.getColumnCount();
        double valorEstadistico = (double) modeloTabla.getValueAt((cantidadFilas - 1), (cantidadColumnas - 1));

        //double valorEstadistico = (double) valorEstadisticoFloat;

        int gradosLibertad = filasTabla.size() - 1;

        CalculadorJiCuadrado calculadorJiCuadrado = new CalculadorJiCuadrado();

        double alfa = 1-valorSeleccionado;
        
        boolean superaPrueba = calculadorJiCuadrado.superaPrueba(gradosLibertad, valorEstadistico, valorSeleccionado);

        if(superaPrueba)
        {
            lblResultadoPrueba.setText("PRUEBA JI-CUADRADO SUPERADA!!!");
            lblResultadoPrueba.setBackground(Color.GREEN);
        }
        else
        {
            lblResultadoPrueba.setText("PRUEBA JI-CUADRADO NO SUPERADA");
            lblResultadoPrueba.setBackground(Color.RED);
        }
    }//GEN-LAST:event_btnPruebaJiActionPerformed

    private void cmbSignificanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSignificanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSignificanciaActionPerformed

    private void btnCargarTablaIntervalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaIntervalosActionPerformed
        // TODO add your handling code here:

        
        this.crearIntervalos();
       
      
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
            double rnd = 0;
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

        
     
       metodo = new MetodoMixto(x);
       
         GeneradorNumerosAleatorios gnd = new GeneradorNumerosAleatorios();
         double rndTwo;
            for (int i = 0; i < n; i++) {
                //System.out.println(n);

                /*if (rdLenguaje.isSelected()) {
                    rnd = Math.random();
                } else {*/
                    rndTwo = gnd.generarAleatorioUniforme(0, 1, metodo, a, c, m);

                    rndTwo = (double) Math.round(rndTwo * 10000d) / 10000d;
                    numerosGenerados.add(rndTwo);

                }
       
        for (int i = 0; i < numerosGenerados.size(); i++) {
            rnd = numerosGenerados.get(i);
            for (Intervalo intervaloActual : filasTabla) {
                if (intervaloActual.contiene(rnd)) {
                    intervaloActual.aumentarFrecuenciaObservada();
                    break;
                }
            }
        }
        this.cargarGrillaManual();
       
                TablaNumeros modeloTablaNumeros = new TablaNumeros(numerosGenerados);

                tablaNumerosGenerados.setModel(modeloTablaNumeros);
            
    }//GEN-LAST:event_btnCargarTablaIntervalosActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:

        if (filasTabla != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for (Intervalo num : filasTabla) {
                dataset.addValue(num.getFrecuenciaObservada(), num.nombreIntervalo(), "");
                dataset.addValue(num.getFrecuenciaEsperada(), "(" + num.nombreIntervalo() + " Esperado)", "");
            }
            
    

            // crear grafico
            JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Frecuencia de números aleatorios generados por intervalo", //Título de la gráfica
                "Intervalos", //leyenda Eje horizontal
                "Frecuencia observada y Esperada", //leyenda Eje vertical
                dataset, //datos
                PlotOrientation.VERTICAL, //orientación
                true, //incluir leyendas
                true, //mostrar tooltips
                true);

            graficoBarras.setBackgroundPaint(Color.lightGray);

            CategoryPlot plot = (CategoryPlot) graficoBarras.getPlot();
            plot.setBackgroundPaint(Color.white); //fondo del grafico
            plot.setDomainGridlinesVisible(true);//lineas de rangos, visibles
            plot.setRangeGridlinePaint(Color.BLACK);//color de las lineas de rangos
            
            BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // set the color (r,g,b) or (r,g,b,a)
            for (int i = 1; i < dataset.getRowCount(); i+=2) {
                Color color = new Color(79, 129, 189);
        renderer.setSeriesPaint(i, color);
            }
        

            // crear la ventana del grafico
            ChartFrame frame = new ChartFrame("Gráfico de barras", graficoBarras);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(this, "Debe cargar numeros antes de graficar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void txtNumeroGeneracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroGeneracionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroGeneracionesActionPerformed

    private void txtIntervalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntervalosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntervalosActionPerformed

    private void txtRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaizActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtRaizActionPerformed

    private void txtRaizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRaizKeyTyped

        String textoPrevio = txtRaiz.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();

            txtRaiz.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtRaizKeyTyped

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtAActionPerformed

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped

        String textoPrevio = txtA.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtA.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtAKeyTyped

    private void txtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyTyped

        String textoPrevio = txtM.getText();
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtM.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtMKeyTyped

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped

        String textoPrevio = txtC.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtC.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void txtNumeroGeneracionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroGeneracionesKeyTyped
        // TODO add your handling code here:
        String textoPrevio = txtNumeroGeneraciones.getText();
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtNumeroGeneraciones.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtNumeroGeneracionesKeyTyped

    private void txtIntervalosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntervalosKeyTyped
        // TODO add your handling code here:
        String textoPrevio = txtIntervalos.getText();
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtIntervalos.setText(textoPrevio);
        }
    }//GEN-LAST:event_txtIntervalosKeyTyped

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
    private javax.swing.JButton btnCargarTablaIntervalos;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnPruebaJi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbSignificancia;
    private javax.swing.ButtonGroup grupoAlgoritmo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblResultadoPrueba;
    private javax.swing.JTable tablaFrecuencia;
    private javax.swing.JTable tablaNumerosGenerados;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtIntervalos;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtNumeroGeneraciones;
    private javax.swing.JTextField txtRaiz;
    // End of variables declaration//GEN-END:variables
}
