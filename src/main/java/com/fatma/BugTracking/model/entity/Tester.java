package com.fatma.BugTracking.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    @JsonProperty("tester_picture")
    private String picture;
    @JsonProperty("tester_address")
    private String address;
    @JsonProperty("tester_bonus")
    private long bonus;
    @ManyToMany
    private Project projects;
    @OneToMany(mappedBy = "tester",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Bug> bugs;
}
