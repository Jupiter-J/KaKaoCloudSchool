
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainDBCP {
    //1. 필드가 먼저 만들어진다 - 객체를 만들지 않아도 이 필드를 사용할 수 있도록
    private static BasicDataSource basicDS;

    //2. main 메소드 실행하기 이전에 소스를 불러오기
    static {
        try{
            basicDS = new BasicDataSource();
            Properties properties = new Properties();

            //파일인풋스트림을 연다
            InputStream is = new FileInputStream("resources/db.properties");
            properties.load(is);

            //connection pull 이 가져야 하는 정보를 넣기
            basicDS.setDriverClassName(properties.getProperty("DRIVER_CLASS"));
            basicDS.setUrl(properties.getProperty("JDBC_URL"));
            basicDS.setUsername(properties.getProperty("DB_USER"));
            basicDS.setPassword("DB_PASSWORD");

            //동시접속자에 따라 달라진다
            basicDS.setInitialSize(10); //초기에 10개를 만들어 둔다
            basicDS.setMaxTotal(10); //connection 유지가 몇개냐

        }catch (Exception e){
        }
    }
    // 필드에 넣은값을 직접적으로 사용하지 않도록 하기위해
    public static DataSource getDataSource(){
        return basicDS;
    }

    public static void main(String[] args) {
        Connection con = null;
        DataSource ds = getDataSource();


        try {
            con = ds.getConnection();
            con.setAutoCommit(false);

            String sql = "DELETE FROM buytbl";
            PreparedStatement pstmt = con.prepareStatement(sql);

            int result = pstmt.executeUpdate();
            con.commit();
            con.close();

        }catch (Exception e){
        }

    }
}
