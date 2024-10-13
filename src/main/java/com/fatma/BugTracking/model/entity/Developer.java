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
public class Developer extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    @JsonProperty("developer_picture")
    private String picture;
    @JsonProperty("developer_address")
    private String address;
    @JsonProperty("developer_bonus")
    private long bonus;
    @ManyToMany
    private Project projects;
    @OneToMany(mappedBy = "developer",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Bug> bugs;
}
