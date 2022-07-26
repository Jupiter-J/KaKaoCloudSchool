import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TestServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 입력
        //2. 로직
        //3. 출력
        // 결과를 클라이언트에게 돌려주기 위해서 contentType 을 설정
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = new PrintWriter(resp.getOutputStream());
        out.println("소리없는 아우성!");
        out.close(); //꼭 닫아주기

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doPost(req, resp);
    }
}

