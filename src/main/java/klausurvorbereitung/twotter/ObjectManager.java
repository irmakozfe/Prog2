package klausurvorbereitung.twotter;

import java.util.List;

public interface ObjectManager<T> {
    void serialize(List<T> objects);
    List<T> deserialize();
}
