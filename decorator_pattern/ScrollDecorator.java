package decorator_pattern;

public class ScrollDecorator extends Decorator {
	
	public ScrollDecorator(Widget wid) {
		super(wid);
	}
	
	public void draw() {
		super.draw();
		System.out.println(" ScrollDecorator");
	}
}
