package builder_pattern;

public abstract class Parent {	
	
	abstract int method1();
	
	abstract int method2();
	
	abstract void printProperties();
	
	protected int getParentProperty1() {
		return parentProperty1;
	}
	
	protected int getParentProperty2() {
		return parentProperty2;
	}

	protected void setParentProperty1(int parentProperty1) {
		this.parentProperty1 = parentProperty1;
	}

	protected void setParentProperty2(int parentProperty2) {
		this.parentProperty2 = parentProperty2;
	}
	
	protected int parentProperty1;
	protected int parentProperty2;
}
