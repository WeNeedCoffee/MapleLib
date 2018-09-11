package coffee.weneed.maplelib.wz;

import java.util.List;

public interface IPropertyContainer {

	void AddProperties(List<WzImageProperty> props);

	void AddProperty(WzImageProperty prop);

	void ClearProperties();

	List<WzImageProperty> getProperties();

	void RemoveProperty(WzImageProperty prop);
}
