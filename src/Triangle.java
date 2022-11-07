import java.util.ArrayList;
import java.util.List;

public class Triangle{
    public int dotNumbers = 3;
    public List<Dot> dots = new ArrayList<>();

    public Triangle() {
        for (int i = 0; i < dotNumbers; i++) {
            dots.add(new Dot((int)(Math.random()*20+2), (int)(Math.random()*20+2)));
        }
    }
    public void print() {
        int i = 1;
        for (Dot dot : dots) {
            System.out.println("Dot " + i++ + ":" +
                    "\n\txCord: " + dot.getXCord() +
                    "\n\tyCord: " + dot.getYCord());
        }
    }
    public double calculatePerimetr() {
        double perimetr = 0;
        perimetr += calculateSide(dots.get(0), dots.get(1)) + calculateSide(dots.get(0), dots.get(2)) + calculateSide(dots.get(1), dots.get(2));
        return perimetr;
    }
    public double calculateSide(Dot dot0, Dot dot1) {
        double side = 0;
        side = Math.sqrt((dot0.getXCord() - dot1.getXCord()) * (dot0.getXCord() - dot1.getXCord()) +
                (dot0.getYCord() - dot1.getYCord()) * (dot0.getYCord() - dot1.getYCord()));
        return side;
    }
    public double calculateSquare() {
        double area = 0;
        area = 0.5 * Math.abs((dots.get(1).getXCord() - dots.get(0).getXCord()) * (dots.get(2).getYCord() - dots.get(0).getYCord()) -
                (dots.get(2).getXCord() - dots.get(0).getXCord()) * (dots.get(1).getYCord() - dots.get(0).getYCord()));
        return area;
    }
    public String toString() {
        return "First dot: " + "\n\txCord: " + dots.get(0).getXCord() + "\n\tyCord: " + dots.get(0).getYCord()
                + "\nSecond dot: " + "\n\txCord: " + dots.get(1).getXCord() + "\n\tyCord: " + dots.get(1).getYCord()
                + "\nThird dot: " + "\n\txCord: " + dots.get(2).getXCord() + "\n\tyCord: " + dots.get(2).getYCord();
    }
    public String triangleType() {
        double firstSide = calculateSide(dots.get(0), dots.get(1));
        double secondSide = calculateSide(dots.get(0), dots.get(2));
        double thirdSide = calculateSide(dots.get(1), dots.get(2));

        if ((firstSide == secondSide) && (firstSide == thirdSide)) {
            return "equilaterial"; //равносторонний
        } else if ((firstSide == secondSide) || (firstSide == thirdSide) || (secondSide == thirdSide)) {
            return "iosceles"; //равнобедренный
        } else if ((Math.sqrt(firstSide * firstSide + secondSide * secondSide) == thirdSide)
                        || (Math.sqrt(thirdSide * thirdSide + secondSide * secondSide) == firstSide)
                        || (Math.sqrt(firstSide * firstSide + thirdSide * thirdSide) == secondSide)) {
            return "right"; // прямоугольный
        } else {
            return "arbitrary"; // произвольный
        }
    }
}

