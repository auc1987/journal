package org.defaults.unijournal.repository;

import org.defaults.unijournal.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
