package com.bdi.sp;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/root-context.xml")
public class DataSourceTest {

	@Autowired
	private DataSource ds;

	@Test
	public void test() {
		try(Connection con = ds.getConnection()) {
			System.out.println("연결 성공");
		} catch(SQLException e) {
			fail("연결 실패");
		}
	}
}
