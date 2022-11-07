import java.util.ArrayList;
public class Administrator extends Employee {

private String jobTitle;
private ArrayList<Boolean> adminBenefits = new ArrayList<Boolean>(); 
  
  public Administrator(String name, int salary, int yearsExp){
    super(name, salary, yearsExp);  
    adminBenefits.add(null);
    adminBenefits.add(null);
    adminBenefits.add(null);
    adminBenefits.add(null);
    adminBenefits.add(null);
    jobTitle = "";
  }

  public Administrator(String name, int salary, int yearsExp, boolean a, boolean b, boolean c, boolean d, boolean e, String jt){
    super(name, salary, yearsExp); 
    adminBenefits.add(a); 
    adminBenefits.add(b); 
    adminBenefits.add(c); 
    adminBenefits.add(d); 
    adminBenefits.add(e); 
    jobTitle = jt; 
  }
  public String getJobTitle(){
    return jobTitle;
  }
 public ArrayList<Boolean> getBenefits(){ 
     
    return adminBenefits; 
    }

  public void setJobTitle(String jobTitle){
    this.jobTitle = jobTitle; 
  }

  public void setBenefits(ArrayList<Boolean> adminBenefits){
    this.adminBenefits = adminBenefits; 
  }
  
  public String adminInfo(String name, String jobTitle, int yearsExp, int salary){
   
    return name +", a " + jobTitle +", has been with John Carroll for " + yearsExp + " year(s) and makes $" + salary + " per year.";
  }

  public String toString (String jobTitle, String name, int salary, int yearsExp){
    return "Administrator []" ;
  }
}