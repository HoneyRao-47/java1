
package pkg1;
class Device{
    void powerOn(){
        System.out.println("device is poweres on");
    }
}
interface Camera{
    void takePhoto();
}
interface musicPlayer{
    void playMusic();
}
class Smartphone extends Device implements Camera,musicPlayer{
    
    @Override
    public  void  playMusic(){
        System.out.println("playing music..");
        
    }

    @Override
    public void takePhoto() {
         
    }
    
}

public class Inheriting {
    public static void main(String[] args){
        Smartphone myphone=new Smartphone();
        myphone.powerOn();
        myphone.takePhoto();
        myphone.playMusic();
        
        
    }
}
