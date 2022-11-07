import java.util.ArrayList; 
public class Staff extends Employee {
private int daysWorked; 
private ArrayList<Boolean> staffBenefits = new ArrayList<Boolean>(); 

  public Staff(String name, int salary, int yearsExp){
    super(name, salary, yearsExp); 
    staffBenefits.add(null);
    staffBenefits.add(null);
    staffBenefits.add(null);
    staffBenefits.add(null);
    staffBenefits.add(null);
    daysWorked = 0;

  }

  public Staff (String name, int salary, int yearsExp, boolean a, boolean b, boolean c, boolean d, boolean e, int dw){
    super(name, salary, yearsExp); 
    staffBenefits.add(a); 
    staffBenefits.add(b); 
    staffBenefits.add(c); 
    staffBenefits.add(d); 
    staffBenefits.add(e);
    daysWorked = dw; 
  }
public int getDaysWorked() {
	return daysWorked;
}
 public ArrayList<Boolean> getBenefits(){ 
     
    return staffBenefits; 
    }

public void setDaysWorked(int daysWorked) {
	this.daysWorked = daysWorked;
}

  public void setBenefits(ArrayList<Boolean> staffBenefits){ 
     
    this.staffBenefits = staffBenefits; 
    }



public String staffInfo(int daysWorked, String name, int salary, int yearsExp){
  return name +" has been with John Carroll for " + yearsExp +" years, works " + daysWorked +" per week, and makes $" + salary + " per year.";
}


  
}