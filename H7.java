/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Employee{
    private int id;
    private String name;
    private Double Salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.Salary=salary;}
    public void raiseSalary(double percent){
            if(percent>0){
                double increment=Salary*percent/100;
                Salary=Salary+increment;
                
            
            System.out.println("New Salary:"+Salary);
    }
    else{
    System.out.println("Salary:"+Salary);}}
public void getEmpDetails(){
System.out.println(name+" "+id+" "+Salary);}}

            
                


public class H7 {
    public static void main(String[] args){
        Employee emp1=new Employee(1,"Honey",5000);
        emp1.getEmpDetails();
        emp1.raiseSalary(10);
        emp1.getEmpDetails();
    }
    
}
