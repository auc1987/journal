package org.defaults.unijournal.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Student extends AbstractEntity {
    private String name;
    @ManyToMany
    private Set<Subject> subjects;
    @ManyToMany
    private Set<Lecturer> lecturers;

    private Student() {

    }

    public Student(Set<Subject> subjects, String name) {
        setSubjects(subjects);
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

    public Set<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(Set<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }
}
