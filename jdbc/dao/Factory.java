package jdbc.dao;

//Factory의 역할을 하는 디자인패턴이 존재함 ==> 팩토리패턴
/// => 객체를 만들어서 필요한 곳으로 넘겨주는 역할
public class Factory {
	public CustomerDAO getDAO() {
		return new CustomerDAOImpl();
	}
}
