package com.zabud.alcancia.utility.dsk;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class UtilityMoney {
	
	public static JPanel panelDeDinero(int ancho) {
		JPanel panelDinero = new JPanel();
		panelDinero.setBounds(0, 300, ancho, 50);
		panelDinero.setOpaque(Boolean.FALSE);
		GridBagLayout gbl_panelDinero = new GridBagLayout();
		gbl_panelDinero.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelDinero.rowHeights = new int[]{0, 0};
		gbl_panelDinero.columnWeights = new double[]{Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};
		gbl_panelDinero.rowWeights = new double[]{Double.MIN_VALUE, Double.MIN_VALUE};
		panelDinero.setLayout(gbl_panelDinero);
		
		panelDinero.add(UtilityCuantities.etiquetas("$ 50", Font.BOLD, 30), UtilityButtons.crearGridBag(0, 0));
		panelDinero.add(UtilityCuantities.etiquetas("$ 100", Font.BOLD, 30), UtilityButtons.crearGridBag(1, 0));
		panelDinero.add(UtilityCuantities.etiquetas("$ 200", Font.BOLD, 30), UtilityButtons.crearGridBag(2, 0));
		panelDinero.add(UtilityCuantities.etiquetas("$ 500", Font.BOLD, 30), UtilityButtons.crearGridBag(3, 0));
		panelDinero.add(UtilityCuantities.etiquetas("$ 1000", Font.BOLD, 30), UtilityButtons.crearGridBag(4, 0));
		
		return panelDinero;
	}
}