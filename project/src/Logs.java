import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Logs {
	public static void setLogs(String data) throws ClassNotFoundException, SQLException {
		Date currdate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY - HH:mm:ss");
		DataBase.setdatalogs("L " + sdf.format(currdate).toString() + " " + data);
	}
}