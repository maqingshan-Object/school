package org.example.school.service;

import org.example.school.dao.ClassMapper;
import org.example.school.dto.StudentInfoDTO;
import org.example.school.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{

    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<Class> queryList() {
        return classMapper.queryList();
    }


    @Override
    public void add(Class classes) {
        classMapper.addClass(classes);
    }

    @Override
    public List<StudentInfoDTO> queryListStu(String id) {
        return classMapper.queryListStu(id);
    }

}
