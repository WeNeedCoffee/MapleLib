package coffee.weneed.maplelib.wz.util;

import java.util.Hashtable;

public class WzTool {

	public static Hashtable<String, Integer> StringCache = new Hashtable<>();

	public static final int WzHeader = 0x31474B50; // PKG1

	private static byte[] Combine(byte[] a, byte[] b) {
		byte[] result = new byte[a.length + b.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		return result;
	}

	public static int GetCompressedIntLength(int i) {
		if (i > 127 || i < -127) {
			return 5;
		}
		return 1;
	}

	public static int GetEncodedStringLength(String s) {
		int len = 0;
		if (s == null || s.isEmpty()) {
			return 1;
		}
		boolean unicode = false;
		for (char c : s.toCharArray()) {
			if (c > 255) {
				unicode = true;
			}
		}
		if (unicode) {
			if (s.length() > 126) {
				len += 5;
			} else {
				len += 1;
			}
			len += s.length() * 2;
		} else {
			if (s.length() > 127) {
				len += 5;
			} else {
				len += 1;
			}
			len += s.length();
		}
		return len;
	}

	private static int GetRecognizedCharacters(String source) {
		int result = 0;
		for (char c : source.toCharArray()) {
			if (0x20 <= c && c <= 0x7E) {
				result++;
			}
		}
		return result;
	}

	public static int GetWzObjectValueLength(String s, byte type) {
		String storeName = type + "_" + s;
		if (s.length() > 4 && WzTool.StringCache.containsKey(storeName)) {
			return 5;
		} else {
			WzTool.StringCache.put(storeName, 1);
			return 1 + WzTool.GetEncodedStringLength(s);
		}
	}

	public static int RotateLeft(int x, byte n) { // TODO Uint32
		return x << n | x >> 32 - n;
	}

	public static int RotateRight(int x, byte n) { // TODO Uint32
		return x >> n | x << 32 - n;
	}

	public static <T extends Enum<T>> T StringToEnum(Class<T> enumType, String name) { // TODO Double check this is rightv
		return Enum.valueOf(enumType, name);
	}
}
