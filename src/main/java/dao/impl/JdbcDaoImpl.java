package dao.impl;

import dao.JdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Alex.Titov on 22.07.2015.
 */
@Service
public class JdbcDaoImpl implements JdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> getObjects() {

        String sql = "SELECT * FROM table1";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

        return list;
    }
}
