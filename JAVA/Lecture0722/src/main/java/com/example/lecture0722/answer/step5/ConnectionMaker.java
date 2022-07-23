package com.example.lecture0722.answer.step5;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException, SQLException;
	
}
