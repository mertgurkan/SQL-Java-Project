import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Data {

	private static String url = "jdbc:db2://winter2021-comp421.cs.mcgill.ca:50000/cs421";
	private static Connection con;

	private static String dbuser = "mgurka"; // user name of server
	private static String dbpass = "password"; // password of server

	private static void setURl() {
		url = "jdbc:db2://winter2021-comp421.cs.mcgill.ca:50000/cs421";
	}

	static {
		setConnection();
	}

	// this method used to set connection between java and db2sql using JDBC
	public static Connection setConnection() {

		try {
			setURl();
			try {
				Class.forName("com.ibm.db2.jcc.DB2Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, dbuser, dbpass);

			return con;

		} catch (SQLException ex) {
			ex.printStackTrace();
		} 

		return null;
	}

	public static boolean MangmentQueries(String sql) {
		Statement stmt = null;

		try {
			setConnection();
			stmt = con.createStatement();
			stmt.execute(sql);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

		return false;

	}

	public static boolean checkPersonExist(String hinsurnum) {
		Statement stmt = null;
		ResultSet rst = null;
		try {
			setConnection();

			stmt = con.createStatement();
			String sql = "select * from Person where hinsurnum = '" + hinsurnum + "' ";
			rst = stmt.executeQuery(sql);
			if (rst.next()) {
				return true;
			}
		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
		} finally {

			try {
				if (rst != null)
					rst.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

		return false;
	}

	public static int checkForVialid(String hinsurnum) {
		Statement stmt = null;
		ResultSet rst = null;
		try {
			setConnection();

			stmt = con.createStatement();
			String sql = "SELECT numdoses FROM vaccination_info where hinsurnum = '" + hinsurnum + "' ";

			rst = stmt.executeQuery(sql);
			while (rst.next()) {
				return rst.getInt("numdoses");

			}

		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
		} finally {

			try {
				if (rst != null)
					rst.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

		return -1;
	}

	public static boolean checkForVaccineSlot(String vslot, LocalDate vdate, String locname) {

		ResultSet rst = null;
		Statement stmt = null;
		try {
			setConnection();

			stmt = con.createStatement();
			String sql = "SELECT * FROM vaccslot WHERE vslot ='" + vslot + "'  and vdate ='" + vdate
					+ "' and loc_name ='" + locname + "' ";
			rst = stmt.executeQuery(sql);
			while (rst.next()) {
				return true;
			}
		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
		} finally {
			try {
				if (rst != null)
					rst.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return false;
	}

	public static int getRequiredDoses(String vname) {
		int doses = 0;
		ResultSet rst = null;
		Statement stmt = null;

		try {
			setConnection();
			stmt = con.createStatement();
			String sql = "SELECT doses FROM vaccine WHERE vname ='" + vname + "' ";

			rst = stmt.executeQuery(sql);
			while (rst.next()) {
				doses = rst.getInt("doses");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (rst != null)
					rst.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return doses;
	}

	public static String getVialId(String hinsurnum) {
		String vialId = "";
		Statement stmt = null;
		ResultSet rst = null;
		try {
			setConnection();
			stmt = con.createStatement();
			String sql = "SELECT vial_id FROM vaccination_info where hinsurnum = '" + hinsurnum + "' ";

			rst = stmt.executeQuery(sql);
			while (rst.next()) {
				vialId = rst.getString("vial_id");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
		} finally {
			// close JDBC objects
			try {
				if (rst != null)
					rst.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return vialId;
	}
}
