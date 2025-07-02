package org.example.school.service;

import org.example.school.dao.ClassMapper;
import org.example.school.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.FormView;
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
}
