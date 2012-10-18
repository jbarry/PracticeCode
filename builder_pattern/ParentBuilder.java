package builder_pattern;

public abstract class ParentBuilder<T extends ParentBuilder<T>> {

	public T withParentProperty1(int value) {
		parentProperty1 = value;
		return getThis();
	}
	
	public T withParentProperty2(int value) {
		parentProperty2 = value;
		return getThis();
	}
	
	public abstract T getThis();
	
	public int parentProperty1;
	public int parentProperty2;
}
