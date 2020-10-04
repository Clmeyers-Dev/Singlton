import java.util.ArrayList;

//This class holds patient data
/**
 * @author chris
 *
 */
public class Patient {
   //Instance variables
   private int id;
   private String firstName;
   private String lastName;
   private ArrayList<String> allergies=new ArrayList<>();
   //Constructor
   /**
 * @param id
 * @param firstName
 * @param lastName
 */
public Patient(int id, String firstName, String lastName) {
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
   }
   //Method to add allergy
   /**
 * @param allergy
 */

void addAllergy(String allergy)
   {
       allergies.add(allergy);
   }
   //ToString
   /**
 *
 */
@Override
   public String toString() {
       String allergyData=allergies.size()>0?(" Allergies:" + allergies):"";
       return "Patient " + (id+1) + ": " + firstName + " " + lastName + "\n" + allergyData;
   }
}