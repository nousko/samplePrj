import java.sql.Connection;
import java.sql.DriverManager;


public class test_Oracle {

	/**
	 * @param args
	 * DB Connection �׽�Ʈ ���α׷�
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
			System.out.println("JDBC ����̹��� ã�� �� �����ϴ�." + e); 
		} 
		
		try{ 
			dbcon = DriverManager.getConnection(db_url,db_user,db_password); 
			System.out.println("���Ἲ��"); 
		}catch(Exception e){ 
			System.out.println("DB�� ������ �� �����ϴ�."); 
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
