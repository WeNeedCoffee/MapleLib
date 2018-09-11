package coffee.weneed.maplelib.wz;

public abstract class APropertyContainer extends AWzImageProperty {

	public void AddProperty(AWzImageProperty pProp) {
		pProp.setParent(this);
		pProp.setParentImage(getParentImage());
		// WzProperties.Add(pProp);
	}
}
