package entrance;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
public class UserInfoBO {
	public boolean accountIsExist(String account) throws SQLException {
		// TODO Auto-generated method stub
		//����jdbc
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("error when loading jdbc");
					e.printStackTrace();
				}
				//������ݿ�
				String url = "jdbc:mysql://localhost:3306/final";
				String username = "root";
				String password = "hlm412725";
				java.sql.Connection con = null;
				try {
					con = DriverManager.getConnection(url,username,password);
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println("error when connecting database");
					se.printStackTrace();
				}
				//ʹ�ô��������Ĳ�ѯ
		int i = 0;
			String sql2="SELECT * FROM `finaldb`";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql2); 
		while(rs.next()){
			String number1 = rs.getString("NUMBER");
			if (number1.equals(account)){
				i=1;
			}
		}
		if(i==1){
		return true;	
		}else {
		return false;
		}
}	
}
