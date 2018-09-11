package coffee.weneed.maplelib.wz;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WzImage extends WzObject implements IPropertyContainer {

	protected boolean parsed;

	protected int size, checksum;

	protected int mOffset; // TODO unsigned?
	// protected WzBinaryReader mReader;
	// protected List<WzImageProperty> properties = new ArrayList<WzImageProperty>();

	protected int mBlockStart;

	protected long mTempFileStart;

	protected long mTempFileEnd;

	protected Set<WzImage> referencedImgs = new HashSet<>();

	public WzImage(String name) {
		super(name);
		// TODO Auto-generated constructor stub
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
	public List<WzImageProperty> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void RemoveProperty(WzImageProperty prop) {
		// TODO Auto-generated method stub

	}

}
