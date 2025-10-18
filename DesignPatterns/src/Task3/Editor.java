package Task3;

import java.util.LinkedList;

public class Editor {
    private LinkedList<DrawCommand> history = new LinkedList<>();

    public void edit(DrawCommand drawCommand) {
        drawCommand.execute(); // aici folosești obiectul primit
        history.push(drawCommand);
    }

    public void undo() {
        if (history.isEmpty()) return;
        DrawCommand drawCommand = history.pop();
        drawCommand.undo();
    }
}
