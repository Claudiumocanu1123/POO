package Task3;

import java.util.LinkedList;

public class DiagramCanvas {
    private LinkedList<DiagramComponent> components = new LinkedList<>();

    public void addComponent(DiagramComponent component) {
        components.add(component);
    }
    public void removeComponent(DiagramComponent component) {
        components.remove(component);
    }
    public DiagramComponent getComponent(int index) {
        return components.get(index);
    }
    public void showComponents() {
        for(int i = 0; i < components.size(); i++) {
            System.out.println(components.get(i));
        }
    }
}
