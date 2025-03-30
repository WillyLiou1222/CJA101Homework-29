package hw6;

public class Calculator {
	private int x;
    private int y;
    public Calculator(int x, int y) throws CalException{
        if(x>0 && y>0){
            this.x = x;
            this.y = y;
        } else if (x>=0 && y<=0) {
            throw new CalException("請將y設定成正整數!");
        } else if (x==0 && y==0) {
            throw new CalException("請將x,y設定成正整數!");
        }else {
            throw new CalException("請將x,y設定成正整數!");
        }
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int pupowerXY(int x, int y){
        return (int) Math.pow(this.x, this.y);
    }
}
