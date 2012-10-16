package decorator_pattern;

public abstract class Decorator implements Widget {
	
	private Widget wid;
	
	public Decorator( Widget wid) {
		this.wid = wid;
	}
	
	@Override
	public void draw() {
		wid.draw();
	}

}
