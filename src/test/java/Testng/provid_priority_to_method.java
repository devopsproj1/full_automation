package Testng;

import org.testng.annotations.Test;

public class provid_priority_to_method {
    @Test
    public void APPLE(){
        System.out.println("APPLE");
    }
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
    @Test(priority = 1)
    public void demo(){
        System.out.println("running it on last");
    }
    @Test(priority = 3)
    public void AA(){
        System.out.println("run AA");
    }
    @Test(priority = 2)
    public void aa(){
        System.out.println("run aa");
    }
    @Test(priority = 2)
    public void aaabb(){
        System.out.println("bb");
    }
    @Test(priority = 2)
    public void AAAA(){
        System.out.println("AAAAA");
    }
    @Test(priority = 0)
    public void zero(){
        System.out.println("run zero priority");
    }
    @Test(priority = -1)
    public void negative(){
        System.out.println("Negative");
    }
    @Test(priority = -4)
    public void negfour(){
        System.out.println("negfour");
    }
}
//first run asci order for those method in which priority not defined
//then run method based on priority
//but negative priority skip asci and all priority and run first
//miultiple method same priority run a/c to asci /ALphabet order
