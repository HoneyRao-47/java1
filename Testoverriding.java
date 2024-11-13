
package pkg1;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
        
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
        
    }
}
public class Testoverriding{
    public static void  main(String[] args){
        Animal animal=new Dog();
        animal.sound();
    }
}



