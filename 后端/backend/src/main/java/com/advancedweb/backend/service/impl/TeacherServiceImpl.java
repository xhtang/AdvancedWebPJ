package com.advancedweb.backend.service.impl;

import com.advancedweb.backend.model.node.Teacher;
import com.advancedweb.backend.repository.TeacherRepository;
import com.advancedweb.backend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Teacher")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher findByName(String name) {
        return teacherRepository.findByName(name);
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
