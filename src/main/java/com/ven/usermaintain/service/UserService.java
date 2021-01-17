/**
 * 
 */
package com.ven.usermaintain.service;

import java.io.IOException;
import java.util.List;

import com.ven.usermaintain.domain.UserEntity;
import com.ven.usermaintain.vo.UserVo;

/**
 * @author Kapil
 *
 */
public interface UserService {
	


public boolean save(UserVo userVo) throws IOException;	
	
public List<UserEntity> getAll();
}
