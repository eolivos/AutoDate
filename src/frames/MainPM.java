package frames;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainPM extends PManager {
	
	public MainPM() {
		super();	
		setMainPanel(genUserP());
		
//		añade un panel a la lista
		PList.add(genMenuP());
	}
	
	@Override
	public void setPanel(int i) {
//		esta funcion se puede implementar como quieran pero la idea es que se
//		especifique una posicion i y se hagan lo cambios necesarios para cambiar
//		a el panel que este en esa posicion en la lista
		switch(i) {
		case 0:
			setUserP();
			break;
		case 1:
			setMenuP();
			break;
		}
	}
	@Override
	protected void setupMainP() {
//		hacer aqui cualquier configuracion necesaria para antes de entrar al PManager
//		la funcion es llamada de forma automatica
		mFrame.getMenu(1).setVisible(false);
	}
	
	public void setUserP() {
		mFrame.getMenu(1).setVisible(false);
		mFrame.setPanel(mainP);
	}
	
	public void setMenuP() {
		mFrame.getMenu(1).setVisible(true);
		mFrame.setPanel(PList.get(0));
	}
	
	private static boolean checkCredentials(String user, String pass) {
		boolean check = false;
		
		try {
			var credFile = new File("files/credentials.txt");
			byte[] bytes = Files.readAllBytes(credFile.toPath());
			String[] cred = new String(bytes, "UTF-8").replaceAll("[^a-zA-Z0-9ñÑ,]", "").split(",");
			
			check = cred[0].equals(user) && cred[1].equals(pass);
		}catch(NullPointerException | IOException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	
//	creacion y configuracion del panel userP
	private JPanel genUserP() {
		var panel = getDefaultPanel();
		
		var carImg = new JLabel(new ImageIcon("images/carro.png"));
		carImg.setBounds(250, 10, carImg.getIcon().getIconWidth(),carImg.getIcon().getIconHeight());
		
		var welcomeTxt = new JLabel("Buen dia operador. " + "\n\n" + "Por favor ingrese su usuario y contraseña.");
		welcomeTxt.setBounds(200,140,500,200);
		
		var userTxt = new JLabel("Usuario:");
        userTxt.setBounds(250,280,100,30);
        var userTxf = new JTextField();
        userTxf.setBounds(350,287,150,20);
        
        var passTxt = new JLabel("Contraseña:");
        passTxt.setBounds(250,310,100,30);
        var passTxf = new JPasswordField();
        passTxf.setBounds(350,317,150,20);
        passTxf.setEchoChar('*');
        
        var warnTxt = new JLabel("Credenciales incorrectas");
        warnTxt.setBounds(350,165,500,200);
        warnTxt.setForeground(new Color(0xFF0000));
        warnTxt.setVisible(false);
        
        var acceptBt = new JButton("Verificar credenciales");
        acceptBt.setBounds(275,350,200,30);
        
//      keyListener para saber si se dio enter en el campo de usuario y avanzar al de contraseña
        userTxf.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
        		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
        			passTxf.grabFocus();
        		}
        	}
        });        
//      keyListener para saber si se dio enter en el campo de la contraseña y verificar credenciales
        passTxf.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
        		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
        			if( checkCredentials( userTxf.getText(), new String(passTxf.getPassword()) ) ) {
        				userTxf.setText("");passTxf.setText("");
        				warnTxt.setVisible(false);
                		setMenuP();
                	} else {
                		warnTxt.setVisible(true);
                	}
        		}
        	}
        });
//      ActionListener para saber si se dio click en el boton y verificar credenciales
        acceptBt.addActionListener(e -> {
        	if( checkCredentials( userTxf.getText(), new String(passTxf.getPassword()) ) ) {
        		userTxf.setText("");passTxf.setText("");
        		warnTxt.setVisible(false);
        		setMenuP();
        	} else {
        		warnTxt.setVisible(true);
        	}
        });
        
		panel.add(carImg);
		panel.add(welcomeTxt);
		panel.add(userTxt);
		panel.add(userTxf);
		panel.add(passTxt);
		panel.add(passTxf);
		panel.add(warnTxt);
		panel.add(acceptBt);
		
		return panel;
	}

//	creacion y configuracion del panel menuP
	private JPanel genMenuP() {
		var panel = getDefaultPanel();
		
		var carImg = new JLabel(new ImageIcon("images/carro.png"));
		carImg.setBounds(10, 50, carImg.getIcon().getIconWidth(),carImg.getIcon().getIconHeight());
		
		var text1 = new JLabel("Ingreso exitoso. Bienvenido de nuevo operador.");
        text1.setBounds(250,50,450,30);
        var text2 = new JLabel("Seleccione el proceso a realizar");
        text2.setBounds(300,100,450,30);
        
        var consButton = new JButton("Consultar estado de un vehiculo en el sistema.");
        consButton.setBounds(250,150,300,30);
        
        var inButton = new JButton("Ingresar vehiculo nuevo al sistema.");
        inButton.setBounds(250,200,300,30);
        
        var procButton = new JButton("Ingresar procedimiento a un vehiculo del sistema.");
        procButton.setBounds(250,250,300,30);

//      TODO: añadir acciones
        consButton.addActionListener(e -> {
//        	cambia el PManager actual
        	mFrame.setPManager(0);
        });
        inButton.addActionListener(e -> {
        	
        });
        procButton.addActionListener(e -> {
        	
        });
        
        panel.add(carImg);
        panel.add(text1);
        panel.add(text2);
        panel.add(consButton);
        panel.add(inButton);
        panel.add(procButton);
		
		return panel;
	}
	
}
