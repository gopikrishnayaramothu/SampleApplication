package com.igate.tmg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.tmg.bean.Trainee;

public class TraineeRowMapper implements RowMapper<Trainee> {

	@Override
	public Trainee mapRow(ResultSet rs, int rownum) throws SQLException {
		
		Trainee tr=new Trainee();
		System.out.println(rs.getString(2));
		tr.setTraineeId(rs.getInt(1));
		tr.setTraineeName(rs.getString(2));
		tr.setTraineeDomain(rs.getString(3));
		tr.setTraineeLocation(rs.getString(4));
		return tr;
		
		
	}

}
