package coffee.weneed.maplelib.wz.properties;

import java.util.ArrayList;
import java.util.List;

import coffee.weneed.maplelib.wz.IPropertyContainer;
import coffee.weneed.maplelib.wz.WzExtended;
import coffee.weneed.maplelib.wz.WzImage;
import coffee.weneed.maplelib.wz.WzImageProperty;

public class WzSubProperty extends WzExtended implements IPropertyContainer {

	protected List<WzImageProperty> properties = new ArrayList<>();

	protected WzImage mImgParent;

	public WzSubProperty(String name) {
		super(name);
	}

	@Override
	public void AddProperties(List<WzImageProperty> props) {
		// TODO Auto-generated method stub

	}

	@Override
	public void AddProperty(WzImageProperty prop) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ClearProperties() {
		// TODO Auto-generated method stub

	}

	@Override
	public WzImageProperty DeepClone() {
		WzSubProperty clone = new WzSubProperty(name);
		for (WzImageProperty prop : properties) {
			clone.AddProperty(prop.DeepClone());
		}
		return clone;
	}

	@Override
	public List<WzImageProperty> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void RemoveProperty(WzImageProperty prop) {
		// TODO Auto-generated method stub

	}
}
