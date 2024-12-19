
public class Main{
    public static void main(String[] args) {
        Menu Menu1 = new Menu("First",1);
        Position Position1 = new Position("Burger1",1500,11);
        Position Position2 = new Position("Burger2",1600,12);
        Menu Menu2 = new Menu("Second",2);
        Position Position3 = new Position("Burger3",1600,21);
        Position Position4 = new Position("Burger4",1900,22);
        Menu1.MenuDescription(1);
        System.out.println(" ");
        Menu2.MenuDescription(2);
        System.out.println(" ");
        Position1.getName();
        Position1.getCoast();
        
    }
}
