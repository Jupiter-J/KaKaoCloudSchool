import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/usesession") //todo: 세션을 찾아와서 사용하는 것
public class UseSessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UseSessionServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 입력을 받는다
        //2. 로직처리
        HttpSession session = req.getSession();
        String result = (String) session.getAttribute("id");

        //3. 클라이언트에게 결과를 출력한다
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = new PrintWriter(resp.getOutputStream());
        out.println("얻어온 결과는 : " + result);
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doPost(req, resp);
    }
}
