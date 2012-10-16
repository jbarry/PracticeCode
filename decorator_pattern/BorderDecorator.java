package decorator_pattern;

public class BorderDecorator extends Decorator {

	public BorderDecorator(Widget wid) {
		super(wid);
	}

	public void draw() {
		super.draw();
		System.out.println(" BorderDecorator");
	}
}
