package com.offcn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tb_person")
@Entity
@Data  //get set
@NoArgsConstructor  //无参构造
@AllArgsConstructor  //有参构造
public class Person {

    @Id //声明当前属性为主键
    @GeneratedValue     //自动递增
    private int id;

    //设置表中属性对应的列属性
    @Column(nullable = true,length = 20,name = "user_name")
    private String  userName;

    @Column(nullable = true,length = 3)
    private int age;

    @Transient
    private String  birthday;
}
