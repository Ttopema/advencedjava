package jdbc.dao;

public class Factory {
	public CustomerDAO getDAO() {
		return new CustomerDAOImpl();
	}
}
