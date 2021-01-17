/**
 * 
 */
package com.ven.usermaintain.service;



import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ven.usermaintain.domain.UserEntity;
import com.ven.usermaintain.repositories.UserRepository;
import com.ven.usermaintain.vo.UserVo;

/**
 * @author Kapil
 *
 */
@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	


	/* (non-Javadoc)
	 * @see com.ven.usermaintain.service.UserService#save(com.ven.usermaintain.vo.UserVo)
	 */
	public boolean save(UserVo userVo) throws IOException {
	
		byte[] fileContent = FileUtils.readFileToByteArray(userVo.getProfileImage());
		 
		String encodedString = Base64.getEncoder().encodeToString(fileContent);

		UserEntity user = new UserEntity(userVo.getUsername(),encodedString);
		
		UserEntity resp = userRepository.save(user);
		
		if (resp == null) {
			return false;
		}
		return true;
	}

	
	public List<UserEntity> getAll() {
		List<UserEntity> resp = userRepository.findAll();
		return resp;
	}
}
