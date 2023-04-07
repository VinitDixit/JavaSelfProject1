package TestLearn.exceptionPack;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exceptionTest=new ExceptionTest();
        try {
            exceptionTest.method1();
            exceptionTest.method2();
            exceptionTest.method3();
        } catch (IOException|ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public void method1(){
        int arr[]= new int[]{1,2,3,4,5};
        System.out.println(arr[6]);
    }
    public void method3() throws Exception {
        throw new Exception();
    }

    public void method2() throws IOException {
        throw new IOException();
    }
}
