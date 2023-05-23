import java.io.*;

public class program {
    public static void main(String[] args) throws Exception {
        // test device class & interfaces 
        device n = new device();
        boolean b = n.isaComputer();
        System.out.println(b);
        boolean b2 = n.isaMobile();
        System.out.println(b2);
    }
}