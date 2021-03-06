package com.cos.Eco_Manager.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity //table 생성
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id //Primary Key
	//프로젝트에서 연결된 DB의 넘버링 전략
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // 시퀀스 넘버링 전략, auto_increment
	
	@Column(nullable = false, length = 30)
	private String userid;
	

	private String username; 
	
	@Column(nullable = false, length = 100)
	private String password;
	
	private String email; 
	
	private String phone_number;
	
	private String address;
	
	@ColumnDefault("'user'")
	private String role;
	
	@CreationTimestamp // 시간이 자동으로 입력이 됨.
	private Timestamp createDate;
	
	
}
