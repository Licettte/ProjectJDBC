package ru.vitasoft.ProjectJDBC.database2021.model2021;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {

    private String id;
    private String dataBase;
    private String docType;
    private String name;
    private String series;
    private String number;
    private LocalDate issueDate;// Дата выпуска
    private String issuedBy; //выдан
}
