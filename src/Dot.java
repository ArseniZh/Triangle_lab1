public class Dot {
    double xCord, yCord ;

    Dot(double xCord, double yCord){
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public void setxCord (double xCord) {
        xCord = this.xCord;
    }
    public void setyCord (double yCord) {
        yCord = this.yCord;
    }
    public double getxCord () {
        return this.xCord;
    }
    public double getyCord () {
        return this.yCord;
    }
    public String toString () {
        return "xCord: " + this.xCord + "yCord: " + this.yCord;
    }
}
