import java.lang.annotation.Target;

public class device implements is_computer, is_mobile{
    protected target target;
    protected String deviceType;
    private String OS = System.getProperty("os.name").toLowerCase();
    public boolean isaComputer(){
        if(OS.indexOf("win") >= 0 || OS.indexOf("mac") >= 0 || OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 ||  OS.indexOf("sunos") >= 0)
            return true;
        else 
            return false;
    }
    public boolean isaMobile(){
        if(isaComputer() == true)
            return false;
        else 
            return true;
    }
}
