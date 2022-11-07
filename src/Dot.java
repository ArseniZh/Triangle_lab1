public class Dot {
    double xCord, yCord ;

    Dot(double xCord, double yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public void setXCord(double xCord) {
        xCord = this.xCord;
    }
    public void setYCord(double yCord) {
        yCord = this.yCord;
    }
    public double getXCord() {
        return this.xCord;
    }
    public double getYCord() {
        return this.yCord;
    }
    public String toString() {
        return "xCord: " + this.xCord + "yCord: " + this.yCord;
    }
}
