/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import interfaces.MamalAquatic;

/**
 *
 * @author joao-
 */
public class Seal extends Animal implements MamalAquatic{

    public Seal(String dateOfBirth, String dateOfArrival, String gender, int OffSpring, String medication, boolean vaccine, boolean exhibit, int number) {
        super(dateOfBirth, dateOfArrival, gender, OffSpring, medication, vaccine, exhibit, number);
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
