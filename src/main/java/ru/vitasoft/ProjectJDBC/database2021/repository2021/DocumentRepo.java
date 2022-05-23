package ru.vitasoft.ProjectJDBC.database2021.repository2021;


import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;
import ru.vitasoft.ProjectJDBC.database2021.model2021.Document;

@Repository
@AllArgsConstructor
public class DocumentRepo {
    private JdbcTemplate jdbcTemplate;

    public Document getByDDocumentId(String dDocumentId){
        return jdbcTemplate.queryForObject("SELECT * FROM d_document WHERE documentid=?",
                BeanPropertyRowMapper.newInstance(Document.class), dDocumentId);
    }
}
