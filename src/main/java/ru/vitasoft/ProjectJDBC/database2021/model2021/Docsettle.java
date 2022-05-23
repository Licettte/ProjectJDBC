package ru.vitasoft.ProjectJDBC.database2021.model2021;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Docsettle {

    private String entrantDocsettleId;
    private String fileName;
    private String dataBase;
    private String fileTypeId;
    private String documentId;
}
