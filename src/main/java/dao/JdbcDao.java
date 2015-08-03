package dao;

import java.util.List;
import java.util.Map;

/**
 * Created by Alex.Titov on 22.07.2015.
 */


public interface JdbcDao {
    public List<Map<String, Object>> getObjects();
}
