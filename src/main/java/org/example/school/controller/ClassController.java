package org.example.school.controller;


import org.example.school.dto.R;
import org.example.school.dto.StudentInfoDTO;
import org.example.school.model.Class;
import org.example.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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


    @RequestMapping("/add")
    public R add(@RequestBody Class classes){
        classService.add(classes);
        return R.Success();
    }

    @RequestMapping("/queryStu")
    public R queryStu(String id){
        List<StudentInfoDTO> studentInfoDTOS = classService.queryListStu(id);
        return R.Success(studentInfoDTOS);
    }




}
