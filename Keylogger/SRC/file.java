import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
public class file {
    private String fileName;
    private String DOF;
    private target target;
    public String getfileName(){
        return fileName;
    }
    public void setfileName(String name){
        this.fileName = name;
    }
    public String getDate(){
        return DOF;
    }
    // public file(){
        
    // }
    public file(target target, String fileName){
        // super(name);
        this.target = target;
        this.fileName = fileName;
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        DOF = formatter.format(date);
    }
    public void localSave(target target, device device ,String data/*, data[] "in window"*/){
        String name = target.getUserName()+"'s" /* + os.name */ + device.getDeviceType();
        fileName = String.format("%s.txt",name);
        try {
            File Obj = new File(fileName);
            if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
            } 
            else {
                System.out.println("File already exists.");
            }
            } 
            catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
            try {
            FileWriter Writer = new FileWriter(fileName);
            Writer.write(data);
            Writer.close();
            System.out.println("Successfully wrote to the file.");
            } 
            catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        }
    }
