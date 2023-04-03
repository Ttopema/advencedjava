package jdbc.dao;

import java.util.ArrayList;

// JSON 액세스하기 위한 기능
public class CustomerDAOImpl_JSON implements CustomerDAO {

	@Override
	public int insert(String id, String pass, String name, String addr, String memo) {
		System.out.println("JSON에 insert");
		return 0;
	}

	@Override
	public int update(String id, int point, String pass) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CustomerVO customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<CustomerVO> select(String addr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerVO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerVO> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerVO getCustomerInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
