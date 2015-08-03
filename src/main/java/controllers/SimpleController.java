package controllers;

import dao.JdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by Александр on 23.07.15.
 */
@org.springframework.stereotype.Controller
public class SimpleController {

    @Autowired
    JdbcDao springJdbc;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getObjects(Model model){

        List<Map<String, Object>> objects = springJdbc.getObjects();
        model.addAttribute("objects", objects);

        return "1";
    }
}
