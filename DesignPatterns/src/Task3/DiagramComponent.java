package Task3;

public class DiagramComponent {
    int width;
    int height;
    String color;
    String text;

    public DiagramComponent(int width, int height, String color, String text) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.text = text;
    }
    public void resize(int percent) {
        this.width = width * percent / 100;
        this.height = height *percent/ 100;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String toString() {
        return "DiagramComponent{" +
                "text='" + text + '\'' +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

}
