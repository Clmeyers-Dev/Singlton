import java.util.ArrayList;

/**
 * @author chris
 *
 */

public class HospitalSystem {

	// static variable single_instance of type Singleton
	   private static HospitalSystem hospitalSystem = null;
	   private ArrayList<Patient> patients=new ArrayList<>();

	   // private constructor restricted to this class itself
	   private HospitalSystem()
	   {
	   }

	   // static method to create instance of Singleton class
	   /**
	 * @return
	 */
	public static HospitalSystem getInstance()
	   {
	       if (hospitalSystem == null)
	           hospitalSystem = new HospitalSystem();

	       return hospitalSystem;
	   }
	   //This method add a patient to the list
	   /**
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public int addPatient(String firstName,String lastName)
	   {
	       int id=patients.size();
	       Patient patient=new Patient(id, firstName, lastName);
	       patients.add(patient);
	       return id;
	   }
	   //This method returns record at index id
	   /**
	 * @param id
	 * @return
	 */
	public Patient getRecord(int id)
	   {
	       return patients.get(id);
	   }
	   //This method adds an allergy to the patient
	   /**
	 * @param id
	 * @param allergy
	 */
	public void addAllergy(int id,String allergy)
	   {
	       Patient patient=patients.get(id);
	       patient.addAllergy(allergy);
	   }
	   //This method returns all patients data
	   /**
	 * @return
	 */
	public String getAllPatientsData()
	   {
	       StringBuilder str=new StringBuilder();
	       for(Patient patient:patients)
	       {
	           str.append(patient.toString().replace("[", "").replace("]", "")+"\n");
	       }
	       return str.toString();
	   }
}
