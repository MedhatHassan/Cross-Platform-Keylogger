public class os extends desktop {
    protected static String osName = System.getProperty("osName.name").toLowerCase(); //Get the osName fullname (Windows 10)
    protected static String osVersion = System.getProperty("java.runtime.version" ); //Get the osName version
    public static boolean IS_WINDOWS = (osName.indexOf("win") >= 0);
    public static boolean IS_MAC = (osName.indexOf("mac") >= 0);
    public static boolean IS_UNIX = (osName.indexOf("nix") >= 0 || osName.indexOf("nux") >= 0 || osName.indexOf("aix") > 0);
    public static boolean IS_SOLARIS = (osName.indexOf("sunosName") >= 0);

    
}
