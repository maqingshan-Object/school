package org.example.school.controller;


import org.example.school.model.Class;
import org.example.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("all")
@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @RequestMapping("/queryList")
    public List<Class> queryList(){
        return classService.queryList();
    }


}
