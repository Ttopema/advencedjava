package jdbc.dao;

import java.util.ArrayList;

public interface CustomerDAO {
	public int insert(CustomerVO customer);
	 
	public ArrayList<CustomerVO> getMemberList(); 

	public int insert(String id, String pass, String name, String addr, String memo);

	public int update(String id, int point, String pass);

	public int delete(String id);

	public ArrayList<CustomerVO> select(String addr);

	public CustomerVO login(String id, String pass);
	
	public CustomerVO getCustomerInfo(String id);
}
