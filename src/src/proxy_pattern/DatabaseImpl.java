package src.proxy_pattern;

public class DatabaseImpl implements Database{

	@Override
	public void executeQuery(String query) throws Exception {
		System.out.println("Query Executed Scucessfully");
	}
}	

	 class DatabaseProxy implements Database{
		boolean isAdmin;
		DatabaseImpl databaseImpl;

		public DatabaseProxy(String userName, String password) {
			if(userName == "ADMIN" && password == "Admin@123") {
				isAdmin=true;
				databaseImpl= new DatabaseImpl();
			}
		}

		@Override
		public void executeQuery(String query) throws Exception {
			if(isAdmin) {
				databaseImpl.executeQuery(query);
			} else {
				if(query.contains("DELETE")) {
					throw new Exception("Delete Query not allowed for non-admin users");
				} else {
					databaseImpl.executeQuery(query);
				}
			}
		}
	}
