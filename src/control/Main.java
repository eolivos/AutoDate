package control;

import frames.*;

public class Main {
	private static MainFrame mFrame;
	
	public static void main(String args[]) {
		
		//conseguir la instancia del objeto mFrame;
		mFrame = MainFrame.getMFrame();
		
		//a�adir PManager ConsultP
		mFrame.addPManager(new ConsultP());
		
		
		mFrame.setVisible(true);
		
		//System.out.println("iniciado");
	}
}
