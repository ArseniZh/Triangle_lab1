package triangle;

import dot.Dot;
import java.util.ArrayList;
import java.util.List;

public class Triangle{
    private int dotNumbers = 3;
    private Dot firstDot;
    private Dot secondDot;
    private Dot thirdDot;
    private double[] sideLength = new double[3];
    private double perimetr;
    private double square;
    private String triangleType;
    private enum triangleSides {
        AB,
        AC,
        BC,
    }

    public Triangle() {
        firstDot = new Dot((int)(Math.random()*20+2), (int)(Math.random()*20+2));
        secondDot = new Dot((int)(Math.random()*20+2), (int)(Math.random()*20+2));
        thirdDot = new Dot((int)(Math.random()*20+2), (int)(Math.random()*20+2));
        perimetr = 0;
        square = 0;
        triangleType = null;
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
    public String triangleType() {
        sideLength[triangleSides.AB.ordinal()] = calculateSide(firstDot, secondDot);
        sideLength[triangleSides.AC.ordinal()] = calculateSide(firstDot, thirdDot);
        sideLength[triangleSides.BC.ordinal()] = calculateSide(secondDot, thirdDot);

        if ((sideLength[triangleSides.AB.ordinal()] == sideLength[triangleSides.AC.ordinal()])
                && (sideLength[triangleSides.AB.ordinal()] == sideLength[triangleSides.BC.ordinal()])) {
            triangleType = "equilaterial";
            return "equilaterial"; //равносторонний
        } else if ((Math.sqrt(sideLength[triangleSides.AB.ordinal()] * sideLength[triangleSides.AB.ordinal()]
                    + sideLength[triangleSides.AC.ordinal()] * sideLength[triangleSides.AC.ordinal()]) == sideLength[triangleSides.BC.ordinal()])
                || (Math.sqrt(sideLength[triangleSides.BC.ordinal()] * sideLength[triangleSides.BC.ordinal()]
                    + sideLength[triangleSides.AC.ordinal()] * sideLength[triangleSides.AC.ordinal()]) == sideLength[triangleSides.AB.ordinal()])
                || (Math.sqrt(sideLength[triangleSides.AB.ordinal()] * sideLength[triangleSides.AB.ordinal()]
                    + sideLength[triangleSides.BC.ordinal()] * sideLength[triangleSides.BC.ordinal()]) == sideLength[triangleSides.AC.ordinal()])) {
            triangleType = "right";
            return "right"; // прямоугольный
        } else if ((sideLength[triangleSides.AB.ordinal()] == sideLength[triangleSides.AC.ordinal()])
                || (sideLength[triangleSides.AB.ordinal()] == sideLength[triangleSides.BC.ordinal()])
                || (sideLength[triangleSides.AB.ordinal()] == sideLength[triangleSides.BC.ordinal()])) {
            triangleType = "iosceles";
            return "iosceles"; //равнобедренный
        } else {
            triangleType = "arbitrary";
            return "arbitrary"; // произвольный
        }
    }
    public String toString() {
        return "First dot: "
                + "\n\txCord: " + firstDot.getXCord() + "\n\tyCord: " + firstDot.getYCord()
                + "\nSecond dot: " + "\n\txCord: " + secondDot.getXCord() + "\n\tyCord: " + secondDot.getYCord()
                + "\nThird dot: " + "\n\txCord: " + thirdDot.getXCord() + "\n\tyCord: " + thirdDot.getYCord()
                + "\nSides: "
                + "\n\tAB: " + sideLength[triangleSides.AB.ordinal()]
                + "\n\tAC: " + sideLength[triangleSides.AC.ordinal()]
                + "\n\tBC: " + sideLength[triangleSides.BC.ordinal()]
                + "\nPerimetr: " + perimetr
                + "\nSquare: " + square
                + "\nType: " + triangleType;
    }
}