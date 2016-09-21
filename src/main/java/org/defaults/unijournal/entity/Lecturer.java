package org.defaults.unijournal.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Lecturer extends AbstractEntity {

    private String name;
    @ManyToMany(targetEntity = Subject.class)
    private Set<Subject> subjects;

    @ManyToMany(targetEntity = Student.class)
    private Set<Student> students;

    protected Lecturer() {

    }

    public Lecturer(Set<Subject> subjects) {
        setSubjects(subjects);
    }

    public Lecturer(Set<Subject> subjects, String name) {
        this(subjects);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
