package com.igate.tmg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import com.igate.tmg.bean.LoginDetails;
import com.igate.tmg.bean.TestCases;
import com.igate.tmg.bean.Trainee;

@Component
public class TraineeDao {

	SimpleJdbcTemplate jdbcTemplate;

	public SimpleJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int doLogin(LoginDetails login) {
		String sql = "select count(*) from login where username=? and password=?";
		Object params = new Object[] { login.getUserName(), login.getPassWord() };
		//int count = jdbcTemplate.queryForInt(sql, Integer.class, params);
		return jdbcTemplate.queryForInt(sql, params);
		

	}

	public int doAddTrainee(Trainee trainee) {
		String sql = "insert into trainees values(?,?,?,?)";
		return jdbcTemplate.update(sql,
				new Object[] { trainee.getTraineeId(),
						trainee.getTraineeName(), trainee.getTraineeDomain(),
						trainee.getTraineeLocation() });
	}

	public int doDeleteTrainee(int id) {
		String sql = "delete from trainees where id=?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	public Trainee doselectTrainee(int id1) {
		
		String sql = "select * from trainees where id=?";
		Trainee t=(Trainee) jdbcTemplate.queryForObject(sql
				,new TraineeRowMapper(),new Object[] { id1 });
		return t;

	}

	public int doUpdateTrainee(Trainee trainee) {
		String sql = "update trainees set name=?,location=?,domain=? where id=?";
		return jdbcTemplate.update(
				sql,
				new Object[] { trainee.getTraineeName(),
						trainee.getTraineeLocation(),
						trainee.getTraineeDomain(), trainee.getTraineeId() });
	}

	public List<Trainee> getAllDetails() {
		// TODO Auto-generated method stub
		
		String sql = "SELECT id,name,location,domain FROM trainees order by id";
		 
		List<Trainee> customers  = getJdbcTemplate().query(sql,
				new TraineeRowMapper());
	 System.out.println(customers.size());
	 for(Trainee t:customers)
		{
			System.out.println(t.toString());
		}
		return customers;

	}

	public List<String> getTets(String application) {
		// TODO Auto-generated method stub
		String sql="SELECT name from application where appName=?";
		List<String>names1 = new ArrayList<String>();
		List<TestCases> names = jdbcTemplate.query(sql, new TestRowMApper(), application);
		System.out.println("In dao"+names.size());
		      for(TestCases d:names)
		      {
		    	  names1.add(d.getTestCase());
		      }
		System.out.println(names1.size());
		return names1;
	}

}
