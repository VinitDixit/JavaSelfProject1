package TestLearn.exceptionPack;

import java.io.IOException;
import java.sql.SQLException;

public class SubCls extends SuperCls{
    public void display() throws ArrayIndexOutOfBoundsException {
        System.out.println("SubClass dispaly");
    }
}
