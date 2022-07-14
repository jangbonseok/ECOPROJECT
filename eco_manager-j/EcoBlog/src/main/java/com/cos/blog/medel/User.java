package com.cos.blog.medel;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // User class => MySql table create 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//DB의 연결 넘버링 참조
	private int id; // auto increment(시퀀스)
	
	@Column(nullable = false, length =30, unique = true)
	private String username; 
	
	@Column(nullable = false, length =100)
	private String passwd; 
	
	@Column(nullable = false, length =50)
	private String email; 
	
	@Enumerated(EnumType.STRING)
	private RoleType role; // Enum을 이용해야함. 
	
	@CreationTimestamp //시간 자동 입력
	private Timestamp createDate; 
	
	
	
}
