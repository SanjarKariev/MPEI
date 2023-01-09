public class Programmist {
    public String ferstName;
    public String Name;
    public String lastName;
    public String selery;

    public Programmist(String ferstName, String name, String lastName, String selery) {
        this.ferstName = ferstName;
        this.Name = name;
        this.lastName = lastName;
        this.selery = selery;
    }

    public String getFerstName() {
        return ferstName;
    }
    public void setFerstName(String ferstName) {
        this.ferstName = ferstName;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSelery() {
        return selery;
    }
    public void setSelery(String selery) {
        this.selery = selery;
    }
}
