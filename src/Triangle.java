import java.util.ArrayList;
import java.util.List;

public class Triangle{
    public int dotNumbers = 3;
    public List<Dot> dots = new ArrayList<>();

    public Triangle() {
        for (int i = 0; i < dotNumbers; i++) {
            dots.add(new Dot(1.2 + i, 4.3 + i));
        }
    }

    public void print () {
        int i = 1;
        for (Dot dot : dots) {
            System.out.println("Dot " + i++ + ":" +
                    "\n\txCord: " + dot.getxCord() +
                    "\n\tyCord: " + dot.getyCord());
        }
    }



}
