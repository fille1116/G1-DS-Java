package library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import avltree.AVLTree;
import common.GeneralController;
import common.Person;

public class LibraryController extends GeneralController{
	private static String filePathMedia = "files/Media.txt";
	protected AVLTree<String, Book> bookTree = new AVLTree<String, Book>();
	protected AVLTree<String, DVD> DVDTree = new AVLTree<String, DVD>();

	public LibraryController(String filePath, Person currentlyLoggedIn) {
		super(filePath, currentlyLoggedIn);
		try {
			LibraryController.readBooks(bookTree, filePathMedia);
			LibraryController.readDVDs(DVDTree, filePathMedia);
		}
		catch(FileNotFoundException e1){
			e1.printStackTrace();
		}
		catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	
	public static void readBooks(AVLTree<String, Book> tree, String filePath) 
		throws FileNotFoundException, IOException{
			
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		    String line = br.readLine();
				
		    while (line != null) {
		    	String[] details = line.split(";");
			   	if(details[0].equals("Bok")){
			   		Book b = new Book(details[1], Integer.parseInt(details[4]), details[2], details[3]);
			        
				    tree.put(b.getId(), b);
			   	}
			   	
			   	line = br.readLine();
			}
		}
	}
	
	public static void readDVDs(AVLTree<String, DVD> tree, String filePath) 
		throws FileNotFoundException, IOException{
				
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
					
			while (line != null) {
			   String[] details = line.split(";");
			   if(details[0].equals("Dvd")){
				   String[] actors = new String[details.length - 4];
				   
				   for(int i = 4; i < details.length; i++){
					   actors[i - 4] = details[i];
				   }
				   
				   DVD d = new DVD(details[1], Integer.parseInt(details[3]), details[2], actors);
			        
				   tree.put(d.getId(), d);
			   }
			   
			   line = br.readLine();
			}
		}
	}
}
