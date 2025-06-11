package com.gourav.spring_boot_rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {
    int postId;
    String postProfile;
    String postDesc;
    int reqExperience;
    List<String> postTechStack;
}
