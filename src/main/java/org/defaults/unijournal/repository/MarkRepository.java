package org.defaults.unijournal.repository;

import org.defaults.unijournal.entity.Mark;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface MarkRepository extends CrudRepository<Mark, Long> {
    @Query("SELECT s.name as name, avg(m.value) as value FROM Mark m JOIN m.student as s GROUP BY m.student")
    public List<Map<Object, Object>> averageMarkByStudent();
}
