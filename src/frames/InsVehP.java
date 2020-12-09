package frames;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsVehP extends PManager {
	
	public InsVehP() {
		super();
		setMainPanel(genInVP());
	}

	@Override
	public void setPanel(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setupMainP() {
		// TODO Auto-generated method stub

	}

	private JPanel genInVP() {
		var panel = getDefaultPanel();
		
		var carImg = new JLabel(new ImageIcon("images/carro.png"));
		carImg.setBounds(260, 130, carImg.getIcon().getIconWidth(),carImg.getIcon().getIconHeight());
		
		var text1 = new JLabel ("Ingrese la placa del vehiculo a registrar");
	   	text1.setBounds(285,30,1000,100);
	   	
	   	var inTxf = new JTextField();
	   	inTxf.setBounds(320,100,150,20);
	   	
	   	var sigBt = new JButton("Siguiente");
	    sigBt.setBounds(350,350,100,30);
	    
	    sigBt.addActionListener(e -> {
	    	
	    });
		
		panel.add(carImg);
		panel.add(text1);
		panel.add(inTxf);
		panel.add(sigBt);
		
		return panel;
	}
	
}
