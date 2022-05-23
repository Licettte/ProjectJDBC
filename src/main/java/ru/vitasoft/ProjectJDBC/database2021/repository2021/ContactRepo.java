package ru.vitasoft.ProjectJDBC.database2021.repository2021;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.vitasoft.ProjectJDBC.database2021.model2021.ContactPerson;

@Repository
@AllArgsConstructor
public class ContactRepo {
    private JdbcTemplate jdbcTemplate;

    public ContactPerson getContactPersonById(Integer contactPersonId){
        return jdbcTemplate.queryForObject("SELECT * FROM contactperson WHERE contactpersonid=?",
                BeanPropertyRowMapper.newInstance(ContactPerson.class), contactPersonId);

    }
}
