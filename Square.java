package HomeWork.Lab10;

public class Square extends Rectangle{
    public Square(){
      width = length = 1.0;
    }
    public Square(double side){
        super();
        width = length = side;
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){return width;}
    public void setSide(double side){ this.width = this.length = side;}

    @Override
    public void setLength(double side) {
        super.setLength(length);
        super.setWidth(width);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString() + width + length;
    }
}
