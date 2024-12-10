
package pkg1;
import pkg2.MyPackage3;
import pkg2.MyPackage2;

class MyPackage{
    public void display(){
        System.out.println("this msg is from MyPackage class within pkg1");
    }
}



public class H35 {
    public static void main(String[] args){
        System.out.println("package");
        MyPackage mypack1=new MyPackage();
        MyPackage2 mypack2=new MyPackage2();
        MyPackage3 mypack3=new MyPackage3();
        mypack1.display();
         mypack2.display();
         mypack3.display();
        
        
        
        
    }
    
}
