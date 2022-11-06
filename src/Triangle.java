import java.util.ArrayList;
import java.util.List;

public class Triangle{
    public int dotNumbers = 3;
    public List<Dot> dots = new ArrayList<>();

    public Triangle () {
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

    public double calculatePerimetr () {
        double perimetr = 0;
        perimetr += calculateSide(dots.get(0), dots.get(1)) + calculateSide(dots.get(0), dots.get(2)) + calculateSide(dots.get(1), dots.get(2));
        return perimetr;
    }

    public double calculateSide (Dot dot0, Dot dot1) {
        double side = 0;
        side = Math.sqrt((dot0.getxCord() - dot1.getxCord()) * (dot0.getxCord() - dot1.getxCord()) +
                (dot0.getyCord() - dot1.getyCord()) * (dot0.getyCord() - dot1.getyCord()));
        return side;
    }

    public double calculateArea () {
        double area = 0;
        area = 0.5 * Math.abs((dots.get(1).getxCord() - dots.get(0).getxCord()) * (dots.get(2).getyCord() - dots.get(0).getyCord()) -
                (dots.get(2).getxCord() - dots.get(0).getxCord()) * (dots.get(1).getyCord() - dots.get(0).getyCord()));
        return area;
    }
}
