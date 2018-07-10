package capitulo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		Connection c;
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost/banco", "user", "senha");
			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
