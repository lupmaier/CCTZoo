/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import animals.Animal;
import ultility.AnimalModel;
import ultility.DataSetup;
import view.SearchAnimalMenu;
import view.View;

/**
 * Purpose: it control the basics of the system, setup data, updates the view and
 * exits the system.
 * @author fernandoms
 */
public class Controller {
    private View view;
    private AnimalModel animalModel;
    
    /**
     * Purpose: it starts the system by setting up the basic data and calling the 
     * initial screen
     */
    public void start(){
        DataSetup ds = new DataSetup();
        animalModel = new AnimalModel(ds.generateAnimals(20));
        view = new SearchAnimalMenu();
        
    }

    /**
     * Purpose: updates the view
     */
    public void update(){
        view.fetchData(animalModel);
        view.display();
        view = view.getOpt();
    }
    
    /**
     * Purpose: check if a view object has been selected and stored to the 'view'
     * variable. if the 'view' variable is null it means that the system has been 
     * exited.
     * @return a boolean; true if the system has been exited
     */
    public boolean exit(){
        if(view == null){
            return true;
        }
        return false;
    }
    
}
