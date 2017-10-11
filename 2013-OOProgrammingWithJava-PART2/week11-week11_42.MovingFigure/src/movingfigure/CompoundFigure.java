package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure {

    private List<Figure> list;

    public CompoundFigure() {
        super(0, 0);
        list = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        list.add(f);
    }

    @Override
    public void move(int dx, int dy) {
        for(Figure f : list) {
            f.move(dx, dy);
        }
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure f : list) {
            f.draw(graphics);
        }
    }

}
