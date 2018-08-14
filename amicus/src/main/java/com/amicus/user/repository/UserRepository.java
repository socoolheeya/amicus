package com.amicus.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.amicus.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value="select "
			+ "a.id"
			+ ", a.email"
			+ ", a.password"
			+ ", a.name"
			+ ", a.birthday"
			+ ", a.position"
			+ ", a.grade"
			+ ", a.createdt"
			+ ", a.updatedt"
			+ ", a.confirm_yn"
			+ ", a.del_yn"
			+ ", b.name "
			+ "from t_user a, t_role b, t_user_role "
			+ "c where a.id = c.user_id "
			+ "and b.id = c.role_id "
			+ "and a.email = :email",  nativeQuery = true)
	public User findByEmail(@Param("email") String email);
	
	
}
