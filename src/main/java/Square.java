public class Square implements Figure {
    Square(double side) {
        if( side <= 0 ) {
            throw new IllegalArgumentException("The side should be greater than 0.");
        }
        this.side = side;
    }
    private double side;
    public void setSide(double side) {
        if( side <= 0 ) {
            throw new IllegalArgumentException("The side should be greater than 0.");
        }
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }
    public double calculateArea(){
        double square = Math.pow(this.side, 2);
        return square;
    }

}
