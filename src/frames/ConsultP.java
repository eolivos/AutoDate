package frames;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConsultP extends PManager {

	public ConsultP() {
		super();
		mainP = genConsMainP();
	}
	
	@Override
	public void setPanel(int i) {
		PList.get(i);
	}
	@Override
	protected void setupMainP() {
//		hacer aqui cualquier configuracion necesaria para antes de entrar al PManager
//		la funcion es llamada de forma automatica
//		en este caso no hay nada que hacer(por ahora almenos)
	}
	
	private JPanel genConsMainP() {
		var panel = getDefaultPanel();
		
		var carImg = new JLabel(new ImageIcon("images/carro.png"));
		carImg.setBounds(262, 120, carImg.getIcon().getIconWidth(),carImg.getIcon().getIconHeight());
		
		var text1 = new JLabel ("Ingrese la placa del vehiculo a consultar");
		text1.setBounds(285,20,1000,100);
		
		var consTxf = new JTextField();
		consTxf.setBounds(320,100,150,20);
		
		var consBt = new JButton("Siguiente");
		consBt.setBounds(340,350,100,30);
		 
		consBt.addActionListener(e -> {
			
		}); 
		
		panel.add(carImg);
		panel.add(text1);
		panel.add(consTxf);
		panel.add(consBt);
		
		return panel;
	}
	
}
