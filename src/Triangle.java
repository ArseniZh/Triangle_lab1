import java.util.ArrayList;
import java.util.List;

public class Triangle{
    private int dotNumbers = 3;
    private List<Dot> dots = new ArrayList<>();
    private Dot firstDot;
    private Dot secondDot;
    private Dot thirdDot;
    private double perimetr;
    private double square;
    private String triangleType;

    public Triangle() {
        firstDot = new Dot((int)(Math.random()*20+2), (int)(Math.random()*20+2));
        secondDot = new Dot((int)(Math.random()*20+2), (int)(Math.random()*20+2));
        thirdDot = new Dot((int)(Math.random()*20+2), (int)(Math.random()*20+2));
        perimetr = calculatePerimetr();
        square = calculateSquare();
    }
    public void setTriangleType(String triangleType) {
        this.triangleType = triangleType;
    }
    public String getTriangleType() {
        return triangleType;
    }
    public void setFirstDot(Dot firstDot) {
        this.firstDot = firstDot;
    }
    public Dot getFirstDot() {
        return firstDot;
    }
    public void setSecondDot(Dot secondDot) {
        this.secondDot = secondDot;
    }
    public Dot getSecondDot() {
        return secondDot;
    }
    public void setThirdDot(Dot thirdDot) {
        this.thirdDot = thirdDot;
    }
    public Dot getThirdDot() {
        return thirdDot;
    }
    public double getPerimetr() {
        return perimetr;
    }
    public double getSquare() {
        return square;
    }
    public double calculatePerimetr() {
        perimetr += calculateSide(firstDot, secondDot) + calculateSide(firstDot, thirdDot) + calculateSide(secondDot, thirdDot);
        return perimetr;
    }
    public double calculateSide(Dot dot0, Dot dot1) {
        double side = 0;
        side = Math.sqrt((dot0.getXCord() - dot1.getXCord()) * (dot0.getXCord() - dot1.getXCord()) +
                (dot0.getYCord() - dot1.getYCord()) * (dot0.getYCord() - dot1.getYCord()));
        return side;
    }
    public double calculateSquare() {
        square = 0.5 * Math.abs((secondDot.getXCord() - firstDot.getXCord()) * (thirdDot.getYCord() - firstDot.getYCord()) -
                (thirdDot.getXCord() - firstDot.getXCord()) * (secondDot.getYCord() - firstDot.getYCord()));
        return square;
    }
    public String toString() {
        return "First dot: " + "\n\txCord: " + firstDot.getXCord() + "\n\tyCord: " + firstDot.getYCord()
                + "\nSecond dot: " + "\n\txCord: " + secondDot.getXCord() + "\n\tyCord: " + secondDot.getYCord()
                + "\nThird dot: " + "\n\txCord: " + thirdDot.getXCord() + "\n\tyCord: " + thirdDot.getYCord()
                + "\nPerimetr: " + perimetr
                + "\nSquare: " + square + "\n";
    }

}