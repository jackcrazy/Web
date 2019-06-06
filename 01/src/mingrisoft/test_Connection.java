package mingrisoft;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class test_Connection {
	/* test the login.java
		public static void main(String[] args)  {
			DBConnection d= new DBConnection();
			ResultSet ret= null;
			Connection conn = d.getConnToMySql();
			String sql ="select * from admin";
			try {
			PreparedStatement pst = conn.prepareStatement(sql);
			 ret = pst.executeQuery();//执行语句，得到结果集  
	            while (ret.next()) {  
	                String AdminName = ret.getString(1);  
	                String AdminPwd = ret.getString(2);
	                System.out.println(AdminName + "\t" + AdminPwd  );  
	            }//显示数据  
	            ret.close();  
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		*/
	/*
	//test the news.java
	static DBConnection DBConn = new DBConnection();
	static Function Fun = new Function();
	static String toPage;
	static String pageNum;
	public static void main(String[] args) {
			Connection Conn = DBConn.getConn();
			ResultSet rs = null;
			String sSql = "select * from News order by NewsID desc";
			try {
				//PreparedStatement pst = Conn.prepareStatement(sSql);
				//rs = pst.executeQuery();
				StringBuffer resultData = new StringBuffer();
				Statement stmt = Conn.createStatement();
			   rs = stmt.executeQuery(sSql);
				while(rs.next()) {
					int NewsID = rs.getInt("NewsID");
					String NewsTitle = rs.getString("NewsTitle");
					String NewsContent = rs.getString("NewsContent");
					String NewsTime = rs.getString("NewsTime");
					String AdminName = rs.getString("AdminName");
					System.out.println(NewsID + "\t" + NewsTitle + "\t" + NewsContent + "\t" + NewsTime + "\t" + AdminName);  
				}
			resultData = Fun.ListNews(resultData, rs, toPage, pageNum);
			rs.close();
			stmt.close();
				//	pst.close();
					Conn.close();
			   }catch(Exception e) {
				   System.out.println("No");
			   }
	}
	*/
}
