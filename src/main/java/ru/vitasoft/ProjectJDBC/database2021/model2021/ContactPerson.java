package ru.vitasoft.ProjectJDBC.database2021.model2021;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactPerson {

    private Integer id;
    private String fullName;
    private String name;
    private String series;
    private Integer number;
    private String eduDocId;
    private Integer eduCardNumber;
    private LocalDate eduIssueDate;
    private LocalDate eduIssuedBy;
    private LocalDate birthDate;
}
