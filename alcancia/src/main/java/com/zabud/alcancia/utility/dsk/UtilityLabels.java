package com.zabud.alcancia.utility.dsk;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UtilityLabels {
	
	public static JLabel titulo(String texto, int ancho) {
		JLabel titulo = new JLabel();
		titulo.setBounds(0, 10, ancho, 40);
		titulo.setFont(new Font("Arial Narrow", Font.ITALIC, 40));
        titulo.setOpaque(Boolean.FALSE);
        titulo.setText(texto);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        return titulo;
	}
	
	public static JLabel subtitulos(String texto, int coordY, int ancho, int alto) {
		JLabel subtitulo = new JLabel();
		subtitulo.setBounds(0, coordY, ancho, alto);
		subtitulo.setFont(new Font("Arial Narrow", Font.ITALIC, 15));
		subtitulo.setOpaque(Boolean.FALSE);
		subtitulo.setText(texto);
		subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo.setVerticalAlignment(SwingConstants.CENTER);
        return subtitulo;
	}
}