package com.amicus.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.amicus.user.model.User;
import com.amicus.user.model.User.USER_TYPE;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value="select "
			+ "a.* "
			+ ", b.name "
			+ "from t_user a, t_role b, t_user_role c "
			+ "where a.id = c.user_id "
			+ "and b.id = c.role_id "
			+ "and a.email = :email",  nativeQuery = true)
	public User findByEmail(@Param("email") String email);
	
	@Query(value="select "
			+ "a.* "
			+ ", b.name "
			+ "from t_user a, t_role b, t_user_role c "
			+ "where a.id = c.user_id "
			+ "and b.id = c.role_id "
			+ "and a.type = :type",  nativeQuery = true)
	public User findBytype(@Param("type") USER_TYPE type);
	
	
}
