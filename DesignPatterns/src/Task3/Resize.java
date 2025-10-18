package Task3;

public class Resize implements DrawCommand{

    public DiagramCanvas conv;
    int percent;
    int oldWidth;
    int oldHeight;
    int index;

    public Resize(DiagramCanvas conv, int percent, int index) {
        this.conv = conv;
        this.percent = percent;
        this.index = index;
    }

    public void execute() {
        DiagramComponent c = conv.getComponent(index);
        oldHeight = c.height;
        oldWidth = c.width;
        c.resize(percent);
    }
    public void undo() {
        DiagramComponent c = conv.getComponent(index);
        c.height = oldHeight;
        c.width = oldWidth;
    }


}
