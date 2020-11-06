package control;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.*;

import frames.MainPM;
import frames.PManager;

public class MainFrame extends JFrame{
	
//	unica instancia de mFrame
	private static MainFrame mFrame;
	
	private MainPM mainPM;
	private ArrayList<PManager> PMList = new ArrayList<PManager>();
	
//	defino el constructor privado, de esa forma no se pueden crear objetos desde fuera de esta clase
	private MainFrame() {}
	
	public static MainFrame getMFrame() {
//		si no existe una instancia de mFrame la creo, sino devuelvo la que ya existe
		if(mFrame == null) {
			mFrame = new MainFrame();
			mFrame.setup();
		}
		return mFrame;
	}
	
	void setup() {
//		defino el PManager principal como una instancia de MainPM
		mainPM = new MainPM();
		
		
//		configuro todos detalles de el JFrame
		setTitle("AutoDate");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon car = new ImageIcon("images/carro.png");
		setIconImage(car.getImage());
		setResizable(false);
		setBounds(0,0,800,500);
		setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(174,214,241));
		
//		configura el JMenuBar
		setupMenuBar();
		
//		asigna el PManager que se muestra actualmente a MainPM
		mainPM.set();
	}
	
	private void setupMenuBar() {
		
//		IMPORTANTE cualquier menu en el programa tiene que crearse y configurarse aqui, para ocultarlo o mostrarlo
//		usar el metodo setVisible, para hacerlo desde fuera de este archivo usar el metodo getMenu(int menu) la
//		posicion del menu depende del orden en que fueron añadidos al JMenuBar empezando en 0
		
		var menuBar = new JMenuBar();
		var winMenu = new JMenu("Ventana");
		var sessMenu = new JMenu("Sesion");
		
		menuBar.add(winMenu);
		menuBar.add(sessMenu);
		
		var winMenIt1 = new JMenuItem("Blanco");
		winMenIt1.addActionListener(e -> { this.getContentPane().setBackground(new Color(254,254,254)); });
		var winMenIt2 = new JMenuItem("Azul");
		winMenIt2.addActionListener(e -> { this.getContentPane().setBackground(new Color(174,214,241)); });
		var winMenIt3 = new JMenuItem("Gris");
		winMenIt3.addActionListener(e -> { this.getContentPane().setBackground(new Color(214,219,223)); });
		
		var sessMenIt1 = new JMenuItem("Menu Principal");
		sessMenIt1.addActionListener(e -> { mainPM.setMenuP(); });
		var sessMenIt2 = new JMenuItem("Cerrar sesion");
		sessMenIt2.addActionListener(e -> { mainPM.setUserP(); });
		
		winMenu.add(winMenIt1);
		winMenu.add(winMenIt2);
		winMenu.add(winMenIt3);
		
		sessMenu.add(sessMenIt1);
		sessMenu.add(sessMenIt2);
		
		//poner la visibilidad de los menus para la ventan de inicio estandar
		sessMenu.setVisible(false);
		
		setJMenuBar(menuBar);
	}
	
	public JMenu getMenu(int i) {
		return getJMenuBar().getMenu(i);
	}
	
	//devuelve el panel que se esta mostrando actualmente
	public Container getPanel() {
		return getContentPane();
	}
	
	//muestra un un nuevo panel
	public void setPanel(JPanel panel) {
		panel.setBackground(getContentPane().getBackground());
		setContentPane(panel);
	}
	
	public void addPManager(PManager pM) {
		PMList.add(pM);
	}
	
	public PManager getPManager(int i) throws IndexOutOfBoundsException{
		return PMList.get(i);
	}
	 public void setPManager(int i) {
		 PMList.get(i).set();
	 }
}
