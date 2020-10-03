


/**
 * Please enter "Completed" in the Text Submission block for this assignment
 *  once your application is ready to grade.

Suggested tasks to work on this week:

Create a Priority Queue that houses a class object.  You can create any 
object - it does not have to be a generic class.  The object needs to have 
at least 6 elements.  The number of methods is up to you.

Inside of your application, populate at least 10 objects - through whatever 
means you prefer (files, via code, etc)

Display a menu for the user that prompts to perform the following actions:
Give them options to sort the queue list by at least 3 different attributes.
Add an additional item
Remove an item by search
Remove the first item
Display the objects with their contents

If you have additional time, work on a project of your choosing. 
 Remember - we are at reduced hours for this week. :)
Reminder: Do not forget to properly document your code.  This is an 
industry best practice and expectation.  
Failure to do so on graded assignments will result in reduced points.
 * @author brandonkline
 *
 *
 *
 *
 *
 */
import java.io.IOException;
import java.util.*;

public class Week6 {
	
	public static void main(String[] args) {
		PriorityQueue<Player> teamRoster = new PriorityQueue<Player>(12, new playerComparator());
		
		Player player1 = new Player("Dan", "Pirates", 30, 74, 1, 170);
		teamRoster.add(player1);
		Player player2 = new Player("Brad", "Yankees", 99, 68, 2, 144);
		teamRoster.add(player2);
		Player player3 = new Player("Marshall", "Goos", 33, 72, 3, 200);
		teamRoster.add(player3);
		Player player4 = new Player("Jared", "Griffs", 46, 69, 4, 180);
		teamRoster.add(player4);
		Player player5 = new Player("Spencer", "Orioles", 48, 78, 5, 225);
		teamRoster.add(player5);
		Player player6 = new Player("Brandon", "Pirates", 18, 99, 6, 350);
		teamRoster.add(player6);
		Player player7 = new Player("Jamie", "Reds", 10, 52, 7, 100);
		teamRoster.add(player7);
		Player player8 = new Player("Twak", "Brewers", 3, 82, 8, 190);
		teamRoster.add(player8);
		Player player9 = new Player("Jordan", "Jays", 7, 72, 9, 179);
		teamRoster.add(player9);
		Player player10 = new Player("Chris", "Wildthings", 32, 70, 10, 159);
		teamRoster.add(player10);
		
		while(!teamRoster.isEmpty()) {
		System.out.println(teamRoster.poll().getName());	
		}
		
	    System.out.println("Choosean opiton: ");
	       System.out.println("1) Sort by Jersey Number");
	       System.out.println("2) Sort by Height");
	       System.out.println("3) Sort by Weight");
	       System.out.println("4) Add a player");
	       System.out.println("5) Remove a searched item");
	       System.out.println("6) Remove first player");
	       System.out.println("7) Show the contents");
	    
	       Scanner scan= new Scanner(System.in);
	       int option = scan.nextInt();
	       
	       switch (option){
	       
	       case 1:
	    	   int temp1;
	    	   int p1=player1.jerseyNumber;
	    	   int p2=player2.jerseyNumber;
	    	   int p3=player3.jerseyNumber;
	    	   int p4=player4.jerseyNumber;
	    	   int p5=player5.jerseyNumber;
	    	   int p6=player6.jerseyNumber;
	    	   int p7=player7.jerseyNumber;
	    	   int p8=player8.jerseyNumber;
	    	   int p9=player9.jerseyNumber;
	    	   int p10=player10.jerseyNumber;
	    	   
	    	   for(int number1 = 0; number1<9; number1++) {
	    		   if(p2<p1) {
	    			   temp1=p1;
	    			   p1=p2;
	    			   p2=temp1;
	    		   }
	    		   if(p3<p2) {
	    			   temp1=p2;
	    			   p2=p3;
	    			   p3=temp1;
	    		   }
	    		   if(p4<p3) {
	    			   temp1=p3;
	    			   p3=p4;
	    			   p4=temp1;
	    		   }
	    		   if(p5<p4) {
	    			   temp1=p4;
	    			   p4=p5;
	    			   p5=temp1;
	    		   }
	    		   if(p6<p5) {
	    			   temp1=p5;
	    			   p5=p6;
	    			   p6=temp1;
	    		   }
	    		   if(p7<p6) {
	    			   temp1=p6;
	    			   p6=p7;
	    			   p7=temp1;
	    		   }
	    		   if(p8<p7) {
	    			   temp1=p7;
	    			   p7=p8;
	    			   p8=temp1;
	    		   }
	    		   if(p9<p8) {
	    			   temp1=p8;
	    			   p8=p9;
	    			   p9=temp1;
	    		   }
	    		   if(p10<p9) {
	    			   temp1=p9;
	    			   p9=p10;
	    			   p10=temp1;
	    		   }
	    		   
	    		 
	    	   }
	    	   System.out.println("The following is the Jersey Numbers of the players in ascending and descending order: ");
	    	   System.out.println(p1+" "+p2 + " "+p3+" "+p4 + " "+p5+" "+p6 + " "+p7+" "+p8 + " "+p9+" "+p10 + " ");;
    		   System.out.println(p10+" "+p9 + " "+p8+" "+p7 + " "+p6+" "+p5 + " "+p4+" "+p3 + " "+p2+" "+p1 + " ");;
  
	            break;
	            
	       case 2:
	    	   int temp2;
	    	   int h1=player1.height;
	    	   int h2=player2.height;
	    	   int h3=player3.height;
	    	   int h4=player4.height;
	    	   int h5=player5.height;
	    	   int h6=player6.height;
	    	   int h7=player7.height;
	    	   int h8=player8.height;
	    	   int h9=player9.height;
	    	   int h10=player10.height;
	    	   
	    	   for(int height1 = 0; height1<9; height1++) {
	    		   if(h2<h1) {
	    			   temp2=h1;
	    			   h1=h2;
	    			   h2=temp2;
	    		   }
	    		   if(h3<h2) {
	    			   temp2=h2;
	    			   h2=h3;
	    			   h3=temp2;
	    		   }
	    		   if(h4<h3) {
	    			   temp2=h3;
	    			   h3=h4;
	    			   h4=temp2;
	    		   }
	    		   if(h5<h4) {
	    			   temp2=h4;
	    			   h4=h5;
	    			   h5=temp2;
	    		   }
	    		   if(h6<h5) {
	    			   temp2=h5;
	    			   h5=h6;
	    			   h6=temp2;
	    		   }
	    		   if(h7<h6) {
	    			   temp2=h6;
	    			   h6=h7;
	    			   h7=temp2;
	    		   }
	    		   if(h8<h7) {
	    			   temp2=h7;
	    			   h7=h8;
	    			   h8=temp2;
	    		   }
	    		   if(h9<h8) {
	    			   temp2=h8;
	    			   h8=h9;
	    			   h9=temp2;
	    		   }
	    		   if(h10<h9) {
	    			   temp2=h9;
	    			   h9=h10;
	    			   h10=temp2;
	    		   }
	    		   
	    		 
	    	   }
	    	   System.out.println("The following is the height of the players in ascending and descending order: ");
	    	   System.out.println(h1+" "+h2 + " "+h3+" "+h4 + " "+h5+" "+h6 + " "+h7+" "+h8 + " "+h9+" "+h10 + " ");;
    		   System.out.println(h10+" "+h9 + " "+h8+" "+h7 + " "+h6+" "+h5 + " "+h4+" "+h3 + " "+h2+" "+h1 + " ");;
  
	            break;
	            
	       case 3:
	    	   int temp3;
	    	   int w1=player1.weight;
	    	   int w2=player2.weight;
	    	   int w3=player3.weight;
	    	   int w4=player4.weight;
	    	   int w5=player5.weight;
	    	   int w6=player6.weight;
	    	   int w7=player7.weight;
	    	   int w8=player8.weight;
	    	   int w9=player9.weight;
	    	   int w10=player10.weight;
	    	  
	    	   for(int height1 = 0; height1<9; height1++) {
	    		   if(w2<w1) {
	    			   temp3=w1;
	    			   w1=w2;
	    			   w2=temp3;
	    		   }
	    		   if(w3<w2) {
	    			   temp3=w2;
	    			   w2=w3;
	    			   w3=temp3;
	    		   }
	    		   if(w4<w3) {
	    			   temp3=w3;
	    			   w3=w4;
	    			   w4=temp3;
	    		   }
	    		   if(w5<w4) {
	    			   temp3=w4;
	    			   w4=w5;
	    			   w5=temp3;
	    		   }
	    		   if(w6<w5) {
	    			   temp3=w5;
	    			   w5=w6;
	    			   w6=temp3;
	    		   }
	    		   if(w7<w6) {
	    			   temp3=w6;
	    			   w6=w7;
	    			   w7=temp3;
	    		   }
	    		   if(w8<w7) {
	    			   temp3=w7;
	    			   w7=w8;
	    			   w8=temp3;
	    		   }
	    		   if(w9<w8) {
	    			   temp3=w8;
	    			   w8=w9;
	    			   w9=temp3;
	    		   }
	    		   if(w10<w9) {
	    			   temp3=w9;
	    			   w9=w10;
	    			   w10=temp3;
	    		   }
	    		   
	    		 
	    	   }
	    	   System.out.println("The following is the height of the players in ascending and descending order: ");
	    	   System.out.println(w1+" "+w2 + " "+w3+" "+w4 + " "+w5+" "+w6 + " "+w7+" "+w8 + " "+w9+" "+w10 + " ");;
    		   System.out.println(w10+" "+w9 + " "+w8+" "+w7 + " "+w6+" "+w5 + " "+w4+" "+w3 + " "+w2+" "+w1 + " ");;
  
	        
	    	   break;
	            
	       case 4:
	    	   System.out.println("Enter Name");
	    	   Scanner k1 = new Scanner(System.in);
	    	   String newName = k1.next();
	    	   
	    	   System.out.println("Enter Team");
	    	   Scanner k2 = new Scanner(System.in);
	    	   String newTeam = k2.next();
	    	   
	    	   System.out.println("Enter Jersey Number");
	    	   Scanner k3 = new Scanner(System.in);
	    	   String newNumber = k3.next();
	    	   
	    	   System.out.println("Enter Height");
	    	   Scanner k4 = new Scanner(System.in);
	    	   String newHeight = k4.next();
	    	   
	    	   System.out.println("Enter Position");
	    	   Scanner k5 = new Scanner(System.in);
	    	   String newPosition = k5.next();
	    	   
	    	   System.out.println("Enter Weight");
	    	   Scanner k6 = new Scanner(System.in);
	    	   String newWeight = k6.next();
	
	            break;
	            
	       case 5:
	    	   System.out.println("Name a player to Remove: ");
	    	   Scanner removePlayer = new Scanner(System.in);
	    	   String remove = removePlayer.next();
	    	   
	    	   if (remove.equals(player1.name)) {
	    		   teamRoster.remove(player1);
	    		   System.out.println("Player 1 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player2.name)) {
	    		   teamRoster.remove(player2);
	    		   System.out.println("Player 2 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player3.name)) {
	    		   teamRoster.remove(player3);
	    		   System.out.println("Player 3 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player4.name)) {
	    		   teamRoster.remove(player4);
	    		   System.out.println("Player 4 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player5.name)) {
	    		   teamRoster.remove(player5);
	    		   System.out.println("Player 5 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player6.name)) {
	    		   teamRoster.remove(player6);
	    		   System.out.println("Player 6 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player7.name)) {
	    		   teamRoster.remove(player7);
	    		   System.out.println("Player 7 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player8.name)) {
	    		   teamRoster.remove(player8);
	    		   System.out.println("Player 8 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player9.name)) {
	    		   teamRoster.remove(player9);
	    		   System.out.println("Player 9 was removed");
	    		   System.out.println();
	    	   }
	    	   if (remove.equals(player10.name)) {
	    		   teamRoster.remove(player10);
	    		   System.out.println("Player 10 was removed");
	    		   System.out.println();
	    	   }
	            break;
	            
	       case 6:
	    	   teamRoster.remove(player1);
	    	   System.out.println("The first player was removed");
	            break; 
	            
	       case 7:
 	    	   System.out.println(player1.name.toString()+" "+player1.team.toString()+ " "+ player1.jerseyNumber+" "+player1.height+" "+ player1.weight+" "+ player1.position); 
 	    	   System.out.println(player2.name.toString()+" "+player2.team.toString()+ " "+ player2.jerseyNumber+" "+player2.height+" "+ player2.weight+" "+ player2.position); 
 	    	   System.out.println(player3.name.toString()+" "+player3.team.toString()+ " "+ player3.jerseyNumber+" "+player3.height+" "+ player3.weight+" "+ player3.position); 
 	    	   System.out.println(player4.name.toString()+" "+player4.team.toString()+ " "+ player4.jerseyNumber+" "+player4.height+" "+ player4.weight+" "+ player4.position); 
 	    	   System.out.println(player5.name.toString()+" "+player5.team.toString()+ " "+ player5.jerseyNumber+" "+player5.height+" "+ player5.weight+" "+ player5.position); 
 	    	   System.out.println(player6.name.toString()+" "+player6.team.toString()+ " "+ player6.jerseyNumber+" "+player6.height+" "+ player6.weight+" "+ player6.position); 
 	    	   System.out.println(player7.name.toString()+" "+player7.team.toString()+ " "+ player7.jerseyNumber+" "+player7.height+" "+ player7.weight+" "+ player7.position); 
 	    	   System.out.println(player8.name.toString()+" "+player8.team.toString()+ " "+ player8.jerseyNumber+" "+player8.height+" "+ player8.weight+" "+ player8.position); 
 	    	   System.out.println(player9.name.toString()+" "+player9.team.toString()+ " "+ player9.jerseyNumber+" "+player9.height+" "+ player9.weight+" "+ player9.position); 
 	    	   System.out.println(player10.name.toString()+" "+player10.team.toString()+ " "+ player10.jerseyNumber+" "+player10.height+" "+ player10.weight+" "+ player10.position); 
		            break;
		       
	       
	      
	       
	       
	       }
	
		
	}
	
	
}
	class playerComparator implements Comparator<Player>{
		public int compare(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6, Player player7, Player player8, Player player9, Player player10) {
	return 0;
		}
@Override
public int compare(player o1, player o2) {
	return 0;
}

	}








