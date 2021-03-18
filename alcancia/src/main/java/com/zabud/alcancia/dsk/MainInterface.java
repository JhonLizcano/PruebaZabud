package com.zabud.alcancia.dsk;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.zabud.alcancia.model.Alcancia;
import com.zabud.alcancia.service.AlcanciaService;
import com.zabud.alcancia.utility.dsk.UtilityButtons;
import com.zabud.alcancia.utility.dsk.UtilityCuantities;
import com.zabud.alcancia.utility.dsk.UtilityLabels;
import com.zabud.alcancia.utility.dsk.UtilityMoney;
import com.zabud.alcancia.utility.dsk.UtilityOperations;

public class MainInterface extends JFrame {

	private static final long serialVersionUID = 1L;
	
	AlcanciaService alcanciaService;
	private Alcancia alcancia;
	
	private MainPanel mainPanel;
	private JPanel panelBotones;
	private JPanel panelCantidades;
	private JPanel panelOperaciones;
	private JPanel panelDinero;
	
	private CustomButton button50;
	private CustomButton button100;
	private CustomButton button200;
	private CustomButton button500;
	private CustomButton button1000;
	
	private JButton cantidadMonedas;
	private JButton totalAhorrado;
	
	private JLabel cantidad50;
	private JLabel cantidad100;
	private JLabel cantidad200;
	private JLabel cantidad500;
	private JLabel cantidad1000;
	private JLabel dinero50;
	private JLabel dinero100;
	private JLabel dinero200;
	private JLabel dinero500;
	private JLabel dinero1000;
	
	public MainInterface() throws IOException {
		alcanciaService = new AlcanciaService();
		alcancia = new Alcancia(new ArrayList<Integer>());
		
		setTitle( "Aplicación para administrar una alcancia" );
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int ancho = (int) Math.round(d.getWidth() * 0.6);
		int alto = (int) Math.round(d.getHeight() * 0.7);
		setSize(ancho, alto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		mainPanel = new MainPanel(ancho, alto);
        mainPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		mainPanel.add(UtilityLabels.titulo("Bienvenido", ancho), BorderLayout.NORTH);
        
		mainPanel.add(UtilityLabels.subtitulos("De click sobre una moneda para agregarla a la alcancia", 70, ancho, 
        		20), BorderLayout.NORTH);
		panelBotones = UtilityButtons.panelDeBotones(ancho);
		button50 = UtilityButtons.crearBoton("./src/main/resources/img/50.png");
		panelBotones.add(button50, UtilityButtons.crearGridBag(0, 0));
		button100 = UtilityButtons.crearBoton("./src/main/resources/img/100.png");
		panelBotones.add(button100, UtilityButtons.crearGridBag(1, 0));
		button200 = UtilityButtons.crearBoton("./src/main/resources/img/200.png");
		panelBotones.add(button200, UtilityButtons.crearGridBag(2, 0));
		button500 = UtilityButtons.crearBoton("./src/main/resources/img/500.png");
		panelBotones.add(button500, UtilityButtons.crearGridBag(3, 0));
		button1000 = UtilityButtons.crearBoton("./src/main/resources/img/1000.png");
		panelBotones.add(button1000, UtilityButtons.crearGridBag(4, 0));
		mainPanel.add(panelBotones);
		
		mainPanel.add(UtilityLabels.subtitulos("Esta es la cantidad de monetas por denominación", 190, ancho, 20), 
        		BorderLayout.NORTH);
        panelCantidades = UtilityCuantities.panelDeCantidades(ancho);
        cantidad50 = UtilityCuantities.etiquetas("0", Font.BOLD, 18);
        panelCantidades.add(cantidad50, UtilityButtons.crearGridBag(0, 1));
        cantidad100 = UtilityCuantities.etiquetas("0", Font.BOLD, 18);
		panelCantidades.add(cantidad100, UtilityButtons.crearGridBag(1, 1));
		cantidad200 = UtilityCuantities.etiquetas("0", Font.BOLD, 18);
		panelCantidades.add(cantidad200, UtilityButtons.crearGridBag(2, 1));
		cantidad500 = UtilityCuantities.etiquetas("0", Font.BOLD, 18);
		panelCantidades.add(cantidad500, UtilityButtons.crearGridBag(3, 1));
		cantidad1000 = UtilityCuantities.etiquetas("0", Font.BOLD, 18);
		panelCantidades.add(cantidad1000, UtilityButtons.crearGridBag(4, 1));
		mainPanel.add(panelCantidades);
        
        mainPanel.add(UtilityLabels.subtitulos("Este es el dinero ahorrado por denominación", 280, ancho, 20), 
        		BorderLayout.NORTH);
        panelDinero = UtilityMoney.panelDeDinero(ancho);
        dinero50 = UtilityCuantities.etiquetas("$ 0", Font.BOLD, 18);
        panelDinero.add(dinero50, UtilityButtons.crearGridBag(0, 1));
        dinero100 = UtilityCuantities.etiquetas("$ 0", Font.BOLD, 18);
		panelDinero.add(dinero100, UtilityButtons.crearGridBag(1, 1));
		dinero200 = UtilityCuantities.etiquetas("$ 0", Font.BOLD, 18);
		panelDinero.add(dinero200, UtilityButtons.crearGridBag(2, 1));
		dinero500 = UtilityCuantities.etiquetas("$ 0", Font.BOLD, 18);
		panelDinero.add(dinero500, UtilityButtons.crearGridBag(3, 1));
		dinero1000 = UtilityCuantities.etiquetas("$ 0", Font.BOLD, 18);
		panelDinero.add(dinero1000, UtilityButtons.crearGridBag(4, 1));
        mainPanel.add(panelDinero);
        
        mainPanel.add(UtilityLabels.subtitulos("Operaciones especiales", 380, ancho, 20), 
        		BorderLayout.NORTH);
        panelOperaciones = UtilityOperations.panelDeOperaciones(ancho);
        cantidadMonedas = new JButton("Total Monedas");
		panelOperaciones.add(cantidadMonedas, UtilityButtons.crearGridBag(0, 0));
		totalAhorrado = new JButton("Total Ahorrado");
		panelOperaciones.add(totalAhorrado, UtilityButtons.crearGridBag(1, 0));
        mainPanel.add(panelOperaciones);
        
        agregarAcciones();
        
        setLocationRelativeTo( null );
        setResizable( false );
	}
	
	public void agregarModena(int valor) {
		alcancia.getMonedas().add(valor);
	}
	
	public void agregarAcciones() {
		button50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accionClick(50, cantidad50, dinero50);
			}
		});
		button100.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accionClick(100, cantidad100, dinero100);
			}
		});
		button200.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accionClick(200, cantidad200, dinero200);
			}
		});
		button500.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accionClick(500, cantidad500, dinero500);
			}
		});
		button1000.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accionClick(1000, cantidad1000, dinero1000);
			}
		});
		cantidadMonedas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String message = "En este momento tienes " + alcanciaService.cantidadMonedas(alcancia.getMonedas()) +
						" monedas en la alcancia";
				JOptionPane.showMessageDialog(new JOptionPane(), message, 
						"Cantidad de monedas", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		totalAhorrado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String message = "En este momento tienes $ " + alcanciaService.retornarTotalAhorrado(alcancia.getMonedas()) +
						" en la alcancia";
				JOptionPane.showMessageDialog(new JOptionPane(), message, 
						"Dinero ahorrado", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	public void accionClick(int denominacion, JLabel labelCantidad, JLabel labelDinero) {
		alcancia.getMonedas().add(denominacion);
		alcanciaService.agruparMonedas(alcancia.getMonedas());
		labelCantidad.setText(String.valueOf(alcanciaService.cantidadMonedaPorDenominacion(denominacion)));
		labelDinero.setText("$ " + alcanciaService.dineroPorMonedaDenominacion(denominacion, 
				alcanciaService.cantidadMonedaPorDenominacion(denominacion)));
	}
}