package com.hyh.springcloud.entity;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dept {

    private Integer deptno;
    private String dname;
    private String db_source;

}
