package coffee.weneed.maplelib.wz;

import java.util.ArrayList;
import java.util.List;

public abstract class WzImageProperty extends WzObject {

	protected WzPropertyType propertyType;

	protected WzImage parentImage;

	public List<WzImageProperty> WzProperties = new ArrayList<>();

	public WzImageProperty(String name) {
		super(name);
	}

	public abstract WzImageProperty DeepClone();

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
