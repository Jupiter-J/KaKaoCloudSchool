package lecture0725;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**싱글톤 - 클라이언트로부터 객체가 한번만 만들어진다
     따라서 생성자에 넣으면 반복호출을 할 필요없이 한번만 호출하면 된다
     */
    public LoginServlet() {
        System.out.println("페이지이동");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }

    }

    @Override           //request 객체화 시킨다            //response 객체
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // service 로 전달됨
        //1. 입력을 받는다
        /**쿼리스트링은 무조건 문자열이다
         주의해야할점 : 입력을 받을때 사용되는 Stream의 Encoding이 ISO-8859-1 :영어라 한글이 깨진다
         한글 데이터를 받으려면 처리가 필요하다
         1-1. GET방식인 경우, 톰캣의 입력 스트림의 인코딩을 변경해준다*/
        String email = req.getParameter("userEmail");
        String pw = req.getParameter("userPassword");
        System.out.println(email + "," + pw);

        //2. 로직처리
        String jdbc_URL = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean loginStatus = false;


        /**
         입력된 email과 password가 dadtabse table에 존재하는지 확인한다
         * */
        try {
            con = DriverManager.getConnection(jdbc_URL,"root","kim8480848");
            String sql = "SELECT * FROM tmpuser where email=? and password=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, pw);

            rs = pstmt.executeQuery();

            if (rs.next()){
                loginStatus = true;
            }
        } catch (Exception e2) {
        }finally{
//            try {
//                pstmt.close();
//                pstmt.close();
//                con.close();
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
        }
        //3. 클라이언트에게 결과를 출력한다
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = new PrintWriter(resp.getOutputStream());
        if (loginStatus){
            out.println("환영합니다");
        }else{
            out.println("로그인에 실패했습니다.");
        }
        out.println("</body></head></html>");
        out.close();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("EUC-KR");
        super.doPost(req, resp);
    }
}
