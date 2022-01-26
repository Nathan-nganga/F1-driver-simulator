/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;



/**
 *
 * @author natty
 */

/**
 * The Driver class is an abstract class that holds basic information
 * such as their name, team and location.
 * This information will be used in the other subclasses.
 * 
 * In the public static void main at the bottom is where the menu method 
 * found in the FormulaChampionshipManager subclass will run from.
 * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.


 */
public abstract class Driver {
    String name;
    String team;
    String Location;
  
    public Driver(String name, String team, String Location){
        this.name = name;
        this.team = team;
        this.Location = Location;
        
    }
    public String getName()
    {
        return name;
    }
    public String getTeam()
    {
        return team;
    }
    public String getLocation()
    {
        return Location;
    }
    
       public  void setName(String name) {
        this.name = name;
    }
       
         public void setTeam(String team) {
        this.team = team;
    }

    public void setLocation(String location) {
        this.Location = location;
    }
    
    
     public static void main(String[] args){
             
        FormulaChampionshipManager fcm = new FormulaChampionshipManager("","","",10,10,10,10,10,10,10);
        fcm.menu();
      
    }
  
}
