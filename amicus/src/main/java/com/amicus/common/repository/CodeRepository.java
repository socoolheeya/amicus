package com.amicus.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.amicus.common.model.Code;

public interface CodeRepository extends JpaRepository<Code, Long> {
	
	@Query(value="select "
			+ "a.code_id"
			+ ", a.code_name"
			+ ", b.category_id"
			+ ", b.category_name"
			+ ", a.order"
			+ "from t_code a, t_category b"
			+ "where a.category_id = b.category_id "
			+ "and b.category_id = :#{#code.categoryId}", nativeQuery = true)
	public List<Code> getCodeList(@Param("code") Code code);
	
	@Query(value="select "
			+ "a.code_id"
			+ ", a.code_name"
			+ ", b.category_id"
			+ ", b.category_name"
			+ ", a.order"
			+ "from t_code a, t_category b"
			+ "where a.category_id = b.category_id "
			+ "and b.category_id = :#{#code.categoryId}"
			+ "and a.code_id = :#{#code.codeId}", nativeQuery = true)
	public Code getCode(@Param("code") Code code);
	
}
