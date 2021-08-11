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
        txtG.setEnabled(false);
        txtK.setEnabled(false);
        txtM.setEnabled(false);
        txtRaiz.setEnabled(false);

        lblA.setEnabled(false);
        lblC.setEnabled(false);
        lblG.setEnabled(false);
        lblIngresoParametros.setEnabled(false);
        lblK.setEnabled(false);
        lblM.setEnabled(false);
        lblRaiz.setEnabled(false);
        this.setLocationRelativeTo(null);
        btnGenerarNumeros.setEnabled(false);
        this.setResizable(false);


    }

    private int cantidadIntervalos() {
        int cantIntervalos = 0;
        if (rdIntervalo10.isSelected()) {
            cantIntervalos = 10;
        }
        if (rdIntervalo15.isSelected()) {
            cantIntervalos = 15;
        }
        if (rdIntervalo20.isSelected()) {
            cantIntervalos = 20;
        }

        return cantIntervalos;
    }

    private void crearIntervalos() {
        int cantIntervalos = cantidadIntervalos();
        filasTabla = new ArrayList<>(cantIntervalos);

        float yi = 0;

        int tamañoMuestra = Integer.parseInt(txtNumeroGeneraciones.getText());

        float frecuenciaEsperadaPorIntervalo = tamañoMuestra / cantIntervalos;

        for (int i = 0; i < cantIntervalos; i++) {
            Intervalo aux = new Intervalo(yi, yi + (1f / (float) cantIntervalos), frecuenciaEsperadaPorIntervalo);

            /*if (i == 14)
            {
                double aux2 = 1.1;
                aux = new Intervalo(yi, aux2 , frecuenciaEsperadaPorIntervalo);
            }*/
            
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
            intervaloActual.setValorEstadisticoAcumulado(acumuladorEstadistico);
            matrizTabla[i][4] = intervaloActual.getValorEstadisticoAcumulado();
            acumuladorFrecuenciaObservada += intervaloActual.getFrecuenciaObservada();;

            i++;
        }
        matrizTabla[i][0] = "Total";
        matrizTabla[i][1] = acumuladorFrecuenciaObservada;
        matrizTabla[i][2] = acumuladorFrecuenciaObservada;
        matrizTabla[i][3] = acumuladorEstadistico;
        matrizTabla[i][4] = acumuladorEstadistico;
        String[] NombresDeColumnas = new String[]{"Intervalo", "Frecuencia observada", "Frecuencia esperada", "Estadístico de la prueba", "Estadistico Acumulado"};

        tablaFrecuencia.setModel(new DefaultTableModel(matrizTabla, NombresDeColumnas));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAlgoritmo = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdMixto = new javax.swing.JRadioButton();
        rdMultiplicativo = new javax.swing.JRadioButton();
        lblG = new javax.swing.JLabel();
        txtG = new javax.swing.JTextField();
        lblK = new javax.swing.JLabel();
        txtK = new javax.swing.JTextField();
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
        rdLenguaje = new javax.swing.JRadioButton();
        btnGraficar = new javax.swing.JButton();
        rdIntervalo10 = new javax.swing.JRadioButton();
        rdIntervalo15 = new javax.swing.JRadioButton();
        rdIntervalo20 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFrecuencia = new javax.swing.JTable();
        btnCargarTablaIntervalos = new javax.swing.JButton();
        cmbSignificancia = new javax.swing.JComboBox<>();
        btnPruebaJi = new javax.swing.JButton();
        lblResultadoPrueba = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Punto A");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 650));

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

        lblG.setText("G");

        txtG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGKeyTyped(evt);
            }
        });

        lblK.setText("K");

        txtK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKActionPerformed(evt);
            }
        });
        txtK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKKeyTyped(evt);
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

        btnGenerarNumeros.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerarNumeros.setText("Generar numeros aleatorios");
        btnGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumerosActionPerformed(evt);
            }
        });

        jLabel1.setText("Método:");

        lblIngresoParametros.setText("Parámetros:");

        jLabel2.setText("n");

        rdLenguaje.setBackground(new java.awt.Color(155, 253, 155));
        grupoAlgoritmo.add(rdLenguaje);
        rdLenguaje.setText("Metodo Lenguaje");
        rdLenguaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rdLenguajeMouseReleased(evt);
            }
        });

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        rdIntervalo10.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(rdIntervalo10);
        rdIntervalo10.setText("10 intervalos");

        rdIntervalo15.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(rdIntervalo15);
        rdIntervalo15.setText("15 intervalos");

        rdIntervalo20.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(rdIntervalo20);
        rdIntervalo20.setText("20 intervalos");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblIngresoParametros)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(33, 33, 33)
                                                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(77, 77, 77)
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtNumeroGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(75, 75, 75)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblM)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblC)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(lblRaiz)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(94, 94, 94))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(lblA)
                                                            .addGap(157, 157, 157)))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(lblG)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(lblK)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtK))))))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGenerarNumeros)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdMixto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdMultiplicativo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdLenguaje)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnCargarTablaIntervalos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rdIntervalo20))
                                        .addComponent(rdIntervalo15)
                                        .addComponent(rdIntervalo10))
                                    .addGap(200, 200, 200)
                                    .addComponent(btnGraficar))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSignificancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPruebaJi))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblIngresoParametros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblK)
                    .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaiz)
                    .addComponent(txtRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblG)
                    .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblC)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdMixto)
                                    .addComponent(rdMultiplicativo)
                                    .addComponent(jLabel1)
                                    .addComponent(rdLenguaje))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGenerarNumeros)
                                    .addComponent(btnCargarTablaIntervalos)))
                            .addComponent(btnGraficar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdIntervalo10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdIntervalo15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdIntervalo20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSignificancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPruebaJi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumerosActionPerformed

        if (rdLenguaje.isSelected()) {
            if (txtNumeroGeneraciones.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor para cada parámetro esencial", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                txtM.requestFocus();
                return;
            }
        } else {
            if (txtRaiz.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un valor para cada parámetro esencial", "Parámetros insuficientes", JOptionPane.WARNING_MESSAGE);
                txtRaiz.requestFocus();
                return;
            }

            if (txtA.getText().trim().equals("")) {
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
        }

        int a = 0, c = 0, m = 0, x = 0, n = 0;
        numerosGenerados = new ArrayList<Double>();
        try {
            a = Integer.parseInt(txtA.getText());
            x = Integer.parseInt(txtRaiz.getText());
            m = Integer.parseInt(txtM.getText());
            c = Integer.parseInt(txtC.getText());
            n = Integer.parseInt(txtNumeroGeneraciones.getText());
        } catch (NumberFormatException e) {
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

        if (rdLenguaje.isSelected()) {
            n = Integer.parseInt(txtNumeroGeneraciones.getText());
        }

        GeneradorNumerosAleatorios gnd = new GeneradorNumerosAleatorios();

        boolean considerarUno = false;

        double rnd;
        for (int i = 0; i < n; i++) {
            //System.out.println(n);

            if (rdLenguaje.isSelected()) {
                rnd = Math.random();
            } else {
                rnd = gnd.generarAleatorioUniforme(0, 1, metodo, a, c, m);
            }
            rnd = (double) Math.round(rnd * 10000d) / 10000d;
            numerosGenerados.add(rnd);

        }

        TablaNumeros modeloTablaNumeros = new TablaNumeros(numerosGenerados);

        tablaNumerosGenerados.setModel(modeloTablaNumeros);

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

    private void txtKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKKeyTyped

        String textoPrevio = txtK.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtK.setText(textoPrevio);
        }

    }//GEN-LAST:event_txtKKeyTyped

    private void txtKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKKeyReleased
        int valorK = 0;
        try {

            valorK = Integer.parseInt(txtK.getText());

            int nuevoValorA = 0;
            if (rdMixto.isSelected()) {
                nuevoValorA = 1 + (4 * valorK);
            }
            if (rdMultiplicativo.isSelected()) {
                nuevoValorA = 3 + (8 * valorK);
            }

            txtA.setText(Integer.toString(nuevoValorA));
        } catch (Exception E) {
            txtA.setText("");
        }

    }//GEN-LAST:event_txtKKeyReleased

    private void txtKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKKeyPressed

    }//GEN-LAST:event_txtKKeyPressed

    private void txtKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKActionPerformed

    }//GEN-LAST:event_txtKActionPerformed

    private void txtGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKeyTyped

        String textoPrevio = txtG.getText();
        char caracterIngresado = evt.getKeyChar();

        if (!Character.isDigit(caracterIngresado)) {
            evt.consume();
            txtG.setText(textoPrevio);
        }

    }//GEN-LAST:event_txtGKeyTyped

    private void txtGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKeyReleased

        int valorG = 0;
        try {

            valorG = Integer.parseInt(txtG.getText());

            double gDouble = (double) valorG;
            int nuevoValorM = (int) Math.pow(2, gDouble);

            txtM.setText(Integer.toString(nuevoValorM));
        } catch (Exception E) {
            txtM.setText("");
        }

    }//GEN-LAST:event_txtGKeyReleased

    private void txtGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKeyPressed
        //            int g=0,m,c,a;
        //       if(evt.getKeyCode() >= 49 && evt.getKeyCode()<=57 )
        //       {
        //          try
        //        {
        //          g = Integer.parseInt(txtG.getText());
        //
        //        }catch(NumberFormatException ex)
        //        {
        //
        //        }
        //
        //       m=(int)Math.pow(2, g);
        //       txtM.setText(" "+m);
        //
        //       }
        //
    }//GEN-LAST:event_txtGKeyPressed

    private void rdMultiplicativoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMultiplicativoMousePressed
        if (!rdMultiplicativo.isSelected()) {
            txtA.setText("");
            txtC.setText("");
            txtG.setText("");
            txtK.setText("");
            txtM.setText("");
            txtRaiz.setText("");
        }
    }//GEN-LAST:event_rdMultiplicativoMousePressed

    private void rdMultiplicativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMultiplicativoMouseClicked

    }//GEN-LAST:event_rdMultiplicativoMouseClicked

    private void rdMixtoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rdMixtoPropertyChange

    }//GEN-LAST:event_rdMixtoPropertyChange

    private void rdMixtoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMixtoMousePressed
        if (!rdMixto.isSelected()) {
            txtA.setText("");
            txtC.setText("");
            txtG.setText("");
            txtK.setText("");
            txtM.setText("");
            txtRaiz.setText("");
        }
    }//GEN-LAST:event_rdMixtoMousePressed

    private void rdMixtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMixtoMouseClicked

    }//GEN-LAST:event_rdMixtoMouseClicked

    private void rdMixtoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMixtoMouseReleased

        txtA.setEnabled(true);
        txtC.setEnabled(true);
        txtG.setEnabled(true);
        txtK.setEnabled(true);
        txtM.setEnabled(true);
        txtRaiz.setEnabled(true);

        lblA.setEnabled(true);
        lblC.setEnabled(true);
        lblG.setEnabled(true);
        lblIngresoParametros.setEnabled(true);
        lblK.setEnabled(true);
        lblM.setEnabled(true);
        //lblParametrosAdicionales.setEnabled(true);
        //lblParametrosEsenciales.setEnabled(true);
        lblRaiz.setEnabled(true);

 
        btnGenerarNumeros.setEnabled(true);

        txtRaiz.requestFocus();

    }//GEN-LAST:event_rdMixtoMouseReleased

    private void rdMultiplicativoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMultiplicativoMouseReleased

        txtA.setEnabled(true);
        txtC.setEnabled(false);
        txtG.setEnabled(true);
        txtK.setEnabled(true);
        txtM.setEnabled(true);
        txtRaiz.setEnabled(true);

        lblA.setEnabled(true);
        lblC.setEnabled(false);
        lblG.setEnabled(true);
        lblIngresoParametros.setEnabled(true);
        lblK.setEnabled(true);
        lblM.setEnabled(true);
        lblRaiz.setEnabled(true);


        btnGenerarNumeros.setEnabled(true);

        txtRaiz.requestFocus();
    }//GEN-LAST:event_rdMultiplicativoMouseReleased

    private void txtRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRaizActionPerformed

    private void rdMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMixtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMixtoActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void rdMultiplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMultiplicativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMultiplicativoActionPerformed

    private void rdLenguajeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdLenguajeMouseReleased
        // TODO add your handling code here:
        txtA.setEnabled(false);
        txtC.setEnabled(false);
        txtG.setEnabled(false);
        txtK.setEnabled(false);
        txtM.setEnabled(false);
        txtRaiz.setEnabled(false);

        lblA.setEnabled(false);
        lblC.setEnabled(false);
        lblG.setEnabled(false);
        lblIngresoParametros.setEnabled(false);
        lblK.setEnabled(false);
        lblM.setEnabled(false);
        lblRaiz.setEnabled(false);


        btnGenerarNumeros.setEnabled(true);

        txtNumeroGeneraciones.requestFocus();

    }//GEN-LAST:event_rdLenguajeMouseReleased

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:

        if (filasTabla != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for (Intervalo num : filasTabla) {
                dataset.addValue(num.getFrecuenciaObservada(), num.nombreIntervalo(), "");
            }

            // crear grafico
            JFreeChart graficoBarras = ChartFactory.createBarChart(
                    "Frecuencia de números aleatorios generados por intervalo", //Título de la gráfica
                    "Intervalos", //leyenda Eje horizontal
                    "Frecuencia observada", //leyenda Eje vertical
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

            // crear la ventana del grafico
            ChartFrame frame = new ChartFrame("Gráfico de barras", graficoBarras);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(this, "Debe cargar numeros antes de graficar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnCargarTablaIntervalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaIntervalosActionPerformed
        // TODO add your handling code here:

        this.crearIntervalos();
        N = Integer.parseInt(txtNumeroGeneraciones.getText());
        double rnd = 0;
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

    }//GEN-LAST:event_btnCargarTablaIntervalosActionPerformed

    private void cmbSignificanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSignificanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSignificanciaActionPerformed

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

        boolean superaPrueba = calculadorJiCuadrado.superaPrueba(gradosLibertad, valorEstadistico, selector);

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
    private javax.swing.JButton btnGenerarNumeros;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnPruebaJi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbSignificancia;
    private javax.swing.ButtonGroup grupoAlgoritmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblG;
    private javax.swing.JLabel lblIngresoParametros;
    private javax.swing.JLabel lblK;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblResultadoPrueba;
    private javax.swing.JRadioButton rdIntervalo10;
    private javax.swing.JRadioButton rdIntervalo15;
    private javax.swing.JRadioButton rdIntervalo20;
    private javax.swing.JRadioButton rdLenguaje;
    private javax.swing.JRadioButton rdMixto;
    private javax.swing.JRadioButton rdMultiplicativo;
    private javax.swing.JTable tablaFrecuencia;
    private javax.swing.JTable tablaNumerosGenerados;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtK;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtNumeroGeneraciones;
    private javax.swing.JTextField txtRaiz;
    // End of variables declaration//GEN-END:variables
}
