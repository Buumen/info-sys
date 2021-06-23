package hu.scs.enaplo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.scs.enaplo.model.user.group.Student;
import hu.scs.enaplo.model.user.group.Teacher;
import hu.scs.enaplo.repository.user.StudentRepository;
import hu.scs.enaplo.repository.user.TeacherRepository;

@Service
public class SecurityService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public boolean hasStudentAccess(Long currentUser_id, Long student_id) {
        Student student = studentRepository.getOne(student_id);
        return student.getStudent().getId().equals(currentUser_id);
    }

    public boolean hasTeacherAccess(Long currentUser_id, Long teacher_id) {
        Teacher teacher = teacherRepository.getOne(teacher_id);
        return teacher.getTeacher().getId().equals(currentUser_id);
    }
}
