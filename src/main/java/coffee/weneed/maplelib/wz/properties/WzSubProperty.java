package coffee.weneed.maplelib.wz.properties;

import java.util.ArrayList;
import java.util.List;

import coffee.weneed.maplelib.wz.APropertyContainer;
import coffee.weneed.maplelib.wz.AWzImageProperty;
import coffee.weneed.maplelib.wz.AWzObject;
import coffee.weneed.maplelib.wz.WzImage;

public class WzSubProperty extends APropertyContainer {

	protected List<AWzImageProperty> mProperties = new ArrayList<>();

	protected String mName;

	protected AWzObject mParent;

	protected WzImage mImgParent;

	@Override
	public AWzObject getParent() {
		return mParent;
	}

	@Override
	protected void setParent(AWzObject parent) {
		mParent = parent;
	}
}
