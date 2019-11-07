package ua.nure.ITKN177AnastasyaMinenko.userManagment.db;

import junit.framework.TestCase;
import ua.nure.ITKN179MykytaMaslovskyi.userManagment.User;
import ua.nure.ITKN179MykytaMaslovskyi.userManagment.db.Dao;
import ua.nure.ITKN179MykytaMaslovskyi.userManagment.db.DaoFactory;


public class DaoFactoryTest extends TestCase {
	public void testUserDao() {
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            assertNotNull("Dao factory instance is null", daoFactory);
            Dao<User> dao = daoFactory.getUserDao();
            assertNotNull("UserDao instance is null", dao);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }
}
