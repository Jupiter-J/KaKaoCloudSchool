package lecture0725;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/mysession") //todo: 세션을 생성하고 데이터 넣는것
public class SessionTestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SessionTestServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1. 입력을 받는다               //key값으로 집어 넣는다
        String id = req.getParameter("myID");

        //2. 로직처리
        //해당 클라이언트에게 session을 할당하거나 할당된 session을 찾아온다
        HttpSession session = req.getSession();
        session.setAttribute("id", id); //아이디라는 key값으로 넘어간 파라미터를 저장한다
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doPost(req, resp);
    }
}
