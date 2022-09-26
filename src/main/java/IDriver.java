package main.java;

public interface IDriver {
    /**
     * @param databaseSchemaPath
     */
    void createDatabase(String databaseSchemaPath);

    /**
     * @param databaseName
     * @param tableName
     * @param value
     */
    void setRow(String databaseName, String tableName, String value);

    /**
     * @param databaseName
     * @param tableName
     * @param value
     */
    void getRow(String databaseName, String tableName, String value);

    /**
     * @param databaseName
     * @param tableName
     * @param value
     */
    void deleteRow(String databaseName, String tableName, String value);
}
