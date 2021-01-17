/**
 * 
 */
package com.ven.usermaintain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ven.usermaintain.domain.UserEntity;

/**
 * @author Kapil
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	

}
