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
	public Child1Builder getThis() {
		return this;
	}
	
	Child1 child1;
	String child1Property1;
	String child1Property2;
}