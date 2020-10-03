
public class Player {
	
	public String name;
	public String team;
	public int jerseyNumber;
	public int height;
	public int position;
	public int weight;
	
	public Player(String name, String team, int jerseyNumber, 
				    int height, int position, int weight) 
	{
		this.name = name;
		this.team = team;
		this.jerseyNumber = jerseyNumber;
		this.height = height;
		this.position = position;
		this.weight = weight;
		
	}
	
	
	
	public String getName() {		return name; 	}
	public String getTeam() { 		return team;	}
	public int getjerseyNumber() {	return jerseyNumber;	}
	public int getHeight() {		return height;	}
	public int getPosition() {		return position;	}
	public double getweight() {		return weight; }
	
	
	
	

}
