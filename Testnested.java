
package pkg1;
class animal{
    class Leg{
        void move(){
            System.out.println("animal's legs helps in movement");
            
            
        }
    }
}

public class Testnested {
    public static  void main(String[] args){
        animal a=new animal();
        animal.Leg leg= a.new Leg();
        leg.move();
    }
    
    
}
