package jdbc.dao;

public interface CustomerDAO {
	public int insert(String id, String pass, String name, String addr, String memo);
	public int update(String id, int point, String pass);
	public int delete(String id);
	public void select(String addr);
	public void login(String id, String pass);
}
