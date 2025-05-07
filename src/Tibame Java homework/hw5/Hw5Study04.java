package hw5;

public class Hw5Study04 {
	// (1) 有兩個double型態的屬性為width, depth
	private double width;
	private double depth;

	// (2) 有三個方法:
	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		return width * depth;
	}

	// (3) 有兩個建構子:
	public Hw5Study04() {
	}

	public Hw5Study04(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public static void main(String[] args) {
		// (1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
		Hw5Study04 hw5S0401 = new Hw5Study04();
		hw5S0401.setWidth(10);
		hw5S0401.setDepth(20);
		System.out.println(hw5S0401.getArea());

		// (2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width,
		// depth為10, 20,透過getArea()印出結果
		Hw5Study04 hw5S0402 = new Hw5Study04(10, 20);
		System.out.println(hw5S0401.getArea());
	}
}
