package com.igate.tmg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.tmg.bean.TestCases;

public class TestRowMApper implements RowMapper<TestCases> {

	@Override
	public TestCases mapRow(ResultSet rs, int rownum) throws SQLException {
		
		TestCases tr=new TestCases();
		//System.out.println(rs.getString(2));
		//tr.setApplication(rs.getString(1));
		tr.setTestCase(rs.getString(1));
		return tr;
		
}
}
