package frames;

import java.util.ArrayList;
import java.awt.Color;

import javax.swing.JPanel;

import control.MainFrame;

public abstract class PManager {
	
	
	//el modificador de acceso es protegido, se considera como una variable privada en la clase que extiendadn a esta
	protected MainFrame mFrame;
	
	protected JPanel mainP;
	protected ArrayList<JPanel> PList = new ArrayList<JPanel>();
	
	public PManager() { mFrame = MainFrame.getMFrame(); }
	
	
//	estas dos funciones se tienen que implementar en las clases que extiendan a esta
	public abstract void setPanel(int i);
//	en esta funcion se debe hacer cualquier cosa necesaria para antes de entrar al PManager
//	con excepcion de poner el Panel principal(eso se hace de forma automatica)
	protected abstract void setupMainP();
	
	//define el panel que se muestra de forma default
	public void setMainPanel(JPanel panel) {
		mainP = panel;
	}
	
	//cambia el PManager que el Main Frame esta usando
	public void set() throws NullPointerException{
		if(mainP !=  null) {
			setupMainP();
			mFrame.setPanel(mainP);
		}else {
			throw new NullPointerException("Main panel non existent: mainP = null");
		}
	}
	
	// devuelve un panel con el tamaño, color, y layout estandar del proyecto
	public static JPanel getDefaultPanel() {
		var panel = new JPanel();
		panel.setBounds(0,0,784,461);
		panel.setBackground(new Color(174,214,241));
		panel.setLayout(null);
		
		return panel;
	}
	
}
