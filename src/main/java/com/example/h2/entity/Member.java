package com.example.h2.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;


/**
 * @author : JB
 * @packageName : com.example.h2.entity
 * @fileName : Member
 * @description :
 * @since : 2024-03-20
 */

@Entity
@Table(name = "member")
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;


    @Builder
    public Member(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
