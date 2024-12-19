
import javax.swing.plaf.PanelUI;
import java.util.UUID;

public class Menu {
    static int[] NumberOfPositions = new int[10];
    static int[] AllCoasts = new int[10];
    private String Name;
    public static int menuid;
    public Menu(String Name,int menuid) {
        this.Name = Name;
        this.menuid = menuid;
    }
    public static void increment(int id ,int coast) {
        if (startsWithid(id) == true) {
            NumberOfPositions[menuid] = NumberOfPositions[menuid] + 1;
            AllCoasts[menuid] = AllCoasts[menuid] + coast;
        }
    }
    public void MenuDescription(int iid) {
        System.out.println("Name of Menu: " + Name);
        System.out.println("Count of Positions: " + NumberOfPositions[iid]);
        System.out.println("Sum of coasts of positions in menu: " + AllCoasts[iid]);
    }
    public static boolean startsWithid(int number) {
        String numberStr = String.valueOf(number);
        return numberStr.startsWith(String.valueOf(menuid));
    }
    public String getName() {
        System.out.println(Name);
        return Name;
    }
}
