package builder_pattern;

public class BuilderMain {
	public static void main(String[] args) {
		Child1 child1 = Child1.child1Builder()
				.withChild1Property1("justin")
				.withChild1Property2("barry")
				.withParentProperty1(1)
				.withParentProperty2(2)
				.build();
		child1.printProperties();
		Child2.child2Builder()
			.withChild2Property1(false)
			.withParentProperty1(20)
			.withParentProperty2(5)
			.build()
			.printProperties();
	}
}
