package com.zabud.alcancia.dsk;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomButton extends JButton{
	
	private final static Logger logger = LoggerFactory.getLogger(CustomButton.class);
	
	private static final long serialVersionUID = 1L;
	private String imagen;
    private int ancho;
    private int alto;
    
    public CustomButton(String imagen, int width, int height) {
    	this.imagen = imagen;
    	this.ancho = width;
    	this.alto = height;
    	createButton();
    }
    
    private void createButton(){
    	BufferedImage img;
		try {
			img = ImageIO.read(getClass().getResourceAsStream(imagen));
			Image dimg = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
			this.setIcon(new ImageIcon(dimg));
		} catch (IOException e) {
			logger.error(e.toString());
		}
    	this.setPreferredSize(new Dimension(ancho, alto));
    	this.setMaximumSize(new Dimension(ancho, alto));
    	this.setFocusPainted(false);
    	this.setRolloverEnabled(false);
    	this.setOpaque(false);
    	this.setContentAreaFilled(false);
    	this.setBorderPainted(false);
    	this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
    }
}