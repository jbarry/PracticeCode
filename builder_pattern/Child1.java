package builder_pattern;

public class Child1 extends Parent {
	
	public Child1(Child1Builder child1Builder) {
		child1Property1 = child1Builder.child1Property1;
		child1Property2 = child1Builder.child1Property2;
		parentProperty1 = child1Builder.parentProperty1;
		parentProperty2 = child1Builder.parentProperty2;
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
	
	public void printProperties() {
		System.out.println(child1Property1 + " " +
				child1Property2 + " " + parentProperty1 + " " + parentProperty2);
	}
	
	private String child1Property1;
	private String child1Property2;
}