package TestLearn.exceptionPack;

import java.io.IOException;

public class SubCls extends SuperCls{
    public void display() throws RuntimeException{
        System.out.println("SubClass dispaly");
    }
}
