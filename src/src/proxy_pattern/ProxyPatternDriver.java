package src.proxy_pattern;


/**
 * Proxy Pattern used when restrict particular scenario
 *
 */
public class ProxyPatternDriver {

	public static void main(String[] args) {

		Database dataBase = new DatabaseProxy("ADMIN","Admin@123");
		try {
			dataBase.executeQuery("DELETE from EMPLOYEE Where emp_id=101");
		} catch (Exception e) {
			System.out.println("DB operation rollbacked" + e);
		}
	}
}
