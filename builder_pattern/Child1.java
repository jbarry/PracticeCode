package builder_pattern;

public class Child1 extends ParentBase {
	
	public Child1(Child1Builder child1Builder) {
		child1Property1 = child1Builder.child1Property1;
		child1Property2 = child1Builder.child1Property2;
	}

	public static Child1Builder child1Builder() {
		return new Child1Builder();
	}
		
	@Override
	int method1() {
		return 0;
	}

	@Override
	int method2() {
		return 0;
	}
	
	public String getChild1Property1() {
		return child1Property1;
	}

	public void setChild1Property1(String child1Property1) {
		this.child1Property1 = child1Property1;
	}

	public String getChild1Property2() {
		return child1Property2;
	}

	public void setChild1Property2(String child1Property2) {
		this.child1Property2 = child1Property2;
	}
	
	public void printProperties() {
		System.out.println(child1Property1 + " " + child1Property2 + " " + parentProperty1 + " " + parentProperty2);
	}
	
	private String child1Property1;
	private String child1Property2;
}