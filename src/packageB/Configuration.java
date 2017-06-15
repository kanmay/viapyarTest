package packageB;

public class Configuration {
	
	
	String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost/MTDATABASE";
	String USER = "root";
	String PASS = "mayank";
	static String imgLoc = "file:///D:/KanMay/";
	static String outputImageLocation="D:/KanMay/";
	static String luceneIndexLocation="/lucene";
	
	
   /* String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static String DB_URL="jdbc:mysql://mysql31576-viapyarr.cloud.cms500.com/mtdatabase";
	
	//Database credentials
    String USER = "root";
	String PASS = "NZEagq30913";
	
	static String imgLoc = "/viapyarrr/productImages/";
	static String outputImageLocation="/opt/tomcat/webapps/viapyarrr/productImages/";
	static String luceneIndexLocation="/opt/tomcat/webapps/lucene";*/
	
 
   
   


	public static String getImgLoc() {
		return imgLoc;
	}

	public static String getLuceneIndexLocation() {
		return luceneIndexLocation;
	}

	public static void setLuceneIndexLocation(String luceneIndexLocation) {
		Configuration.luceneIndexLocation = luceneIndexLocation;
	}

	public static String getOutputImageLocation() {
		return outputImageLocation;
	}

	public static void setOutputImageLocation(String outputImageLocation) {
		Configuration.outputImageLocation = outputImageLocation;
	}

	public void setImgLoc(String imgLoc) {
		this.imgLoc = imgLoc;
	}

	public String getJDBC_DRIVER() {
		return JDBC_DRIVER;
	}

	public void setJDBC_DRIVER(String jDBC_DRIVER) {
		JDBC_DRIVER = jDBC_DRIVER;
	}

	public String getDB_URL() {
		return DB_URL;
	}

	public void setDB_URL(String dB_URL) {
		DB_URL = dB_URL;
	}

	public String getUSER() {
		return USER;
	}

	public void setUSER(String uSER) {
		USER = uSER;
	}

	public String getPASS() {
		return PASS;
	}

	public void setPASS(String pASS) {
		PASS = pASS;
	}
	
	

}
