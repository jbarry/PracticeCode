package decorator_pattern;

public class DecoratorDemo {
	public static void main(String[] args) {
		Widget wid =  new BorderDecorator(
				new BorderDecorator(new ScrollDecorator(new TextField(80, 90))));
		wid.draw();
	}
}
