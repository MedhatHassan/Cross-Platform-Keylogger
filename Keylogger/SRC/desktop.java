public class desktop extends device {
    private String desktopType;

    public desktop(){
        detect d =new detect();
        desktopType = d.detectDesktop();
    }
}
