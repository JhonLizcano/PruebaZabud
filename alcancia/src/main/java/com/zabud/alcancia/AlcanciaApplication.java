package com.zabud.alcancia;

import java.io.IOException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zabud.alcancia.dsk.MainInterface;

@SpringBootApplication
public class AlcanciaApplication implements CommandLineRunner{
	
	private final static Logger logger = LoggerFactory.getLogger(AlcanciaApplication.class);

	public static void main(String[] args) 
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		SpringApplication.run(AlcanciaApplication.class, args);
		System.setProperty("java.awt.headless", "false");
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MainInterface ia = new MainInterface();
            ia.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            logger.info(AlcanciaApplication.class.getName());
        }
	}
	
	@Override
	public void run(String... args) throws Exception {
	}
}