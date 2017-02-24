package library;

//Klassen Media är abstrakt och måste därför ärvas. Böcker och dvs- filmer
//ska representeras av klasser vilka ärver Media-klassen.

public abstract class Media {
	private String id;

	public Media( String id ) { 
		this.id = id;
	}

	public String getId() { 
		return id;
	}

	public boolean equals( Object obj ) { 
		if(obj instanceof Media) {
			Media media = (Media)obj;
			return id.equals( media.getId() ); 
		}
		
		return false; 
	}
}














