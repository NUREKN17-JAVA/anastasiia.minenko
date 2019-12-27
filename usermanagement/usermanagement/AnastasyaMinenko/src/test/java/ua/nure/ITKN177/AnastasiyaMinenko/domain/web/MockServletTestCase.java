package ua.nure.ITKN177.AnastasiyaMinenko.domain.web;

import java.util.Calendar;
import java.util.Properties;

import com.mockobjects.dynamic.Mock;
import com.mockrunner.servlet.BasicServletTestCaseAdapter;

import ua.nure.ITKN177.AnastasiyaMinenko.domain.User;
import ua.nure.ITKN177.AnastasiyaMinenko.domain.db.DaoFactory;
import ua.nure.ITKN177.AnastasiyaMinenko.domain.db.MockDaoFactory;

public abstract class MockServletTestCase extends BasicServletTestCaseAdapter {

    private Mock mockUserDao;

    protected Mock getMockUserDao() {
        return mockUserDao;
    }

    protected void setMockUserDao(Mock mockUserDao) {
        this.mockUserDao = mockUserDao;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Properties properties = new Properties();
        properties.setProperty("dao.factory", MockDaoFactory.class.getName());
        DaoFactory.init(properties);
        setMockUserDao(((MockDaoFactory) DaoFactory.getInstance()).getMockUserDao());
    }

    @Override
    protected void tearDown() throws Exception {
        getMockUserDao().verify();
        super.tearDown();
    }
}
