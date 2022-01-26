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
public interface ChampionshipManager {
    public int getf1drivers();
    public int getf1cars();
    public void CreateNewDriver();
    public void DeleteDriverandTeam();
    public void ChangeDriverTeam();
    public void DisplaystatsforselectedDriver();
    public void DisplayF1table();
    public void AddRace();
    public void Storeprogramdataintofile();
    public void Loadprogramdatafromfile();
    
    
}
