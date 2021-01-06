package it.framework.api.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDao {
	NamedParameterJdbcTemplate template;  
}
