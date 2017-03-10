package common;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import helpclasses.Streams;
import structures.HashtableOH;

public class GeneralController {
	protected HashtableOH<String, Person> persons = new HashtableOH<String, Person>(15);
	
	public GeneralController(String filePath){
		this.loadPersons(filePath);
	}
	
	private void loadPersons(String filePath){
		try {
			Streams.readPersons(persons, filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Filen " + filePath + "Kunde ej hittas");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Felaktig ström!");
			e.printStackTrace();
		}
	}
	
	protected void loadWindow(JPanel panel, String windowTitle){
		JFrame frame = new JFrame(windowTitle);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(40, 40);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}








