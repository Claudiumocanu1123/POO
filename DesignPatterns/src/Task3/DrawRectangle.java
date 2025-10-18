package Task3;

public class DrawRectangle implements DrawCommand{

    private final DiagramComponent component;
    private DiagramCanvas conv;
    public DrawRectangle(DiagramComponent component, DiagramCanvas conv) {
        this.component = component;
        this.conv = conv;
    }
    public void execute() {
        conv.addComponent(component);
    }
    public void undo() {
        conv.removeComponent(component);
    }


}
