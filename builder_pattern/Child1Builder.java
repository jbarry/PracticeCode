package builder_pattern;

class Child1Builder extends ParentBuilder<Child1Builder> {
	
	public Child1 build() {
		return new Child1(this);
	}
	
	public Child1Builder withChild1Property1(String value) {
		this.child1Property1 = value;
		return this;
	}

	public Child1Builder withChild1Property2(String value) {
		this.child1Property2 = value;
		return this;
	}
	
	@Override
	protected ParentBase getParent() {
		return child1;
	}

	@Override
	protected Child1Builder getThis() {
		return this;
	}
	
	private Child1 child1;
	String child1Property1;
	String child1Property2;
}