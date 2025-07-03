package org.example.school.service;

import org.example.school.dto.StudentInfoDTO;
import org.example.school.model.Class;

import java.util.List;

public interface ClassService {

    List<Class> queryList();

    void add(Class classes);

    List<StudentInfoDTO> queryListStu(String id);

}
