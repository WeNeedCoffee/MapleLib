package coffee.weneed.maplelib.wz;

public abstract class WzObject {

	protected String name;

	protected WzObject parent;

	protected WzObjectType objectType;

	protected Object tag = null;

	protected Object tag2 = null;

	protected Object tag3 = null;

	protected Object wzvalue;

	public WzObject(String name) {
		this.name = name;
	}

	public String getFullPath() {
		// if (this instanceof WzFile) return ((WzFile)this).WzDirectory.Name;
		String result = getName();
		WzObject currObj = this;
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

	public WzObject getParent() {
		return parent;
	}

	public Object getTag() {
		return tag;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected void setParent(WzObject parent) {
		this.parent = parent;
	}

	public void setTag(Object tag) {
		this.tag = tag;
	}
}
