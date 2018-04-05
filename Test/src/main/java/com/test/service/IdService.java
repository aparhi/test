package com.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.IdModel;

@Service("idservice")
public class IdService {

	@Autowired
	private DataSource dataSource;

	public String createContract(IdModel idModel) throws SQLException {

		Connection conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("CREATE SEQUENCE \"IDGENERATIONSERVICE\".\"mySequence\" START WITH 1000 INCREMENT BY 1");
		ps.executeUpdate();
		return "success";

	}

}
