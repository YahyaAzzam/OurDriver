package main.java;


import netscape.javascript.JSObject;

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
     * @return
     *      Array of json objects
     */
    JSObject[] getRow(String databaseName, String tableName, String value);

    /**
     * @param databaseName
     * @param tableName
     * @param value
     * @return
     *      Return True if the row got deleted, and false if it was already not created
     */
    boolean deleteRow(String databaseName, String tableName, String value);

    /**
     * @param databaseName
     * @return
     *      Return True if the database got deleted, and false if it was already not created
     */
    boolean clearDatabase(String databaseName);
}
