package abstract_builder_pattern;

public abstract class ParentBuilder <T extends ParentBuilder<T>> {

	T withParentProperty1(int value) {
		System.out.println(getParent());
		getParent().setParentProperty1(value);
		return getThis();
	}
	
	T withParentProperty2(int value) {
		getParent().setParentProperty2(value);
		return getThis();
	}
	
	protected abstract Parent getParent();
	
	protected abstract T getThis();
}
