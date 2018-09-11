package coffee.weneed.maplelib.wz;

public enum WzPropertyType {
	Null(0x1), Short(0x2), CompressedInt(0x4), ByteFloat(0x8), Double(0x10), String(0x20), CompressedLong(0x40), SubProperty(0x80),
	Canvas(0x100), Vector(0x200), Convex(0x400), Sound(0x800), UOL(0x1000), PNG(0x2000);

	private int v;

	private WzPropertyType(int v) {
		this.v = v;
	}

	public WzPropertyType getProperty(int v) {
		for (WzPropertyType t : WzPropertyType.values()) {
			if (t.getValue() == v) {
				return t;
			}
		}
		return null;
	}

	public int getValue() {
		return v;
	}

}
