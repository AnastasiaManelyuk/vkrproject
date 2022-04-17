package elements_objects;

public class Fields implements Element {
    private String filedXPATH = "//input[@type='text' and contains(@placeholder, '%1$s')]";

    @Override
    public String getXPATH() {
        return filedXPATH;
    }
}
