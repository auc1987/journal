package org.defaults.unijournal.entity;

import javax.persistence.*;

@Entity
public class Mark extends AbstractEntity {

    public static final int MAX = 100;
    public static final int MIN = 0;
    @OneToOne
    @JoinColumn(name = "subjectId")
    private Subject subject;
    private int value;
    @OneToOne
    @JoinColumn(name = "studentId")
    private Student student;
    @OneToOne
    @JoinColumn(name = "lecturerId")
    private Lecturer lecturer;

    private Mark() {

    }

    public Mark(Subject subject, Lecturer lecturer, Student student, int value) {
        setSubject(subject);
        setLecturer(lecturer);
        setStudent(student);
        setValue(value);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        checkMarkValueRange(value);
        this.value = value;
    }

    private void checkMarkValueRange(int value) {
        if(value < MIN || value > MAX)
            throw new IllegalArgumentException(String.format("Mark value out of range [%d;%d]",MIN, MAX));
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
