package org.example.school.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.school.dto.StudentInfoDTO;
import org.example.school.model.Class;

import java.util.List;

@Mapper
public interface ClassMapper {
    
    List<Class> queryList();

    void addClass(Class classes);

    List<StudentInfoDTO> queryListStu(String id);


}
