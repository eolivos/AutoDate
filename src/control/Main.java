package control;

import frames.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import file_io.*;

public class Main {
	private static MainFrame mFrame;
	private static DataBase carData;
	
	public static void main(String args[]) {
		
		//conseguir la instancia del objeto mFrame;
		mFrame = MainFrame.getMFrame();
		
		carData = new DataBase("carData.txt");
		
		//añadir PManagers
		mFrame.addPManager(new ConsultP());
		mFrame.addPManager(new InsVehP());
		
		mFrame.setVisible(true);
		
		//System.out.println("iniciado");
		
		mFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				carData.close();
			}
			
		});
	}
}
