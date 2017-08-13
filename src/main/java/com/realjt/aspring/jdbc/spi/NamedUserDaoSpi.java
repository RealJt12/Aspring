package com.realjt.aspring.jdbc.spi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.util.CollectionUtils;

import com.realjt.aspring.jdbc.User;
import com.realjt.aspring.jdbc.UserDao;

/**
 * 使用具名参数的jdbcTemplate
 * 
 * @author RealJt
 */
public class NamedUserDaoSpi implements UserDao
{
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private static final RowMapper<User> USER_ROWMAPPER = new RowMapper<User>()
	{
		@Override
		public User mapRow(ResultSet resultSet, int i) throws SQLException
		{
			User user = new User();

			user.setId(resultSet.getInt("id"));
			user.setUsername(resultSet.getString("username"));
			user.setPassword(resultSet.getString("password"));
			user.setSex(resultSet.getInt("sex"));
			user.setAge(resultSet.getInt("age"));
			user.setPhone(resultSet.getString("phone"));
			user.setEmail(resultSet.getString("email"));
			user.setAddress(resultSet.getString("address"));

			return user;
		}

	};

	@Override
	public void add(User user)
	{
		if (null == user)
		{
			System.out.println("user is null");

			return;
		}

		String sql = "insert into userinfo (username,password,sex,age,phone,email,address) values (:username,:password,:sex,:age,:phone,:email,:address)";

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", user.getUsername());
		paramMap.put("password", user.getPassword());
		paramMap.put("sex", user.getSex());
		paramMap.put("age", user.getAge());
		paramMap.put("phone", user.getPhone());
		paramMap.put("email", user.getEmail());
		paramMap.put("address", user.getAddress());

		namedParameterJdbcTemplate.update(sql, paramMap);
	}

	@Override
	public void add(List<User> users)
	{
		if (CollectionUtils.isEmpty(users))
		{
			System.out.println("users is empty");

			return;
		}

		String sql = "insert into userinfo (username,password,sex,age,phone,email,address) values (:username,:password,:sex,:age,:phone,:email,:address)";

		List<SqlParameterSource> sqlParameterSources = new ArrayList<SqlParameterSource>();
		for (User user : users)
		{
			if (null != user)
			{
				sqlParameterSources.add(new BeanPropertySqlParameterSource(user));
			}
		}

		namedParameterJdbcTemplate.batchUpdate(sql,
				sqlParameterSources.toArray(new SqlParameterSource[sqlParameterSources.size()]));
	}

	@Override
	public User query(int id)
	{
		String sql = "select * from userinfo where id = :id";

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);

		namedParameterJdbcTemplate.queryForObject(sql, paramMap, USER_ROWMAPPER);

		return null;
	}

	@Override
	public User query(String username)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> query()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String username)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public long count()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate()
	{
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate)
	{
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

}