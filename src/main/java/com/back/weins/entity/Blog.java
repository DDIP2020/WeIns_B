package com.back.weins.entity;

import com.back.weins.repository.UserRepository;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name="lik")
    private Integer like;

    @Column(name = "reblog")
    private Integer reblog;

    @Column(name = "com_number")
    private Integer com_number;

    @Column(name = "coll_number")
    private Integer coll_number;

    @Column(name = "is_del")
    private Integer is_del;

    @Column(name = "uid")
    private Integer uid;


    @Column(name = "post_day")
    private String post_day;

    @Column(name = "type")
    private Integer type;

    @Column(name = "reblog_id")
    private Integer reblog_id;

    public Blog(){
        like = 0;
        reblog = 0;
        com_number = 0;
        coll_number = 0;
        is_del = 0;
        reblog_id = -1;
    }

    @Transient
    private BlogMongo blogMongo;
}
