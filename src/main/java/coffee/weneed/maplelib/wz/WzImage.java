package coffee.weneed.maplelib.wz;

import java.util.HashSet;
import java.util.Set;

import coffee.weneed.maplelib.wz.properties.WzSubProperty;


public class WzImage extends WzSubProperty {

	protected boolean mParsed;
	protected boolean initialParse;
	protected int mSize, checksum;
	protected int mOffset; //TODO unsigned?
	//protected WzBinaryReader mReader;
	protected int mBlockStart;
	protected long mTempFileStart;
	protected long mTempFileEnd;
	protected Set<WzImage> referencedImgs = new HashSet<WzImage>();
	
	@Override
	public AWzObject getParent() { //TODO Redundant @See WzSubProperty
		return mParent;
	}
	
	@Override
	protected void setParent(AWzObject parent) { //TODO Redundant @See WzSubProperty
		this.mParent = parent;
	}
}
