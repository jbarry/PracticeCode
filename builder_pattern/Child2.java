package builder_pattern;

public class Child2 extends Parent {

	public Child2(Child2Builder builder) {
		child2Property1 = builder.child2Property1;
		parentProperty1 = builder.parentProperty1;
		parentProperty2 = builder.parentProperty2;
	}
	
	public static Child2Builder child2Builder() {
		return new Child2Builder();
	}
	
	@Override
	int method1() {
		return 0;
	}

	@Override
	int method2() {
		return 0;
	}
	
	void printProperties() {
		System.out.println(child2Property1 + " " + parentProperty1 + " " + parentProperty2);
	}	
	
	boolean child2Property1;
}