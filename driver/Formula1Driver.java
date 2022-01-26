/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author natty
 * 
 * The Formula1Driver class hold more information about the driver things 
 * such as their: total points,NumofRaces,Numof1stPost,Numof2ndPost, Numof3rdPost and pointsperrace
 */
public class Formula1Driver extends Driver{
    int Totalpoints;
    int NumofRaces;
    int Numof1stPost;
    int Numof2ndPost;
    int Numof3rdPost;
    int pointsPerRace;
    
            
/**
Because this a subclass it must include the properties of the abstract class.
* Name, team and Location to implement this I used the super() method
* Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

 */

    public Formula1Driver(String name, String team, String Location,int points,int NumofRaces, int Numof1stPost, int Numof2ndPost, int Numof3rdPost){
        super(name,team,Location);
        this.Totalpoints = points;
        this.NumofRaces = NumofRaces;
        this.Numof1stPost = Numof1stPost;
        this.Numof2ndPost = Numof2ndPost;
        this.Numof3rdPost = Numof3rdPost;
        this.NumofRaces = NumofRaces;
        this.Totalpoints = points;
    } 
    
  
    public int getNumof1stPost(){
        return Numof1stPost;
    }
    public int getNumof2ndPost(){
        return Numof2ndPost;
    }
    public int getNumof3rdPost(){
        return Numof3rdPost;
    }
    public int getTotalPoints(){
        return Totalpoints;
    }
    public int getRaces(){
        return NumofRaces;
    }
    
    public int getPointsPerRace() {
        return pointsPerRace;
    }
        
    public void setNumof1stPost(int Fp){
        Numof1stPost = Fp;    
    }
    public void setNumof2ndPost(int Sp){
        Numof1stPost = Sp;    
    }
    public void setNumof3rdPost(int Tp){
        Numof1stPost = Tp;    
    }
    public void setTotalPoints(int pts){
        Totalpoints = pts;
    }
    public void setRaces(int Rcs){
        NumofRaces = Rcs;
    }  
    public void setPointsPerRace(int pointsPerRace) {
        this.pointsPerRace = pointsPerRace;
    }
    
    /**
     * 
     * @return 
     */
          @Override
    public String toString() {
        return "Driver: "+getName()+
                " Location: "+getLocation()+
                " Team: "+getTeam()+
                "\nNum. of 1st positions: " + getNumof1stPost() +
                "\nNum. of 2nd positions: "+  getNumof2ndPost() +
                "\nNum. of 3rd positions: " + getNumof3rdPost() +
                "\nPoints: " + getTotalPoints() +
                " Races: " + getRaces();
    }
        
    
}

