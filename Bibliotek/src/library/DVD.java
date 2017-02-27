package library;

public class DVD extends Media{
	private String name;
	private String[] actors;

	public DVD(String id, int year, String name, String[] actors) {
		super(id, year);
		
		this.name = name;
		this.actors = actors;
	}
}
