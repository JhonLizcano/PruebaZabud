package com.zabud.alcancia.dsk;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MainPanel extends JPanel{
	
	private final static Logger logger = LoggerFactory.getLogger(MainPanel.class);
	
	private static final long serialVersionUID = 1L;
	private int ancho;
	private int alto;

	@Override
	protected void paintComponent(Graphics g) {
		if (ancho > 0 && alto > 0) {
			super.paintComponent(g);
			BufferedImage img;
			try {
				img = ImageIO.read(getClass().getResourceAsStream("/img/alcancia.png"));
				Image dimg = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
				g.drawImage(dimg, 0, 0, null);
			} catch (IOException e) {
				logger.error(e.toString());
			}
		}
	}
}