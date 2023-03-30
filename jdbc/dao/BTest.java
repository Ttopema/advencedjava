package jdbc.dao;

public class BTest {
	public static void main(String[] args) {
		System.out.println("다른 코드들....1");
		System.out.println("다른 코드들....4");
		
		//인터페이스 = 클래스 객체
//		CustomerDAO dao = new CustomerDAOImpl_JSON();
//		dao.insert(null, null, null, null, null);
		Factory factory = new Factory();
		CustomerDAO dao = factory.getDAO();
		
		System.out.println("다른 코드들....1");
		System.out.println("다른 코드들....2");
		System.out.println("다른 코드들....3");
		System.out.println("다른 코드들....4");
		
		dao.insert(null, null, null, null, null);
		
		System.out.println("다른 코드들....1");
		System.out.println("다른 코드들....2");
		System.out.println("다른 코드들....3");
		System.out.println("다른 코드들....4");
	}

}
