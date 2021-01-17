/**
 * 
 */
package com.ven.usermaintain.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ven.usermaintain.domain.UserEntity;
import com.ven.usermaintain.service.UserService;
import com.ven.usermaintain.vo.UserVo;


/**
 * @author Kapil
 *
 */
@RestController("/api")
public class UserController {
	
	@Autowired
	UserService	userService;
	
	
	@PostMapping("/user")
	public String save(@RequestBody UserVo userVo ) throws IOException {
	
		Boolean res = userService.save(userVo) ;
		
		if(res) {
			return "saved";
		}
		else {
			return "error occured";
		}
	}
	@GetMapping("/user")
	public List<UserEntity> getAll(){
		return userService.getAll();
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
