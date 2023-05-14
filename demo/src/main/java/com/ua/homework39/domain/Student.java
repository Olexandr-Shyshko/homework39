package com.ua.homework39.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
//@EntityScan
public class Student {
//    @Id
    private int id;
    private String name;
    private int course;
    private String groupName;

}
