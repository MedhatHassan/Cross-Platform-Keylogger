package src;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class db 
{
    private int dataBaseRecords = 0;
    public int getDataBaseRecords(){
        return dataBaseRecords;
    }
    ArrayList<String> arr = new ArrayList<String>();
    String fileName = "database.txt";
    File dataBase = new File(fileName);
            public void addToDB(target t, device d , file f) {
                arr.add(t.getUserName());
                arr.add(d.getDeviceType());
                arr.add(f.getfileName());
                SaveToDB(arr);
                dataBaseRecords++;
            }
            //Write To DB
            public void SaveToDB(ArrayList arr){
            //Create File of data base file
            try {
                if (dataBase.createNewFile()) {
                    System.out.println("File created: " + dataBase.getName());
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
            for(int i = 0; i< arr.size(); i++) {
                String data = arr.get(i) + "     " + arr.get(i)+ "     " + arr.get(i);
                Writer.write(data);
                Writer.close();
            }
                System.out.println("Successfully wrote to the file.");
            } 
            catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        }
        //Read from DB
        public void readFromDB() {
            try {
                Scanner reader = new Scanner(dataBase);
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
                } 
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
}
