import java.util.ArrayList; 
public class Faculty extends Employee {

	private String department;
private ArrayList<Boolean> facBenefits = new ArrayList<Boolean>(); 
  
  public Faculty(String name, int salary, int yearsExp){
    super(name, salary, yearsExp); 
    facBenefits.add(null);
    facBenefits.add(null);
    facBenefits.add(null);
    facBenefits.add(null);
    facBenefits.add(null);
    department = "" ;
   
  }
  public Faculty(String name, int salary, int yearsExp, boolean a, boolean b, boolean c, boolean d, boolean e, String dept){
    super(name, salary, yearsExp); 
    facBenefits.add(a); 
    facBenefits.add(b); 
    facBenefits.add(c); 
    facBenefits.add(d); 
    facBenefits.add(e);
    department = dept; 
  }
	public String getDepartment() {
		return department;
	}

  public ArrayList<Boolean> getBenefits(){ 
     
    return facBenefits; 
    }

	public void setDepartment(String department) {
		this.department = department;
	
  }

  public void setBenefits(ArrayList<Boolean> facBenefits){ 
     
    this.facBenefits = facBenefits; 
    }

  public String facultyInfo(String name, String department, int yearsExp, int salary){
    
    return name + "works in the " + department + " department" +", has been with John Carroll for " + yearsExp + " years, and makes $" + salary + " per year.";
  }
  
}