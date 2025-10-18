package Task3;

public class Client {
    public static void main(String[] args) {
        DiagramCanvas dc = new DiagramCanvas();
        Editor editor = new Editor();

        DiagramComponent rect1 = new DiagramComponent(100, 50, "Red", "Box1");
        DiagramComponent rect2 = new DiagramComponent(120, 60, "Blue", "Box2");

        editor.edit(new DrawRectangle(rect1,dc));
        editor.edit(new DrawRectangle(rect2, dc));

        editor.edit(new Resize(dc, 150, 0)); // resize primul dreptunghi
        editor.edit(new ChangeColor(dc, 1, "Green")); // schimbam culoarea celui de-al doilea
        editor.edit(new ChangeText(dc, 0, "NewBox1")); // schimbam textul primului

        System.out.println("After commands:");
        dc.showComponents();

        editor.undo();
        editor.undo();

        System.out.println("\nAfter undo 2 commands:");
        dc.showComponents();
    }
}
