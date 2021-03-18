package com.zabud.alcancia.utility.dsk;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class UtilityOperations {
	
	public static JPanel panelDeOperaciones(int ancho) {
		JPanel panelOperaciones = new JPanel();
		panelOperaciones.setBounds(0, 400, ancho, 40);
		panelOperaciones.setOpaque(Boolean.FALSE);
		GridBagLayout gbl_panelOperaciones = new GridBagLayout();
		gbl_panelOperaciones.columnWidths = new int[]{0, 0};
		gbl_panelOperaciones.rowHeights = new int[]{0};
		gbl_panelOperaciones.columnWeights = new double[]{Double.MIN_VALUE, Double.MIN_VALUE};
		gbl_panelOperaciones.rowWeights = new double[]{Double.MIN_VALUE};
		panelOperaciones.setLayout(gbl_panelOperaciones);
		
		return panelOperaciones;
	}
}