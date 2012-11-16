import java.sql.Connection;
import java.sql.DriverManager;


public class test_mssql {

	/**
	 * @param args
	 * DB Connection 테스트 프로그램
	 */
	public static void main(String[] args) {
// MS-SQL 2000용
//		String db_driver="com.microsoft.jdbc.sqlserver.SQLServerDriver"; 
//		String db_url="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=test"; 
	
// MS-SQL 2005/2008용
		String db_driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
		String db_url="jdbc:sqlserver://localhost:1433;DatabaseName=test";
		
		String db_user="nousko"; 
		String db_password="gksmf00"; 
		Connection dbcon = null; 
		
		try{ 
			Class.forName(db_driver); 
		}catch(ClassNotFoundException e){ 
			System.out.println("JDBC 드라이버를 찾을 수 없습니다." + e);  
		} 
		
		try{ 
			dbcon = DriverManager.getConnection(db_url,db_user,db_password); 
			System.out.println("연결성공"); 
		}catch(Exception e){ 
			System.out.println("[Exception]"+e);
			System.out.println("DB에 연결할 수 없습니다."); 
		}finally{ 
			try{ 
				if(dbcon != null) dbcon.close(); 
			}catch(Exception e){} 
	  }
	}

}
