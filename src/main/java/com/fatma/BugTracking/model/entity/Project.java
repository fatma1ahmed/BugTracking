package com.fatma.BugTracking.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonProperty("project_name")
    private String name;
    @JsonProperty("project_details")
    private String details;
    @JsonProperty("project_type")
    private String type;
    @JsonProperty("project_start_date")
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime startDate;
    @UpdateTimestamp
    @JsonProperty("project_end_date")
    private LocalDateTime endDate;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Bug> bugs;


}
