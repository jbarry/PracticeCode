package builder_pattern;

public abstract class ParentBase extends Parent {

	@Override
	public int getParentProperty1() {
		return parentProperty1;
	}
	
	protected void setParentProperty1(int value) {
		parentProperty1 = value;
	}
	
	@Override
	public int getParentProperty2() {
		return parentProperty2;
	}
	
	protected void setParentProperty2(int value) {
		parentProperty2 = value;
	}
}