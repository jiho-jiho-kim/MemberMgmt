package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor	//기본생성자
@AllArgsConstructor //파라미터를 다 받는 생성자
public class UserVo {
	private String userid;
	private String name;
	private String gender;
	private String city;
}
