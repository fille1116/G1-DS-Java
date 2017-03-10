package helpclasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import common.Person;
import structures.HashtableOH;

public class Streams {
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
}
