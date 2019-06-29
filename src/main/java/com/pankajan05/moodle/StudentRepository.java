package com.pankajan05.moodle;

import com.pankajan05.moodle.student.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}
