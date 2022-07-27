package member.controller;

import member.service.MemberService;
import member.vo.Member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override // login-form post 방식이기 때문에 해당 메소드에서 작업
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("userID");
        String pw = req.getParameter("userPW");

        //컴포넌트끼리 데이터를 주고받을 때는 객체를 생성해서 주고받는다
        //todo: 클라이언트에서 입력받은 데이터를 Service에게 전달하기 위해서 ** VO생성 **
        Member member = new Member();
        member.setId(id);
        member.setPw(pw);

        //todo: Service로 비즈니스 로직을 처리하기 위해서 ** Service 생성 **
        MemberService service = new MemberService();
        member = service.login(member); //vo로 받은 값들을 서비스에 전달
        //service메서드 실행후 결과값 return member

        //todo: 출력하기 위해 로그인에 성공하면 VO객체를 JSP에게 전달
        if(member != null){
            RequestDispatcher rd = req.getRequestDispatcher("/book/member/loginSuccess.jsp");
            req.setAttribute("member",member); //결과 데이터를 붙여서 surblet -> jsp로 붙여서 보낸다
            rd.forward(req, resp); //servlet이 jsp를 찾아서 실행(forward)
        }else{
            resp.sendRedirect("/book/member/loginFail.html");
        }

    }
}
