package org.defaults.unijournal.entity;

import javax.persistence.Entity;

@Entity
public class Subject extends AbstractEntity {
    private String name;

    protected Subject() {

    }

    public Subject(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
