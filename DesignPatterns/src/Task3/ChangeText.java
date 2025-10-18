package Task3;

public class ChangeText implements DrawCommand {

    DiagramCanvas canvas;
    int index;
    String oldText;
    String newText;
    DiagramComponent component;

    public ChangeText(DiagramCanvas canvas, int index, String newText) {
        this.canvas = canvas;
        this.index = index;
        this.newText = newText;
    }

    @Override
    public void execute() {
        component = canvas.getComponent(index);
        oldText = component.text;
        component.setText(newText);
    }

    @Override
    public void undo() {
        component.setText(oldText);
    }
}
