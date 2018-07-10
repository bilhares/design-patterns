package capitulo7;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Programa {

	public static void main(String[] args) throws Exception {

		Connection c = new ConnectionFactory().getConnection();

		PreparedStatement ps = c.prepareStatement("SELECT * FROM TABELA");
	}

}
