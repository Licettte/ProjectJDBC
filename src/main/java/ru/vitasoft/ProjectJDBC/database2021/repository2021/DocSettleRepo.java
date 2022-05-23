package ru.vitasoft.ProjectJDBC.database2021.repository2021;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.vitasoft.ProjectJDBC.database2021.model2021.Docsettle;

@Repository
@AllArgsConstructor
public class DocSettleRepo {
    private JdbcTemplate jdbcTemplate;
    public Docsettle getDocSettleByEduDocId(String eduDocId){
            return jdbcTemplate.queryForObject("SELECT * FROM d_docsettle WHERE edudocid=?",
                    BeanPropertyRowMapper.newInstance(Docsettle.class), eduDocId);
    }
}
