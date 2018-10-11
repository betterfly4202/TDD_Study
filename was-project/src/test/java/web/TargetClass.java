package web;

/**
 * Created by betterFLY on 2018. 10. 11.
 * Github : http://github.com/betterfly88
 */

public class TargetClass extends ClassNotFoundTest{
    public void execute() throws ClassNotFoundException{
//        Class c = Class.forName("web.ClassNotFoundTestt");
//        System.out.println("terminated!");
        System.out.println(super.getString());
    }


    public static void main(String[] args) {
        try {
            new TargetClass().execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
