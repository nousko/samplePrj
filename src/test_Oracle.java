import java.sql.Connection;
import java.sql.DriverManager;


public class test_Oracle {

	/**
	 * @param args
	 * DB Connection 테스트 프로그램
	 */
	public static void main(String[] args) {
		String db_driver="oracle.jdbc.OracleDriver";
		String db_url="jdbc:oracle:thin:@127.0.0.1:1521:HAGIS"; 
		String db_user="ESUM"; 
		String db_password="ESUM"; 
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
			System.out.println("DB에 연결할 수 없습니다."); 
			System.out.println("Exception e :" +e);
		}finally{ 
			try{ 
				if(dbcon != null) dbcon.close(); 
			}catch(Exception e){
				System.out.println("Exception e :" +e);
			} 
	  }
	}

}
