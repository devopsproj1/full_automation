package Testng;

import org.testng.annotations.Test;

public class default_asci_order_test {
    @Test
    public  void  apple(){
        System.out.println("a");
    }

    @Test
    public void boy(){
        System.out.println();
    }
    @Test
    public  void   aascifirst(){
        System.out.println("run in asci order");
    }
    @Test
    public void demo(){
        System.out.println("running it on last");
    }
    @Test
    public void AA(){
        System.out.println("run AA");
    }
    @Test
    public void aa(){
        System.out.println("run aa");
    }
}
