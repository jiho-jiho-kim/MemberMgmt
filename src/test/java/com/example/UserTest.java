package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.domain.UserVo;
import com.example.service.UserService;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Log
class UserTest {
	@Autowired
	private UserService userService;
	
	
	@Disabled @Test
	public void test() {
		assertNotNull(this.userService);  
	}
	
	@Disabled @Test
	public void test1() {
		UserVo user = this.userService.selectUser("jimin");
		assertEquals("한지민", user.getName());
		log.info(user.toString());
	}
	
	@Disabled @Test
	public void test2() {
		UserVo user = new UserVo("javaexpert", "박지민", "여", "의정부");
		int rowcount = this.userService.insertUser(user);
		assertEquals(1, rowcount);
	}
	
	@Disabled @Test
	public void test3() {
		int rowcount = this.userService.deleteUser("javaexpert");
		assertEquals(1, rowcount);
	}
	
	@Disabled @Test
	public void test4() {
		UserVo user = new UserVo("chulsu", "이철수", "여", "부산");
		int rowcount = this.userService.updateUser(user);
		assertEquals(1, rowcount);
	}
	
	@Test				//게시판으로 치면 다 나오게 하는거니까 이게 제일 먼저 나와야하는거지
	public void test5() {
		List<UserVo> list = this.userService.selectAllUsers();
		for(UserVo user : list) {
			log.info(user.toString());
		}
	}
}






