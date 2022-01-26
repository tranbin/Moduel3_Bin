    package repository.imp;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class BaseRepository {
        private String jdbcUrl ="jdbc:mysql://localhost:3306/FuramaManagerment";
        private String username ="root";
        private String password ="123456";
        private Connection connection;
        public BaseRepository() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                this.connection = DriverManager.getConnection(jdbcUrl,username,password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }
