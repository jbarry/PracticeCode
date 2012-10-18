package abstract_builder_pattern;

public class AbstractBuilderMain {
	public static void main(String[] args) {
		Child1 child1 = Child1.child1Builder()
				.withChild1Property1("justin")
				.withChild1Property2("barry")
				.withParentProperty1(1)
				.withParentProperty2(2)
				.build();
		child1.printProperties();
	}
}
