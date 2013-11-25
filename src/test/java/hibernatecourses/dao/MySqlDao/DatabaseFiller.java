package hibernatecourses.dao.MySqlDao;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.dbunit.util.fileloader.FullXmlDataFileLoader;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;

public class DatabaseFiller {
    private String xmlFilename;
    private DataSource dataSource;

    public DatabaseFiller(String xmlFilename, DataSource dataSource) {
        this.xmlFilename = xmlFilename;
        this.dataSource = dataSource;
    }

    public void fill() throws Exception {
        Connection connection = null;
        try {
            connection = DataSourceUtils.getConnection(dataSource);
            IDatabaseConnection dbUnitConnection = new DatabaseConnection(connection);
            FullXmlDataFileLoader loader = new FullXmlDataFileLoader();
            IDataSet xmlDataSet = loader.load(xmlFilename);
            DatabaseOperation.CLEAN_INSERT.execute(dbUnitConnection, xmlDataSet);
        } finally {
            DataSourceUtils.releaseConnection(connection, dataSource);
        }
    }
}
