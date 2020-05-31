package com.vinan.myfirstthymeleaf.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = Biodata.TABLE_NAME)
@Data
@Getter @Setter
public class Biodata {
    public static final String TABLE_NAME = "t_biodata";

    @Id
    @GeneratedValue
    @Column(name = "id_bio")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String fullName;
    @Column(name = "email")
	private String email;
    @Column(name = "phone_number")
	private String phone;
    @Column(name = "address")
	private String address;
    @Column(name = "birthday")
	private Date birthday;
    @Column(name = "id_card_number")
	private String idCard;
    @Column(name = "university")
	private String univ;
    @Column(name = "major")
	private String major;
    @Column(name = "gpa")
	private String gpa;
    @Column(name = "cover_letter")
	private String cover;
    @Column(name = "hobby")
	private String hobby;
    @Column(name = "gender")
	private String gender;
    @Column(name = "religion")
	private String religion;

    @OneToOne
    private DetailBiodata detailBiodata;


}
