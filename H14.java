
package pkg1;
class car{
    private String make;
    private String model;
    private int year;
    private String color;
    car(String mk,String md,int yr,String clr){
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.color=clr;}
        public void getCarDetails(){
            System.out.println(color+" "+make+"-"+model+" "+year);}}

                
            
        
   


public class H14 {
    public static void main(String[] args){
        car principalCar=new car("Hyundai","i20",2022,"white");
        car vprincipalCar=new car("maruti","swift",2020,"grey");
        System.out.println("the two cars parked in front of SMVITM are");
        principalCar.getCarDetails();
        vprincipalCar.getCarDetails();
        
        
    }
    
}
