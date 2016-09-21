package org.defaults.unijournal.controller;

import org.defaults.unijournal.entity.MarkListEntity;
import org.defaults.unijournal.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestController
public class AverageMarkByStudentController {
    @Autowired
    MarkRepository markRepository;
    @RequestMapping("/marks/search/averageMarkByStudent")
    public @ResponseBody ResponseEntity<?> getAverageMarkByStudent() {
        List<MarkListEntity> marks = new ArrayList<>();
        markRepository.averageMarkByStudent().forEach(v -> {
            MarkListEntity entry = new MarkListEntity();
            entry.setName((String)v.get("name"));
            entry.setValue((Double)v.get("value"));
            marks.add(entry);
        });
        Resources<MarkListEntity> resources = new Resources<>(marks);
        return ResponseEntity.ok(resources);
    }
}
