/*
 //�����õ���DBHelper�ļ����Լ�д�Ĳ��������ļ���
package mingrisoft;

import java.sql.ResultSet;  
import java.sql.SQLException; 

public class Login {
	static String sql =null;
	static DBHelper db = null;
	static ResultSet  r1= null;
	public boolean LoginCheck(String user, String pwd) {
		sql = "select AdminPwd from Admin where AdminName =?";
		db = new DBHelper(sql);
		try {  
			db.pst.setString(1, user);
            r1 = db.pst.executeQuery();//ִ����䣬�õ������  
            while(r1.next()) {
	        	 //System.out.println(r1.getString("AdminPwd"));
	        	if(pwd.equals(r1.getString(1))) {
	        		return true;
	        	}
	        	else 
	        		return false;
            }
            r1.close();  
            db.close();//�ر�����  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
	 	return false;
	}
}

*/

package mingrisoft;
import  java.sql.Connection;
import java.sql.SQLException;

public class Login{
		DBConnection DBConn = new DBConnection();
		Function Fun = new Function();
		public boolean LoginCheck(String user,String pwd) {
		try {
			Connection Conn = DBConn.getConn();
			boolean OK = true;
			OK = Fun.CheckLogin(Conn, user, pwd);
			return OK;
		}catch(SQLException e) {
			return false;
		}
    }
}