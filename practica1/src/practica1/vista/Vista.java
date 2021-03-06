/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.vista;

import javax.swing.*;
import practica1.AGenetico;
import practica1.Selectores;
import org.math.plot.*;
import practica1.Practica1;

/**
 *
 * @author usuario_local
 */
public class Vista extends javax.swing.JFrame {

	/**
	 * Creates new form Vista
	 */
	public Vista() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluarButton = new javax.swing.JButton();
        mejorAbsolutoText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        elitismoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoSeleccionBox = new javax.swing.JComboBox();
        tamPoblacionText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numGeneracionesText = new javax.swing.JTextField();
        funcionBox = new javax.swing.JComboBox<>();
        porcentajeCrucesText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        porcentajeMutacionesText = new javax.swing.JTextField();
        numGenesBox = new javax.swing.JComboBox<>();
        precisionText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        graficaPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo genético");

        evaluarButton.setText("Evaluar población");
        evaluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarButtonActionPerformed(evt);
            }
        });

        mejorAbsolutoText.setText("Mejor absoluto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setText("Elitismo:");

        jLabel1.setText("Tamaño de población:");

        elitismoText.setText("0.02");
        elitismoText.setToolTipText("");
        elitismoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elitismoTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Número de generaciones:");

        jLabel7.setText("Tipo de selección:");

        jLabel3.setText("Porcentaje de cruces:");

        jLabel4.setText("Porcentaje de mutaciones:");

        tipoSeleccionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RULETA", "TORNEO", "ESTOCASTICO" }));
        tipoSeleccionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSeleccionBoxActionPerformed(evt);
            }
        });

        tamPoblacionText.setText("100");
        tamPoblacionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamPoblacionTextActionPerformed(evt);
            }
        });

        jLabel8.setText("Función:");

        numGeneracionesText.setText("100");

        funcionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F1", "F2", "F3", "F4", "F5" }));

        porcentajeCrucesText.setText("0");
        porcentajeCrucesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeCrucesTextActionPerformed(evt);
            }
        });

        jLabel9.setText("Número de genes:");

        porcentajeMutacionesText.setText("0");

        numGenesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3" }));

        precisionText.setText("0.001");
        precisionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precisionTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Precisión:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precisionText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tamPoblacionText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numGeneracionesText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(porcentajeCrucesText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(porcentajeMutacionesText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numGenesBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(elitismoText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(funcionBox, 0, 92, Short.MAX_VALUE)
                                    .addComponent(tipoSeleccionBox, 0, 1, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funcionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoSeleccionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamPoblacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numGeneracionesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentajeCrucesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentajeMutacionesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precisionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elitismoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numGenesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout graficaPanelLayout = new javax.swing.GroupLayout(graficaPanel);
        graficaPanel.setLayout(graficaPanelLayout);
        graficaPanelLayout.setHorizontalGroup(
            graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        graficaPanelLayout.setVerticalGroup(
            graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(evaluarButton)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(mejorAbsolutoText, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(graficaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(graficaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(mejorAbsolutoText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(evaluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	// Código que se ejecuta al presionar el botón de "Evaluar población"
	private void evaluarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_evaluarButtonActionPerformed
		int tamPoblacion, numGeneraciones, numGenes;
		double probabilidadCruce, probabilidadMutacion, tolerancia, elitismo;
		Selectores selector;
		String funcion;
                boolean minMax = false;
                double cmax = -1000;

		AGenetico algoritmo;

		try {
			// Almacenamos cada valor introducido por el usuario en una variable
			tamPoblacion = Integer.parseInt(this.tamPoblacionText.getText());
			numGeneraciones = Integer.parseInt(this.numGeneracionesText.getText());
			numGenes = Integer.parseInt(this.numGenesBox.getSelectedItem().toString());

			probabilidadCruce = Double.parseDouble(this.porcentajeCrucesText.getText());
			probabilidadMutacion = Double.parseDouble(this.porcentajeMutacionesText.getText());
			tolerancia = Double.parseDouble(this.precisionText.getText());
			elitismo = Double.parseDouble(this.elitismoText.getText());

			selector = Selectores.valueOf(this.tipoSeleccionBox.getSelectedItem().toString());

			funcion = this.funcionBox.getSelectedItem().toString();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}


                algoritmo = new AGenetico(tamPoblacion, numGeneraciones, probabilidadCruce, probabilidadMutacion,
					tolerancia, selector, 2, numGenes, funcion, elitismo);

                
                if(funcion == "F1" || funcion == "F3")
                    minMax = true;
                

		algoritmo.inicializa();
		algoritmo.evaluarPoblacion(cmax);
		for (int i = 0; i < numGeneraciones; i++) {
			algoritmo.seleccionarElite(minMax);
			algoritmo.seleccion(minMax);
			algoritmo.cruzar();
			algoritmo.mutacion();

                        algoritmo.incluirElite(minMax);
                        
			algoritmo.aumentarGeneracion();
			algoritmo.evaluarPoblacion(cmax);
		}
                
                
                this.mejorAbsolutoText.setText("Mejor absoluto: " + algoritmo.getMejor().getFitness());
                
		

		// define your data
		double[] x = new double[numGeneraciones];

		for (int i = 0; i < numGeneraciones; i++) {
			x[i] = i;
		}

		double[] y = algoritmo.getMejoresAbsolutos();
		double[] z = algoritmo.getMejoresGeneracion();
		double[] k = algoritmo.getMedias();

		Practica1.plot.removeAllPlots();

		// add a line plot to the PlotPanel
		Practica1.plot.addLinePlot("Mejor acumulado", x, y);
		Practica1.plot.addLinePlot("Mejor de la generacion", x, z);
		Practica1.plot.addLinePlot("Media de la generacion", x, k);

	}// GEN-LAST:event_evaluarButtonActionPerformed

	private void precisionTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_precisionTextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_precisionTextActionPerformed

	private void porcentajeCrucesTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_porcentajeCrucesTextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_porcentajeCrucesTextActionPerformed

	private void tamPoblacionTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tamPoblacionTextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tamPoblacionTextActionPerformed

	private void tipoSeleccionBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tipoSeleccionBoxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tipoSeleccionBoxActionPerformed

	private void elitismoTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_elitismoTextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_elitismoTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField elitismoText;
    private javax.swing.JButton evaluarButton;
    private javax.swing.JComboBox<String> funcionBox;
    private javax.swing.JPanel graficaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mejorAbsolutoText;
    private javax.swing.JTextField numGeneracionesText;
    private javax.swing.JComboBox<String> numGenesBox;
    private javax.swing.JTextField porcentajeCrucesText;
    private javax.swing.JTextField porcentajeMutacionesText;
    private javax.swing.JTextField precisionText;
    private javax.swing.JTextField tamPoblacionText;
    private javax.swing.JComboBox tipoSeleccionBox;
    // End of variables declaration//GEN-END:variables

	public javax.swing.JPanel getGraficaPanel() {
		return this.graficaPanel;
	}

	public javax.swing.JLabel getJLabel9() {
		return this.jLabel9;
	}

	public javax.swing.JComboBox<String> getNumGenesBox() {
		return this.numGenesBox;
	}
}
