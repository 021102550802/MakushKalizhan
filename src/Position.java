import java.sql.SQLOutput;

public class Position {
    String Name;
    int coast;
    private int id;

    public Position(String Name, int coast, int id) {
        this.Name = Name;
        this.coast = coast;
        this.id = id;
        Menu.increment(id,coast);
    }
    public String getName() {
        System.out.println("Name of Position: " + Name);
        return Name;
    }
    public int getCoast() {
        System.out.println("Coast of Position: " + coast);
        return coast;
    }
}
