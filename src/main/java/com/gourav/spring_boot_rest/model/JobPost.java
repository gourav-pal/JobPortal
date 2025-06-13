package com.gourav.spring_boot_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobPost {
    @Id
    int postId;
    String postProfile;
    String postDesc;
    int reqExperience;
    List<String> postTechStack;
}
