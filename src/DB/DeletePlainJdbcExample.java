package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// JDBC API
public class DeletePlainJdbcExample {
  private static final String SQL = "DELETE FROM students WHERE id = ?";
  private static final String DB_URL = "jdbc:mysql://localhost:3306/test_db";
  private static final String username = "root";
  private static final String password = "0000";

  public static void main(String[] args) {
    // 1. DB Conn (username, pw, db_url)
    try (Connection conn = DriverManager.getConnection(DB_URL, username, password);
        PreparedStatement ps = conn.prepareStatement(SQL)) {

      // 2. conn.statement  (SQL)
      int id = 3;
      ps.setInt(1, id);

      int rowNum = ps.executeUpdate();
      // 3. 실행 결과 출력
      System.out.println("rowNum = " + rowNum);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
