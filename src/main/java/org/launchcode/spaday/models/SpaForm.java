package org.launchcode.spaday.models;

public class SpaForm {
    private String name;
    private String skintype;
    private String manipedi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkintype() {
        return skintype;
    }

    public void setSkintype(String skintype) {
        this.skintype = skintype;
    }

    public String getManipedi() {
        return manipedi;
    }

    public void setManipedi(String manipedi) {
        this.manipedi = manipedi;
    }

    public SpaForm(String name, String skintype, String manipedi) {
        this.name = name;
        this.skintype = skintype;
        this.manipedi = manipedi;
    }
}
