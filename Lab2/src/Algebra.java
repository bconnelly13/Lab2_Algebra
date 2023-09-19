public class Algebra {

    public static double average(int x, int y){
        return ((double)x+y)/2;
    }
    public static double slope(int x1,int y1,int x2,int y2){
        return (double)(y2-y1)/(x2-x1);
    }
    public static int difference(int x,int y){
        return x - y;
    }
    public static int square (int x){
        return x * x;
    }
    public static double distance(int x1,int y1,int x2,int y2){
        int yDiff = difference(y2, y1);
        int xDiff = difference(x2, x1);

        int ySquare = square(yDiff);
        int xSquare = square(xDiff);

        return Math.sqrt(ySquare + xSquare);

    }
}
