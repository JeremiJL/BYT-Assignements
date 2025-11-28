package byt.factory;

public class DatabaseFactory {

    public static IDatabase createDatabase(DatabaseType type) {
        return switch (type) {
            case SqlServer -> new SqlServerDatabase();
            case Oracle -> new OracleDatabase();
        };
    }

}
