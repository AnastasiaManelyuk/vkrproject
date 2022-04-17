package elements_objects;

import static utils.XpathUtils.or;

public class Buttons implements Element {
    private String buttonXPATH = "//input[@type='button' and contains(., '%1$s')] || //button[.='%1$s']";
    private String buttonFileXPATH = "//input[@type='file' and contains(., '%1$s')]";

    @Override
    public String getXPATH() {
        return or(buttonXPATH, buttonFileXPATH);
    }
}
