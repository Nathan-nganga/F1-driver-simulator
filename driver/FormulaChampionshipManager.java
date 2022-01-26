/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

/**
 *
 * @author natty
 * This is the FormulaChampionshipManager which extends Formula1Driver as it holds all driver information
 * such as name,team,location, points and how many times they achieved a position.
 * This information will be very important for the methods used in the menu.
 * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.
 */
public class FormulaChampionshipManager extends Formula1Driver implements ChampionshipManager {  
    static boolean MainMenu = true;
    static boolean SubMenu = true;
    public int f1drivers;
    public int f1cars;
    public String man;
    public int Fp=0;
    public int Sp=0;
    public int Tp=0;
    public int noOfRaces=0;
    public int currentPoints;
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    static ArrayList<Formula1Driver> driverList = new ArrayList<Formula1Driver>();
     
    public static void getDriverList() {
    }
    public FormulaChampionshipManager(String name, String team, String Location,int points,int NumofRaces, int Numof1stPost, int Numof2ndPost, int Numof3rdPost,int f1drivers, int f1cars){
        super(name,team,Location,points,NumofRaces,Numof1stPost,Numof2ndPost,Numof3rdPost);
        this.f1drivers = f1drivers;
        this.f1cars = f1cars;
    }
     
    public int getF1drivers() {
        return f1drivers;
    }

    public void setF1drivers(int f1drivers) {
        this.f1drivers = f1drivers;
    }

    public int getFp() {
        return Fp;
    }

    public void setFp(int fp) {
        this.Fp = Fp;
    }

    public int getSp() {
        return Sp;
    }

    public void setSp(int sp) {
        this.Sp = Sp;
    }

    public int getTp() {
        return Tp;
    }

    public void setTp(int tp) {
        this.Tp = Tp;
    }

    public int getNoOfRaces() {
        return noOfRaces;
    }

    public void setNoOfRaces(int noOfRaces) {
        this.noOfRaces = noOfRaces;
    }

    public int getf1drivers(){
        return f1drivers;
    }
    
    public int getf1cars(){
        return f1cars;
    }
        public void menu(){
            String Option;
          //Below is the menu options that a customer is able to choose from
        while (MainMenu) {
          while (SubMenu) {
               
         System.out.println("Hello and Welcome to F1");
         System.out.println("================================================");
         System.out.println("Please look over and select one of the options.");
         System.out.println("================================================");
         System.out.println("C: Create New Driver.");
         System.out.println("================================================");
         System.out.println("D: Delete Driver and Team.");
         System.out.println("================================================");
         System.out.println("E: Change Driver Team.");
         System.out.println("================================================");
         System.out.println("V: Display stats for selected Driver.");
         System.out.println("================================================");
         System.out.println("F: Display F1 table.");
         System.out.println("================================================");
         System.out.println("A: Add Race.");
         System.out.println("================================================");
         System.out.println("S: Store program data in to file.");
         System.out.println("================================================");
         System.out.println("L: Load program data from file.");
         System.out.println("================================================");
        
         /*
         Below is the method on how users choose
         which service they want to use on the menu.
         For this method I used the if else conditions 
         */
         
         Option = input.next();
        
             if (Option.equals("C")){
                 CreateNewDriver();
            }
             if (Option.equals("D")){
                  DeleteDriverandTeam();
            }   
             if (Option.equals("E")){
                  ChangeDriverTeam();
            }
                 
             if (Option.equals("V")){
                 DisplaystatsforselectedDriver();
            }     
             if (Option.equals("F")){
                  DisplayF1table();
            }   
                 
             if (Option.equals("A")){
                  AddRace();
            }     
             if (Option.equals("S")){
                 Storeprogramdataintofile();
            }
                 
             if (Option.equals("L")){
                 Loadprogramdatafromfile();
            }
                 
             else{
                 System.out.println("Please choose an option from the list");
            }
             
              /*
          After choosing an option from the menu above    
          the program will continue, the submenu below allows the user
          to choose another option from the main menu.  
         */              
         System.out.println("================================================");
         System.out.println("Would you like to Select another Option\n1 ) Yes\n2 ) No");
         System.out.println("================================================");
         if (input.nextInt() == 1) {
             SubMenu = true;
            } else {
             SubMenu = false;
            }
                    
         
            }
                
            }
          /*
          This second submenu allows the customer to exit the program
          by pressing '2' from the first submenu and '2' again in the second
          submenu, the user will be able to exit the program           
         */
         SubMenu = true;
            System.out.println("================================================");
            System.out.println("Would You Like To Continue With The Program\n1 ) Yes\n2 ) No");
            System.out.println("================================================");
            if (input.nextInt() == 1) {
                MainMenu = true;
            } else {
                System.out.println("");
                System.exit(0);
            }  
            }   
             
         /*
           Below are the diffrent methods used to allow the customer
           to use the diffrent functions of the main menu
         */
    


     public void CreateNewDriver() {
         /**
          * This is the method that allows users to add their own drivers to the system.
          * The method asks the user three questions and the scanner input reads what the users types in.
          * The method also gives each driver a number of races that they have competed in.
          * One the driver is created they are added to the driver list.
          * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

          */
         super.setName(input.nextLine());
         System.out.println("Enter the new driver's name: ");
         super.setName(input.nextLine());
         System.out.println("Enter "+super.getTeam()+"'s team name: ");
         super.setTeam(input.nextLine());
         System.out.println("Enter "+super.getLocation()+"'s Location: ");
         super.setLocation(input.nextLine());
         super.setRaces(getNoOfRaces());
         super.setNumof1stPost(getFp());
         super.setNumof2ndPost(getSp());
         super.setNumof3rdPost(getTp());
         Formula1Driver newDriver = new Formula1Driver(getName(), getTeam(), getLocation(),             
         getNumof1stPost(), getNumof2ndPost(), getNumof3rdPost(), getTotalPoints(), getRaces());
         driverList.add(newDriver);
         System.out.println(super.getName()+" has been added to this season!");
         for(Formula1Driver driver : driverList){
            System.out.println(driver.toString());
    }
       
       
    }

    public void DeleteDriverandTeam() {
        /**
         * This is the second option of the menu which allows the user to delete a driver.
         * The program will ask the user to type in the name of which driver they would like to delete.
         * The program will then search for this driver in the driver list and delete them from the program.
         * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

         */
        System.out.println("Enter the name of the driver you want to delete: ");
        String deletingDriver = input.next();
        for (Formula1Driver driver : driverList){
            if (deletingDriver.equals(driver.getName())){
                driverList.remove(driver);
            }
        }
        System.out.println(deletingDriver+" has been deleted!");
    }

    public void ChangeDriverTeam() {
        /**
         * This method allows the user to change the team for a driver.
         * To do this the program will ask the user for name of team which the driver
         * has to change 
         * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

         */
        System.out.println("Enter the team you wish to change the driver for: ");
        String changingTeam = input.next();
        for (Formula1Driver driver : driverList){
            if (changingTeam.equals(driver.getTeam())){
                System.out.println("Enter the name of the new driver: ");
                String newDriver = input.next();
                driver.setName(newDriver);
            }
        }
        System.out.println("The racer for "+changingTeam+" has been changed!");
    }

    public void DisplaystatsforselectedDriver() {
        /**
         * This method allows the user to get the stats for any driver that they are interested in.
         * The user types in the driver name and the program displays information such as:
         * number of 1st positions, number of 2nd positions, number of 3rd positions and total of 
         * points.
         * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

         */
        System.out.println("Enter the name of the driver you wish to see the statistics for: ");
        String statDriver = input.next();
        for (Formula1Driver driver : driverList){
            if (statDriver.equals(driver.getName())){
                System.out.println("Races participated this season: "+driver.getRaces()+
                                    "\nNumber of first positions: "+driver.getNumof1stPost()+
                                    "\nNumber of second positions: "+driver.getNumof2ndPost()+
                                    "\nNumber of third positions: "+driver.getNumof3rdPost()+
                                    "\nTotal number of points: "+driver.getTotalPoints());
    }
    }
    }

    public void DisplayF1table() {
        /**
         * This method makes the program display a table for all the driver which shows all 
         * their stats.
         * The method gets this information from the drivers list
         * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

         */
        System.out.println("Formula 1 Championship 2021 points table");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s", "DRIVER","|", "LOCATION","|", "TEAM","|", "POINTS","|", "1ST POSITIONS","|", "RACES");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        for (Formula1Driver driver : driverList){
            System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s",
                    driver.getName(), "|", driver.getLocation(), "|", driver.getTeam(), "|", driver.getTotalPoints(), "|", driver.getNumof1stPost(), "|", driver.getRaces()+"\n");
    }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }

    public void AddRace() {
        /**
         * This is the method that generates a race.
         * The method asks the user to enter a date for the race.
         * At each race the drivers earn points depending on which 
         * position they achieved during the race.
         * Using a switch method allows this method to run smoothly.
         * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

         */
        noOfRaces++;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter the date of the new race: ");
        String raceDate = input.nextLine();
        try {
            Date date1 = format.parse(raceDate);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("The new race has been added!");
        for (Formula1Driver driver : driverList) {
            int racePosition = (int) ((Math.random() * (9)) + 1);
            switch (racePosition) {
                case 1:
                    driver.setPointsPerRace(25);
                    Fp++;
                    driver.setNumof1stPost(Fp);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 2:
                    driver.setPointsPerRace(18);
                    Sp++;
                    driver.setNumof2ndPost(Sp);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 3:
                    driver.setPointsPerRace(15);
                    Tp++;
                    driver.setNumof3rdPost(Tp);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 4:
                    driver.setPointsPerRace(12);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 5:
                    driver.setPointsPerRace(10);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 6:
                    driver.setPointsPerRace(8);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 7:
                    driver.setPointsPerRace(6);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 8:
                    driver.setPointsPerRace(4);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 9:
                    driver.setPointsPerRace(2);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
                case 10:
                    driver.setPointsPerRace(1);
                    currentPoints=driver.getTotalPoints()+driver.getPointsPerRace();
                    driver.setTotalPoints(currentPoints);
                    driver.setRaces(noOfRaces);
                    break;
            }
        }
       
    }

    public void Storeprogramdataintofile() {
        /**
         *  This method allows the user to store the data from the program like driver information and their stats
         * and their achievements they gained during the race.
        using the FileWriter the data is stored in an empty file that is connected to our program.
        * Reference:Anonymous. (2021). Java program. Available: https://www.chegg.com/homework-help/questions-and-answers/description-task-create-java-program-simulates-manipulation-formula-1-racing-car-champions-q88743609. Last accessed 10th Dec 2021.

         */
         try {
            FileOutputStream fOut = new FileOutputStream(new File("C:\\Users\\natty\\OneDrive\\Documents\\NetBeansProjects\\Driver\\src\\driver\\Race"));
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);

            oOut.writeObject(driverList);

            oOut.close();
            fOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The data has been saved!");
    }

    public void Loadprogramdatafromfile() {
         try {
            FileInputStream fIn = new FileInputStream(new File("C:\\Users\\natty\\OneDrive\\Documents\\NetBeansProjects\\Driver\\src\\driver\\Race"));
            InputStream inputStream = new ByteArrayInputStream(driverList.get(0).getName().getBytes(StandardCharsets.UTF_8));
            ObjectInputStream oIn = new ObjectInputStream(fIn);

            driverList = (ArrayList<Formula1Driver>) oIn.readObject();

            System.out.println(driverList.toString());

            oIn.close();
            fIn.close();

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      
    }
   

