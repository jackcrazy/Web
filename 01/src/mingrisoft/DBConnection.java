package mingrisoft;			

import java.sql.*;						
import java.util.*;
import java.io.*;

import mingrisoft.Function;

public class DBConnection					
{

    private String FileName;			
    private int DBType;					
    private Connection conn;			
    private String MySqlDriver;			
    private String MySqlURL; 			
    private String MySQLuser;
    private String MySQLpwd;   
   
    public DBConnection()
    {
    	conn = null;
    }

	public  Connection getConn()
	{

		DBType= new Function().StrToInt(getPara("DBType"));
	
		switch(DBType)
		{
			case 1:return(getConnToMySql());
			default:return null;
		}	
	}
	
	
	public String getPara(String ParaName) 
	{
		FileName="../DBConfig.property";
		Properties prop= new Properties();
		try
		{
			InputStream is=getClass().getResourceAsStream(FileName);
			prop.load(is);
			if(is!=null) is.close();
		}
		catch(Exception e) {
			return "Error!";
		}
		return prop.getProperty(ParaName);
	}
	
	
    public Connection getConnToMySql()
    {
		try{
	 		MySqlDriver = getPara("MySQLDriver");	
	    	MySqlURL = getPara("MySQLURL");
	    	MySQLuser = getPara("MySQLuser");
	    	MySQLpwd= getPara("MySQLpwd");
	    	Class.forName(MySqlDriver).newInstance();
	    	conn = DriverManager.getConnection(MySqlURL,MySQLuser,MySQLpwd);
	    	}catch(Exception e){
	    	}
	    return conn;
    }       
    
}
