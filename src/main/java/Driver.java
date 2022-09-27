package main.java;

//import com.google.common.base.Strings;

import org.json.JSONArray;

/**
 * This is java doc.
 * @author yazzam
 *
 */
public final class Driver implements IDriver {

    @Override
    public void createDatabase(final String databaseSchemaPath) {

    }

    @Override
    public void setRow(final String databaseName, final String tableName, final String value) {

    }

    @Override
    public JSONArray getRow(final String databaseName, final String tableName, final String value) {
        return null;
    }

    @Override
    public boolean deleteRow(final String databaseName, final String tableName, final String value) {
        return true;
    }

    @Override
    public boolean clearDatabase(final String databaseName) {
        return true;
    }

    /**
     * This is a java doc.
     * @param args
     */
    public void main(final String[] args) {

    }
}
