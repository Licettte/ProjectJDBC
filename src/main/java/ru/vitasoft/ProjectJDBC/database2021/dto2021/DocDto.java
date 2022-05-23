package ru.vitasoft.ProjectJDBC.database2021.dto2021;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor

@AllArgsConstructor
@Builder
public class DocDto {

    private Integer id;
    private String dataBase;
    private String name;
    private String series;
    private Integer number;
    private LocalDate issuedBy;
    private LocalDate issueDate;
}
