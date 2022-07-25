import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/servletb")
public class BServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BServlet() {
        super();
    }

    @Override           //request 객체            //response 객체
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 입력을 받는다
        //2. 로직처리
        //servletContext를 사용
        //servletContext 객체를 얻어오기 (공유객체에 대한 레퍼런스를 획득)
        ServletContext context = getServletContext();
        String product = (String) context.getAttribute("product");

        //3. 출력
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = new PrintWriter(resp.getOutputStream());
        out.println("얻어온 결과는 : " + product);
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("EUC-KR");
        super.doPost(req, resp);
    }
}
