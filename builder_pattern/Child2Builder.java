package builder_pattern;

public class Child2Builder extends ParentBuilder<Child2Builder> {

	public Child2 build() {
		return new Child2(this);
	}
	
	public Child2Builder withChild2Property1(boolean value) {
		child2Property1 = value;
		return this;
	}
	
	@Override
	public Child2Builder getThis() {
		return this;
	}
	
	boolean child2Property1;
}
