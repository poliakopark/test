package com.git.demo.domain;

import lombok.Data;

@Data
public class UserDTO {
	private String userId;
	private String userPw;
	private String name;
	private int age;
	private String regdate;
}
