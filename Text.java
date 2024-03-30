import java.awt.*;

public class Text extends Image{

    private Point point;
    private String string;

    public Text(Color color, Point point, String string){
        super(color);
        this.point = point;
        this.string = string;
    }
    @Override
    void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(string, point.x, point.y);
    }
}
