package coffee.weneed.maplelib.wz;

import java.util.ArrayList;
import java.util.List;

public abstract class AWzImageProperty extends AWzObject {

	protected WzPropertyType propertyType;

	protected WzImage parentImage;

	public List<AWzImageProperty> WzProperties = new ArrayList<>();

	@Override
	public WzObjectType getObjectType() {
		return WzObjectType.Property;
	}

	public WzImage getParentImage() {
		return parentImage;
	}

	public WzPropertyType getWzPropertyType() {
		return propertyType;
	}

	protected void setParentImage(WzImage parentImage) {
		this.parentImage = parentImage;
	}
}
