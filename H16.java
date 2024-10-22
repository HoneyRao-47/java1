/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class MultiThreadingTwo implements  Runnable{
    public void run(){
        System.out.println("Thread"+Thread.currentThread().getId()+" is running");
        
    }
}
public class H16 {
    public static void main(String[] args){
        for(int i=0;i<8;i++){
            MultiThreadingTwo mt1=new MultiThreadingTwo();
            Thread t1= new Thread(mt1);
            t1.start();
        }
    }
    
    
}
