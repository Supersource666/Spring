package com.supersource.demoforjpacrud.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
    @Entity
     @Table (name="tb_user")
    public class User_Entity implements Serializable {
        @Id
        @Column(name = "user_id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "user_name",nullable = false)
        private String name;

        @Column(name = "user_pwd", nullable = false)
        private String password;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "User_Entity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }
    }


