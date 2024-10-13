package com.fatma.BugTracking.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fatma.BugTracking.model.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonProperty("bug_name")
    private String name;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    @JsonProperty("bug_picture")
    private String picture;
    @JsonProperty("bug_description")
    private String description;
    @JsonProperty("bug_status")
    private Status status;
    @ManyToOne
    private Project project;
    @ManyToOne
    private Developer developer;
    @ManyToOne
    private Tester tester;

}
