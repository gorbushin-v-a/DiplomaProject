package com.example.diplomaproject.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Testcoll {

    @Id
    private String id;
    private String firstName;
    private String lastName;
}
