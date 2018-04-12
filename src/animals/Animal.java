/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author fernandoms
 */
public abstract class Animal {
    String dateOfBirth;
    String dateOfArrival;
    String gender;
    int OffSpring;
    String medication;
    boolean vaccine;
    static int exhibitNumber; 
    String name;

    public Animal(String dateOfBirth, String dateOfArrival, String gender, int OffSpring, String medication, boolean vaccine) {
        this.dateOfBirth = dateOfBirth;
        this.dateOfArrival = dateOfArrival;
        this.gender = gender;
        this.OffSpring = OffSpring;
        this.medication = medication;
        this.vaccine = vaccine;
       
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public String getGender() {
        return gender;
    }

    public int getOffSpring() {
        return OffSpring;
    }

    public String getMedication() {
        return medication;
    }

    public boolean isVaccine() {
        return vaccine;
    }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOffSpring(int OffSpring) {
        this.OffSpring = OffSpring;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public static int getExhibitNumber() {
        return exhibitNumber;
    }

    public String getName() {
        return name;
    }

    public static void setExhibitNumber(int exhibitNumber) {
        Animal.exhibitNumber = exhibitNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @Override
    public String toString() {
        return "Animal info:" + "\nDate Of Birth = " + dateOfBirth + "\nDate Of Arrival = " + dateOfArrival + ""
                + "\nGender =  " + gender + "\nOffSpring = " + OffSpring + "\nMedication = " + medication + ""
                + "\nVaccine = " + vaccine + "\nExhibitnNumber = " + exhibitNumber;
    }



    
    
}
