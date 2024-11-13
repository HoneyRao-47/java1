
package pkg1;
class  vehicle{
    void start(){
        System.out.println("vehicle is starting..");
        
    }
}
class Car extends vehicle{
    void drive(){
        System.out.println("car is being driven");
        
    }
}
class ElectricCar extends Car{
    void chargeBattery(){
        System.out.println("electric  car battery is charging ..");
    
    }
}


public class Multilevel {
    public static void main(String[] args){
        ElectricCar myCar=new ElectricCar();
        myCar.start();
        myCar.drive();
        myCar.chargeBattery();
    }
    
}
