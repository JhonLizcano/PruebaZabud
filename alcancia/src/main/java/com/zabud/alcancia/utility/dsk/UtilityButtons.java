package com.zabud.alcancia.utility.dsk;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import com.zabud.alcancia.dsk.CustomButton;

public class UtilityButtons {
	
	public static JPanel panelDeBotones(int ancho) {
		JPanel panelBotones = new JPanel();
        panelBotones.setBounds(0, 90, ancho, 80);
        panelBotones.setOpaque(Boolean.FALSE);
		GridBagLayout gbl_panelBotones = new GridBagLayout();
		gbl_panelBotones.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelBotones.rowHeights = new int[]{0};
		gbl_panelBotones.columnWeights = new double[]{Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};
		gbl_panelBotones.rowWeights = new double[]{0.0};
		panelBotones.setLayout(gbl_panelBotones);		
		return panelBotones;
	}
	
	public static CustomButton crearBoton(String img) {
		return new CustomButton(img, 80, 80);
	}
	
	public static GridBagConstraints crearGridBag(int gridX, int gridY) {
		GridBagConstraints gbc_button_X = new GridBagConstraints();
		gbc_button_X.insets = new Insets(0, 0, 0, 5);
		gbc_button_X.gridx = gridX;
		gbc_button_X.gridy = gridY;
		return gbc_button_X;
	}
}