package ru.vitasoft.ProjectJDBC.database2021.service2021;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vitasoft.ProjectJDBC.database2021.dto2021.DocDto;
import ru.vitasoft.ProjectJDBC.database2021.model2021.ContactPerson;
import ru.vitasoft.ProjectJDBC.database2021.model2021.Docsettle;
import ru.vitasoft.ProjectJDBC.database2021.model2021.Document;
import ru.vitasoft.ProjectJDBC.database2021.repository2021.ContactRepo;
import ru.vitasoft.ProjectJDBC.database2021.repository2021.DocSettleRepo;
import ru.vitasoft.ProjectJDBC.database2021.repository2021.DocumentRepo;

@Service
@AllArgsConstructor
public class DocService {
    private ContactRepo contactRepo;
    private DocSettleRepo docSettleRepo;
    private DocumentRepo documentRepo;

    public DocDto getById(Integer contactPersonId) {
        ContactPerson contactPerson = contactRepo.getContactPersonById(contactPersonId);

        String eduDocId = contactPerson.getEduDocId();

        Docsettle docsettle = docSettleRepo.getDocSettleByEduDocId(eduDocId);

        String dDocId = docsettle.getDocumentId();

        Document document = documentRepo.getByDDocumentId(dDocId);

        return DocDto.builder()
                .id(contactPersonId)
                .dataBase("ПК-2021")
                .name(document.getName())
                .series(contactPerson.getSeries())
                .number(contactPerson.getEduCardNumber())
                .issuedBy(contactPerson.getEduIssuedBy())
                .issueDate(contactPerson.getEduIssueDate())
                .build();
    }
}
