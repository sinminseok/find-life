package com.core.user.model;

import com.core.base.model.BaseTimeEntity;
import com.core.home.model.Home;
import com.core.home.model.HomeAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 애그리거트 루트
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String nickName;

    private String password;

    private String profileUrl;

    private Integer brith;

    private Integer phoneNumber;

    private String job;

    private Gender gender;

    private String nationality;

    public void passwordEncode(String encodePassword) {
        this.password = encodePassword;
    }

}