/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class MultiThreadingFive implements Runnable{
    int threadNumber;
    MultiThreadingFive(int tNo){
        this.threadNumber=tNo;
    }
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println("task"+i+"by ThreadNumber"+threadNumber);
            try{
                Thread.sleep(1000);
                
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
public class H19 {
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            MultiThreadingFive mt1=new MultiThreadingFive(i);
            Thread t1=new Thread(mt1);
            t1.start();
        }
    }
    
}
