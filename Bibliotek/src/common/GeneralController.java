package common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import structures.HashtableOH;

/**
 *	GeneralController
 *
 * 	The GeneralController class is responsible for starting windows, loading
 * 	in files and storing them into suitable data-structures.
 */

public class GeneralController {
<<<<<<< Updated upstream
	protected HashtableOH<String, Person> persons = new HashtableOH<String, Person>(15);
	
	public GeneralController(String filePath){
		this.loadPersons(filePath);
	}
	
	private void loadPersons(String filePath){
		try {
			GeneralController.readPersons(persons, filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Filen " + filePath + "Kunde ej hittas");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Felaktig ström!");
			e.printStackTrace();
		}
	}
=======
	protected Person persons[];
>>>>>>> Stashed changes
	
	protected void loadWindow(JPanel panel, String windowTitle){
		JFrame frame = new JFrame(windowTitle);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(40, 40);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void readPersons(HashtableOH<String, Person> map, String filePath) 
		throws FileNotFoundException, IOException{
			
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		    String line = br.readLine();
			
		    while (line != null) {
			   	String[] details = line.split(";");
			   	Person p = new Person(details[0], details[1], details[2]);
			        
			    map.put(p.getPersonnr(), p);
			    line = br.readLine();
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}








