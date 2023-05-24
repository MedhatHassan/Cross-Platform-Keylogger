import java.util.ArrayList;
public class program {
    public static void main(String[] args) throws Exception {
        // test device class & interfaces 
        device n = new device();
        device n2 = new device();
        ArrayList<device> arr = new ArrayList<device>();
        boolean b = n.isaComputer();
        System.out.println("device 1 =" + b);
        
        target t1 = new target("new", n);
        System.out.println("device 1 type ="+ n.getDeviceType());
        t1.addDevice(t1, n2);
        arr = t1.getDevices(t1);
        System.out.println("....................................");
        for (int i = 0; i< arr.size() ;i++) {
            System.out.println(arr.get(i).getDeviceType());
        }
        file f = new file();
        System.out.println(f.getDate());
    }
}