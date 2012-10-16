package decorator_pattern;

public class TextField implements Widget {

	private int width, height;
	
	public TextField(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("Text Field: " + width + height);
	}
}
