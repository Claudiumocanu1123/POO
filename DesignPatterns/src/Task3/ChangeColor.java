package Task3;

public class ChangeColor implements DrawCommand {

    DiagramCanvas canvas;
    int index;
    String oldColor;
    String newColor;
    DiagramComponent component;

    public ChangeColor(DiagramCanvas canvas, int index, String newColor) {
        this.canvas = canvas;
        this.index = index;
        this.newColor = newColor;
    }

    @Override
    public void execute() {
        component = canvas.getComponent(index);
        oldColor = component.color;
        component.setColor(newColor);
    }

    @Override
    public void undo() {
        component.setColor(oldColor);
    }
}
