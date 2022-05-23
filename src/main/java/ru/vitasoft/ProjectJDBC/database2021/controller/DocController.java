package ru.vitasoft.ProjectJDBC.database2021.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vitasoft.ProjectJDBC.database2021.dto2021.DocDto;
import ru.vitasoft.ProjectJDBC.database2021.service2021.DocService;

@RestController
@RequestMapping("contactPerson")
@AllArgsConstructor
public class DocController {
    private DocService docService;

    @GetMapping("/{id}")
    public ResponseEntity<DocDto> findAll(@PathVariable("id") Integer contactPersonId) {
        return new ResponseEntity<>(docService.getById(contactPersonId), HttpStatus.OK);
    }
}
