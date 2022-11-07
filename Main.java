import java.util.ArrayList; 
class Main {


  public static void main(String[] args) {

   
// ADMIN
  Administrator principal = new Administrator("Carl Patton", 100000, 1, true, false, false, false, true, "principal"); 
  Administrator vp1 = new Administrator("Danica Attanasio", 90000, 15, true, true, false, true, true, "vice-principal"); 
  Administrator vp2 = new Administrator("Jake Hollin", 90000, 13, false, false, true, true, true, "vice-principal"); 
    
// FACULTY
  Faculty teacher1 = new Faculty("Mr. Monaghan", 75000, 7, true, true, true, true, true, "STEAM");
  Faculty teacher2 = new Faculty("Mrs. Roiy", 70000, 6, true, true, true, false, false,  "St. Joe's"); 
  Faculty teacher3 = new Faculty("Mr. Orndorff", 60000, 1, true, false, false, false, false, "Mathematics"); 

// STAFF
  Staff lady = new Staff("Karen", 10000, 3, false, false, false, true, false, 5); 
  Staff man = new Staff ("Bob", 10000, 2, false, false, true, false, false, 3); 
  Staff counselor = new Staff("Tucker", 30000, 5, false, false, false, true, false, 3) ; 

// TOTAL PAYROLL
  System.out.println("JOHN CARROLL'S CURRENT PAYROLL:");
  System.out.println(); 
ArrayList<Integer> payroll = new ArrayList<Integer>(); 

   payroll.add(principal.getSalary()); 
   payroll.add(vp1.getSalary()); 
   payroll.add(vp2.getSalary()); 
   payroll.add(teacher1.getSalary()); 
   payroll.add(teacher2.getSalary()); 
   payroll.add(teacher3.getSalary()); 
   payroll.add(lady.getSalary()); 
   payroll.add(man.getSalary()); 
   payroll.add(counselor.getSalary()); 
  
int totalPay = 0; 
    for (int i: payroll){
      totalPay += i; 
    } System.out.println("The total amount of money on John Carroll's payroll is: $" + totalPay); 
System.out.println(); 

// ADMIN PAYROLL
    ArrayList<Integer> adminPayroll = new ArrayList<Integer>(); 

   adminPayroll.add(principal.getSalary()); 
   adminPayroll.add(vp1.getSalary()); 
   adminPayroll.add(vp2.getSalary()); 
    int adminPay = 0; 
    for (int i: adminPayroll){
      adminPay += i; 
    } System.out.println("The amount of money on John Carroll's administration payroll is: $" + adminPay); 
System.out.println(); 

// FACULTY PAYROLL
    ArrayList<Integer> facPayroll = new ArrayList<Integer>(); 

   facPayroll.add(teacher1.getSalary()); 
   facPayroll.add(teacher2.getSalary()); 
   facPayroll.add(teacher3.getSalary()); 
    int facPay = 0; 
    for (int i: facPayroll){
      facPay += i; 
    } System.out.println("The amount of money on John Carroll's faculty payroll is: $" + facPay); 
System.out.println(); 

// STAFF PAYROLL 
     ArrayList<Integer> staffPayroll = new ArrayList<Integer>(); 

   staffPayroll.add(lady.getSalary()); 
   staffPayroll.add(man.getSalary()); 
   staffPayroll.add(counselor.getSalary()); 
    int staffPay = 0; 
    for (int i: staffPayroll){
      staffPay += i; 
    } System.out.println("The amount of money on John Carroll's staff payroll is: $" + staffPay); 


   System.out.println();  
 System.out.println("EMPLOYEE RECORDS FOR HEALTH, DENTAL, VISION, LIFE, AND RETIREMENT BENEFITS.");
    System.out.println();
// ADMIN BENEFITS 
System.out.println(principal.getName()+"'s status: " + principal.getBenefits());  
    System.out.println();
System.out.println(vp1.getName()+"'s status: " + vp1.getBenefits());  
    System.out.println();
System.out.println(vp2.getName()+"'s status: " + vp2.getBenefits()); 
    System.out.println();
// FACULTY BENEFITS
System.out.println(teacher1.getName()+"'s status: " + teacher1.getBenefits());  
    System.out.println();
System.out.println(teacher2.getName()+"'s status: " + teacher2.getBenefits());
    System.out.println();
System.out.println(teacher3.getName()+"'s status: " + teacher3.getBenefits());  
    System.out.println();
// STAFF BENEFITS 
System.out.println(lady.getName()+"'s status: " + lady.getBenefits());  
    System.out.println();
System.out.println(man.getName()+"'s status: " + man.getBenefits());
    System.out.println();
System.out.println(counselor.getName()+"'s status: " + counselor.getBenefits());  
  }
}