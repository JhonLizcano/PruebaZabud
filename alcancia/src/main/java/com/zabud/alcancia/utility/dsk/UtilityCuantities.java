package com.zabud.alcancia.utility.dsk;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class UtilityCuantities {
	
	public static JPanel panelDeCantidades(int ancho) {
		JPanel panelCantidades = new JPanel();
		panelCantidades.setBounds(0, 210, ancho, 50);
		panelCantidades.setOpaque(Boolean.FALSE);
		GridBagLayout gbl_panelCantidad = new GridBagLayout();
		gbl_panelCantidad.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelCantidad.rowHeights = new int[]{0, 0};
		gbl_panelCantidad.columnWeights = new double[]{Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};
		gbl_panelCantidad.rowWeights = new double[]{Double.MIN_VALUE, Double.MIN_VALUE};
		panelCantidades.setLayout(gbl_panelCantidad);
		
		panelCantidades.add(etiquetas("$ 50", Font.BOLD, 30), UtilityButtons.crearGridBag(0, 0));
		panelCantidades.add(etiquetas("$ 100", Font.BOLD, 30), UtilityButtons.crearGridBag(1, 0));
		panelCantidades.add(etiquetas("$ 200", Font.BOLD, 30), UtilityButtons.crearGridBag(2, 0));
		panelCantidades.add(etiquetas("$ 500", Font.BOLD, 30), UtilityButtons.crearGridBag(3, 0));
		panelCantidades.add(etiquetas("$ 1000", Font.BOLD, 30), UtilityButtons.crearGridBag(4, 0));
				
		return panelCantidades;
	}
	
	public static JLabel etiquetas(String texto, int font, int tamanio) {
		JLabel label_X = new JLabel(texto);
		label_X.setFont(new Font("Arial Narrow", font, tamanio));
		return label_X;
	}
}