import java.sql.Date;
import java.text.SimpleDateFormat;
public class file {
    private String name;
    private String DOF;
    private target target;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDate(){
        return DOF;
    }
    public file(){}
    public file(target target, String name){
        this.target = target;
        this.name = name;
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        DOF = formatter.format(date);
    }
    public void localSave(target target, device device /*, data[] "in window"*/){
        name = target.getUserName()+"'s" /* + os.name */ + device.getDeviceType();
    }
}
