package coffee.weneed.maplelib.wz;


public abstract class AWzImageProperty extends AWzObject {

	protected WzPropertyType propertyType;
	protected WzImage parentImage;
	
	public WzImage getParentImage() {
		return parentImage;
	}
	
	protected void setParentImage(WzImage parentImage) {
		this.parentImage = parentImage;
	}
	
	@Override
	public WzObjectType getObjectType() {
		return WzObjectType.Property;
	}
	
	public WzPropertyType getWzPropertyType() {
		return propertyType;
	}
}
