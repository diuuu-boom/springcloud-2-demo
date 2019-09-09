package indi.jsees.springcloud.entities;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@ToString
@Accessors(chain = true)
public class User implements Serializable {

    private static final Long serialVersionUID  = 1L;

    private Long userId;
    private String username;
    private String password;
    private int age;
    private String hobby;
    private String db_source;
}
