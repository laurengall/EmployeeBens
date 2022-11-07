import java.util.ArrayList; 
public class Employee {
private String name; 
private int salary;
private int yearsExp; 


public Employee(){
  name =""; 
  salary = 0; 
  yearsExp = 0;

   
}

  public Employee(String n, int s, int ye){
    name = n; 
    salary = s; 
    yearsExp = ye; 

  }

public String getName(){
  return name; 
}

public int getSalary(){
  return salary; 
}  

public int getYearsExp(){
    return yearsExp; 
  }


  public void setName(String name){
    this.name = name; 
  }

  public void setSalary(int salary){
    this.salary = salary; 
  }

  public void setYearsExp(int yearsExp){
    this.yearsExp = yearsExp; 
  }


  public String employeeInfo(String name, int salary, int yearsExp){
    return name +" has been with John Carroll for " + yearsExp + " years and makes $" + salary + " per year.";
  }
  
}