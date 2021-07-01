/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainee;

/**
 *
 * @author smair
 */
public class Trainee {
    
    private String name;
        
    private String contactAddress;
        
    private String telephone;
        
    private String dob;
        
    private double attendedClass;

    private double totalClass;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getAttendedClass() {
        return attendedClass;
    }

    public void setAttendedClass(double attendedClass) {
        this.attendedClass = attendedClass;
    }

    public double getTotalClass() {
        return totalClass;
    }

    public void setTotalClass(double totalClass) {
        this.totalClass = totalClass;
    }
    
    public double percentageOfAttendedClass () {
        double c = this.attendedClass / this.totalClass ;
        double p =  c * 100;
        
        return p;
    }

    public Trainee(String name, String contactAddress, String telephone, String dob, double attendedClass, double totalClass) {
        this.name = name;
        this.contactAddress = contactAddress;
        this.telephone = telephone;
        this.dob = dob;
        this.attendedClass = attendedClass;
        this.totalClass = totalClass;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Trainee to = new Trainee("rezaul", "demra", "017", "2-8-1993", 40, 100);
               
        System.out.println( "percenteage of trainee " + to.getName() + " is " + to.percentageOfAttendedClass() + "%");
    }
    
}
