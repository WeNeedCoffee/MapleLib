package coffee.weneed.maplelib.wz;

public abstract class AWzObject {

	private String name;

	private AWzObject parent;

	private WzObjectType objectType;

	private Object tag;

	protected Object wzvalue;

	public String getFullPath() {
		String result = getName();
		AWzObject currObj = this;
		while (currObj.getParent() != null) {
			currObj = currObj.getParent();
			result = currObj.getName() + "\\" + result;
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public WzObjectType getObjectType() {
		return objectType;
	}

	public AWzObject getParent() {
		return parent;
	}

	public Object getTag() {
		return tag;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected void setParent(AWzObject parent) {
		this.parent = parent;
	}

	public void setTag(Object tag) {
		this.tag = tag;
	}
}
