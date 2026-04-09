
import jdk.dynalink.support.AbstractRelinkableCallSite;

public class firstFun{
    public static void harsh(){
        System.out.println("1st");
    }
    public static void main(String []args){
        ankit();            //calling harsh
        System.out.println("2nd");
        harsh();
        aman();
    } 
    public static void ankit(){
        System.out.println("3rd");
        raman();
    }
    public static void aman(){
        System.out.println("aman");
    }
    public static void raman(){
        System.out.println("raman");
        suman();
    }
    public static void suman(){
        System.out.println("suman");
    }

}